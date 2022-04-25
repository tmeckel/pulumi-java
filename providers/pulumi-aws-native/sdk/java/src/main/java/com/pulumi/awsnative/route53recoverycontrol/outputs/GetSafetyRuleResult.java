// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol.outputs;

import com.pulumi.awsnative.route53recoverycontrol.enums.SafetyRuleStatus;
import com.pulumi.awsnative.route53recoverycontrol.outputs.SafetyRuleAssertionRule;
import com.pulumi.awsnative.route53recoverycontrol.outputs.SafetyRuleGatingRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSafetyRuleResult {
    private final @Nullable SafetyRuleAssertionRule assertionRule;
    private final @Nullable SafetyRuleGatingRule gatingRule;
    private final @Nullable String name;
    /**
     * @return The Amazon Resource Name (ARN) of the safety rule.
     * 
     */
    private final @Nullable String safetyRuleArn;
    /**
     * @return The deployment status of the routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    private final @Nullable SafetyRuleStatus status;

    @CustomType.Constructor
    private GetSafetyRuleResult(
        @CustomType.Parameter("assertionRule") @Nullable SafetyRuleAssertionRule assertionRule,
        @CustomType.Parameter("gatingRule") @Nullable SafetyRuleGatingRule gatingRule,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("safetyRuleArn") @Nullable String safetyRuleArn,
        @CustomType.Parameter("status") @Nullable SafetyRuleStatus status) {
        this.assertionRule = assertionRule;
        this.gatingRule = gatingRule;
        this.name = name;
        this.safetyRuleArn = safetyRuleArn;
        this.status = status;
    }

    public Optional<SafetyRuleAssertionRule> assertionRule() {
        return Optional.ofNullable(this.assertionRule);
    }
    public Optional<SafetyRuleGatingRule> gatingRule() {
        return Optional.ofNullable(this.gatingRule);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the safety rule.
     * 
     */
    public Optional<String> safetyRuleArn() {
        return Optional.ofNullable(this.safetyRuleArn);
    }
    /**
     * @return The deployment status of the routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    public Optional<SafetyRuleStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSafetyRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SafetyRuleAssertionRule assertionRule;
        private @Nullable SafetyRuleGatingRule gatingRule;
        private @Nullable String name;
        private @Nullable String safetyRuleArn;
        private @Nullable SafetyRuleStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSafetyRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertionRule = defaults.assertionRule;
    	      this.gatingRule = defaults.gatingRule;
    	      this.name = defaults.name;
    	      this.safetyRuleArn = defaults.safetyRuleArn;
    	      this.status = defaults.status;
        }

        public Builder assertionRule(@Nullable SafetyRuleAssertionRule assertionRule) {
            this.assertionRule = assertionRule;
            return this;
        }
        public Builder gatingRule(@Nullable SafetyRuleGatingRule gatingRule) {
            this.gatingRule = gatingRule;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder safetyRuleArn(@Nullable String safetyRuleArn) {
            this.safetyRuleArn = safetyRuleArn;
            return this;
        }
        public Builder status(@Nullable SafetyRuleStatus status) {
            this.status = status;
            return this;
        }        public GetSafetyRuleResult build() {
            return new GetSafetyRuleResult(assertionRule, gatingRule, name, safetyRuleArn, status);
        }
    }
}
