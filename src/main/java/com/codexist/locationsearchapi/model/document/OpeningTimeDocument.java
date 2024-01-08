package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "openingTimes")
@ApiModel(description = "Opening time information stored in MongoDB")
@Data
public class OpeningTimeDocument {

    @ApiModelProperty(notes = "Day of the opening time")
    private int day;

    @ApiModelProperty(notes = "Hour of the opening time")
    private int hour;

    @ApiModelProperty(notes = "Minute of the opening time")
    private int minute;

    @ApiModelProperty(notes = "Date information")
    private DateDocument date;

}
