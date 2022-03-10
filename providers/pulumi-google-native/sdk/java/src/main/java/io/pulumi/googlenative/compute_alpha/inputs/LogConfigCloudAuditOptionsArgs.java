// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.LogConfigCloudAuditOptionsLogName;
import io.pulumi.googlenative.compute_alpha.inputs.AuthorizationLoggingOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCloudAuditOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigCloudAuditOptionsArgs Empty = new LogConfigCloudAuditOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="authorizationLoggingOptions")
      private final @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;

    public Input<AuthorizationLoggingOptionsArgs> getAuthorizationLoggingOptions() {
        return this.authorizationLoggingOptions == null ? Input.empty() : this.authorizationLoggingOptions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="logName")
      private final @Nullable Input<LogConfigCloudAuditOptionsLogName> logName;

    public Input<LogConfigCloudAuditOptionsLogName> getLogName() {
        return this.logName == null ? Input.empty() : this.logName;
    }

    public LogConfigCloudAuditOptionsArgs(
        @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions,
        @Nullable Input<LogConfigCloudAuditOptionsLogName> logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    private LogConfigCloudAuditOptionsArgs() {
        this.authorizationLoggingOptions = Input.empty();
        this.logName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCloudAuditOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;
        private @Nullable Input<LogConfigCloudAuditOptionsLogName> logName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCloudAuditOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder authorizationLoggingOptions(@Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions) {
            this.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }

        public Builder authorizationLoggingOptions(@Nullable AuthorizationLoggingOptionsArgs authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Input.ofNullable(authorizationLoggingOptions);
            return this;
        }

        public Builder logName(@Nullable Input<LogConfigCloudAuditOptionsLogName> logName) {
            this.logName = logName;
            return this;
        }

        public Builder logName(@Nullable LogConfigCloudAuditOptionsLogName logName) {
            this.logName = Input.ofNullable(logName);
            return this;
        }
        public LogConfigCloudAuditOptionsArgs build() {
            return new LogConfigCloudAuditOptionsArgs(authorizationLoggingOptions, logName);
        }
    }
}
