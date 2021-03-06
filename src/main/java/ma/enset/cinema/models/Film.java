package ma.enset.cinema.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String decription;
    private String realisateur;
    private Date dateSortie;
    private double duree;
    private String photo;
    @OneToMany(mappedBy="film")
    private Collection<Projection> projections;
    @ManyToOne
    private Categorie categorie;
}
