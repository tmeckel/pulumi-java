// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.enums.CloudRunConfigLoadBalancerType;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for the Cloud Run feature.
 * 
 */
public final class CloudRunConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudRunConfigArgs Empty = new CloudRunConfigArgs();

    /**
     * Whether Cloud Run addon is enabled for this cluster.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Which load balancer type is installed for Cloud Run.
     * 
     */
    @InputImport(name="loadBalancerType")
    private final @Nullable Input<CloudRunConfigLoadBalancerType> loadBalancerType;

    public Input<CloudRunConfigLoadBalancerType> getLoadBalancerType() {
        return this.loadBalancerType == null ? Input.empty() : this.loadBalancerType;
    }

    public CloudRunConfigArgs(
        @Nullable Input<Boolean> disabled,
        @Nullable Input<CloudRunConfigLoadBalancerType> loadBalancerType) {
        this.disabled = disabled;
        this.loadBalancerType = loadBalancerType;
    }

    private CloudRunConfigArgs() {
        this.disabled = Input.empty();
        this.loadBalancerType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<CloudRunConfigLoadBalancerType> loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setLoadBalancerType(@Nullable Input<CloudRunConfigLoadBalancerType> loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        public Builder setLoadBalancerType(@Nullable CloudRunConfigLoadBalancerType loadBalancerType) {
            this.loadBalancerType = Input.ofNullable(loadBalancerType);
            return this;
        }

        public CloudRunConfigArgs build() {
            return new CloudRunConfigArgs(disabled, loadBalancerType);
        }
    }
}
