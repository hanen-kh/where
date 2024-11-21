package where.enitites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class offer implements Serializable {
    private  static final long SerialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String internshipTitle;
    private String internshipDescription;
    private Date startDate;
    private Date endDate;
    private Date publicationDate;
    @Enumerated(EnumType.STRING)
    private OfferStatus Status;
    @ManyToOne (cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private company company;


}
