package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "displayNames")
@ApiModel(description = "Display name information stored in MongoDB")
@Data
public class DisplayNameDocument {

    @ApiModelProperty(notes = "Text of the display name")
    private String text;

    @ApiModelProperty(notes = "Language code of the display name")
    private String languageCode;
}
