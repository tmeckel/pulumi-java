// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardStickinessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardStickinessGetArgs Empty = new ListenerRuleActionForwardStickinessGetArgs();

    /**
     * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    @InputImport(name="duration", required=true)
      private final Input<Integer> duration;

    public Input<Integer> getDuration() {
        return this.duration;
    }

    /**
     * Indicates whether target group stickiness is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public ListenerRuleActionForwardStickinessGetArgs(
        Input<Integer> duration,
        @Nullable Input<Boolean> enabled) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.enabled = enabled;
    }

    private ListenerRuleActionForwardStickinessGetArgs() {
        this.duration = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardStickinessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> duration;
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardStickinessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        public Builder duration(Input<Integer> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder duration(Integer duration) {
            this.duration = Input.of(Objects.requireNonNull(duration));
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public ListenerRuleActionForwardStickinessGetArgs build() {
            return new ListenerRuleActionForwardStickinessGetArgs(duration, enabled);
        }
    }
}
