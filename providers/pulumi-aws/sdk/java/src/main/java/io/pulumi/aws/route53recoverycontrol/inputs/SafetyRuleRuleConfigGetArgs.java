// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SafetyRuleRuleConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleRuleConfigGetArgs Empty = new SafetyRuleRuleConfigGetArgs();

    /**
     * Logical negation of the rule.
     * 
     */
    @Import(name="inverted", required=true)
      private final Output<Boolean> inverted;

    public Output<Boolean> getInverted() {
        return this.inverted;
    }

    /**
     * Number of controls that must be set when you specify an `ATLEAST` type rule.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<Integer> threshold;

    public Output<Integer> getThreshold() {
        return this.threshold;
    }

    /**
     * Rule type. Valid values are `ATLEAST`, `AND`, and `OR`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SafetyRuleRuleConfigGetArgs(
        Output<Boolean> inverted,
        Output<Integer> threshold,
        Output<String> type) {
        this.inverted = Objects.requireNonNull(inverted, "expected parameter 'inverted' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SafetyRuleRuleConfigGetArgs() {
        this.inverted = Codegen.empty();
        this.threshold = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleRuleConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> inverted;
        private Output<Integer> threshold;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleRuleConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverted = defaults.inverted;
    	      this.threshold = defaults.threshold;
    	      this.type = defaults.type;
        }

        public Builder inverted(Output<Boolean> inverted) {
            this.inverted = Objects.requireNonNull(inverted);
            return this;
        }
        public Builder inverted(Boolean inverted) {
            this.inverted = Output.of(Objects.requireNonNull(inverted));
            return this;
        }
        public Builder threshold(Output<Integer> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder threshold(Integer threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SafetyRuleRuleConfigGetArgs build() {
            return new SafetyRuleRuleConfigGetArgs(inverted, threshold, type);
        }
    }
}
