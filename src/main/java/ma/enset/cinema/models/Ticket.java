package ma.enset.cinema.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.cinema.models.Place;
import ma.enset.cinema.models.Projection;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private double prix;
    @Column(unique=true)
    private int codePayement;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;
}
