// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or relative (&#34;percent&#34;) to a value.
 * 
 */
public final class FixedOrPercentResponse extends com.pulumi.resources.InvokeArgs {

    public static final FixedOrPercentResponse Empty = new FixedOrPercentResponse();

    /**
     * Specifies a fixed value.
     * 
     */
    @Import(name="fixed", required=true)
    private Integer fixed;

    /**
     * @return Specifies a fixed value.
     * 
     */
    public Integer fixed() {
        return this.fixed;
    }

    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    @Import(name="percent", required=true)
    private Integer percent;

    /**
     * @return Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    public Integer percent() {
        return this.percent;
    }

    private FixedOrPercentResponse() {}

    private FixedOrPercentResponse(FixedOrPercentResponse $) {
        this.fixed = $.fixed;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FixedOrPercentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse $;

        public Builder() {
            $ = new FixedOrPercentResponse();
        }

        public Builder(FixedOrPercentResponse defaults) {
            $ = new FixedOrPercentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixed Specifies a fixed value.
         * 
         * @return builder
         * 
         */
        public Builder fixed(Integer fixed) {
            $.fixed = fixed;
            return this;
        }

        /**
         * @param percent Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            $.percent = percent;
            return this;
        }

        public FixedOrPercentResponse build() {
            $.fixed = Objects.requireNonNull($.fixed, "expected parameter 'fixed' to be non-null");
            $.percent = Objects.requireNonNull($.percent, "expected parameter 'percent' to be non-null");
            return $;
        }
    }

}
