package javamongo.adapters;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import javamongo.configs.MongoConfigProperties;
import javamongo.interfaces.IData;
import lombok.RequiredArgsConstructor;
import org.bson.Document;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class MongoDataAdapter implements IData {
    private final MongoClient mongoClient;
    private final MongoConfigProperties mongoConfig;

    // IRental implementation //
    @Override
    public String data() {
        return dataCollection().find().first().toString();
    }

    private MongoCollection<Document> dataCollection() {
        return dataDatabase()
                .getCollection(mongoConfig.rentalsCollection);
    }

    private MongoDatabase dataDatabase() {
        return mongoClient.getDatabase(mongoConfig.database);
    }

}
