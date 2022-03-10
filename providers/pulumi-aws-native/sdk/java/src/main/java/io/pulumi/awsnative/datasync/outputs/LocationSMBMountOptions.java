// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.LocationSMBMountOptionsVersion;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LocationSMBMountOptions {
    /**
     * The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
     */
    private final @Nullable LocationSMBMountOptionsVersion version;

    @OutputCustomType.Constructor
    private LocationSMBMountOptions(@OutputCustomType.Parameter("version") @Nullable LocationSMBMountOptionsVersion version) {
        this.version = version;
    }

    /**
     * The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
    */
    public Optional<LocationSMBMountOptionsVersion> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSMBMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationSMBMountOptionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSMBMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable LocationSMBMountOptionsVersion version) {
            this.version = version;
            return this;
        }
        public LocationSMBMountOptions build() {
            return new LocationSMBMountOptions(version);
        }
    }
}
