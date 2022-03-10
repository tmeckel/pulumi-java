// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyIamPolicyArgs Empty = new GetAccessPolicyIamPolicyArgs();

    @InputImport(name="accessPolicyId", required=true)
      private final String accessPolicyId;

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    public GetAccessPolicyIamPolicyArgs(String accessPolicyId) {
        this.accessPolicyId = Objects.requireNonNull(accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
    }

    private GetAccessPolicyIamPolicyArgs() {
        this.accessPolicyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyId = defaults.accessPolicyId;
        }

        public Builder accessPolicyId(String accessPolicyId) {
            this.accessPolicyId = Objects.requireNonNull(accessPolicyId);
            return this;
        }
        public GetAccessPolicyIamPolicyArgs build() {
            return new GetAccessPolicyIamPolicyArgs(accessPolicyId);
        }
    }
}
