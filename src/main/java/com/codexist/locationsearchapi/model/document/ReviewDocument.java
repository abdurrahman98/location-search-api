package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@ApiModel(description = "Review information stored in MongoDB")
@Data
public class ReviewDocument {

    @ApiModelProperty(notes = "Name of the reviewer")
    private String name;

    @ApiModelProperty(notes = "Relative publish time description")
    private String relativePublishTimeDescription;

    @ApiModelProperty(notes = "Rating given by the reviewer")
    private int rating;

    @ApiModelProperty(notes = "Text of the review")
    private TextDocument text;

    @ApiModelProperty(notes = "Original text of the review")
    private TextDocument originalText;

    @ApiModelProperty(notes = "Author attribution information")
    private AuthorAttributionDocument authorAttribution;

    @ApiModelProperty(notes = "Publish time of the review")
    private String publishTime;

    // Diğer alanlar...

    // Getter ve Setter metotları...

    // İlgili constructerlar...
}
