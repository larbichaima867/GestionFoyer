package tn.esprim.gestionfoyer.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants",cascade =CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Reservation> reservations;


}
