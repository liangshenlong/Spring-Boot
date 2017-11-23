package cn.hacz.edu.web.api;

import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import cn.hacz.edu.webexception.BaseController;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：9:44
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class ServerRestFullController extends BaseController {
    @Autowired
    private UserDaoI userDaoI;
    @Autowired
    private UserServiceI userServiceI;

    /**
     * 查询所有用户列表
     *
     * @return
     */
    @GetMapping(value = "/getListUser")
    public List<UserEntity> getListUser() {
        return userDaoI.findAll();
    }

    /**
     * 添加单个用户信息
     *
     * @param userEntity
     * @return
     */
    @PostMapping(value = "/addUser")
    public R addUser(UserEntity userEntity) {
        return R.ok(userDaoI.save(userEntity));
    }

    /**
     * 通过id查询单个用户
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/getFindOneUser/{id}")
    public UserEntity getFindOneUser(@PathVariable("id") Integer id) {
        return userDaoI.getOne(id);
    }

    /**
     * 通过id进行用户数据的更新
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/updateUser/{id}")
    public UserEntity updateUser(@PathVariable("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(age);
        return userDaoI.save(userEntity);
    }

    /**
     * 通过id删除单个用户操作
     *
     * @param id
     */
    @DeleteMapping(value = "/delectUserOne/{id}")
    public void delectUserOne(@PathVariable("id") Integer id) {
        userDaoI.delete(id);
    }

    /**
     * 通过name查询用户
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/getUserName/{name}")
    public List<UserEntity> getUserName(@PathVariable("name") String name) {
        return userDaoI.findByName(name);
    }

    /**
     * 通过age查询用户
     *
     * @param age
     * @return
     */
    @GetMapping(value = "/getUserAge/{age}")
    public List<UserEntity> getUserAge(@PathVariable("age") Integer age) {
        return userDaoI.findByAge(age);
    }

    @PostMapping(value = "/addUserTwo")
    public void addUserTwo() {
        userServiceI.insertUserTwo();
    }
}
