package cn.hacz.edu.models.book.controller;

import cn.hacz.edu.models.book.dao.BookDaoI;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：9:23
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class BookController {
    @Autowired
    private BookDaoI bookDaoI;

    @GetMapping(value = "/getBookAll")
    public R getBookAll() {
        return R.ok(bookDaoI.findAll());
    }
}
