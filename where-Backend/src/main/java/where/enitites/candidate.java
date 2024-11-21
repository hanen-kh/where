package where.enitites;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="candidate_id")
public class candidate extends User {
    private Date dateOfBirth;

}
