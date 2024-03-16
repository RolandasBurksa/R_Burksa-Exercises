package lt.techin.cinema.controller;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.services.CinemaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {

    CinemaSer cinemaSer;

    // Konstruktorius
    @Autowired
    public SeatController(CinemaSer cinemaSer) {
        this.cinemaSer = cinemaSer;
    }

    @GetMapping
    public Cinema getCinema() {
        return cinemaSer.getCinema();
    }

}
