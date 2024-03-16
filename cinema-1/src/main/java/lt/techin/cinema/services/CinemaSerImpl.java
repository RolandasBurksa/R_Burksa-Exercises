package lt.techin.cinema.services;

import lt.techin.cinema.model.Cinema;
import org.springframework.stereotype.Service;

@Service

public class CinemaSerImpl implements CinemaSer{

    // Tam, kad kai servisas susikurs, jis tures viena objekta - cia antrai uzduoties daliai su pirkimu vietos
    private Cinema cinema = new Cinema();

    @Override
    public Cinema getCinema() {
        return  cinema;
    }
}
