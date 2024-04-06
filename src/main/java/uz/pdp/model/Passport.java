package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false)
    private Date issuedDate;

    @Column(nullable = false, unique = true)
    private Date passportId;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String region;

}
