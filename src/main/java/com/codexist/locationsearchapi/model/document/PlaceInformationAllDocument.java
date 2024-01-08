package com.codexist.locationsearchapi.model.document;

import com.codexist.locationsearchapi.model.PlaceInformation;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;


@Data
@Document(collection = "placeInformationAll")
@ApiModel(description = "Place information all information stored in MongoDB")
public class PlaceInformationAllDocument {

    @Id
    @ApiModelProperty(notes = "Unique identifier of the place")
    private String id;

    @ApiModelProperty(value = "List of place information", required = true)
    private List<PlaceInformation> places;

}
