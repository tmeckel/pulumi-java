// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Message encapsulating a value that can be either absolute ("fixed") or relative ("percent") to a value.
 * 
 */
public final class FixedOrPercentResponse extends io.pulumi.resources.InvokeArgs {

    public static final FixedOrPercentResponse Empty = new FixedOrPercentResponse();

    /**
     * Specifies a fixed value.
     * 
     */
    @InputImport(name="fixed", required=true)
      private final Integer fixed;

    public Integer getFixed() {
        return this.fixed;
    }

    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    @InputImport(name="percent", required=true)
      private final Integer percent;

    public Integer getPercent() {
        return this.percent;
    }

    public FixedOrPercentResponse(
        Integer fixed,
        Integer percent) {
        this.fixed = Objects.requireNonNull(fixed, "expected parameter 'fixed' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
    }

    private FixedOrPercentResponse() {
        this.fixed = null;
        this.percent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedOrPercentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fixed;
        private Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedOrPercentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(Integer fixed) {
            this.fixed = Objects.requireNonNull(fixed);
            return this;
        }

        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }
        public FixedOrPercentResponse build() {
            return new FixedOrPercentResponse(fixed, percent);
        }
    }
}
