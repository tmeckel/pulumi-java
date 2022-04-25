// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementNotStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementArgs Empty = new RuleGroupRuleStatementOrStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> andStatement;

    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementAndStatementArgs>> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;

    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> notStatement;

    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementNotStatementArgs>> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> orStatement;

    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementArgs>> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private RuleGroupRuleStatementOrStatementStatementArgs() {}

    private RuleGroupRuleStatementOrStatementStatementArgs(RuleGroupRuleStatementOrStatementStatementArgs $) {
        this.andStatement = $.andStatement;
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.notStatement = $.notStatement;
        this.orStatement = $.orStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementOrStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementOrStatementStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementOrStatementStatementArgs();
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementArgs defaults) {
            $ = new RuleGroupRuleStatementOrStatementStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param andStatement A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder andStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> andStatement) {
            $.andStatement = andStatement;
            return this;
        }

        /**
         * @param andStatement A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder andStatement(RuleGroupRuleStatementOrStatementStatementAndStatementArgs andStatement) {
            return andStatement(Output.of(andStatement));
        }

        /**
         * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        /**
         * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        /**
         * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        /**
         * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        /**
         * @param notStatement A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder notStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> notStatement) {
            $.notStatement = notStatement;
            return this;
        }

        /**
         * @param notStatement A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder notStatement(RuleGroupRuleStatementOrStatementStatementNotStatementArgs notStatement) {
            return notStatement(Output.of(notStatement));
        }

        /**
         * @param orStatement A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder orStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> orStatement) {
            $.orStatement = orStatement;
            return this;
        }

        /**
         * @param orStatement A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder orStatement(RuleGroupRuleStatementOrStatementStatementOrStatementArgs orStatement) {
            return orStatement(Output.of(orStatement));
        }

        /**
         * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        /**
         * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        /**
         * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(@Nullable Output<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public RuleGroupRuleStatementOrStatementStatementArgs build() {
            return $;
        }
    }

}
