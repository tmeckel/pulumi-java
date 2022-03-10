// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupImmunityTimePropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupImmunityTimePropertyArgs Empty = new RuleGroupImmunityTimePropertyArgs();

    @InputImport(name="immunityTime", required=true)
      private final Input<Integer> immunityTime;

    public Input<Integer> getImmunityTime() {
        return this.immunityTime;
    }

    public RuleGroupImmunityTimePropertyArgs(Input<Integer> immunityTime) {
        this.immunityTime = Objects.requireNonNull(immunityTime, "expected parameter 'immunityTime' to be non-null");
    }

    private RuleGroupImmunityTimePropertyArgs() {
        this.immunityTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupImmunityTimePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> immunityTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupImmunityTimePropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTime = defaults.immunityTime;
        }

        public Builder immunityTime(Input<Integer> immunityTime) {
            this.immunityTime = Objects.requireNonNull(immunityTime);
            return this;
        }

        public Builder immunityTime(Integer immunityTime) {
            this.immunityTime = Input.of(Objects.requireNonNull(immunityTime));
            return this;
        }
        public RuleGroupImmunityTimePropertyArgs build() {
            return new RuleGroupImmunityTimePropertyArgs(immunityTime);
        }
    }
}
