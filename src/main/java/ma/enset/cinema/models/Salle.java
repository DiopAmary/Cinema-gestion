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
@NoArgsConstructor
@AllArgsConstructor
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int nombrePlace;
    @ManyToOne
    @JsonIgnore
    private Cinema cinema;
    @OneToMany(mappedBy="salle")
    @JsonIgnore
    private Collection<Place> places;
    @OneToMany(mappedBy="salle")
    @JsonIgnore
    private Collection<Projection> projections;
}
