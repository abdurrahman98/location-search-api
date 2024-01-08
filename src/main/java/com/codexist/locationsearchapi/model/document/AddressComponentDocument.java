package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "addressComponents")
@ApiModel(description = "Address component information stored in MongoDB")
@Data
public class AddressComponentDocument {

    @ApiModelProperty(notes = "The long text of the address component")
    private String longText;

    @ApiModelProperty(notes = "The short text of the address component")
    private String shortText;

}
