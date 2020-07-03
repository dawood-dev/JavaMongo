package javamongo.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;
import io.reactivex.Single;
import javamongo.services.*;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Controller("/filmView")
@RequiredArgsConstructor
public class FilmsViewController {

    private final FindFilms findFilms;

    @Get
    @View
    public Single<ModelAndView> filmView() {
        return findFilms.invoke()
                .toList()
                .map(filmsList -> {
                    Map<String, ?> model = Map.of(
                            "films", filmsList,
                            "numberOfFilms", filmsList.size()
                    );
                    return new ModelAndView("filmView", model);
                });
    }

        /*
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
    */

}