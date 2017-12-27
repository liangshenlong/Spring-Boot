package rabbitmq.provider.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import rabbitmq.provider.user.entity.UserEntity;

/**
 * 用户数据接口定义
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：14:35
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
