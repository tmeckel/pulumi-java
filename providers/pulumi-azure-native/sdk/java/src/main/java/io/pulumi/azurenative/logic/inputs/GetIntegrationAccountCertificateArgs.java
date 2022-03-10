// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountCertificateArgs Empty = new GetIntegrationAccountCertificateArgs();

    /**
     * The integration account certificate name.
     * 
     */
    @InputImport(name="certificateName", required=true)
      private final String certificateName;

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
      private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIntegrationAccountCertificateArgs(
        String certificateName,
        String integrationAccountName,
        String resourceGroupName) {
        this.certificateName = Objects.requireNonNull(certificateName, "expected parameter 'certificateName' to be non-null");
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIntegrationAccountCertificateArgs() {
        this.certificateName = null;
        this.integrationAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateName;
        private String integrationAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }

        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIntegrationAccountCertificateArgs build() {
            return new GetIntegrationAccountCertificateArgs(certificateName, integrationAccountName, resourceGroupName);
        }
    }
}
