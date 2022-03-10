// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CustomRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomRuleListResponse {
    /**
     * List of rules
     * 
     */
    private final @Nullable List<CustomRuleResponse> rules;

    @OutputCustomType.Constructor
    private CustomRuleListResponse(@OutputCustomType.Parameter("rules") @Nullable List<CustomRuleResponse> rules) {
        this.rules = rules;
    }

    /**
     * List of rules
     * 
    */
    public List<CustomRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable List<CustomRuleResponse> rules) {
            this.rules = rules;
            return this;
        }
        public CustomRuleListResponse build() {
            return new CustomRuleListResponse(rules);
        }
    }
}
