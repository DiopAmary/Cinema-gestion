package ma.enset.cinema.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Projection implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Date dateProjection;
    private double prix;
    @ManyToOne
    @JsonIgnore
    private Salle salle;
    @ManyToOne
    @JsonIgnore
    private Film film;
    @OneToMany(mappedBy="projection")
    @JsonIgnore
    private Collection<Ticket> tickets;
    @ManyToOne
    private Seance seance;
}
