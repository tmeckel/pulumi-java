// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OneTimeScheduleResponse {
    /**
     * The desired patch job execution time.
     * 
     */
    private final String executeTime;

    @OutputCustomType.Constructor({"executeTime"})
    private OneTimeScheduleResponse(String executeTime) {
        this.executeTime = Objects.requireNonNull(executeTime);
    }

    /**
     * The desired patch job execution time.
     * 
     */
    public String getExecuteTime() {
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

        public Builder setExecuteTime(String executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }

        public OneTimeScheduleResponse build() {
            return new OneTimeScheduleResponse(executeTime);
        }
    }
}
