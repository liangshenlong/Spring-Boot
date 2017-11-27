package cn.hacz.edu;

import cn.hacz.edu.entity.TeacherEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learning1701ApplicationTests {

    @Test
    public void contextLoads() {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setName("java");
        System.out.println(teacherEntity.toString());
    }

}
