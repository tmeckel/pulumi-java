// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.ContainerArgs;
import io.pulumi.awsnative.lightsail.inputs.ContainerPublicEndpointArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a container deployment configuration of an Amazon Lightsail container service.
 * 
 */
public final class ContainerServiceDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerServiceDeploymentArgs Empty = new ContainerServiceDeploymentArgs();

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    @Import(name="containers")
      private final @Nullable Output<List<ContainerArgs>> containers;

    public Output<List<ContainerArgs>> getContainers() {
        return this.containers == null ? Codegen.empty() : this.containers;
    }

    /**
     * An object that describes the endpoint of the deployment.
     * 
     */
    @Import(name="publicEndpoint")
      private final @Nullable Output<ContainerPublicEndpointArgs> publicEndpoint;

    public Output<ContainerPublicEndpointArgs> getPublicEndpoint() {
        return this.publicEndpoint == null ? Codegen.empty() : this.publicEndpoint;
    }

    public ContainerServiceDeploymentArgs(
        @Nullable Output<List<ContainerArgs>> containers,
        @Nullable Output<ContainerPublicEndpointArgs> publicEndpoint) {
        this.containers = containers;
        this.publicEndpoint = publicEndpoint;
    }

    private ContainerServiceDeploymentArgs() {
        this.containers = Codegen.empty();
        this.publicEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ContainerArgs>> containers;
        private @Nullable Output<ContainerPublicEndpointArgs> publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder containers(@Nullable Output<List<ContainerArgs>> containers) {
            this.containers = containers;
            return this;
        }
        public Builder containers(@Nullable List<ContainerArgs> containers) {
            this.containers = Codegen.ofNullable(containers);
            return this;
        }
        public Builder containers(ContainerArgs... containers) {
            return containers(List.of(containers));
        }
        public Builder publicEndpoint(@Nullable Output<ContainerPublicEndpointArgs> publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public Builder publicEndpoint(@Nullable ContainerPublicEndpointArgs publicEndpoint) {
            this.publicEndpoint = Codegen.ofNullable(publicEndpoint);
            return this;
        }        public ContainerServiceDeploymentArgs build() {
            return new ContainerServiceDeploymentArgs(containers, publicEndpoint);
        }
    }
}
