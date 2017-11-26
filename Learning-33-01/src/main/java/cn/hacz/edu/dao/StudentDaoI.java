package cn.hacz.edu.dao;

import cn.hacz.edu.entity.StudentEntity;

import java.util.List;

public interface StudentDaoI {
    boolean create(String tableName);

    boolean doSave(StudentEntity vo);

    boolean doSqlSave(StudentEntity vo);

    List<StudentEntity> getChild();
}
