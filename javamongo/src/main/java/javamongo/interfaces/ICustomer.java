package javamongo.interfaces;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.reactivex.Flowable;
import io.reactivex.Single;
import javamongo.data.Customer;

import java.util.List;

public interface ICustomer {


    Flowable<Customer> customer();


    @Get("/")
    Single<List<Customer>> listCustomers();

    @Get("/Ids")
    Single<List<String>> customerNames();

    @Post("/")
    Single<Customer> saveCustomer(String name);


    }
