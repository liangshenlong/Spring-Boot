package cn.hacz.edu.dao;

import cn.hacz.edu.entity.GirlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface GirlDaoI extends JpaRepository<GirlEntity, Serializable> {
    List<GirlEntity> findByAge(Integer age);
}
