// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Customer Managed Identity
 * 
 */
public final class WorkbookUserAssignedIdentitiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkbookUserAssignedIdentitiesResponse Empty = new WorkbookUserAssignedIdentitiesResponse();

    /**
     * The client ID of resource.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * The principal ID of resource identity.
     * 
     */
    @InputImport(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    public WorkbookUserAssignedIdentitiesResponse(
        String clientId,
        String principalId,
        String tenantId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private WorkbookUserAssignedIdentitiesResponse() {
        this.clientId = null;
        this.principalId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookUserAssignedIdentitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookUserAssignedIdentitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public WorkbookUserAssignedIdentitiesResponse build() {
            return new WorkbookUserAssignedIdentitiesResponse(clientId, principalId, tenantId);
        }
    }
}
