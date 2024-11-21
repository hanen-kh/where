package where.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import where.enitites.Jwt;

import java.util.Optional;
import java.util.stream.Stream;

@EnableJpaRepositories
public interface JwtRepository extends JpaRepository<Jwt,Long> {

    @Query("SELECT j FROM Jwt j WHERE j.valeur = :value")
    Optional<Jwt> findByValeur(@Param("value") String value);


    @Query("FROM Jwt j WHERE j.desactive=:desactive AND j.expire=:expire AND j.user.email=:email")
    Optional<Jwt> findValidToken(String email, boolean expire, boolean desactive);

    @Query("FROM Jwt j WHERE j.user.email=:email")
    Stream<Jwt> findTokens(String email);

    // @Query("DELETE FROM Jwt j WHERE j.expire=:expire AND j.desactive=:desactive")
    void deleteAllByExpireAndDesactive(boolean expire, boolean desactive);
}

