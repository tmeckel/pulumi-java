// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationConfigurationExecutionControlsSsmControlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationConfigurationExecutionControlsSsmControlsGetArgs Empty = new RemediationConfigurationExecutionControlsSsmControlsGetArgs();

    /**
     * Maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that specific rule. The default value is 10%.
     * 
     */
    @Import(name="concurrentExecutionRatePercentage")
      private final @Nullable Output<Integer> concurrentExecutionRatePercentage;

    public Output<Integer> getConcurrentExecutionRatePercentage() {
        return this.concurrentExecutionRatePercentage == null ? Codegen.empty() : this.concurrentExecutionRatePercentage;
    }

    /**
     * Percentage of errors that are allowed before SSM stops running automations on non-compliant resources for that specific rule. The default is 50%.
     * 
     */
    @Import(name="errorPercentage")
      private final @Nullable Output<Integer> errorPercentage;

    public Output<Integer> getErrorPercentage() {
        return this.errorPercentage == null ? Codegen.empty() : this.errorPercentage;
    }

    public RemediationConfigurationExecutionControlsSsmControlsGetArgs(
        @Nullable Output<Integer> concurrentExecutionRatePercentage,
        @Nullable Output<Integer> errorPercentage) {
        this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
        this.errorPercentage = errorPercentage;
    }

    private RemediationConfigurationExecutionControlsSsmControlsGetArgs() {
        this.concurrentExecutionRatePercentage = Codegen.empty();
        this.errorPercentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationExecutionControlsSsmControlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> concurrentExecutionRatePercentage;
        private @Nullable Output<Integer> errorPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationConfigurationExecutionControlsSsmControlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentExecutionRatePercentage = defaults.concurrentExecutionRatePercentage;
    	      this.errorPercentage = defaults.errorPercentage;
        }

        public Builder concurrentExecutionRatePercentage(@Nullable Output<Integer> concurrentExecutionRatePercentage) {
            this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
            return this;
        }
        public Builder concurrentExecutionRatePercentage(@Nullable Integer concurrentExecutionRatePercentage) {
            this.concurrentExecutionRatePercentage = Codegen.ofNullable(concurrentExecutionRatePercentage);
            return this;
        }
        public Builder errorPercentage(@Nullable Output<Integer> errorPercentage) {
            this.errorPercentage = errorPercentage;
            return this;
        }
        public Builder errorPercentage(@Nullable Integer errorPercentage) {
            this.errorPercentage = Codegen.ofNullable(errorPercentage);
            return this;
        }        public RemediationConfigurationExecutionControlsSsmControlsGetArgs build() {
            return new RemediationConfigurationExecutionControlsSsmControlsGetArgs(concurrentExecutionRatePercentage, errorPercentage);
        }
    }
}
