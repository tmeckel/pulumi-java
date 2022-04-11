// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs;
import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs();

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
     * 
     */
    @Import(name="cmkArn")
      private final @Nullable Output<String> cmkArn;

    public Output<String> getCmkArn() {
        return this.cmkArn == null ? Codegen.empty() : this.cmkArn;
    }

    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    @Import(name="copyTags")
      private final @Nullable Output<Boolean> copyTags;

    public Output<Boolean> getCopyTags() {
        return this.copyTags == null ? Codegen.empty() : this.copyTags;
    }

    /**
     * The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
     * 
     */
    @Import(name="deprecateRule")
      private final @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs> deprecateRule;

    public Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs> getDeprecateRule() {
        return this.deprecateRule == null ? Codegen.empty() : this.deprecateRule;
    }

    /**
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
     * 
     */
    @Import(name="encrypted", required=true)
      private final Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted;
    }

    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    @Import(name="retainRule")
      private final @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs> retainRule;

    public Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs> getRetainRule() {
        return this.retainRule == null ? Codegen.empty() : this.retainRule;
    }

    /**
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * 
     */
    @Import(name="target", required=true)
      private final Output<String> target;

    public Output<String> getTarget() {
        return this.target;
    }

    public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs(
        @Nullable Output<String> cmkArn,
        @Nullable Output<Boolean> copyTags,
        @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs> deprecateRule,
        Output<Boolean> encrypted,
        @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs> retainRule,
        Output<String> target) {
        this.cmkArn = cmkArn;
        this.copyTags = copyTags;
        this.deprecateRule = deprecateRule;
        this.encrypted = Objects.requireNonNull(encrypted, "expected parameter 'encrypted' to be non-null");
        this.retainRule = retainRule;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs() {
        this.cmkArn = Codegen.empty();
        this.copyTags = Codegen.empty();
        this.deprecateRule = Codegen.empty();
        this.encrypted = Codegen.empty();
        this.retainRule = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cmkArn;
        private @Nullable Output<Boolean> copyTags;
        private @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs> deprecateRule;
        private Output<Boolean> encrypted;
        private @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs> retainRule;
        private Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmkArn = defaults.cmkArn;
    	      this.copyTags = defaults.copyTags;
    	      this.deprecateRule = defaults.deprecateRule;
    	      this.encrypted = defaults.encrypted;
    	      this.retainRule = defaults.retainRule;
    	      this.target = defaults.target;
        }

        public Builder cmkArn(@Nullable Output<String> cmkArn) {
            this.cmkArn = cmkArn;
            return this;
        }
        public Builder cmkArn(@Nullable String cmkArn) {
            this.cmkArn = Codegen.ofNullable(cmkArn);
            return this;
        }
        public Builder copyTags(@Nullable Output<Boolean> copyTags) {
            this.copyTags = copyTags;
            return this;
        }
        public Builder copyTags(@Nullable Boolean copyTags) {
            this.copyTags = Codegen.ofNullable(copyTags);
            return this;
        }
        public Builder deprecateRule(@Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs> deprecateRule) {
            this.deprecateRule = deprecateRule;
            return this;
        }
        public Builder deprecateRule(@Nullable LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleArgs deprecateRule) {
            this.deprecateRule = Codegen.ofNullable(deprecateRule);
            return this;
        }
        public Builder encrypted(Output<Boolean> encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Output.of(Objects.requireNonNull(encrypted));
            return this;
        }
        public Builder retainRule(@Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs> retainRule) {
            this.retainRule = retainRule;
            return this;
        }
        public Builder retainRule(@Nullable LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs retainRule) {
            this.retainRule = Codegen.ofNullable(retainRule);
            return this;
        }
        public Builder target(Output<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(String target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs(cmkArn, copyTags, deprecateRule, encrypted, retainRule, target);
        }
    }
}
