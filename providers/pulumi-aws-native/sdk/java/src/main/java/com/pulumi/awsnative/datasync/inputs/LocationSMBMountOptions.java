// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.awsnative.datasync.enums.LocationSMBMountOptionsVersion;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The mount options used by DataSync to access the SMB server.
 * 
 */
public final class LocationSMBMountOptions extends com.pulumi.resources.InvokeArgs {

    public static final LocationSMBMountOptions Empty = new LocationSMBMountOptions();

    /**
     * The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
     */
    @Import(name="version")
    private @Nullable LocationSMBMountOptionsVersion version;

    /**
     * @return The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
     */
    public Optional<LocationSMBMountOptionsVersion> version() {
        return Optional.ofNullable(this.version);
    }

    private LocationSMBMountOptions() {}

    private LocationSMBMountOptions(LocationSMBMountOptions $) {
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationSMBMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationSMBMountOptions $;

        public Builder() {
            $ = new LocationSMBMountOptions();
        }

        public Builder(LocationSMBMountOptions defaults) {
            $ = new LocationSMBMountOptions(Objects.requireNonNull(defaults));
        }

        /**
         * @param version The specific SMB version that you want DataSync to use to mount your SMB share.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable LocationSMBMountOptionsVersion version) {
            $.version = version;
            return this;
        }

        public LocationSMBMountOptions build() {
            return $;
        }
    }

}
