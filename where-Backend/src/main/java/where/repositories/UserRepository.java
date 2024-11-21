package where.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import where.enitites.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

}
