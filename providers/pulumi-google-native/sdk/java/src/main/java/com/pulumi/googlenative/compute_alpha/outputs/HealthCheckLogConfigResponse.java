// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class HealthCheckLogConfigResponse {
    /**
     * @return Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    private final Boolean enable;

    @CustomType.Constructor
    private HealthCheckLogConfigResponse(@CustomType.Parameter("enable") Boolean enable) {
        this.enable = enable;
    }

    /**
     * @return Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }        public HealthCheckLogConfigResponse build() {
            return new HealthCheckLogConfigResponse(enable);
        }
    }
}
