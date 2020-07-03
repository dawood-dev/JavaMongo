package javamongo.services;

import io.reactivex.Flowable;
import javamongo.data.Film;
import javamongo.interfaces.IFilm;
import lombok.RequiredArgsConstructor;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class FindFilms {

    private final IFilm iFilm;

    public Flowable<Film>  findFilms (String filmIds){
        return iFilm.film();
    }

    public Flowable<Film> invoke() {
        return iFilm.film();
    }

}