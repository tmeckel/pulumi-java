// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A DataFactory compute.
 * 
 */
public final class DataFactoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataFactoryArgs Empty = new DataFactoryArgs();

    /**
     * Location for the underlying compute
     * 
     */
    @Import(name="computeLocation")
      private final @Nullable Output<String> computeLocation;

    public Output<String> getComputeLocation() {
        return this.computeLocation == null ? Codegen.empty() : this.computeLocation;
    }

    /**
     * The type of compute
     * Expected value is 'DataFactory'.
     * 
     */
    @Import(name="computeType", required=true)
      private final Output<String> computeType;

    public Output<String> getComputeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public DataFactoryArgs(
        @Nullable Output<String> computeLocation,
        Output<String> computeType,
        @Nullable Output<String> description,
        @Nullable Output<String> resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.resourceId = resourceId;
    }

    private DataFactoryArgs() {
        this.computeLocation = Codegen.empty();
        this.computeType = Codegen.empty();
        this.description = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFactoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computeLocation;
        private Output<String> computeType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFactoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable Output<String> computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }
        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = Codegen.ofNullable(computeLocation);
            return this;
        }
        public Builder computeType(Output<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Output.of(Objects.requireNonNull(computeType));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public DataFactoryArgs build() {
            return new DataFactoryArgs(computeLocation, computeType, description, resourceId);
        }
    }
}
