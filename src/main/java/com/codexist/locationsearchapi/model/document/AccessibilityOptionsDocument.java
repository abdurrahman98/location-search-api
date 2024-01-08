package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accessibilityOptions")
@ApiModel(description = "Accessibility options information stored in MongoDB")
@Data
public class AccessibilityOptionsDocument {

    @ApiModelProperty(notes = "Whether the location has wheelchair accessible parking")
    private boolean wheelchairAccessibleParking;

    @ApiModelProperty(notes = "Whether the location has wheelchair accessible entrance")
    private boolean wheelchairAccessibleEntrance;

}
