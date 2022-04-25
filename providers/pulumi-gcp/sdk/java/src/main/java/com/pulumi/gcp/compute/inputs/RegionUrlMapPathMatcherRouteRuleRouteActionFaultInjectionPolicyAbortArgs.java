// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs();

    /**
     * The HTTP status code used to abort the request. The value must be between 200
     * and 599 inclusive.
     * 
     */
    @Import(name="httpStatus")
    private @Nullable Output<Integer> httpStatus;

    /**
     * @return The HTTP status code used to abort the request. The value must be between 200
     * and 599 inclusive.
     * 
     */
    public Optional<Output<Integer>> httpStatus() {
        return Optional.ofNullable(this.httpStatus);
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
    private @Nullable Output<Double> percentage;

    /**
     * @return The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    public Optional<Output<Double>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs() {}

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs $) {
        this.httpStatus = $.httpStatus;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpStatus The HTTP status code used to abort the request. The value must be between 200
         * and 599 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder httpStatus(@Nullable Output<Integer> httpStatus) {
            $.httpStatus = httpStatus;
            return this;
        }

        /**
         * @param httpStatus The HTTP status code used to abort the request. The value must be between 200
         * and 599 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder httpStatus(Integer httpStatus) {
            return httpStatus(Output.of(httpStatus));
        }

        /**
         * @param percentage The percentage of traffic (connections/operations/requests) on which delay will
         * be introduced as part of fault injection. The value must be between 0.0 and
         * 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage The percentage of traffic (connections/operations/requests) on which delay will
         * be introduced as part of fault injection. The value must be between 0.0 and
         * 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs build() {
            return $;
        }
    }

}
