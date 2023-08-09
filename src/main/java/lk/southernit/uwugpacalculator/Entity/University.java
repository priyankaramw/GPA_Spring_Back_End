package lk.southernit.uwugpacalculator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "t_university")
@NoArgsConstructor
@AllArgsConstructor
public class University {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "is_sl_gov_uni")
    private boolean isSlGovUni;

    @Column(name = "country_code")
    private int countryCode;

    @Column(name = "added_by_id")
    private int addedById;

}