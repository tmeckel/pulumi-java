// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionNetworkEndpointGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionNetworkEndpointGroupArgs Empty = new GetRegionNetworkEndpointGroupArgs();

    @InputImport(name="networkEndpointGroup", required=true)
      private final String networkEndpointGroup;

    public String getNetworkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetRegionNetworkEndpointGroupArgs(
        String networkEndpointGroup,
        @Nullable String project,
        String region) {
        this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionNetworkEndpointGroupArgs() {
        this.networkEndpointGroup = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkEndpointGroup;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkEndpointGroup = defaults.networkEndpointGroup;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetRegionNetworkEndpointGroupArgs build() {
            return new GetRegionNetworkEndpointGroupArgs(networkEndpointGroup, project, region);
        }
    }
}
