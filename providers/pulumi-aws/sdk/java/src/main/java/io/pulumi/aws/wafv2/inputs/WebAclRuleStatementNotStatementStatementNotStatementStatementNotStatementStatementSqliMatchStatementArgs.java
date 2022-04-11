// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Codegen.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs() {
        this.fieldToMatch = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Codegen.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
