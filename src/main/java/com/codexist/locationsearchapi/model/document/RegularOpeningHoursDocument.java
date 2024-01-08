package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "regularOpeningHours")
@ApiModel(description = "Regular opening hours information stored in MongoDB")
@Data
public class RegularOpeningHoursDocument {

    @ApiModelProperty(notes = "Whether the place is open now")
    private boolean openNow;

    @ApiModelProperty(notes = "List of opening periods")
    private List<OpeningPeriodDocument> periods;

    @ApiModelProperty(notes = "List of weekday descriptions")
    private List<String> weekdayDescriptions;

}
