// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.GuestOsFeatureType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Guest OS features.
 * 
 */
public final class GuestOsFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestOsFeatureArgs Empty = new GuestOsFeatureArgs();

    /**
     * The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<GuestOsFeatureType> type;

    public Output<GuestOsFeatureType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public GuestOsFeatureArgs(@Nullable Output<GuestOsFeatureType> type) {
        this.type = type;
    }

    private GuestOsFeatureArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOsFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GuestOsFeatureType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOsFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<GuestOsFeatureType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable GuestOsFeatureType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public GuestOsFeatureArgs build() {
            return new GuestOsFeatureArgs(type);
        }
    }
}
