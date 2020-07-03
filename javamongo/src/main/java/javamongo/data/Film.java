package javamongo.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Film {

    @JsonProperty("movieId")
    private Integer movieId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("category")
    private String category;
    @JsonProperty("description")
    private String description;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("rentalDuration")
    private String rentalDuration;
    @JsonProperty("length")
    private String length;
    @JsonProperty("replacementCost")
    private String replacementCost;
    @JsonProperty("specialFeatures")
    private String specialFeatures;

}