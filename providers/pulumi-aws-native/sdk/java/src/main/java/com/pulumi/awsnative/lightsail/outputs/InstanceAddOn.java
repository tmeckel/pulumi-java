// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.awsnative.lightsail.enums.InstanceAddOnStatus;
import com.pulumi.awsnative.lightsail.outputs.InstanceAutoSnapshotAddOn;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceAddOn {
    /**
     * @return The add-on type
     * 
     */
    private final String addOnType;
    private final @Nullable InstanceAutoSnapshotAddOn autoSnapshotAddOnRequest;
    /**
     * @return Status of the Addon
     * 
     */
    private final @Nullable InstanceAddOnStatus status;

    @CustomType.Constructor
    private InstanceAddOn(
        @CustomType.Parameter("addOnType") String addOnType,
        @CustomType.Parameter("autoSnapshotAddOnRequest") @Nullable InstanceAutoSnapshotAddOn autoSnapshotAddOnRequest,
        @CustomType.Parameter("status") @Nullable InstanceAddOnStatus status) {
        this.addOnType = addOnType;
        this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
        this.status = status;
    }

    /**
     * @return The add-on type
     * 
     */
    public String addOnType() {
        return this.addOnType;
    }
    public Optional<InstanceAutoSnapshotAddOn> autoSnapshotAddOnRequest() {
        return Optional.ofNullable(this.autoSnapshotAddOnRequest);
    }
    /**
     * @return Status of the Addon
     * 
     */
    public Optional<InstanceAddOnStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAddOn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addOnType;
        private @Nullable InstanceAutoSnapshotAddOn autoSnapshotAddOnRequest;
        private @Nullable InstanceAddOnStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAddOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnType = defaults.addOnType;
    	      this.autoSnapshotAddOnRequest = defaults.autoSnapshotAddOnRequest;
    	      this.status = defaults.status;
        }

        public Builder addOnType(String addOnType) {
            this.addOnType = Objects.requireNonNull(addOnType);
            return this;
        }
        public Builder autoSnapshotAddOnRequest(@Nullable InstanceAutoSnapshotAddOn autoSnapshotAddOnRequest) {
            this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
            return this;
        }
        public Builder status(@Nullable InstanceAddOnStatus status) {
            this.status = status;
            return this;
        }        public InstanceAddOn build() {
            return new InstanceAddOn(addOnType, autoSnapshotAddOnRequest, status);
        }
    }
}
