// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.aws.waf.outputs.SizeConstraintSetSizeConstraintFieldToMatch;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SizeConstraintSetSizeConstraint {
    /**
     * The type of comparison you want to perform.
     * e.g., `EQ`, `NE`, `LT`, `GT`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_wafRegional_SizeConstraint.html) for all supported values.
     * 
     */
    private final String comparisonOperator;
    /**
     * Specifies where in a web request to look for the size constraint.
     * 
     */
    private final SizeConstraintSetSizeConstraintFieldToMatch fieldToMatch;
    /**
     * The size in bytes that you want to compare against the size of the specified `field_to_match`.
     * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
     * 
     */
    private final Integer size;
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
     * for all supported values.
     * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
     * 
     */
    private final String textTransformation;

    @OutputCustomType.Constructor
    private SizeConstraintSetSizeConstraint(
        @OutputCustomType.Parameter("comparisonOperator") String comparisonOperator,
        @OutputCustomType.Parameter("fieldToMatch") SizeConstraintSetSizeConstraintFieldToMatch fieldToMatch,
        @OutputCustomType.Parameter("size") Integer size,
        @OutputCustomType.Parameter("textTransformation") String textTransformation) {
        this.comparisonOperator = comparisonOperator;
        this.fieldToMatch = fieldToMatch;
        this.size = size;
        this.textTransformation = textTransformation;
    }

    /**
     * The type of comparison you want to perform.
     * e.g., `EQ`, `NE`, `LT`, `GT`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_wafRegional_SizeConstraint.html) for all supported values.
     * 
    */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * Specifies where in a web request to look for the size constraint.
     * 
    */
    public SizeConstraintSetSizeConstraintFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * The size in bytes that you want to compare against the size of the specified `field_to_match`.
     * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
     * 
    */
    public Integer getSize() {
        return this.size;
    }
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
     * for all supported values.
     * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
     * 
    */
    public String getTextTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetSizeConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private SizeConstraintSetSizeConstraintFieldToMatch fieldToMatch;
        private Integer size;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetSizeConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder fieldToMatch(SizeConstraintSetSizeConstraintFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public SizeConstraintSetSizeConstraint build() {
            return new SizeConstraintSetSizeConstraint(comparisonOperator, fieldToMatch, size, textTransformation);
        }
    }
}
