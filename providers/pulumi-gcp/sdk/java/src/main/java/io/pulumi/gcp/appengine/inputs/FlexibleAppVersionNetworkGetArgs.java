// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionNetworkGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionNetworkGetArgs Empty = new FlexibleAppVersionNetworkGetArgs();

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * 
     */
    @Import(name="forwardedPorts")
      private final @Nullable Output<List<String>> forwardedPorts;

    public Output<List<String>> getForwardedPorts() {
        return this.forwardedPorts == null ? Codegen.empty() : this.forwardedPorts;
    }

    /**
     * Tag to apply to the instance during creation.
     * 
     */
    @Import(name="instanceTag")
      private final @Nullable Output<String> instanceTag;

    public Output<String> getInstanceTag() {
        return this.instanceTag == null ? Codegen.empty() : this.instanceTag;
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Enable session affinity.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<Boolean> sessionAffinity;

    public Output<Boolean> getSessionAffinity() {
        return this.sessionAffinity == null ? Codegen.empty() : this.sessionAffinity;
    }

    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.
     * If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
     * If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetworkName) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
     * If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetworkName must be specified and the IP address is created from the IPCidrRange of the subnetwork.
     * If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public FlexibleAppVersionNetworkGetArgs(
        @Nullable Output<List<String>> forwardedPorts,
        @Nullable Output<String> instanceTag,
        Output<String> name,
        @Nullable Output<Boolean> sessionAffinity,
        @Nullable Output<String> subnetwork) {
        this.forwardedPorts = forwardedPorts;
        this.instanceTag = instanceTag;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sessionAffinity = sessionAffinity;
        this.subnetwork = subnetwork;
    }

    private FlexibleAppVersionNetworkGetArgs() {
        this.forwardedPorts = Codegen.empty();
        this.instanceTag = Codegen.empty();
        this.name = Codegen.empty();
        this.sessionAffinity = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionNetworkGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> forwardedPorts;
        private @Nullable Output<String> instanceTag;
        private Output<String> name;
        private @Nullable Output<Boolean> sessionAffinity;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionNetworkGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardedPorts = defaults.forwardedPorts;
    	      this.instanceTag = defaults.instanceTag;
    	      this.name = defaults.name;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder forwardedPorts(@Nullable Output<List<String>> forwardedPorts) {
            this.forwardedPorts = forwardedPorts;
            return this;
        }
        public Builder forwardedPorts(@Nullable List<String> forwardedPorts) {
            this.forwardedPorts = Codegen.ofNullable(forwardedPorts);
            return this;
        }
        public Builder forwardedPorts(String... forwardedPorts) {
            return forwardedPorts(List.of(forwardedPorts));
        }
        public Builder instanceTag(@Nullable Output<String> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public Builder instanceTag(@Nullable String instanceTag) {
            this.instanceTag = Codegen.ofNullable(instanceTag);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<Boolean> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable Boolean sessionAffinity) {
            this.sessionAffinity = Codegen.ofNullable(sessionAffinity);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public FlexibleAppVersionNetworkGetArgs build() {
            return new FlexibleAppVersionNetworkGetArgs(forwardedPorts, instanceTag, name, sessionAffinity, subnetwork);
        }
    }
}
