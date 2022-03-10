// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRuleGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRuleGroupArgs Empty = new GetRuleGroupArgs();

    @InputImport(name="ruleGroupArn", required=true)
      private final String ruleGroupArn;

    public String getRuleGroupArn() {
        return this.ruleGroupArn;
    }

    public GetRuleGroupArgs(String ruleGroupArn) {
        this.ruleGroupArn = Objects.requireNonNull(ruleGroupArn, "expected parameter 'ruleGroupArn' to be non-null");
    }

    private GetRuleGroupArgs() {
        this.ruleGroupArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupArn = defaults.ruleGroupArn;
        }

        public Builder ruleGroupArn(String ruleGroupArn) {
            this.ruleGroupArn = Objects.requireNonNull(ruleGroupArn);
            return this;
        }
        public GetRuleGroupArgs build() {
            return new GetRuleGroupArgs(ruleGroupArn);
        }
    }
}
