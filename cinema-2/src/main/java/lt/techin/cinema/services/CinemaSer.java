package lt.techin.cinema.services;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;

public interface CinemaSer {

    Cinema getCinema();

    Seat purchaseSeat(Seat seat);


}
