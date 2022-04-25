// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.ResourcePolicyWeeklyCycleDayOfWeekResponse;
import java.util.List;
import java.util.Objects;


/**
 * Time window specified for weekly operations.
 * 
 */
public final class ResourcePolicyWeeklyCycleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyWeeklyCycleResponse Empty = new ResourcePolicyWeeklyCycleResponse();

    /**
     * Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    @Import(name="dayOfWeeks", required=true)
    private List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks;

    /**
     * @return Up to 7 intervals/windows, one for each day of the week.
     * 
     */
    public List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    private ResourcePolicyWeeklyCycleResponse() {}

    private ResourcePolicyWeeklyCycleResponse(ResourcePolicyWeeklyCycleResponse $) {
        this.dayOfWeeks = $.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyWeeklyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyWeeklyCycleResponse $;

        public Builder() {
            $ = new ResourcePolicyWeeklyCycleResponse();
        }

        public Builder(ResourcePolicyWeeklyCycleResponse defaults) {
            $ = new ResourcePolicyWeeklyCycleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeeks Up to 7 intervals/windows, one for each day of the week.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeeks(List<ResourcePolicyWeeklyCycleDayOfWeekResponse> dayOfWeeks) {
            $.dayOfWeeks = dayOfWeeks;
            return this;
        }

        /**
         * @param dayOfWeeks Up to 7 intervals/windows, one for each day of the week.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeeks(ResourcePolicyWeeklyCycleDayOfWeekResponse... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }

        public ResourcePolicyWeeklyCycleResponse build() {
            $.dayOfWeeks = Objects.requireNonNull($.dayOfWeeks, "expected parameter 'dayOfWeeks' to be non-null");
            return $;
        }
    }

}
