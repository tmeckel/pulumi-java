// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final IAMPolicyState Empty = new IAMPolicyState();

    /**
     * (Computed) The etag of the service account IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Codegen.empty() : this.policyData;
    }

    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Import(name="serviceAccountId")
      private final @Nullable Output<String> serviceAccountId;

    public Output<String> getServiceAccountId() {
        return this.serviceAccountId == null ? Codegen.empty() : this.serviceAccountId;
    }

    public IAMPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> serviceAccountId) {
        this.etag = etag;
        this.policyData = policyData;
        this.serviceAccountId = serviceAccountId;
    }

    private IAMPolicyState() {
        this.etag = Codegen.empty();
        this.policyData = Codegen.empty();
        this.serviceAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.serviceAccountId = defaults.serviceAccountId;
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
        }
        public Builder serviceAccountId(@Nullable Output<String> serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public Builder serviceAccountId(@Nullable String serviceAccountId) {
            this.serviceAccountId = Codegen.ofNullable(serviceAccountId);
            return this;
        }        public IAMPolicyState build() {
            return new IAMPolicyState(etag, policyData, serviceAccountId);
        }
    }
}
