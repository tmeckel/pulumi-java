// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters that can be configured on Linux nodes.
 * 
 */
public final class LinuxNodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinuxNodeConfigArgs Empty = new LinuxNodeConfigArgs();

    /**
     * The Linux kernel parameters to be applied to the nodes and all pods running on the nodes. The following parameters are supported. net.core.netdev_max_backlog net.core.rmem_max net.core.wmem_default net.core.wmem_max net.core.optmem_max net.core.somaxconn net.ipv4.tcp_rmem net.ipv4.tcp_wmem net.ipv4.tcp_tw_reuse
     * 
     */
    @Import(name="sysctls")
      private final @Nullable Output<Map<String,String>> sysctls;

    public Output<Map<String,String>> getSysctls() {
        return this.sysctls == null ? Codegen.empty() : this.sysctls;
    }

    public LinuxNodeConfigArgs(@Nullable Output<Map<String,String>> sysctls) {
        this.sysctls = sysctls;
    }

    private LinuxNodeConfigArgs() {
        this.sysctls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxNodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(@Nullable Output<Map<String,String>> sysctls) {
            this.sysctls = sysctls;
            return this;
        }
        public Builder sysctls(@Nullable Map<String,String> sysctls) {
            this.sysctls = Codegen.ofNullable(sysctls);
            return this;
        }        public LinuxNodeConfigArgs build() {
            return new LinuxNodeConfigArgs(sysctls);
        }
    }
}
