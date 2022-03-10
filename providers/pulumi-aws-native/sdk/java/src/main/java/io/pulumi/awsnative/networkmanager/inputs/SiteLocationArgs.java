// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of the site
 * 
 */
public final class SiteLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteLocationArgs Empty = new SiteLocationArgs();

    /**
     * The physical address.
     * 
     */
    @InputImport(name="address")
      private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * The latitude.
     * 
     */
    @InputImport(name="latitude")
      private final @Nullable Input<String> latitude;

    public Input<String> getLatitude() {
        return this.latitude == null ? Input.empty() : this.latitude;
    }

    /**
     * The longitude.
     * 
     */
    @InputImport(name="longitude")
      private final @Nullable Input<String> longitude;

    public Input<String> getLongitude() {
        return this.longitude == null ? Input.empty() : this.longitude;
    }

    public SiteLocationArgs(
        @Nullable Input<String> address,
        @Nullable Input<String> latitude,
        @Nullable Input<String> longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private SiteLocationArgs() {
        this.address = Input.empty();
        this.latitude = Input.empty();
        this.longitude = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> latitude;
        private @Nullable Input<String> longitude;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
        }

        public Builder address(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder address(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder latitude(@Nullable Input<String> latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder latitude(@Nullable String latitude) {
            this.latitude = Input.ofNullable(latitude);
            return this;
        }

        public Builder longitude(@Nullable Input<String> longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder longitude(@Nullable String longitude) {
            this.longitude = Input.ofNullable(longitude);
            return this;
        }
        public SiteLocationArgs build() {
            return new SiteLocationArgs(address, latitude, longitude);
        }
    }
}
