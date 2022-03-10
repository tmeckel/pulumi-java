// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ClusterNodeConfigLinuxNodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigLinuxNodeConfigArgs Empty = new ClusterNodeConfigLinuxNodeConfigArgs();

    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
     */
    @InputImport(name="sysctls", required=true)
      private final Input<Map<String,String>> sysctls;

    public Input<Map<String,String>> getSysctls() {
        return this.sysctls;
    }

    public ClusterNodeConfigLinuxNodeConfigArgs(Input<Map<String,String>> sysctls) {
        this.sysctls = Objects.requireNonNull(sysctls, "expected parameter 'sysctls' to be non-null");
    }

    private ClusterNodeConfigLinuxNodeConfigArgs() {
        this.sysctls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigLinuxNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigLinuxNodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(Input<Map<String,String>> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            this.sysctls = Input.of(Objects.requireNonNull(sysctls));
            return this;
        }
        public ClusterNodeConfigLinuxNodeConfigArgs build() {
            return new ClusterNodeConfigLinuxNodeConfigArgs(sysctls);
        }
    }
}
