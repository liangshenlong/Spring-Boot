package cn.hacz.edu.controller;

import cn.hacz.edu.vo.UserVO;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ValidationController {
    /**
     * @return void
     * @Title validation
     * @date 日期:2017年8月14日 时间:下午6:01:09
     * @Description 功能：当个属性校验,BindingResult不能够单独使用,必须和验证注解@Validated共同使用。
     */
    @RequestMapping(value = "/validation")
    public String validation(@Valid UserVO vo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        }
        return "";
    }

    /**
     * @return void
     * @Title validationGrop
     * @ClassName APPserver
     * @date 日期:2017年8月14日 时间:下午6:01:23
     * @Description 功能：分组校验,可以多属性校验
     */
    @RequestMapping("/validationGrop")
    public void validationGrop(@Validated(UserVO.ValidationLogin.class) UserVO vo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        }
    }
}
