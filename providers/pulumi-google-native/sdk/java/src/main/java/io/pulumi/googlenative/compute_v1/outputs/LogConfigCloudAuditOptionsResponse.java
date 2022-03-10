// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LogConfigCloudAuditOptionsResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final AuthorizationLoggingOptionsResponse authorizationLoggingOptions;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String logName;

    @OutputCustomType.Constructor
    private LogConfigCloudAuditOptionsResponse(
        @OutputCustomType.Parameter("authorizationLoggingOptions") AuthorizationLoggingOptionsResponse authorizationLoggingOptions,
        @OutputCustomType.Parameter("logName") String logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public AuthorizationLoggingOptionsResponse getAuthorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getLogName() {
        return this.logName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCloudAuditOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsResponse authorizationLoggingOptions;
        private String logName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCloudAuditOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions);
            return this;
        }

        public Builder logName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }
        public LogConfigCloudAuditOptionsResponse build() {
            return new LogConfigCloudAuditOptionsResponse(authorizationLoggingOptions, logName);
        }
    }
}
