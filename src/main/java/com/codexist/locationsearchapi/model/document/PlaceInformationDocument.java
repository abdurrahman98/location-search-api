package com.codexist.locationsearchapi.model.document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "places")
@ApiModel(description = "Place information stored in MongoDB")
@Data
public class PlaceInformationDocument {

    @Id
    @ApiModelProperty(notes = "Unique identifier of the place")
    private String id;

    @ApiModelProperty(notes = "Name of the place")
    private String name;

    @ApiModelProperty(notes = "List of types associated with the place")
    private List<String> types;

    @ApiModelProperty(notes = "National phone number of the place")
    private String nationalPhoneNumber;

    @ApiModelProperty(notes = "International phone number of the place")
    private String internationalPhoneNumber;

    @ApiModelProperty(notes = "Formatted address of the place")
    private String formattedAddress;

    @ApiModelProperty(notes = "List of address components")
    private List<AddressComponentDocument> addressComponents;

    @ApiModelProperty(notes = "Plus code information")
    private PlusCodeDocument plusCode;

    @ApiModelProperty(notes = "Location information")
    private LocationDocument location;

    @ApiModelProperty(notes = "Viewport information")
    private ViewportDocument viewport;

    @ApiModelProperty(notes = "Rating of the place")
    private double rating;

    @ApiModelProperty(notes = "Google Maps URI of the place")
    private String googleMapsUri;

    @ApiModelProperty(notes = "Website URI of the place")
    private String websiteUri;

    @ApiModelProperty(notes = "Regular opening hours information")
    private RegularOpeningHoursDocument regularOpeningHours;

    @ApiModelProperty(notes = "UTC offset in minutes")
    private int utcOffsetMinutes;

    @ApiModelProperty(notes = "ADR format address")
    private String adrFormatAddress;

    @ApiModelProperty(notes = "Business status of the place")
    private String businessStatus;

    @ApiModelProperty(notes = "User rating count of the place")
    private int userRatingCount;

    @ApiModelProperty(notes = "Base URI for the icon mask")
    private String iconMaskBaseUri;

    @ApiModelProperty(notes = "Background color of the icon")
    private String iconBackgroundColor;

    @ApiModelProperty(notes = "Display name information")
    private DisplayNameDocument displayName;

    @ApiModelProperty(notes = "Primary type display name information")
    private PrimaryTypeDisplayNameDocument primaryTypeDisplayName;

    @ApiModelProperty(notes = "Whether the place is good for children")
    private boolean goodForChildren;

    @ApiModelProperty(notes = "Current opening hours information")
    private CurrentOpeningHoursDocument currentOpeningHours;

    @ApiModelProperty(notes = "Primary type of the place")
    private String primaryType;

    @ApiModelProperty(notes = "Short formatted address of the place")
    private String shortFormattedAddress;

    @ApiModelProperty(notes = "Editorial summary information")
    private EditorialSummaryDocument editorialSummary;

    @ApiModelProperty(notes = "List of reviews associated with the place")
    private List<ReviewDocument> reviews;

    @ApiModelProperty(notes = "List of photos associated with the place")
    private List<PhotoDocument> photos;

    @ApiModelProperty(notes = "Accessibility options information")
    private AccessibilityOptionsDocument accessibilityOptions;

}
