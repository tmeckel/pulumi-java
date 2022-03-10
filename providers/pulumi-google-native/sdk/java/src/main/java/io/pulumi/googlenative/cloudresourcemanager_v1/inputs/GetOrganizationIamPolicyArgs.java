// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationIamPolicyArgs Empty = new GetOrganizationIamPolicyArgs();

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetOrganizationIamPolicyArgs(String organizationId) {
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetOrganizationIamPolicyArgs() {
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationId = defaults.organizationId;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetOrganizationIamPolicyArgs build() {
            return new GetOrganizationIamPolicyArgs(organizationId);
        }
    }
}
