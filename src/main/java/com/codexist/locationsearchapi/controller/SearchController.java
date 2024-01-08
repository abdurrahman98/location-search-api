package com.codexist.locationsearchapi.controller;


import com.codexist.locationsearchapi.model.document.PlaceInformationAllDocument;
import com.codexist.locationsearchapi.service.GoogleSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {
    private final GoogleSearchService googleSearchService;

    @GetMapping
    public PlaceInformationAllDocument search(@RequestParam("radius") Double radius,
                                              @RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude){
        return googleSearchService.search(radius, latitude, longitude);
    }
}
