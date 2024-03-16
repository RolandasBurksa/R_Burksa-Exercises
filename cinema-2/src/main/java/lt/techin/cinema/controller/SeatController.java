package lt.techin.cinema.controller;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import lt.techin.cinema.services.CinemaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeatController {

    CinemaSer cinemaSer;

    // Konstruktorius
    @Autowired
    public SeatController(CinemaSer cinemaSer) {
        this.cinemaSer = cinemaSer;
    }

    @GetMapping
    @RequestMapping("/seats")
    public Cinema getCinema() {
        return cinemaSer.getCinema();
    }

    @PostMapping
    @RequestMapping("/purchase")
    public Seat purchaseSeat(@RequestBody Seat seat1){

        return cinemaSer.purchaseSeat(seat1);
    }
}
