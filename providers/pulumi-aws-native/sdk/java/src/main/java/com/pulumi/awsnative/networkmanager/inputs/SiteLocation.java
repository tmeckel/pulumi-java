// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of the site
 * 
 */
public final class SiteLocation extends com.pulumi.resources.InvokeArgs {

    public static final SiteLocation Empty = new SiteLocation();

    /**
     * The physical address.
     * 
     */
    @Import(name="address")
    private @Nullable String address;

    /**
     * @return The physical address.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The latitude.
     * 
     */
    @Import(name="latitude")
    private @Nullable String latitude;

    /**
     * @return The latitude.
     * 
     */
    public Optional<String> latitude() {
        return Optional.ofNullable(this.latitude);
    }

    /**
     * The longitude.
     * 
     */
    @Import(name="longitude")
    private @Nullable String longitude;

    /**
     * @return The longitude.
     * 
     */
    public Optional<String> longitude() {
        return Optional.ofNullable(this.longitude);
    }

    private SiteLocation() {}

    private SiteLocation(SiteLocation $) {
        this.address = $.address;
        this.latitude = $.latitude;
        this.longitude = $.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteLocation $;

        public Builder() {
            $ = new SiteLocation();
        }

        public Builder(SiteLocation defaults) {
            $ = new SiteLocation(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The physical address.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable String address) {
            $.address = address;
            return this;
        }

        /**
         * @param latitude The latitude.
         * 
         * @return builder
         * 
         */
        public Builder latitude(@Nullable String latitude) {
            $.latitude = latitude;
            return this;
        }

        /**
         * @param longitude The longitude.
         * 
         * @return builder
         * 
         */
        public Builder longitude(@Nullable String longitude) {
            $.longitude = longitude;
            return this;
        }

        public SiteLocation build() {
            return $;
        }
    }

}
