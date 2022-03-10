// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.outputs.Container;
import io.pulumi.awsnative.lightsail.outputs.ContainerPublicEndpoint;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerServiceDeployment {
    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    private final @Nullable List<Container> containers;
    /**
     * An object that describes the endpoint of the deployment.
     * 
     */
    private final @Nullable ContainerPublicEndpoint publicEndpoint;

    @OutputCustomType.Constructor
    private ContainerServiceDeployment(
        @OutputCustomType.Parameter("containers") @Nullable List<Container> containers,
        @OutputCustomType.Parameter("publicEndpoint") @Nullable ContainerPublicEndpoint publicEndpoint) {
        this.containers = containers;
        this.publicEndpoint = publicEndpoint;
    }

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
    */
    public List<Container> getContainers() {
        return this.containers == null ? List.of() : this.containers;
    }
    /**
     * An object that describes the endpoint of the deployment.
     * 
    */
    public Optional<ContainerPublicEndpoint> getPublicEndpoint() {
        return Optional.ofNullable(this.publicEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Container> containers;
        private @Nullable ContainerPublicEndpoint publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder containers(@Nullable List<Container> containers) {
            this.containers = containers;
            return this;
        }

        public Builder publicEndpoint(@Nullable ContainerPublicEndpoint publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public ContainerServiceDeployment build() {
            return new ContainerServiceDeployment(containers, publicEndpoint);
        }
    }
}
