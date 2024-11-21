package where.enitites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table(name="utilisateur")
public class User implements Serializable , UserDetails {
    private static final long SerialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @Column
    @JsonIgnore
    protected String password;

    @Column
    protected String FirstName;
    @Column
    protected String LastName;
    @Column(unique = true)
    private String email;

    protected boolean actif = false;

    protected int PhoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="role_id")
    protected Role role;



    @Override
    public String getPassword() {
        return this.password;
    }
    @Override
    public String getUsername() {
        return this.email;
    }
    @Override
    public boolean isAccountNonExpired() {
        return this.actif;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_"+this.role.getLibelle()));
    }

    @Override
    public boolean isEnabled() {
        return this.actif;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.actif;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.actif;
    }
}
