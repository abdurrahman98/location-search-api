package com.codexist.locationsearchapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Circle {
    @JsonProperty("center")
    private Center center;
    @JsonProperty("radius")
    private double radius;

}