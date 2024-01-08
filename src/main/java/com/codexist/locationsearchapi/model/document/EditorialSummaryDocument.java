package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "editorialSummaries")
@ApiModel(description = "Editorial summary information stored in MongoDB")
@Data
public class EditorialSummaryDocument {

    @ApiModelProperty(notes = "Text of the editorial summary")
    private String text;

    @ApiModelProperty(notes = "Language code of the editorial summary")
    private String languageCode;

}
