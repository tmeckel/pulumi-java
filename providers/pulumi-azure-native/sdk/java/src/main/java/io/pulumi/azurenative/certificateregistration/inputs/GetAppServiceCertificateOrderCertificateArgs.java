// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAppServiceCertificateOrderCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAppServiceCertificateOrderCertificateArgs Empty = new GetAppServiceCertificateOrderCertificateArgs();

    /**
     * Name of the certificate order.
     * 
     */
    @InputImport(name="certificateOrderName", required=true)
      private final String certificateOrderName;

    public String getCertificateOrderName() {
        return this.certificateOrderName;
    }

    /**
     * Name of the certificate.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAppServiceCertificateOrderCertificateArgs(
        String certificateOrderName,
        String name,
        String resourceGroupName) {
        this.certificateOrderName = Objects.requireNonNull(certificateOrderName, "expected parameter 'certificateOrderName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAppServiceCertificateOrderCertificateArgs() {
        this.certificateOrderName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceCertificateOrderCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateOrderName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceCertificateOrderCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateOrderName = defaults.certificateOrderName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder certificateOrderName(String certificateOrderName) {
            this.certificateOrderName = Objects.requireNonNull(certificateOrderName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetAppServiceCertificateOrderCertificateArgs build() {
            return new GetAppServiceCertificateOrderCertificateArgs(certificateOrderName, name, resourceGroupName);
        }
    }
}
