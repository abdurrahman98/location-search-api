package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "texts")
@ApiModel(description = "Text information stored in MongoDB")
@Data
public class TextDocument {

    @ApiModelProperty(notes = "Text content")
    private String text;

    @ApiModelProperty(notes = "Language code of the text")
    private String languageCode;
}
