// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceActionAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceActionAssociationArgs Empty = new ServiceActionAssociationArgs();

    @InputImport(name="productId", required=true)
      private final Input<String> productId;

    public Input<String> getProductId() {
        return this.productId;
    }

    @InputImport(name="provisioningArtifactId", required=true)
      private final Input<String> provisioningArtifactId;

    public Input<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    @InputImport(name="serviceActionId", required=true)
      private final Input<String> serviceActionId;

    public Input<String> getServiceActionId() {
        return this.serviceActionId;
    }

    public ServiceActionAssociationArgs(
        Input<String> productId,
        Input<String> provisioningArtifactId,
        Input<String> serviceActionId) {
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.provisioningArtifactId = Objects.requireNonNull(provisioningArtifactId, "expected parameter 'provisioningArtifactId' to be non-null");
        this.serviceActionId = Objects.requireNonNull(serviceActionId, "expected parameter 'serviceActionId' to be non-null");
    }

    private ServiceActionAssociationArgs() {
        this.productId = Input.empty();
        this.provisioningArtifactId = Input.empty();
        this.serviceActionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceActionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> productId;
        private Input<String> provisioningArtifactId;
        private Input<String> serviceActionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceActionAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.serviceActionId = defaults.serviceActionId;
        }

        public Builder productId(Input<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder productId(String productId) {
            this.productId = Input.of(Objects.requireNonNull(productId));
            return this;
        }

        public Builder provisioningArtifactId(Input<String> provisioningArtifactId) {
            this.provisioningArtifactId = Objects.requireNonNull(provisioningArtifactId);
            return this;
        }

        public Builder provisioningArtifactId(String provisioningArtifactId) {
            this.provisioningArtifactId = Input.of(Objects.requireNonNull(provisioningArtifactId));
            return this;
        }

        public Builder serviceActionId(Input<String> serviceActionId) {
            this.serviceActionId = Objects.requireNonNull(serviceActionId);
            return this;
        }

        public Builder serviceActionId(String serviceActionId) {
            this.serviceActionId = Input.of(Objects.requireNonNull(serviceActionId));
            return this;
        }
        public ServiceActionAssociationArgs build() {
            return new ServiceActionAssociationArgs(productId, provisioningArtifactId, serviceActionId);
        }
    }
}
