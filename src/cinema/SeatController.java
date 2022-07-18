package cinema;

import org.springframework.web.bind.annotation.*;


@RestController
public class SeatController {
    Cinema cinema = new Cinema(9, 9);

    @GetMapping("/seats")
    public Cinema getCinema() {
        return this.cinema;
    }

    @PostMapping("/purchase")
    public Seat makePurchase(@RequestBody Seat seat) {
        System.out.println("Seat is "  + seat.getRow());
        return seat;
    }

    @GetMapping("/test")
    public int test() {
        return 120;
    }

}
