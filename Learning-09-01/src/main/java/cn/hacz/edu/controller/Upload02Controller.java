package cn.hacz.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Iterator;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:13:51
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Controller
public class Upload02Controller {

    @RequestMapping(value = "/upload01")
    public String upload01(@RequestParam("image_icon") CommonsMultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        return "";
    }

    /**
     * 传统的原生处理方式
     *
     * @param request
     * @param response
     * @return
     */
    public String upload02(HttpServletRequest request, HttpServletResponse response) {
        CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (cmr.isMultipart(request)) {
            MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
            Iterator files = mRequest.getFileNames();
            String result = "";
            while (files.hasNext()) {
                MultipartFile mFile = mRequest.getFile((String) files.next());
                if (mFile != null) {
                    String fileName = mFile.getOriginalFilename();
                }
            }
        }
        return "";
    }
}