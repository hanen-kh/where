package where.enitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class company {
    @Id
    private long id;
    private String companyName;
    private String address;
    private String url;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hr_id", referencedColumnName = "id")
    private hr hr;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<offer> offers;

}
