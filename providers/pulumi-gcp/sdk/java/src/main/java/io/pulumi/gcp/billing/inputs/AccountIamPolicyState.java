// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final AccountIamPolicyState Empty = new AccountIamPolicyState();

    @Import(name="billingAccountId")
      private final @Nullable Output<String> billingAccountId;

    public Output<String> getBillingAccountId() {
        return this.billingAccountId == null ? Codegen.empty() : this.billingAccountId;
    }

    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Codegen.empty() : this.policyData;
    }

    public AccountIamPolicyState(
        @Nullable Output<String> billingAccountId,
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData) {
        this.billingAccountId = billingAccountId;
        this.etag = etag;
        this.policyData = policyData;
    }

    private AccountIamPolicyState() {
        this.billingAccountId = Codegen.empty();
        this.etag = Codegen.empty();
        this.policyData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> billingAccountId;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
        }

        public Builder billingAccountId(@Nullable Output<String> billingAccountId) {
            this.billingAccountId = billingAccountId;
            return this;
        }
        public Builder billingAccountId(@Nullable String billingAccountId) {
            this.billingAccountId = Codegen.ofNullable(billingAccountId);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }
        public Builder policyData(@Nullable String policyData) {
            this.policyData = Codegen.ofNullable(policyData);
            return this;
        }        public AccountIamPolicyState build() {
            return new AccountIamPolicyState(billingAccountId, etag, policyData);
        }
    }
}
