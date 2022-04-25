// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.LogConfigCloudAuditOptionsResponse;
import com.pulumi.googlenative.compute_beta.outputs.LogConfigCounterOptionsResponse;
import com.pulumi.googlenative.compute_beta.outputs.LogConfigDataAccessOptionsResponse;
import java.util.Objects;

@CustomType
public final class LogConfigResponse {
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final LogConfigCloudAuditOptionsResponse cloudAudit;
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final LogConfigCounterOptionsResponse counter;
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    private final LogConfigDataAccessOptionsResponse dataAccess;

    @CustomType.Constructor
    private LogConfigResponse(
        @CustomType.Parameter("cloudAudit") LogConfigCloudAuditOptionsResponse cloudAudit,
        @CustomType.Parameter("counter") LogConfigCounterOptionsResponse counter,
        @CustomType.Parameter("dataAccess") LogConfigDataAccessOptionsResponse dataAccess) {
        this.cloudAudit = cloudAudit;
        this.counter = counter;
        this.dataAccess = dataAccess;
    }

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public LogConfigCloudAuditOptionsResponse cloudAudit() {
        return this.cloudAudit;
    }
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public LogConfigCounterOptionsResponse counter() {
        return this.counter;
    }
    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public LogConfigDataAccessOptionsResponse dataAccess() {
        return this.dataAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigCloudAuditOptionsResponse cloudAudit;
        private LogConfigCounterOptionsResponse counter;
        private LogConfigDataAccessOptionsResponse dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder cloudAudit(LogConfigCloudAuditOptionsResponse cloudAudit) {
            this.cloudAudit = Objects.requireNonNull(cloudAudit);
            return this;
        }
        public Builder counter(LogConfigCounterOptionsResponse counter) {
            this.counter = Objects.requireNonNull(counter);
            return this;
        }
        public Builder dataAccess(LogConfigDataAccessOptionsResponse dataAccess) {
            this.dataAccess = Objects.requireNonNull(dataAccess);
            return this;
        }        public LogConfigResponse build() {
            return new LogConfigResponse(cloudAudit, counter, dataAccess);
        }
    }
}
