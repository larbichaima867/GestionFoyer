package tn.esprim.gestionfoyer.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long  capaciteBloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy ="bloc",cascade= CascadeType.ALL)
    private List<Chambre> chambres;
}
