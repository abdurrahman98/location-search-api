package com.codexist.locationsearchapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlacesApiRequestBody {
    @JsonProperty("languageCode")
    private String languageCode;
    @JsonProperty("locationRestriction")
    private LocationRestriction locationRestriction;


}