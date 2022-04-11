// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Node kubelet configs.
 * 
 */
public final class NodeKubeletConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeKubeletConfigArgs Empty = new NodeKubeletConfigArgs();

    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled by default which makes kubelet use CFS quota (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU throttling problems while still having your pods to be in Guaranteed QoS class by specifying the CPU limits. The default value is 'true' if unspecified.
     * 
     */
    @Import(name="cpuCfsQuota")
      private final @Nullable Output<Boolean> cpuCfsQuota;

    public Output<Boolean> getCpuCfsQuota() {
        return this.cpuCfsQuota == null ? Codegen.empty() : this.cpuCfsQuota;
    }

    /**
     * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
      private final @Nullable Output<String> cpuCfsQuotaPeriod;

    public Output<String> getCpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod == null ? Codegen.empty() : this.cpuCfsQuotaPeriod;
    }

    /**
     * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which represents the existing scheduling behavior. * "static": allows pods with certain resource characteristics to be granted increased CPU affinity and exclusivity on the node. The default value is 'none' if unspecified.
     * 
     */
    @Import(name="cpuManagerPolicy")
      private final @Nullable Output<String> cpuManagerPolicy;

    public Output<String> getCpuManagerPolicy() {
        return this.cpuManagerPolicy == null ? Codegen.empty() : this.cpuManagerPolicy;
    }

    public NodeKubeletConfigArgs(
        @Nullable Output<Boolean> cpuCfsQuota,
        @Nullable Output<String> cpuCfsQuotaPeriod,
        @Nullable Output<String> cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
    }

    private NodeKubeletConfigArgs() {
        this.cpuCfsQuota = Codegen.empty();
        this.cpuCfsQuotaPeriod = Codegen.empty();
        this.cpuManagerPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeKubeletConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cpuCfsQuota;
        private @Nullable Output<String> cpuCfsQuotaPeriod;
        private @Nullable Output<String> cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeKubeletConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Codegen.ofNullable(cpuCfsQuota);
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Codegen.ofNullable(cpuCfsQuotaPeriod);
            return this;
        }
        public Builder cpuManagerPolicy(@Nullable Output<String> cpuManagerPolicy) {
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }
        public Builder cpuManagerPolicy(@Nullable String cpuManagerPolicy) {
            this.cpuManagerPolicy = Codegen.ofNullable(cpuManagerPolicy);
            return this;
        }        public NodeKubeletConfigArgs build() {
            return new NodeKubeletConfigArgs(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
