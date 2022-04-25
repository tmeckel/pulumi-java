// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Service provisioned for an entitlement.
 * 
 */
public final class GoogleCloudChannelV1ProvisionedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1ProvisionedServiceResponse Empty = new GoogleCloudChannelV1ProvisionedServiceResponse();

    /**
     * The product pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    @Import(name="productId", required=true)
    private String productId;

    /**
     * @return The product pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    public String productId() {
        return this.productId;
    }

    /**
     * Provisioning ID of the entitlement. For Google Workspace, this would be the underlying Subscription ID. For Google Cloud Platform, this would be the Billing Account ID of the billing subaccount.&#34;
     * 
     */
    @Import(name="provisioningId", required=true)
    private String provisioningId;

    /**
     * @return Provisioning ID of the entitlement. For Google Workspace, this would be the underlying Subscription ID. For Google Cloud Platform, this would be the Billing Account ID of the billing subaccount.&#34;
     * 
     */
    public String provisioningId() {
        return this.provisioningId;
    }

    /**
     * The SKU pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    @Import(name="skuId", required=true)
    private String skuId;

    /**
     * @return The SKU pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    public String skuId() {
        return this.skuId;
    }

    private GoogleCloudChannelV1ProvisionedServiceResponse() {}

    private GoogleCloudChannelV1ProvisionedServiceResponse(GoogleCloudChannelV1ProvisionedServiceResponse $) {
        this.productId = $.productId;
        this.provisioningId = $.provisioningId;
        this.skuId = $.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudChannelV1ProvisionedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1ProvisionedServiceResponse $;

        public Builder() {
            $ = new GoogleCloudChannelV1ProvisionedServiceResponse();
        }

        public Builder(GoogleCloudChannelV1ProvisionedServiceResponse defaults) {
            $ = new GoogleCloudChannelV1ProvisionedServiceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param productId The product pertaining to the provisioning resource as specified in the Offer.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param provisioningId Provisioning ID of the entitlement. For Google Workspace, this would be the underlying Subscription ID. For Google Cloud Platform, this would be the Billing Account ID of the billing subaccount.&#34;
         * 
         * @return builder
         * 
         */
        public Builder provisioningId(String provisioningId) {
            $.provisioningId = provisioningId;
            return this;
        }

        /**
         * @param skuId The SKU pertaining to the provisioning resource as specified in the Offer.
         * 
         * @return builder
         * 
         */
        public Builder skuId(String skuId) {
            $.skuId = skuId;
            return this;
        }

        public GoogleCloudChannelV1ProvisionedServiceResponse build() {
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.provisioningId = Objects.requireNonNull($.provisioningId, "expected parameter 'provisioningId' to be non-null");
            $.skuId = Objects.requireNonNull($.skuId, "expected parameter 'skuId' to be non-null");
            return $;
        }
    }

}
