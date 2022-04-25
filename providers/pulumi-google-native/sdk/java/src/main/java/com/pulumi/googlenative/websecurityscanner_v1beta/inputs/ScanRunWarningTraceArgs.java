// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanRunWarningTraceCode;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output only. Defines a warning trace message for ScanRun. Warning traces provide customers with useful information that helps make the scanning process more effective.
 * 
 */
public final class ScanRunWarningTraceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScanRunWarningTraceArgs Empty = new ScanRunWarningTraceArgs();

    /**
     * Indicates the warning code.
     * 
     */
    @Import(name="code")
    private @Nullable Output<ScanRunWarningTraceCode> code;

    /**
     * @return Indicates the warning code.
     * 
     */
    public Optional<Output<ScanRunWarningTraceCode>> code() {
        return Optional.ofNullable(this.code);
    }

    private ScanRunWarningTraceArgs() {}

    private ScanRunWarningTraceArgs(ScanRunWarningTraceArgs $) {
        this.code = $.code;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScanRunWarningTraceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScanRunWarningTraceArgs $;

        public Builder() {
            $ = new ScanRunWarningTraceArgs();
        }

        public Builder(ScanRunWarningTraceArgs defaults) {
            $ = new ScanRunWarningTraceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Indicates the warning code.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<ScanRunWarningTraceCode> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Indicates the warning code.
         * 
         * @return builder
         * 
         */
        public Builder code(ScanRunWarningTraceCode code) {
            return code(Output.of(code));
        }

        public ScanRunWarningTraceArgs build() {
            return $;
        }
    }

}
