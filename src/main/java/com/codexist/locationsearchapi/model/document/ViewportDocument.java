package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "viewports")
@ApiModel(description = "Viewport information stored in MongoDB")
@Data
public class ViewportDocument {

    @ApiModelProperty(notes = "The low part of the viewport")
    private LocationDocument low;

    @ApiModelProperty(notes = "The high part of the viewport")
    private LocationDocument high;
}
