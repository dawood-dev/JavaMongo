package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;
import io.reactivex.Single;
import javamongo.services.FindRentals;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Controller("/rentalView")
@RequiredArgsConstructor
public class RentalsViewController {

    private final FindRentals findRentals;

    @Get
    @View
    public Single<ModelAndView> rentalView() {
        return findRentals.invoke()
                .toList()
                .map(rentalList -> {
                    Map<String, ?> model = Map.of(
                            "rentals", rentalList,
                            "numberOfRentals", rentalList.size()
                    );
                    return new ModelAndView("rentalView", model);
                });
    }

    /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */

}