// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.attestation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAttestationProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttestationProviderArgs Empty = new GetAttestationProviderArgs();

    /**
     * Name of the attestation provider.
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    /**
     * @return Name of the attestation provider.
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAttestationProviderArgs() {}

    private GetAttestationProviderArgs(GetAttestationProviderArgs $) {
        this.providerName = $.providerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttestationProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttestationProviderArgs $;

        public Builder() {
            $ = new GetAttestationProviderArgs();
        }

        public Builder(GetAttestationProviderArgs defaults) {
            $ = new GetAttestationProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param providerName Name of the attestation provider.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAttestationProviderArgs build() {
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
