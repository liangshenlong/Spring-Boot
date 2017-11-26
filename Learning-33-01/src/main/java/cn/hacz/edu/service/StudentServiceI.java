package cn.hacz.edu.service;

import cn.hacz.edu.entity.StudentEntity;

public interface StudentServiceI {
    boolean createTable(String createName);

    boolean doSave(StudentEntity vo);

    boolean daSqlSave(StudentEntity vo);
}
