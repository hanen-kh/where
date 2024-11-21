package where.enitites;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="hr_id")
public class hr extends User {
    @OneToOne(mappedBy = "hr", cascade = CascadeType.ALL)
    private company company;
}
