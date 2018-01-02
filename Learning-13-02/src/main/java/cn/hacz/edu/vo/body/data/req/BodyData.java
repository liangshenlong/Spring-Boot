package cn.hacz.edu.vo.body.data.req;

import cn.hacz.edu.vo.body.data.Data;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/1/2 时间:11:11
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class BodyData implements Data {
    private BodyDataYzlpcx yzlpcx;

    public BodyDataYzlpcx getYzlpcx() {
        return yzlpcx;
    }

    public void setYzlpcx(BodyDataYzlpcx yzlpcx) {
        this.yzlpcx = yzlpcx;
    }
}
