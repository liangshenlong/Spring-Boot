package cn.hacz.edu.service.impl;

import cn.hacz.edu.dao.StudentDaoI;
import cn.hacz.edu.entity.StudentEntity;
import cn.hacz.edu.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServiceI {
    @Autowired
    private StudentDaoI studentDaoI;

    @Override
    public boolean createTable(String createName) {
        return studentDaoI.create(createName);
    }

    @Override
    public boolean doSave(StudentEntity vo) {
        return studentDaoI.doSave(vo);
    }

    @Override
    public boolean daSqlSave(StudentEntity vo) {
        return studentDaoI.doSqlSave(vo);
    }
}
