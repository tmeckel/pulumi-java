// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.enums.LoggingDefaultLogLevel;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoggingResult {
    /**
     * @return The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    private final @Nullable LoggingDefaultLogLevel defaultLogLevel;
    /**
     * @return The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    private final @Nullable String roleArn;

    @CustomType.Constructor
    private GetLoggingResult(
        @CustomType.Parameter("defaultLogLevel") @Nullable LoggingDefaultLogLevel defaultLogLevel,
        @CustomType.Parameter("roleArn") @Nullable String roleArn) {
        this.defaultLogLevel = defaultLogLevel;
        this.roleArn = roleArn;
    }

    /**
     * @return The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    public Optional<LoggingDefaultLogLevel> defaultLogLevel() {
        return Optional.ofNullable(this.defaultLogLevel);
    }
    /**
     * @return The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LoggingDefaultLogLevel defaultLogLevel;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLogLevel = defaults.defaultLogLevel;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder defaultLogLevel(@Nullable LoggingDefaultLogLevel defaultLogLevel) {
            this.defaultLogLevel = defaultLogLevel;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }        public GetLoggingResult build() {
            return new GetLoggingResult(defaultLogLevel, roleArn);
        }
    }
}
