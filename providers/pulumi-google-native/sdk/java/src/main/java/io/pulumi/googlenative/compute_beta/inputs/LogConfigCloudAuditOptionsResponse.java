// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCloudAuditOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogConfigCloudAuditOptionsResponse Empty = new LogConfigCloudAuditOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="authorizationLoggingOptions", required=true)
    private final AuthorizationLoggingOptionsResponse authorizationLoggingOptions;

    public AuthorizationLoggingOptionsResponse getAuthorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="logName", required=true)
    private final String logName;

    public String getLogName() {
        return this.logName;
    }

    public LogConfigCloudAuditOptionsResponse(
        AuthorizationLoggingOptionsResponse authorizationLoggingOptions,
        String logName) {
        this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions, "expected parameter 'authorizationLoggingOptions' to be non-null");
        this.logName = Objects.requireNonNull(logName, "expected parameter 'logName' to be non-null");
    }

    private LogConfigCloudAuditOptionsResponse() {
        this.authorizationLoggingOptions = null;
        this.logName = null;
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

        public Builder setAuthorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Objects.requireNonNull(authorizationLoggingOptions);
            return this;
        }

        public Builder setLogName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }

        public LogConfigCloudAuditOptionsResponse build() {
            return new LogConfigCloudAuditOptionsResponse(authorizationLoggingOptions, logName);
        }
    }
}
