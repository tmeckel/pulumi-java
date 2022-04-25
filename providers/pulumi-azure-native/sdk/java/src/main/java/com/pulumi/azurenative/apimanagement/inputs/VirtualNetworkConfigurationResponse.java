// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of a virtual network to which API Management service is deployed.
 * 
 */
public final class VirtualNetworkConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkConfigurationResponse Empty = new VirtualNetworkConfigurationResponse();

    /**
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    @Import(name="subnetResourceId")
    private @Nullable String subnetResourceId;

    /**
     * @return The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    public Optional<String> subnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }

    /**
     * The name of the subnet.
     * 
     */
    @Import(name="subnetname", required=true)
    private String subnetname;

    /**
     * @return The name of the subnet.
     * 
     */
    public String subnetname() {
        return this.subnetname;
    }

    /**
     * The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     * 
     */
    @Import(name="vnetid", required=true)
    private String vnetid;

    /**
     * @return The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     * 
     */
    public String vnetid() {
        return this.vnetid;
    }

    private VirtualNetworkConfigurationResponse() {}

    private VirtualNetworkConfigurationResponse(VirtualNetworkConfigurationResponse $) {
        this.subnetResourceId = $.subnetResourceId;
        this.subnetname = $.subnetname;
        this.vnetid = $.vnetid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkConfigurationResponse $;

        public Builder() {
            $ = new VirtualNetworkConfigurationResponse();
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
            $ = new VirtualNetworkConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetResourceId The full resource ID of a subnet in a virtual network to deploy the API Management service in.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            $.subnetResourceId = subnetResourceId;
            return this;
        }

        /**
         * @param subnetname The name of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetname(String subnetname) {
            $.subnetname = subnetname;
            return this;
        }

        /**
         * @param vnetid The virtual network ID. This is typically a GUID. Expect a null GUID by default.
         * 
         * @return builder
         * 
         */
        public Builder vnetid(String vnetid) {
            $.vnetid = vnetid;
            return this;
        }

        public VirtualNetworkConfigurationResponse build() {
            $.subnetname = Objects.requireNonNull($.subnetname, "expected parameter 'subnetname' to be non-null");
            $.vnetid = Objects.requireNonNull($.vnetid, "expected parameter 'vnetid' to be non-null");
            return $;
        }
    }

}
