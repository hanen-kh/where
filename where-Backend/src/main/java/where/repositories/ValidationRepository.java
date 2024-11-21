package where.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import where.enitites.Validation;

public interface ValidationRepository extends JpaRepository<Validation,Long> {


    Validation findByCode(String code);

}
