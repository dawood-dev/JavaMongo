package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import javamongo.data.Customer;
import javamongo.services.FindCustomers;
import lombok.RequiredArgsConstructor;

@Controller("/customersApi")
@RequiredArgsConstructor
public class CustomersApiController {

    private final FindCustomers findCustomers;

    @Get("/")
    public Flowable<Customer> customer() {
        return findCustomers.invoke();
    }

    /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */

}