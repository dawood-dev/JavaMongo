package javamongo.services;

import io.reactivex.Flowable;
import javamongo.data.Rental;
import javamongo.interfaces.IRental;
import lombok.RequiredArgsConstructor;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class FindRentals {

    private final IRental iRental;

    public Flowable<Rental>  findRentals (String rentalIds){
        return iRental.rental();
    }

    public Flowable<Rental> invoke() {
        return iRental.rental();
    }

}