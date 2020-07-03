package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import javamongo.data.Rental;
import javamongo.services.FindRentals;
import lombok.RequiredArgsConstructor;

@Controller("/rentalsApi")
@RequiredArgsConstructor
public class RentalsApiController {

    private final FindRentals findRentals;

    @Get("/")
    public Flowable<Rental> rental() {
        return findRentals.invoke();
    }

    /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */

}