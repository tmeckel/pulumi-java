// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v3.inputs.LatLngResponse;
import com.pulumi.googlenative.jobs_v3.inputs.PostalAddressResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Output only. A resource that represents a location with full geographic information.
 * 
 */
public final class LocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LocationResponse Empty = new LocationResponse();

    /**
     * An object representing a latitude/longitude pair.
     * 
     */
    @Import(name="latLng", required=true)
    private LatLngResponse latLng;

    /**
     * @return An object representing a latitude/longitude pair.
     * 
     */
    public LatLngResponse latLng() {
        return this.latLng;
    }

    /**
     * The type of a location, which corresponds to the address lines field of PostalAddress. For example, &#34;Downtown, Atlanta, GA, USA&#34; has a type of LocationType#NEIGHBORHOOD, and &#34;Kansas City, KS, USA&#34; has a type of LocationType#LOCALITY.
     * 
     */
    @Import(name="locationType", required=true)
    private String locationType;

    /**
     * @return The type of a location, which corresponds to the address lines field of PostalAddress. For example, &#34;Downtown, Atlanta, GA, USA&#34; has a type of LocationType#NEIGHBORHOOD, and &#34;Kansas City, KS, USA&#34; has a type of LocationType#LOCALITY.
     * 
     */
    public String locationType() {
        return this.locationType;
    }

    /**
     * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
     * 
     */
    @Import(name="postalAddress", required=true)
    private PostalAddressResponse postalAddress;

    /**
     * @return Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
     * 
     */
    public PostalAddressResponse postalAddress() {
        return this.postalAddress;
    }

    /**
     * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from LatLng covers the area associated with the job location. For example, currently, &#34;Mountain View, CA, USA&#34; has a radius of 6.17 miles.
     * 
     */
    @Import(name="radiusInMiles", required=true)
    private Double radiusInMiles;

    /**
     * @return Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from LatLng covers the area associated with the job location. For example, currently, &#34;Mountain View, CA, USA&#34; has a radius of 6.17 miles.
     * 
     */
    public Double radiusInMiles() {
        return this.radiusInMiles;
    }

    private LocationResponse() {}

    private LocationResponse(LocationResponse $) {
        this.latLng = $.latLng;
        this.locationType = $.locationType;
        this.postalAddress = $.postalAddress;
        this.radiusInMiles = $.radiusInMiles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationResponse $;

        public Builder() {
            $ = new LocationResponse();
        }

        public Builder(LocationResponse defaults) {
            $ = new LocationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param latLng An object representing a latitude/longitude pair.
         * 
         * @return builder
         * 
         */
        public Builder latLng(LatLngResponse latLng) {
            $.latLng = latLng;
            return this;
        }

        /**
         * @param locationType The type of a location, which corresponds to the address lines field of PostalAddress. For example, &#34;Downtown, Atlanta, GA, USA&#34; has a type of LocationType#NEIGHBORHOOD, and &#34;Kansas City, KS, USA&#34; has a type of LocationType#LOCALITY.
         * 
         * @return builder
         * 
         */
        public Builder locationType(String locationType) {
            $.locationType = locationType;
            return this;
        }

        /**
         * @param postalAddress Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
         * 
         * @return builder
         * 
         */
        public Builder postalAddress(PostalAddressResponse postalAddress) {
            $.postalAddress = postalAddress;
            return this;
        }

        /**
         * @param radiusInMiles Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from LatLng covers the area associated with the job location. For example, currently, &#34;Mountain View, CA, USA&#34; has a radius of 6.17 miles.
         * 
         * @return builder
         * 
         */
        public Builder radiusInMiles(Double radiusInMiles) {
            $.radiusInMiles = radiusInMiles;
            return this;
        }

        public LocationResponse build() {
            $.latLng = Objects.requireNonNull($.latLng, "expected parameter 'latLng' to be non-null");
            $.locationType = Objects.requireNonNull($.locationType, "expected parameter 'locationType' to be non-null");
            $.postalAddress = Objects.requireNonNull($.postalAddress, "expected parameter 'postalAddress' to be non-null");
            $.radiusInMiles = Objects.requireNonNull($.radiusInMiles, "expected parameter 'radiusInMiles' to be non-null");
            return $;
        }
    }

}
