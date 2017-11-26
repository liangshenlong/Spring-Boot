package cn.hacz.edu.dao.impl;

import cn.hacz.edu.dao.StudentDaoI;
import cn.hacz.edu.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentImpl implements StudentDaoI {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean create(String tableName) {
        jdbcTemplate.execute("create table " + tableName + " (id int(36) NOT NULL auto_increment primary key,name varchar(20),age int)");
        return true;
    }

    @Override
    public boolean doSave(StudentEntity vo) {
        jdbcTemplate.update(" insert into tb_child(name,age) values(?,?) ", new Object[]{vo.getName(), vo.getAge()});
        return true;
    }

    @Override
    public boolean doSqlSave(StudentEntity vo) {
        jdbcTemplate.update(" insert into tb_child(name,age) values(?,?) ", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, vo.getName());
                ps.setInt(2, vo.getAge());
            }
        });
        return false;
    }

    @Override
    public List<StudentEntity> getChild() {
        return null;
    }
}
