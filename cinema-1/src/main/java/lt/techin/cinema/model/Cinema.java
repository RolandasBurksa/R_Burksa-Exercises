package lt.techin.cinema.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cinema {

    private  int rows;
    private int columns;
    private List<Seat> seats = new ArrayList<>();


    public Cinema() {
        this.rows = 9;
        this.columns = 9;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                Seat seat = new Seat();
                seat.setRow(i);
                seat.setColumn(j);
                seats.add(seat);
            }
        }
    }
}
