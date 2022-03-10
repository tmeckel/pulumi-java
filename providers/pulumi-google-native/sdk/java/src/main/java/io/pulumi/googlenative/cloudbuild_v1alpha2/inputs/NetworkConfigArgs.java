// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Network describes the network configuration for a `WorkerPool`.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
     * 
     */
    @InputImport(name="peeredNetwork", required=true)
      private final Input<String> peeredNetwork;

    public Input<String> getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public NetworkConfigArgs(Input<String> peeredNetwork) {
        this.peeredNetwork = Objects.requireNonNull(peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
    }

    private NetworkConfigArgs() {
        this.peeredNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder peeredNetwork(Input<String> peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }

        public Builder peeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Input.of(Objects.requireNonNull(peeredNetwork));
            return this;
        }
        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(peeredNetwork);
        }
    }
}
