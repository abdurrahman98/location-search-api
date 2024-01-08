package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "openingPeriods")
@ApiModel(description = "Opening period information stored in MongoDB")
@Data
public class OpeningPeriodDocument {

    @ApiModelProperty(notes = "Opening time information")
    private OpeningTimeDocument open;

    @ApiModelProperty(notes = "Closing time information")
    private OpeningTimeDocument close;

}
