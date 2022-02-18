// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
 * 
 */
public final class BasicScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicScalingArgs Empty = new BasicScalingArgs();

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    @InputImport(name="idleTimeout")
    private final @Nullable Input<String> idleTimeout;

    public Input<String> getIdleTimeout() {
        return this.idleTimeout == null ? Input.empty() : this.idleTimeout;
    }

    /**
     * Maximum number of instances to create for this version.
     * 
     */
    @InputImport(name="maxInstances")
    private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    public BasicScalingArgs(
        @Nullable Input<String> idleTimeout,
        @Nullable Input<Integer> maxInstances) {
        this.idleTimeout = idleTimeout;
        this.maxInstances = maxInstances;
    }

    private BasicScalingArgs() {
        this.idleTimeout = Input.empty();
        this.maxInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> idleTimeout;
        private @Nullable Input<Integer> maxInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        public Builder setIdleTimeout(@Nullable Input<String> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        public Builder setIdleTimeout(@Nullable String idleTimeout) {
            this.idleTimeout = Input.ofNullable(idleTimeout);
            return this;
        }

        public Builder setMaxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public BasicScalingArgs build() {
            return new BasicScalingArgs(idleTimeout, maxInstances);
        }
    }
}
