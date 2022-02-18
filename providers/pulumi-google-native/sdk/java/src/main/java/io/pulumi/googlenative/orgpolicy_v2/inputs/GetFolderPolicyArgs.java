// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFolderPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFolderPolicyArgs Empty = new GetFolderPolicyArgs();

    @InputImport(name="folderId", required=true)
    private final String folderId;

    public String getFolderId() {
        return this.folderId;
    }

    @InputImport(name="policyId", required=true)
    private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    public GetFolderPolicyArgs(
        String folderId,
        String policyId) {
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
    }

    private GetFolderPolicyArgs() {
        this.folderId = null;
        this.policyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String folderId;
        private String policyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
    	      this.policyId = defaults.policyId;
        }

        public Builder setFolderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public GetFolderPolicyArgs build() {
            return new GetFolderPolicyArgs(folderId, policyId);
        }
    }
}
