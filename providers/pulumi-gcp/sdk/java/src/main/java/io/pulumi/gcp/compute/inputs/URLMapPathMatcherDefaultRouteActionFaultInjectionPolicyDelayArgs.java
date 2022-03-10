// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fixedDelay")
      private final @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;

    public Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs> getFixedDelay() {
        return this.fixedDelay == null ? Input.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage")
      private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs(
        @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay,
        @Nullable Input<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs() {
        this.fixedDelay = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(@Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }

        public Builder fixedDelay(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayArgs fixedDelay) {
            this.fixedDelay = Input.ofNullable(fixedDelay);
            return this;
        }

        public Builder percentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }
        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs(fixedDelay, percentage);
        }
    }
}
