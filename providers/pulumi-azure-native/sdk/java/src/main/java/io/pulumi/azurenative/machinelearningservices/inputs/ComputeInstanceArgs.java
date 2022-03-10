// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstancePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Azure Machine Learning compute instance.
 * 
 */
public final class ComputeInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeInstanceArgs Empty = new ComputeInstanceArgs();

    /**
     * Location for the underlying compute
     * 
     */
    @InputImport(name="computeLocation")
      private final @Nullable Input<String> computeLocation;

    public Input<String> getComputeLocation() {
        return this.computeLocation == null ? Input.empty() : this.computeLocation;
    }

    /**
     * The type of compute
     * Expected value is 'ComputeInstance'.
     * 
     */
    @InputImport(name="computeType", required=true)
      private final Input<String> computeType;

    public Input<String> getComputeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Compute Instance properties
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<ComputeInstancePropertiesArgs> properties;

    public Input<ComputeInstancePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public ComputeInstanceArgs(
        @Nullable Input<String> computeLocation,
        Input<String> computeType,
        @Nullable Input<String> description,
        @Nullable Input<ComputeInstancePropertiesArgs> properties,
        @Nullable Input<String> resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.properties = properties;
        this.resourceId = resourceId;
    }

    private ComputeInstanceArgs() {
        this.computeLocation = Input.empty();
        this.computeType = Input.empty();
        this.description = Input.empty();
        this.properties = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> computeLocation;
        private Input<String> computeType;
        private @Nullable Input<String> description;
        private @Nullable Input<ComputeInstancePropertiesArgs> properties;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable Input<String> computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }

        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = Input.ofNullable(computeLocation);
            return this;
        }

        public Builder computeType(Input<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder computeType(String computeType) {
            this.computeType = Input.of(Objects.requireNonNull(computeType));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder properties(@Nullable Input<ComputeInstancePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable ComputeInstancePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder resourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }
        public ComputeInstanceArgs build() {
            return new ComputeInstanceArgs(computeLocation, computeType, description, properties, resourceId);
        }
    }
}
