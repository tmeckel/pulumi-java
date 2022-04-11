// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs();

    /**
     * The HTTP status code used to abort the request. The value must be between 200
     * and 599 inclusive.
     * 
     */
    @Import(name="httpStatus")
      private final @Nullable Output<Integer> httpStatus;

    public Output<Integer> getHttpStatus() {
        return this.httpStatus == null ? Codegen.empty() : this.httpStatus;
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> getPercentage() {
        return this.percentage == null ? Codegen.empty() : this.percentage;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs(
        @Nullable Output<Integer> httpStatus,
        @Nullable Output<Double> percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs() {
        this.httpStatus = Codegen.empty();
        this.percentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> httpStatus;
        private @Nullable Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(@Nullable Output<Integer> httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Builder httpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = Codegen.ofNullable(httpStatus);
            return this;
        }
        public Builder percentage(@Nullable Output<Double> percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Codegen.ofNullable(percentage);
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs(httpStatus, percentage);
        }
    }
}
