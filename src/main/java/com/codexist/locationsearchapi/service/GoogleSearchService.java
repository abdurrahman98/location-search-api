package com.codexist.locationsearchapi.service;


import com.codexist.locationsearchapi.client.GoogleFeignClient;
import com.codexist.locationsearchapi.model.document.PlaceInformationAllDocument;
import com.codexist.locationsearchapi.model.Center;
import com.codexist.locationsearchapi.model.Circle;
import com.codexist.locationsearchapi.model.LocationRestriction;
import com.codexist.locationsearchapi.model.PlacesApiRequestBody;
import com.codexist.locationsearchapi.repository.PlaceInformationAllRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoogleSearchService {

    private final GoogleFeignClient googleFeignClient;

    private final PlaceInformationAllRepository placeInformationAllRepository;
    @Value("${google-places-api.language}")
    private String language;

    public PlaceInformationAllDocument search(Double radius, Double latitude,Double longitude) {
        String id = String.format("%.4f_%.4f_%.4f", radius,latitude,longitude);
        return placeInformationAllRepository.findById(id).orElseGet(()->{
            PlaceInformationAllDocument placeInformationAllDocument = googleFeignClient.searchNearby(createBody(radius, latitude, longitude));
            placeInformationAllDocument.setId(id);
            return placeInformationAllRepository.save(placeInformationAllDocument);
        });
    }

    private PlacesApiRequestBody createBody(Double radius, Double latitude,Double longitude) {
        return PlacesApiRequestBody.builder()
                .languageCode(language)
                .locationRestriction(LocationRestriction.builder()
                        .circle(Circle.builder()
                                .center(Center.builder()
                                        .latitude(latitude)
                                        .longitude(longitude)
                                        .build())
                                .radius(radius)
                                .build())
                        .build())
                .build();
    }
}
