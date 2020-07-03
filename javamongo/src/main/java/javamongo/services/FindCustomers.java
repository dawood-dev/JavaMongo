package javamongo.services;

import io.reactivex.Flowable;
import javamongo.data.Customer;
import javamongo.interfaces.ICustomer;
import lombok.RequiredArgsConstructor;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class FindCustomers {

    private final ICustomer iCustomer;


    public Flowable<Customer>  findCustomers (String customerIds){
        return iCustomer.customer();
    }


    public Flowable<Customer> invoke() {
        return iCustomer.customer();
    }

}