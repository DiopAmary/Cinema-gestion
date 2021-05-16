package ma.enset.cinema.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Place implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double longitude,latidude,altitude;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy="place")
    @JsonIgnore
    private Collection<Ticket> tickets;
}