// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationArgs Empty = new GetOrganizationArgs();

    @InputImport(name="organizationId", required=true)
    private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetOrganizationArgs(String organizationId) {
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetOrganizationArgs() {
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public GetOrganizationArgs build() {
            return new GetOrganizationArgs(organizationId);
        }
    }
}
