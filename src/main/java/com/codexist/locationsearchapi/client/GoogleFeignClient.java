package com.codexist.locationsearchapi.client;

import com.codexist.locationsearchapi.model.document.PlaceInformationAllDocument;
import com.codexist.locationsearchapi.model.PlacesApiRequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "google-places-api", url = "${google-places-api.url}")
public interface GoogleFeignClient {
    @PostMapping("/places:searchNearby")
    PlaceInformationAllDocument searchNearby(@RequestBody PlacesApiRequestBody placesApiRequestBody);
}
