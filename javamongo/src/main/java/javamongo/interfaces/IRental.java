package javamongo.interfaces;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import javamongo.data.Rental;
import java.util.List;

public interface IRental {

    Flowable<Rental> rental();

    @Get("/")
    Single<List<Rental>> listRentals();

    @Get("/Ids")
    Single<List<String>> rentalIds();

    @Post("/")
    Single<Rental> saveRental(String id);
}
