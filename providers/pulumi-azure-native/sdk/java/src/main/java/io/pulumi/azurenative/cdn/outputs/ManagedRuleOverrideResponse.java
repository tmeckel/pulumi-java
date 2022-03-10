// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedRuleOverrideResponse {
    /**
     * Describes the override action to be applied when rule matches.
     * 
     */
    private final @Nullable String action;
    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
     * 
     */
    private final @Nullable String enabledState;
    /**
     * Identifier for the managed rule.
     * 
     */
    private final String ruleId;

    @OutputCustomType.Constructor
    private ManagedRuleOverrideResponse(
        @OutputCustomType.Parameter("action") @Nullable String action,
        @OutputCustomType.Parameter("enabledState") @Nullable String enabledState,
        @OutputCustomType.Parameter("ruleId") String ruleId) {
        this.action = action;
        this.enabledState = enabledState;
        this.ruleId = ruleId;
    }

    /**
     * Describes the override action to be applied when rule matches.
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
     * 
    */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * Identifier for the managed rule.
     * 
    */
    public String getRuleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String enabledState;
        private String ruleId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.ruleId = defaults.ruleId;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public ManagedRuleOverrideResponse build() {
            return new ManagedRuleOverrideResponse(action, enabledState, ruleId);
        }
    }
}
