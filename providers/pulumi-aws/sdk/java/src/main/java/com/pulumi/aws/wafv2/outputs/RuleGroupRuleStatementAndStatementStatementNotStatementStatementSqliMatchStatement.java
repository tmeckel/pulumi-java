// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatement {
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
