// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActiveReceiptRuleSetState extends io.pulumi.resources.ResourceArgs {

    public static final ActiveReceiptRuleSetState Empty = new ActiveReceiptRuleSetState();

    /**
     * The SES receipt rule set ARN.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of the rule set
     * 
     */
    @InputImport(name="ruleSetName")
      private final @Nullable Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName == null ? Input.empty() : this.ruleSetName;
    }

    public ActiveReceiptRuleSetState(
        @Nullable Input<String> arn,
        @Nullable Input<String> ruleSetName) {
        this.arn = arn;
        this.ruleSetName = ruleSetName;
    }

    private ActiveReceiptRuleSetState() {
        this.arn = Input.empty();
        this.ruleSetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveReceiptRuleSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveReceiptRuleSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder ruleSetName(@Nullable Input<String> ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }

        public Builder ruleSetName(@Nullable String ruleSetName) {
            this.ruleSetName = Input.ofNullable(ruleSetName);
            return this;
        }
        public ActiveReceiptRuleSetState build() {
            return new ActiveReceiptRuleSetState(arn, ruleSetName);
        }
    }
}
