// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbilling_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBillingAccountIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountIamPolicyArgs Empty = new GetBillingAccountIamPolicyArgs();

    @InputImport(name="billingAccountId", required=true)
    private final String billingAccountId;

    public String getBillingAccountId() {
        return this.billingAccountId;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
    private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    public GetBillingAccountIamPolicyArgs(
        String billingAccountId,
        @Nullable String optionsRequestedPolicyVersion) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
    }

    private GetBillingAccountIamPolicyArgs() {
        this.billingAccountId = null;
        this.optionsRequestedPolicyVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingAccountIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountId;
        private @Nullable String optionsRequestedPolicyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingAccountIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
        }

        public Builder setBillingAccountId(String billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public GetBillingAccountIamPolicyArgs build() {
            return new GetBillingAccountIamPolicyArgs(billingAccountId, optionsRequestedPolicyVersion);
        }
    }
}
