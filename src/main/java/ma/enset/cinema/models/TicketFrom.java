package ma.enset.cinema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketFrom{
    private String nomClient;
    private int codePayement;
    private List<Long> tickets=new ArrayList<>();
}
