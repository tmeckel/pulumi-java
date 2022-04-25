// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.enums.DiagnosticsLevel;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Diagnostics settings for an Azure ML web service.
 * 
 */
public final class DiagnosticsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticsConfigurationArgs Empty = new DiagnosticsConfigurationArgs();

    /**
     * Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
     * 
     */
    @Import(name="expiry")
    private @Nullable Output<String> expiry;

    /**
     * @return Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
     * 
     */
    public Optional<Output<String>> expiry() {
        return Optional.ofNullable(this.expiry);
    }

    /**
     * Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
     * 
     */
    @Import(name="level", required=true)
    private Output<Either<String,DiagnosticsLevel>> level;

    /**
     * @return Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
     * 
     */
    public Output<Either<String,DiagnosticsLevel>> level() {
        return this.level;
    }

    private DiagnosticsConfigurationArgs() {}

    private DiagnosticsConfigurationArgs(DiagnosticsConfigurationArgs $) {
        this.expiry = $.expiry;
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticsConfigurationArgs $;

        public Builder() {
            $ = new DiagnosticsConfigurationArgs();
        }

        public Builder(DiagnosticsConfigurationArgs defaults) {
            $ = new DiagnosticsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiry Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
         * 
         * @return builder
         * 
         */
        public Builder expiry(@Nullable Output<String> expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param expiry Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            return expiry(Output.of(expiry));
        }

        /**
         * @param level Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
         * 
         * @return builder
         * 
         */
        public Builder level(Output<Either<String,DiagnosticsLevel>> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
         * 
         * @return builder
         * 
         */
        public Builder level(Either<String,DiagnosticsLevel> level) {
            return level(Output.of(level));
        }

        /**
         * @param level Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Either.ofLeft(level));
        }

        /**
         * @param level Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
         * 
         * @return builder
         * 
         */
        public Builder level(DiagnosticsLevel level) {
            return level(Either.ofRight(level));
        }

        public DiagnosticsConfigurationArgs build() {
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            return $;
        }
    }

}
