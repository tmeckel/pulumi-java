// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NotificationRateLimitResponse {
    /**
     * Not more than one notification per period.
     * 
     */
    private final String period;

    @OutputCustomType.Constructor({"period"})
    private NotificationRateLimitResponse(String period) {
        this.period = Objects.requireNonNull(period);
    }

    /**
     * Not more than one notification per period.
     * 
     */
    public String getPeriod() {
        return this.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRateLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String period;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRateLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
        }

        public Builder setPeriod(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }

        public NotificationRateLimitResponse build() {
            return new NotificationRateLimitResponse(period);
        }
    }
}
