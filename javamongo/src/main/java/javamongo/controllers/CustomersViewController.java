package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;
import io.reactivex.Single;
import javamongo.services.*;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Controller("/customerView")
@RequiredArgsConstructor
public class CustomersViewController {

    private final FindCustomers findCustomers;

    @Get
    @View
    public Single<ModelAndView> customerView() {
        return findCustomers.invoke()
                .toList()
                .map(customerList -> {
                    Map<String, ?> model = Map.of(
                            "customers", customerList,
                            "numberOfCustomers", customerList.size()
                    );
                    return new ModelAndView("customerView", model);
                });
    }

    /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */

}