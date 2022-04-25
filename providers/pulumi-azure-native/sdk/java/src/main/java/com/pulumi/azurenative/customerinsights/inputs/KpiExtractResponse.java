// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI extract.
 * 
 */
public final class KpiExtractResponse extends com.pulumi.resources.InvokeArgs {

    public static final KpiExtractResponse Empty = new KpiExtractResponse();

    /**
     * The expression.
     * 
     */
    @Import(name="expression", required=true)
    private String expression;

    /**
     * @return The expression.
     * 
     */
    public String expression() {
        return this.expression;
    }

    /**
     * KPI extract name.
     * 
     */
    @Import(name="extractName", required=true)
    private String extractName;

    /**
     * @return KPI extract name.
     * 
     */
    public String extractName() {
        return this.extractName;
    }

    private KpiExtractResponse() {}

    private KpiExtractResponse(KpiExtractResponse $) {
        this.expression = $.expression;
        this.extractName = $.extractName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KpiExtractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KpiExtractResponse $;

        public Builder() {
            $ = new KpiExtractResponse();
        }

        public Builder(KpiExtractResponse defaults) {
            $ = new KpiExtractResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression The expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param extractName KPI extract name.
         * 
         * @return builder
         * 
         */
        public Builder extractName(String extractName) {
            $.extractName = extractName;
            return this;
        }

        public KpiExtractResponse build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.extractName = Objects.requireNonNull($.extractName, "expected parameter 'extractName' to be non-null");
            return $;
        }
    }

}
