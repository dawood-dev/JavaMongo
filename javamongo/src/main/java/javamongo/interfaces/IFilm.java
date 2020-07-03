package javamongo.interfaces;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import javamongo.data.Film;
import java.util.List;

public interface IFilm {

    Flowable<Film> film();

    @Get("/")
    Single<List<Film>> litFilms();

    @Get("/Ids")
    Single<List<String>> titles();

    @Post("/")
    Single<Film> saveFilms(String title);
}
