// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkEndpointGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkEndpointGroupArgs Empty = new GetNetworkEndpointGroupArgs();

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

    @InputImport(name="zone", required=true)
    private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetNetworkEndpointGroupArgs(
        String networkEndpointGroup,
        @Nullable String project,
        String zone) {
        this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetNetworkEndpointGroupArgs() {
        this.networkEndpointGroup = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkEndpointGroup;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkEndpointGroup = defaults.networkEndpointGroup;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setNetworkEndpointGroup(String networkEndpointGroup) {
            this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetNetworkEndpointGroupArgs build() {
            return new GetNetworkEndpointGroupArgs(networkEndpointGroup, project, zone);
        }
    }
}
