// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyWeeklyCycleDayOfWeekResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyWeeklyCycleResponse {
    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    private final List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

    @OutputCustomType.Constructor({"dayOfWeeks"})
    private ResourcePolicyWeeklyCycleResponse(List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
        this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
    }

    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    public List<ResourcePolicyWeeklyCycleDayOfWeekResponse> getDayOfWeeks() {
        return this.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder setDayOfWeeks(List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }

        public ResourcePolicyWeeklyCycleResponse build() {
            return new ResourcePolicyWeeklyCycleResponse(dayOfWeeks);
        }
    }
}
