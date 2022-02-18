// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScanRunWarningTraceResponse {
    /**
     * Indicates the warning code.
     * 
     */
    private final String code;

    @OutputCustomType.Constructor({"code"})
    private ScanRunWarningTraceResponse(String code) {
        this.code = Objects.requireNonNull(code);
    }

    /**
     * Indicates the warning code.
     * 
     */
    public String getCode() {
        return this.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunWarningTraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunWarningTraceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public ScanRunWarningTraceResponse build() {
            return new ScanRunWarningTraceResponse(code);
        }
    }
}
