// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.LifecycleHandlerArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 * 
 */
public final class LifecycleArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecycleArgs Empty = new LifecycleArgs();

    /**
     * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @Import(name="postStart")
    private @Nullable Output<LifecycleHandlerArgs> postStart;

    /**
     * @return PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    public Optional<Output<LifecycleHandlerArgs>> postStart() {
        return Optional.ofNullable(this.postStart);
    }

    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod&#39;s termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod&#39;s termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @Import(name="preStop")
    private @Nullable Output<LifecycleHandlerArgs> preStop;

    /**
     * @return PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod&#39;s termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod&#39;s termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    public Optional<Output<LifecycleHandlerArgs>> preStop() {
        return Optional.ofNullable(this.preStop);
    }

    private LifecycleArgs() {}

    private LifecycleArgs(LifecycleArgs $) {
        this.postStart = $.postStart;
        this.preStop = $.preStop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecycleArgs $;

        public Builder() {
            $ = new LifecycleArgs();
        }

        public Builder(LifecycleArgs defaults) {
            $ = new LifecycleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param postStart PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * 
         * @return builder
         * 
         */
        public Builder postStart(@Nullable Output<LifecycleHandlerArgs> postStart) {
            $.postStart = postStart;
            return this;
        }

        /**
         * @param postStart PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * 
         * @return builder
         * 
         */
        public Builder postStart(LifecycleHandlerArgs postStart) {
            return postStart(Output.of(postStart));
        }

        /**
         * @param preStop PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod&#39;s termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod&#39;s termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * 
         * @return builder
         * 
         */
        public Builder preStop(@Nullable Output<LifecycleHandlerArgs> preStop) {
            $.preStop = preStop;
            return this;
        }

        /**
         * @param preStop PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod&#39;s termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod&#39;s termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * 
         * @return builder
         * 
         */
        public Builder preStop(LifecycleHandlerArgs preStop) {
            return preStop(Output.of(preStop));
        }

        public LifecycleArgs build() {
            return $;
        }
    }

}
