// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleActionCountGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionGetArgs Empty = new WebAclRuleActionGetArgs();

    /**
     * Instructs AWS WAF to allow the web request. See Allow below for details.
     * 
     */
    @InputImport(name="allow")
      private final @Nullable Input<WebAclRuleActionAllowGetArgs> allow;

    public Input<WebAclRuleActionAllowGetArgs> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    /**
     * Instructs AWS WAF to block the web request. See Block below for details.
     * 
     */
    @InputImport(name="block")
      private final @Nullable Input<WebAclRuleActionBlockGetArgs> block;

    public Input<WebAclRuleActionBlockGetArgs> getBlock() {
        return this.block == null ? Input.empty() : this.block;
    }

    /**
     * Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<WebAclRuleActionCountGetArgs> count;

    public Input<WebAclRuleActionCountGetArgs> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    public WebAclRuleActionGetArgs(
        @Nullable Input<WebAclRuleActionAllowGetArgs> allow,
        @Nullable Input<WebAclRuleActionBlockGetArgs> block,
        @Nullable Input<WebAclRuleActionCountGetArgs> count) {
        this.allow = allow;
        this.block = block;
        this.count = count;
    }

    private WebAclRuleActionGetArgs() {
        this.allow = Input.empty();
        this.block = Input.empty();
        this.count = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleActionAllowGetArgs> allow;
        private @Nullable Input<WebAclRuleActionBlockGetArgs> block;
        private @Nullable Input<WebAclRuleActionCountGetArgs> count;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable Input<WebAclRuleActionAllowGetArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder allow(@Nullable WebAclRuleActionAllowGetArgs allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder block(@Nullable Input<WebAclRuleActionBlockGetArgs> block) {
            this.block = block;
            return this;
        }

        public Builder block(@Nullable WebAclRuleActionBlockGetArgs block) {
            this.block = Input.ofNullable(block);
            return this;
        }

        public Builder count(@Nullable Input<WebAclRuleActionCountGetArgs> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable WebAclRuleActionCountGetArgs count) {
            this.count = Input.ofNullable(count);
            return this;
        }
        public WebAclRuleActionGetArgs build() {
            return new WebAclRuleActionGetArgs(allow, block, count);
        }
    }
}
