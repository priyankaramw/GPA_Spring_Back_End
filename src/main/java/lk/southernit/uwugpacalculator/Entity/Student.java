package lk.southernit.uwugpacalculator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@Table(name = "t_student")
@NoArgsConstructor
@AllArgsConstructor
public class Student implements UserDetails {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "degree_id")
    private Degree degree;

    @Column(name = "university_id")
    private int universityId;

    @Column(name = "name_first", nullable = false)
    private String nameFirst;

    @Column(name = "name_last")
    private String nameLast;

    @Column(name = "name_initials")
    private String nameInitials;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "registration_no")
    private String registrationNo;

    @Column(name = "semester_count")
    private int semesterCount;

    @Column(name = "year_at_signup")
    private int yearAtSignup;

    @Column(name = "access_level")
    private int accessLevel;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "has_custom_weights")
    private boolean hasCustomWeights;

    @Column(name = "invited_by_id")
    private int invitedById;

    /**    Methods from UserDetails implementation for security. */

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
