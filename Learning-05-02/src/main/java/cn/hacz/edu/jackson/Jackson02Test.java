package cn.hacz.edu.jackson;

import cn.hacz.edu.vo.BookVo;
import cn.hacz.edu.vo.VolumeVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:9:01
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Jackson02Test {
    @Test
    public void jackson01() throws JsonProcessingException {
        BookVo bookVo = new BookVo();
        bookVo.setId("001");
        bookVo.setName("第一章");
        VolumeVo volumeVo = new VolumeVo();
        bookVo.getVolume().add(volumeVo);
        ObjectWriter o = new XmlMapper().writerWithDefaultPrettyPrinter();
        String s = o.writeValueAsString(bookVo);
        System.out.println(s);
    }
}
