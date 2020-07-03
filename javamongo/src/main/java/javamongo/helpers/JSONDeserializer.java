package javamongo.helpers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import javamongo.data.Rental;

import java.io.IOException;

public class JSONDeserializer  extends JsonDeserializer<Rental>
{
    @Override
    public Rental deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException
    {
        JsonNode jsonNode = parser.readValueAsTree();

        Rental rental = new Rental();
        rental.setCustomerId(jsonNode.get("rentalId").asInt());

        Integer rentalId;
        JsonNode rentalNode = jsonNode.get("rentalId");
        rentalId = jsonNode.get("rentalId").asInt();
        //rental.setRentalId(rentalId);

        return rental;
    }
}
