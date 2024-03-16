package lt.techin.cinema.services;

import lt.techin.cinema.exceptions.SeatIsOccupiedException;
import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import org.springframework.stereotype.Service;
import lt.techin.cinema.exceptions.SeatNotFoundException;


@Service

public class CinemaSerImpl implements CinemaSer{

    // Tam, kad kai servisas susikurs, jis tures viena objekta - cia antrai uzduoties daliai su pirkimu vietos
    private Cinema cinema = new Cinema();

    @Override
    public Cinema getCinema() {
        return cinema;
    }

    @Override
    public Seat purchaseSeat(Seat seat1) {
        if((seat1.getRow() > 9) || (seat1.getColumn() > 9)){
            throw new SeatNotFoundException("Seat row: " + seat1.getRow() + " column: " + seat1.getColumn() + " not exist");
        }
        Seat seat = cinema.findSeat(seat1.getRow(), seat1.getColumn());
        if (seat.isOccupied()){
            throw  new SeatIsOccupiedException("Seat row: " + seat1.getRow() + " column: " + seat1.getColumn() + " is occupied. Choose another seat");
        }
        seat.setOccupied(true);
        return seat;
    }
}
