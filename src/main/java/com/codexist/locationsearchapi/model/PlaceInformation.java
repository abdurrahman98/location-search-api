package com.codexist.locationsearchapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder

public class PlaceInformation {
    @JsonProperty("name")
    private String name;
    private String id;
    private List<String> types;
    private String nationalPhoneNumber;
    private String internationalPhoneNumber;
    private String formattedAddress;
    private List<AddressComponent> addressComponents;
    private PlusCode plusCode;
    private Location location;
    private Viewport viewport;
    private double rating;
    private String googleMapsUri;
    private String websiteUri;
    private RegularOpeningHours regularOpeningHours;
    private int utcOffsetMinutes;
    private String adrFormatAddress;
    private String businessStatus;
    private int userRatingCount;
    private String iconMaskBaseUri;
    private String iconBackgroundColor;
    private DisplayName displayName;
    private PrimaryTypeDisplayName primaryTypeDisplayName;
    private boolean delivery;
    private CurrentOpeningHours currentOpeningHours;
    private String primaryType;
    private String shortFormattedAddress;
    private EditorialSummary editorialSummary;
    private List<Review> reviews;
    private List<Photo> photos;
    private boolean goodForChildren;
    private AccessibilityOptions accessibilityOptions;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class AddressComponent {
        private String longText;
        private String shortText;
        private List<String> types;
        private String languageCode;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class PlusCode {
        private String globalCode;
        private String compoundCode;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Location {
        private double latitude;
        private double longitude;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Viewport {
        private Location low;
        private Location high;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class RegularOpeningHours {
        private boolean openNow;
        private List<OpeningPeriod> periods;
        private List<String> weekdayDescriptions;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class OpeningPeriod {
        private OpeningTime open;
        private OpeningTime close;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class OpeningTime {
        private int day;
        private int hour;
        private int minute;
        private Date date;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Date {
        private int year;
        private int month;
        private int day;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class CurrentOpeningHours {
        private boolean openNow;
        private List<OpeningPeriod> periods;
        private List<String> weekdayDescriptions;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class DisplayName {
        private String text;
        private String languageCode;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class PrimaryTypeDisplayName {
        private String text;
        private String languageCode;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class EditorialSummary {
        private String text;
        private String languageCode;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Review {
        private String name;
        private String relativePublishTimeDescription;
        private int rating;
        private Text text;
        private Text originalText;
        private AuthorAttribution authorAttribution;
        private String publishTime;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Text {
        private String text;
        private String languageCode;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class AuthorAttribution {
        private String displayName;
        private String uri;
        private String photoUri;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Photo {
        private String name;
        private int widthPx;
        private int heightPx;
        private List<AuthorAttribution> authorAttributions;

    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class AccessibilityOptions {
        private boolean wheelchairAccessibleParking;
        private boolean wheelchairAccessibleEntrance;

    }
}
