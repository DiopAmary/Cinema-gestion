package ma.enset.cinema.models.projections;

import ma.enset.cinema.models.Film;
import ma.enset.cinema.models.Salle;
import ma.enset.cinema.models.Seance;
import ma.enset.cinema.models.Ticket;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(name = "p",types = {ma.enset.cinema.models.Projection.class})
public interface ProjectionFilmProjection {
    public Long getId();
    public Date getDateProjection();
    public double getPrix();
    public Film getFilm();
    public Salle getSalle();
    public Collection<Ticket> getTickets();
    public Seance getSeance();
}
