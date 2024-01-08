package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plusCodes")
@ApiModel(description = "Plus code information stored in MongoDB")
@Data
public class PlusCodeDocument {

    @ApiModelProperty(notes = "The global code of the plus code")
    private String globalCode;

    @ApiModelProperty(notes = "The compound code of the plus code")
    private String compoundCode;

}

