package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "locations")
@ApiModel(description = "Location information stored in MongoDB")
@Data
public class LocationDocument {

    @ApiModelProperty(notes = "The latitude of the location")
    private double latitude;

    @ApiModelProperty(notes = "The longitude of the location")
    private double longitude;
}
