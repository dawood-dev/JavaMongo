package javamongo.adapters;

import com.mongodb.client.model.Sorts;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.reactivex.Flowable;
import io.reactivex.Single;
import javamongo.configs.MongoConfigProperties;
import javamongo.data.Customer;
import javamongo.interfaces.ICustomer;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;
import java.util.List;

@Singleton
@RequiredArgsConstructor
public class MongoCustomerAdapter implements ICustomer{
    private final MongoClient mongoClient;
    private final MongoConfigProperties mongoConfig;

    // ICustomer implementation //
    @Override
    public Flowable<Customer> customer() {
        return Flowable.fromPublisher(
                customerCollection()
                        .find()
                        .sort(Sorts.ascending("customerId"))
        );
    }

    private MongoCollection<Customer> customerCollection() {
        return customerDatabase()
                .getCollection(mongoConfig.customersCollection, Customer.class);
                //.getCollection("customers", Customer.class);
    }

    private MongoDatabase customerDatabase() {
        return mongoClient
                .getDatabase(mongoConfig.database);
                //.getDatabase("javamongo");
    }


    public Single<List<Customer>> listCustomers(){
        return this.listCustomers();
    };

    public Single<List<String>> customerNames(){
        return this.customerNames();
    };

    public Single<Customer> saveCustomer(String name){
        return this.saveCustomer(name);
    };


}
