// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies the retention policy for the log.
 * 
 */
public final class RetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyArgs Empty = new RetentionPolicyArgs();

    /**
     * The number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    @Import(name="days", required=true)
      private final Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days;
    }

    /**
     * A value indicating whether the retention policy is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public RetentionPolicyArgs(
        Output<Integer> days,
        Output<Boolean> enabled) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private RetentionPolicyArgs() {
        this.days = Codegen.empty();
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> days;
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(Output<Integer> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(Integer days) {
            this.days = Output.of(Objects.requireNonNull(days));
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }        public RetentionPolicyArgs build() {
            return new RetentionPolicyArgs(days, enabled);
        }
    }
}
