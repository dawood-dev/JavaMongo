package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import javamongo.data.Film;
import javamongo.services.FindFilms;
import lombok.RequiredArgsConstructor;

@Controller("/filmsApi")
@RequiredArgsConstructor
public class FilmsApiController {

    private final FindFilms findFilms;

    @Get("/")
    public Flowable<Film> film() {
        return findFilms.invoke();
    }

    /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */
}