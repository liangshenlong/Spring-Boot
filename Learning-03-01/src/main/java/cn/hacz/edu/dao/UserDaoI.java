package cn.hacz.edu.dao;

import cn.hacz.edu.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserDaoI extends JpaRepository<UserEntity, Serializable> {
}
