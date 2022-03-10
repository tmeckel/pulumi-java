// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclDefaultActionAllow;
import io.pulumi.aws.wafv2.outputs.WebAclDefaultActionBlock;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclDefaultAction {
    /**
     * Specifies that AWS WAF should allow requests by default. See Allow below for details.
     * 
     */
    private final @Nullable WebAclDefaultActionAllow allow;
    /**
     * Specifies that AWS WAF should block requests by default. See Block below for details.
     * 
     */
    private final @Nullable WebAclDefaultActionBlock block;

    @OutputCustomType.Constructor
    private WebAclDefaultAction(
        @OutputCustomType.Parameter("allow") @Nullable WebAclDefaultActionAllow allow,
        @OutputCustomType.Parameter("block") @Nullable WebAclDefaultActionBlock block) {
        this.allow = allow;
        this.block = block;
    }

    /**
     * Specifies that AWS WAF should allow requests by default. See Allow below for details.
     * 
    */
    public Optional<WebAclDefaultActionAllow> getAllow() {
        return Optional.ofNullable(this.allow);
    }
    /**
     * Specifies that AWS WAF should block requests by default. See Block below for details.
     * 
    */
    public Optional<WebAclDefaultActionBlock> getBlock() {
        return Optional.ofNullable(this.block);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclDefaultActionAllow allow;
        private @Nullable WebAclDefaultActionBlock block;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
        }

        public Builder allow(@Nullable WebAclDefaultActionAllow allow) {
            this.allow = allow;
            return this;
        }

        public Builder block(@Nullable WebAclDefaultActionBlock block) {
            this.block = block;
            return this;
        }
        public WebAclDefaultAction build() {
            return new WebAclDefaultAction(allow, block);
        }
    }
}
