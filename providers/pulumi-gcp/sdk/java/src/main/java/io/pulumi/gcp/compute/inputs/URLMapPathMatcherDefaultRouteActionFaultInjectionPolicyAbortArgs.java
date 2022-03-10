// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs();

    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
     */
    @InputImport(name="httpStatus")
      private final @Nullable Input<Integer> httpStatus;

    public Input<Integer> getHttpStatus() {
        return this.httpStatus == null ? Input.empty() : this.httpStatus;
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

    public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs(
        @Nullable Input<Integer> httpStatus,
        @Nullable Input<Double> percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs() {
        this.httpStatus = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> httpStatus;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(@Nullable Input<Integer> httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder httpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = Input.ofNullable(httpStatus);
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
        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs(httpStatus, percentage);
        }
    }
}
