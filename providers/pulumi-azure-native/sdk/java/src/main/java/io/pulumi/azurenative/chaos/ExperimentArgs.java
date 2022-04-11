// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos;

import io.pulumi.azurenative.chaos.inputs.ExperimentPropertiesArgs;
import io.pulumi.azurenative.chaos.inputs.ResourceIdentityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExperimentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    /**
     * String that represents a Experiment resource name.
     * 
     */
    @Import(name="experimentName")
      private final @Nullable Output<String> experimentName;

    public Output<String> getExperimentName() {
        return this.experimentName == null ? Codegen.empty() : this.experimentName;
    }

    /**
     * The identity of the experiment resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ResourceIdentityArgs> identity;

    public Output<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The properties of the experiment resource.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<ExperimentPropertiesArgs> properties;

    public Output<ExperimentPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ExperimentArgs(
        @Nullable Output<String> experimentName,
        @Nullable Output<ResourceIdentityArgs> identity,
        @Nullable Output<String> location,
        Output<ExperimentPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.experimentName = experimentName;
        this.identity = identity;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ExperimentArgs() {
        this.experimentName = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> experimentName;
        private @Nullable Output<ResourceIdentityArgs> identity;
        private @Nullable Output<String> location;
        private Output<ExperimentPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder experimentName(@Nullable Output<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = Codegen.ofNullable(experimentName);
            return this;
        }
        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(Output<ExperimentPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(ExperimentPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ExperimentArgs build() {
            return new ExperimentArgs(experimentName, identity, location, properties, resourceGroupName, tags);
        }
    }
}
