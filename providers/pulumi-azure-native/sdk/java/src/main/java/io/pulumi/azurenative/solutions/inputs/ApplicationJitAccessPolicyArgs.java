// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.azurenative.solutions.enums.JitApprovalMode;
import io.pulumi.azurenative.solutions.inputs.JitApproverDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed application Jit access policy.
 * 
 */
public final class ApplicationJitAccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationJitAccessPolicyArgs Empty = new ApplicationJitAccessPolicyArgs();

    /**
     * Whether the JIT access is enabled.
     * 
     */
    @Import(name="jitAccessEnabled", required=true)
      private final Output<Boolean> jitAccessEnabled;

    public Output<Boolean> getJitAccessEnabled() {
        return this.jitAccessEnabled;
    }

    /**
     * JIT approval mode.
     * 
     */
    @Import(name="jitApprovalMode")
      private final @Nullable Output<Either<String,JitApprovalMode>> jitApprovalMode;

    public Output<Either<String,JitApprovalMode>> getJitApprovalMode() {
        return this.jitApprovalMode == null ? Codegen.empty() : this.jitApprovalMode;
    }

    /**
     * The JIT approvers
     * 
     */
    @Import(name="jitApprovers")
      private final @Nullable Output<List<JitApproverDefinitionArgs>> jitApprovers;

    public Output<List<JitApproverDefinitionArgs>> getJitApprovers() {
        return this.jitApprovers == null ? Codegen.empty() : this.jitApprovers;
    }

    /**
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
     */
    @Import(name="maximumJitAccessDuration")
      private final @Nullable Output<String> maximumJitAccessDuration;

    public Output<String> getMaximumJitAccessDuration() {
        return this.maximumJitAccessDuration == null ? Codegen.empty() : this.maximumJitAccessDuration;
    }

    public ApplicationJitAccessPolicyArgs(
        Output<Boolean> jitAccessEnabled,
        @Nullable Output<Either<String,JitApprovalMode>> jitApprovalMode,
        @Nullable Output<List<JitApproverDefinitionArgs>> jitApprovers,
        @Nullable Output<String> maximumJitAccessDuration) {
        this.jitAccessEnabled = Objects.requireNonNull(jitAccessEnabled, "expected parameter 'jitAccessEnabled' to be non-null");
        this.jitApprovalMode = jitApprovalMode;
        this.jitApprovers = jitApprovers;
        this.maximumJitAccessDuration = maximumJitAccessDuration;
    }

    private ApplicationJitAccessPolicyArgs() {
        this.jitAccessEnabled = Codegen.empty();
        this.jitApprovalMode = Codegen.empty();
        this.jitApprovers = Codegen.empty();
        this.maximumJitAccessDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationJitAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> jitAccessEnabled;
        private @Nullable Output<Either<String,JitApprovalMode>> jitApprovalMode;
        private @Nullable Output<List<JitApproverDefinitionArgs>> jitApprovers;
        private @Nullable Output<String> maximumJitAccessDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationJitAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jitAccessEnabled = defaults.jitAccessEnabled;
    	      this.jitApprovalMode = defaults.jitApprovalMode;
    	      this.jitApprovers = defaults.jitApprovers;
    	      this.maximumJitAccessDuration = defaults.maximumJitAccessDuration;
        }

        public Builder jitAccessEnabled(Output<Boolean> jitAccessEnabled) {
            this.jitAccessEnabled = Objects.requireNonNull(jitAccessEnabled);
            return this;
        }
        public Builder jitAccessEnabled(Boolean jitAccessEnabled) {
            this.jitAccessEnabled = Output.of(Objects.requireNonNull(jitAccessEnabled));
            return this;
        }
        public Builder jitApprovalMode(@Nullable Output<Either<String,JitApprovalMode>> jitApprovalMode) {
            this.jitApprovalMode = jitApprovalMode;
            return this;
        }
        public Builder jitApprovalMode(@Nullable Either<String,JitApprovalMode> jitApprovalMode) {
            this.jitApprovalMode = Codegen.ofNullable(jitApprovalMode);
            return this;
        }
        public Builder jitApprovers(@Nullable Output<List<JitApproverDefinitionArgs>> jitApprovers) {
            this.jitApprovers = jitApprovers;
            return this;
        }
        public Builder jitApprovers(@Nullable List<JitApproverDefinitionArgs> jitApprovers) {
            this.jitApprovers = Codegen.ofNullable(jitApprovers);
            return this;
        }
        public Builder jitApprovers(JitApproverDefinitionArgs... jitApprovers) {
            return jitApprovers(List.of(jitApprovers));
        }
        public Builder maximumJitAccessDuration(@Nullable Output<String> maximumJitAccessDuration) {
            this.maximumJitAccessDuration = maximumJitAccessDuration;
            return this;
        }
        public Builder maximumJitAccessDuration(@Nullable String maximumJitAccessDuration) {
            this.maximumJitAccessDuration = Codegen.ofNullable(maximumJitAccessDuration);
            return this;
        }        public ApplicationJitAccessPolicyArgs build() {
            return new ApplicationJitAccessPolicyArgs(jitAccessEnabled, jitApprovalMode, jitApprovers, maximumJitAccessDuration);
        }
    }
}
