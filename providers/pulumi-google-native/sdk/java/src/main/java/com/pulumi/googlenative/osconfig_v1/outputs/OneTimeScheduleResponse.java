// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OneTimeScheduleResponse {
    /**
     * @return The desired patch job execution time.
     * 
     */
    private final String executeTime;

    @CustomType.Constructor
    private OneTimeScheduleResponse(@CustomType.Parameter("executeTime") String executeTime) {
        this.executeTime = executeTime;
    }

    /**
     * @return The desired patch job execution time.
     * 
     */
    public String executeTime() {
        return this.executeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneTimeScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OneTimeScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
        }

        public Builder executeTime(String executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }        public OneTimeScheduleResponse build() {
            return new OneTimeScheduleResponse(executeTime);
        }
    }
}
