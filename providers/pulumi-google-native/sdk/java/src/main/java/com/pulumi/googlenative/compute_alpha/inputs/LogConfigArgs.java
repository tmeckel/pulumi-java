// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.LogConfigCloudAuditOptionsArgs;
import com.pulumi.googlenative.compute_alpha.inputs.LogConfigCounterOptionsArgs;
import com.pulumi.googlenative.compute_alpha.inputs.LogConfigDataAccessOptionsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogConfigArgs Empty = new LogConfigArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="cloudAudit")
    private @Nullable Output<LogConfigCloudAuditOptionsArgs> cloudAudit;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<LogConfigCloudAuditOptionsArgs>> cloudAudit() {
        return Optional.ofNullable(this.cloudAudit);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="counter")
    private @Nullable Output<LogConfigCounterOptionsArgs> counter;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<LogConfigCounterOptionsArgs>> counter() {
        return Optional.ofNullable(this.counter);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="dataAccess")
    private @Nullable Output<LogConfigDataAccessOptionsArgs> dataAccess;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<LogConfigDataAccessOptionsArgs>> dataAccess() {
        return Optional.ofNullable(this.dataAccess);
    }

    private LogConfigArgs() {}

    private LogConfigArgs(LogConfigArgs $) {
        this.cloudAudit = $.cloudAudit;
        this.counter = $.counter;
        this.dataAccess = $.dataAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigArgs $;

        public Builder() {
            $ = new LogConfigArgs();
        }

        public Builder(LogConfigArgs defaults) {
            $ = new LogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudAudit This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder cloudAudit(@Nullable Output<LogConfigCloudAuditOptionsArgs> cloudAudit) {
            $.cloudAudit = cloudAudit;
            return this;
        }

        /**
         * @param cloudAudit This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder cloudAudit(LogConfigCloudAuditOptionsArgs cloudAudit) {
            return cloudAudit(Output.of(cloudAudit));
        }

        /**
         * @param counter This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder counter(@Nullable Output<LogConfigCounterOptionsArgs> counter) {
            $.counter = counter;
            return this;
        }

        /**
         * @param counter This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder counter(LogConfigCounterOptionsArgs counter) {
            return counter(Output.of(counter));
        }

        /**
         * @param dataAccess This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder dataAccess(@Nullable Output<LogConfigDataAccessOptionsArgs> dataAccess) {
            $.dataAccess = dataAccess;
            return this;
        }

        /**
         * @param dataAccess This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder dataAccess(LogConfigDataAccessOptionsArgs dataAccess) {
            return dataAccess(Output.of(dataAccess));
        }

        public LogConfigArgs build() {
            return $;
        }
    }

}
