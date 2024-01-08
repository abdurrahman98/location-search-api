package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "photos")
@ApiModel(description = "Photo information stored in MongoDB")
@Data
public class PhotoDocument {

    @ApiModelProperty(notes = "Name of the photo")
    private String name;

    @ApiModelProperty(notes = "Width in pixels of the photo")
    private int widthPx;

    @ApiModelProperty(notes = "Height in pixels of the photo")
    private int heightPx;

    @ApiModelProperty(notes = "List of author attributions")
    private List<AuthorAttributionDocument> authorAttributions;

    // Diğer alanlar...

    // Getter ve Setter metotları...

    // İlgili constructerlar...
}
