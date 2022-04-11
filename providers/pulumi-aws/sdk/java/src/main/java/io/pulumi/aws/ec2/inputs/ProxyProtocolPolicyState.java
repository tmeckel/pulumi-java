// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyProtocolPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ProxyProtocolPolicyState Empty = new ProxyProtocolPolicyState();

    /**
     * List of instance ports to which the policy
     * should be applied. This can be specified if the protocol is SSL or TCP.
     * 
     */
    @Import(name="instancePorts")
      private final @Nullable Output<List<String>> instancePorts;

    public Output<List<String>> getInstancePorts() {
        return this.instancePorts == null ? Codegen.empty() : this.instancePorts;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer")
      private final @Nullable Output<String> loadBalancer;

    public Output<String> getLoadBalancer() {
        return this.loadBalancer == null ? Codegen.empty() : this.loadBalancer;
    }

    public ProxyProtocolPolicyState(
        @Nullable Output<List<String>> instancePorts,
        @Nullable Output<String> loadBalancer) {
        this.instancePorts = instancePorts;
        this.loadBalancer = loadBalancer;
    }

    private ProxyProtocolPolicyState() {
        this.instancePorts = Codegen.empty();
        this.loadBalancer = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyProtocolPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> instancePorts;
        private @Nullable Output<String> loadBalancer;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyProtocolPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePorts = defaults.instancePorts;
    	      this.loadBalancer = defaults.loadBalancer;
        }

        public Builder instancePorts(@Nullable Output<List<String>> instancePorts) {
            this.instancePorts = instancePorts;
            return this;
        }
        public Builder instancePorts(@Nullable List<String> instancePorts) {
            this.instancePorts = Codegen.ofNullable(instancePorts);
            return this;
        }
        public Builder instancePorts(String... instancePorts) {
            return instancePorts(List.of(instancePorts));
        }
        public Builder loadBalancer(@Nullable Output<String> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public Builder loadBalancer(@Nullable String loadBalancer) {
            this.loadBalancer = Codegen.ofNullable(loadBalancer);
            return this;
        }        public ProxyProtocolPolicyState build() {
            return new ProxyProtocolPolicyState(instancePorts, loadBalancer);
        }
    }
}
