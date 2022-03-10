// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time window specified for daily operations.
 * 
 */
public final class ResourcePolicyDailyCycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyDailyCycleArgs Empty = new ResourcePolicyDailyCycleArgs();

    /**
     * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
     * 
     */
    @InputImport(name="daysInCycle")
      private final @Nullable Input<Integer> daysInCycle;

    public Input<Integer> getDaysInCycle() {
        return this.daysInCycle == null ? Input.empty() : this.daysInCycle;
    }

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public ResourcePolicyDailyCycleArgs(
        @Nullable Input<Integer> daysInCycle,
        @Nullable Input<String> startTime) {
        this.daysInCycle = daysInCycle;
        this.startTime = startTime;
    }

    private ResourcePolicyDailyCycleArgs() {
        this.daysInCycle = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyDailyCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> daysInCycle;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyDailyCycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder daysInCycle(@Nullable Input<Integer> daysInCycle) {
            this.daysInCycle = daysInCycle;
            return this;
        }

        public Builder daysInCycle(@Nullable Integer daysInCycle) {
            this.daysInCycle = Input.ofNullable(daysInCycle);
            return this;
        }

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }
        public ResourcePolicyDailyCycleArgs build() {
            return new ResourcePolicyDailyCycleArgs(daysInCycle, startTime);
        }
    }
}
