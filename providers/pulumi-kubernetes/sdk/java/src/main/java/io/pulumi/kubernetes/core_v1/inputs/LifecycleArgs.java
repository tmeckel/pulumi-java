// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LifecycleHandlerArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 * 
 */
public final class LifecycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleArgs Empty = new LifecycleArgs();

    /**
     * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @InputImport(name="postStart")
      private final @Nullable Input<LifecycleHandlerArgs> postStart;

    public Input<LifecycleHandlerArgs> getPostStart() {
        return this.postStart == null ? Input.empty() : this.postStart;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @InputImport(name="preStop")
      private final @Nullable Input<LifecycleHandlerArgs> preStop;

    public Input<LifecycleHandlerArgs> getPreStop() {
        return this.preStop == null ? Input.empty() : this.preStop;
    }

    public LifecycleArgs(
        @Nullable Input<LifecycleHandlerArgs> postStart,
        @Nullable Input<LifecycleHandlerArgs> preStop) {
        this.postStart = postStart;
        this.preStop = preStop;
    }

    private LifecycleArgs() {
        this.postStart = Input.empty();
        this.preStop = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LifecycleHandlerArgs> postStart;
        private @Nullable Input<LifecycleHandlerArgs> preStop;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postStart = defaults.postStart;
    	      this.preStop = defaults.preStop;
        }

        public Builder postStart(@Nullable Input<LifecycleHandlerArgs> postStart) {
            this.postStart = postStart;
            return this;
        }

        public Builder postStart(@Nullable LifecycleHandlerArgs postStart) {
            this.postStart = Input.ofNullable(postStart);
            return this;
        }

        public Builder preStop(@Nullable Input<LifecycleHandlerArgs> preStop) {
            this.preStop = preStop;
            return this;
        }

        public Builder preStop(@Nullable LifecycleHandlerArgs preStop) {
            this.preStop = Input.ofNullable(preStop);
            return this;
        }
        public LifecycleArgs build() {
            return new LifecycleArgs(postStart, preStop);
        }
    }
}
