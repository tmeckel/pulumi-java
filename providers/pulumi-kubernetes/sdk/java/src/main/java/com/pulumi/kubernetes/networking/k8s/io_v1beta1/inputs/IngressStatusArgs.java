// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.LoadBalancerStatusArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressStatus describe the current state of the Ingress.
 * 
 */
public final class IngressStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressStatusArgs Empty = new IngressStatusArgs();

    /**
     * LoadBalancer contains the current status of the load-balancer.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<LoadBalancerStatusArgs> loadBalancer;

    /**
     * @return LoadBalancer contains the current status of the load-balancer.
     * 
     */
    public Optional<Output<LoadBalancerStatusArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    private IngressStatusArgs() {}

    private IngressStatusArgs(IngressStatusArgs $) {
        this.loadBalancer = $.loadBalancer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressStatusArgs $;

        public Builder() {
            $ = new IngressStatusArgs();
        }

        public Builder(IngressStatusArgs defaults) {
            $ = new IngressStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadBalancer LoadBalancer contains the current status of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<LoadBalancerStatusArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer LoadBalancer contains the current status of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(LoadBalancerStatusArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        public IngressStatusArgs build() {
            return $;
        }
    }

}
