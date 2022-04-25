// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.awsnative.lightsail.inputs.ContainerArgs;
import com.pulumi.awsnative.lightsail.inputs.ContainerPublicEndpointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a container deployment configuration of an Amazon Lightsail container service.
 * 
 */
public final class ContainerServiceDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerServiceDeploymentArgs Empty = new ContainerServiceDeploymentArgs();

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    @Import(name="containers")
    private @Nullable Output<List<ContainerArgs>> containers;

    /**
     * @return An object that describes the configuration for the containers of the deployment.
     * 
     */
    public Optional<Output<List<ContainerArgs>>> containers() {
        return Optional.ofNullable(this.containers);
    }

    /**
     * An object that describes the endpoint of the deployment.
     * 
     */
    @Import(name="publicEndpoint")
    private @Nullable Output<ContainerPublicEndpointArgs> publicEndpoint;

    /**
     * @return An object that describes the endpoint of the deployment.
     * 
     */
    public Optional<Output<ContainerPublicEndpointArgs>> publicEndpoint() {
        return Optional.ofNullable(this.publicEndpoint);
    }

    private ContainerServiceDeploymentArgs() {}

    private ContainerServiceDeploymentArgs(ContainerServiceDeploymentArgs $) {
        this.containers = $.containers;
        this.publicEndpoint = $.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerServiceDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerServiceDeploymentArgs $;

        public Builder() {
            $ = new ContainerServiceDeploymentArgs();
        }

        public Builder(ContainerServiceDeploymentArgs defaults) {
            $ = new ContainerServiceDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containers An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder containers(@Nullable Output<List<ContainerArgs>> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder containers(List<ContainerArgs> containers) {
            return containers(Output.of(containers));
        }

        /**
         * @param containers An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder containers(ContainerArgs... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param publicEndpoint An object that describes the endpoint of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder publicEndpoint(@Nullable Output<ContainerPublicEndpointArgs> publicEndpoint) {
            $.publicEndpoint = publicEndpoint;
            return this;
        }

        /**
         * @param publicEndpoint An object that describes the endpoint of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder publicEndpoint(ContainerPublicEndpointArgs publicEndpoint) {
            return publicEndpoint(Output.of(publicEndpoint));
        }

        public ContainerServiceDeploymentArgs build() {
            return $;
        }
    }

}
