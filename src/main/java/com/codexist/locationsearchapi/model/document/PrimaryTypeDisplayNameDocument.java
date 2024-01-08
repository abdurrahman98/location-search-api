package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "primaryTypeDisplayNames")
@ApiModel(description = "Primary type display name information stored in MongoDB")
@Data
public class PrimaryTypeDisplayNameDocument {

    @ApiModelProperty(notes = "Text of the primary type display name")
    private String text;

    @ApiModelProperty(notes = "Language code of the primary type display name")
    private String languageCode;

}
