// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTopologyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTopologyArgs Empty = new ServiceTopologyArgs();

    /**
     * The resource Id of the artifact source that contains the artifacts that can be referenced in the service units.
     * 
     */
    @Import(name="artifactSourceId")
      private final @Nullable Output<String> artifactSourceId;

    public Output<String> getArtifactSourceId() {
        return this.artifactSourceId == null ? Codegen.empty() : this.artifactSourceId;
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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @Import(name="serviceTopologyName")
      private final @Nullable Output<String> serviceTopologyName;

    public Output<String> getServiceTopologyName() {
        return this.serviceTopologyName == null ? Codegen.empty() : this.serviceTopologyName;
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

    public ServiceTopologyArgs(
        @Nullable Output<String> artifactSourceId,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> serviceTopologyName,
        @Nullable Output<Map<String,String>> tags) {
        this.artifactSourceId = artifactSourceId;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceTopologyName = serviceTopologyName;
        this.tags = tags;
    }

    private ServiceTopologyArgs() {
        this.artifactSourceId = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceTopologyName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactSourceId;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serviceTopologyName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTopologyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSourceId = defaults.artifactSourceId;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceTopologyName = defaults.serviceTopologyName;
    	      this.tags = defaults.tags;
        }

        public Builder artifactSourceId(@Nullable Output<String> artifactSourceId) {
            this.artifactSourceId = artifactSourceId;
            return this;
        }
        public Builder artifactSourceId(@Nullable String artifactSourceId) {
            this.artifactSourceId = Codegen.ofNullable(artifactSourceId);
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceTopologyName(@Nullable Output<String> serviceTopologyName) {
            this.serviceTopologyName = serviceTopologyName;
            return this;
        }
        public Builder serviceTopologyName(@Nullable String serviceTopologyName) {
            this.serviceTopologyName = Codegen.ofNullable(serviceTopologyName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ServiceTopologyArgs build() {
            return new ServiceTopologyArgs(artifactSourceId, location, resourceGroupName, serviceTopologyName, tags);
        }
    }
}
