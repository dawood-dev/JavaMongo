package javamongo.adapters;

import com.mongodb.client.model.Sorts;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.reactivex.Flowable;
import io.reactivex.Single;
import javamongo.configs.MongoConfigProperties;
import javamongo.data.Film;
import javamongo.interfaces.IFilm;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;
import java.util.List;

@Singleton
@RequiredArgsConstructor
public class MongoFilmAdapter implements IFilm{
    private final MongoClient mongoClient;
    private final MongoConfigProperties mongoConfig;

    // IFilm implementation //
    public Flowable<Film> film() {
        return Flowable.fromPublisher(
                filmCollection()
                        .find()
                        .sort(Sorts.ascending("MovieId"))
        );
    }

    private MongoCollection<Film> filmCollection() {
        return filmDatabase()
                .getCollection(mongoConfig.filmsCollection, Film.class);
    }

    private MongoDatabase filmDatabase() {
        return mongoClient.getDatabase(mongoConfig.database);
    }

    @Override
    public Single<List<Film>> litFilms() {
        return this.litFilms();
    }

    @Override
    public Single<List<String>> titles() {
        return this.titles();
    }

    @Override
    public Single<Film> saveFilms(String title) {
        return this.saveFilms(title);
    }

}
