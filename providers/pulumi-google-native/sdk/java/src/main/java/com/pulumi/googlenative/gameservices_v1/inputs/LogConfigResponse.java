// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1.inputs.CloudAuditOptionsResponse;
import com.pulumi.googlenative.gameservices_v1.inputs.CounterOptionsResponse;
import com.pulumi.googlenative.gameservices_v1.inputs.DataAccessOptionsResponse;
import java.util.Objects;


/**
 * Specifies what kind of log the caller must write
 * 
 */
public final class LogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogConfigResponse Empty = new LogConfigResponse();

    /**
     * Cloud audit options.
     * 
     */
    @Import(name="cloudAudit", required=true)
    private CloudAuditOptionsResponse cloudAudit;

    /**
     * @return Cloud audit options.
     * 
     */
    public CloudAuditOptionsResponse cloudAudit() {
        return this.cloudAudit;
    }

    /**
     * Counter options.
     * 
     */
    @Import(name="counter", required=true)
    private CounterOptionsResponse counter;

    /**
     * @return Counter options.
     * 
     */
    public CounterOptionsResponse counter() {
        return this.counter;
    }

    /**
     * Data access options.
     * 
     */
    @Import(name="dataAccess", required=true)
    private DataAccessOptionsResponse dataAccess;

    /**
     * @return Data access options.
     * 
     */
    public DataAccessOptionsResponse dataAccess() {
        return this.dataAccess;
    }

    private LogConfigResponse() {}

    private LogConfigResponse(LogConfigResponse $) {
        this.cloudAudit = $.cloudAudit;
        this.counter = $.counter;
        this.dataAccess = $.dataAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigResponse $;

        public Builder() {
            $ = new LogConfigResponse();
        }

        public Builder(LogConfigResponse defaults) {
            $ = new LogConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudAudit Cloud audit options.
         * 
         * @return builder
         * 
         */
        public Builder cloudAudit(CloudAuditOptionsResponse cloudAudit) {
            $.cloudAudit = cloudAudit;
            return this;
        }

        /**
         * @param counter Counter options.
         * 
         * @return builder
         * 
         */
        public Builder counter(CounterOptionsResponse counter) {
            $.counter = counter;
            return this;
        }

        /**
         * @param dataAccess Data access options.
         * 
         * @return builder
         * 
         */
        public Builder dataAccess(DataAccessOptionsResponse dataAccess) {
            $.dataAccess = dataAccess;
            return this;
        }

        public LogConfigResponse build() {
            $.cloudAudit = Objects.requireNonNull($.cloudAudit, "expected parameter 'cloudAudit' to be non-null");
            $.counter = Objects.requireNonNull($.counter, "expected parameter 'counter' to be non-null");
            $.dataAccess = Objects.requireNonNull($.dataAccess, "expected parameter 'dataAccess' to be non-null");
            return $;
        }
    }

}
