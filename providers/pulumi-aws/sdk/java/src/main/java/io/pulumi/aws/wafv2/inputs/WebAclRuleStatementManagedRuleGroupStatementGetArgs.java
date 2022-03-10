// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementGetArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementGetArgs();

    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    @InputImport(name="excludedRules")
      private final @Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules;

    public Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> getExcludedRules() {
        return this.excludedRules == null ? Input.empty() : this.excludedRules;
    }

    /**
     * The name of the managed rule group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
     * 
     */
    @InputImport(name="scopeDownStatement")
      private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Input.empty() : this.scopeDownStatement;
    }

    /**
     * The name of the managed rule group vendor.
     * 
     */
    @InputImport(name="vendorName", required=true)
      private final Input<String> vendorName;

    public Input<String> getVendorName() {
        return this.vendorName;
    }

    public WebAclRuleStatementManagedRuleGroupStatementGetArgs(
        @Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules,
        Input<String> name,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement,
        Input<String> vendorName) {
        this.excludedRules = excludedRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private WebAclRuleStatementManagedRuleGroupStatementGetArgs() {
        this.excludedRules = Input.empty();
        this.name = Input.empty();
        this.scopeDownStatement = Input.empty();
        this.vendorName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules;
        private Input<String> name;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement;
        private Input<String> vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedRules = defaults.excludedRules;
    	      this.name = defaults.name;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder excludedRules(@Nullable Input<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder excludedRules(@Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs> excludedRules) {
            this.excludedRules = Input.ofNullable(excludedRules);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder scopeDownStatement(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder scopeDownStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs scopeDownStatement) {
            this.scopeDownStatement = Input.ofNullable(scopeDownStatement);
            return this;
        }

        public Builder vendorName(Input<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }

        public Builder vendorName(String vendorName) {
            this.vendorName = Input.of(Objects.requireNonNull(vendorName));
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementGetArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementGetArgs(excludedRules, name, scopeDownStatement, vendorName);
        }
    }
}
