package cn.hacz.edu.controller;

import cn.hacz.edu.model.LoginDetail;
import cn.hacz.edu.model.vo.RequestLoginUser;
import cn.hacz.edu.service.LoginService;
import cn.hacz.edu.util.token.TokenDetail;
import cn.hacz.edu.webexception.BaseController;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @version V1.0.0
 * @Description
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/10/3 1:30
 */
@RestController
public class LoginController extends BaseController {

    private final LoginService loginService;

    @Value("${token.header}")
    private String tokenHeader;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R login(@Valid RequestLoginUser requestLoginUser, BindingResult bindingResult) {
        // 检查有没有输入用户名密码和格式对不对
        if (bindingResult.hasErrors()) {
            logger.error("数据校验有误！");
            return R.error("400", "缺少参数或者参数格式不对");
        }

        // 这里是从数据库中拿出该账号的信息，然后进行检查账号密码对不对
        LoginDetail loginDetail = loginService.getLoginDetail(requestLoginUser.getUsername());
        R r = checkAccount(requestLoginUser, loginDetail);
        if (r != null) {
            return r;
        }
        // 此处是将LoginDetail强制转成TokenDetail
        return R.ok(loginService.generateToken((TokenDetail) loginDetail));
    }

    private R checkAccount(RequestLoginUser requestLoginUser, LoginDetail loginDetail) {
        if (loginDetail == null) {
            return R.error("434", "账号不存在！");
        } else {
            if (loginDetail.enable() == false) {
                return R.error("452", "账号在黑名单中");
            }
            if (!loginDetail.getPassword().equals(requestLoginUser.getPassword())) {
                return R.error("438", "密码错误！");
            }
        }
        return null;
    }

}
