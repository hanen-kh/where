package where.repositories;

import org.springframework.data.repository.CrudRepository;
import where.enitites.Role;
import where.enitites.TypeRole;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Optional<Role> findByLibelle(TypeRole libelle);
}
