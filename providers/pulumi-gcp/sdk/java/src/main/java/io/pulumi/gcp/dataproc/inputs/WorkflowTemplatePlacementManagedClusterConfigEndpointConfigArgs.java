// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs();

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    @InputImport(name="enableHttpPortAccess")
      private final @Nullable Input<Boolean> enableHttpPortAccess;

    public Input<Boolean> getEnableHttpPortAccess() {
        return this.enableHttpPortAccess == null ? Input.empty() : this.enableHttpPortAccess;
    }

    /**
     * - 
     * Output only. The map of port descriptions to URLs. Will only be populated if enable_http_port_access is true.
     * 
     */
    @InputImport(name="httpPorts")
      private final @Nullable Input<Map<String,String>> httpPorts;

    public Input<Map<String,String>> getHttpPorts() {
        return this.httpPorts == null ? Input.empty() : this.httpPorts;
    }

    public WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs(
        @Nullable Input<Boolean> enableHttpPortAccess,
        @Nullable Input<Map<String,String>> httpPorts) {
        this.enableHttpPortAccess = enableHttpPortAccess;
        this.httpPorts = httpPorts;
    }

    private WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs() {
        this.enableHttpPortAccess = Input.empty();
        this.httpPorts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableHttpPortAccess;
        private @Nullable Input<Map<String,String>> httpPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
    	      this.httpPorts = defaults.httpPorts;
        }

        public Builder enableHttpPortAccess(@Nullable Input<Boolean> enableHttpPortAccess) {
            this.enableHttpPortAccess = enableHttpPortAccess;
            return this;
        }

        public Builder enableHttpPortAccess(@Nullable Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Input.ofNullable(enableHttpPortAccess);
            return this;
        }

        public Builder httpPorts(@Nullable Input<Map<String,String>> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }

        public Builder httpPorts(@Nullable Map<String,String> httpPorts) {
            this.httpPorts = Input.ofNullable(httpPorts);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigEndpointConfigArgs(enableHttpPortAccess, httpPorts);
        }
    }
}
