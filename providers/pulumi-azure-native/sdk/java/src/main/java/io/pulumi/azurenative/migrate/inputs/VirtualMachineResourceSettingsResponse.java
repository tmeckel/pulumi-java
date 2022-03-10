// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets or sets the virtual machine resource settings.
 * 
 */
public final class VirtualMachineResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineResourceSettingsResponse Empty = new VirtualMachineResourceSettingsResponse();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target availability set id for virtual machines not in an availability set at source.
     * 
     */
    @InputImport(name="targetAvailabilitySetId")
      private final @Nullable String targetAvailabilitySetId;

    public Optional<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Optional.empty() : Optional.ofNullable(this.targetAvailabilitySetId);
    }

    /**
     * Gets or sets the target availability zone.
     * 
     */
    @InputImport(name="targetAvailabilityZone")
      private final @Nullable String targetAvailabilityZone;

    public Optional<String> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Optional.empty() : Optional.ofNullable(this.targetAvailabilityZone);
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @InputImport(name="targetResourceName", required=true)
      private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the target virtual machine size.
     * 
     */
    @InputImport(name="targetVmSize")
      private final @Nullable String targetVmSize;

    public Optional<String> getTargetVmSize() {
        return this.targetVmSize == null ? Optional.empty() : Optional.ofNullable(this.targetVmSize);
    }

    public VirtualMachineResourceSettingsResponse(
        String resourceType,
        @Nullable String targetAvailabilitySetId,
        @Nullable String targetAvailabilityZone,
        String targetResourceName,
        @Nullable String targetVmSize) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.targetVmSize = targetVmSize;
    }

    private VirtualMachineResourceSettingsResponse() {
        this.resourceType = null;
        this.targetAvailabilitySetId = null;
        this.targetAvailabilityZone = null;
        this.targetResourceName = null;
        this.targetVmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private @Nullable String targetAvailabilitySetId;
        private @Nullable String targetAvailabilityZone;
        private String targetResourceName;
        private @Nullable String targetVmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.targetVmSize = defaults.targetVmSize;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder targetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public VirtualMachineResourceSettingsResponse build() {
            return new VirtualMachineResourceSettingsResponse(resourceType, targetAvailabilitySetId, targetAvailabilityZone, targetResourceName, targetVmSize);
        }
    }
}
