package cn.hacz.edu.service.impl;

import cn.hacz.edu.service.IndexServiceI;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexServiceI {
    @Override
    public void indexServiceTest() {
        System.out.println("测试service");
    }
}
