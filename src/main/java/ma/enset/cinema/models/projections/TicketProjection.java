package ma.enset.cinema.models.projections;

import ma.enset.cinema.models.Place;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "t",types = {ma.enset.cinema.models.Ticket.class})
public interface TicketProjection {
    public Long getId();
    public String getNomClient();
    public double getPrix();
    public int getCodePayement();
    public boolean getReserve();
    public Place getPlace();
}
