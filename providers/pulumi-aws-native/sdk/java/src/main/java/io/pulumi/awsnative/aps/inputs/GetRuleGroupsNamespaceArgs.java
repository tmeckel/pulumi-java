// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRuleGroupsNamespaceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRuleGroupsNamespaceArgs Empty = new GetRuleGroupsNamespaceArgs();

    /**
     * The RuleGroupsNamespace ARN.
     * 
     */
    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetRuleGroupsNamespaceArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetRuleGroupsNamespaceArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleGroupsNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleGroupsNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetRuleGroupsNamespaceArgs build() {
            return new GetRuleGroupsNamespaceArgs(arn);
        }
    }
}
