// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupDimension extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupDimension Empty = new RuleGroupDimension();

    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public RuleGroupDimension(String value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private RuleGroupDimension() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RuleGroupDimension build() {
            return new RuleGroupDimension(value);
        }
    }
}
