package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authorAttributions")
@ApiModel(description = "Author attribution information stored in MongoDB")
@Data
public class AuthorAttributionDocument {
    @ApiModelProperty(notes = "Display name of the author")
    private String displayName;

    @ApiModelProperty(notes = "URI of the author")
    private String uri;

    @ApiModelProperty(notes = "Photo URI of the author")
    private String photoUri;
}
