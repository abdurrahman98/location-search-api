package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dates")
@ApiModel(description = "Date information stored in MongoDB")
@Data
public class DateDocument {

    @ApiModelProperty(notes = "Year of the date")
    private int year;

    @ApiModelProperty(notes = "Month of the date")
    private int month;

    @ApiModelProperty(notes = "Day of the date")
    private int day;

}
