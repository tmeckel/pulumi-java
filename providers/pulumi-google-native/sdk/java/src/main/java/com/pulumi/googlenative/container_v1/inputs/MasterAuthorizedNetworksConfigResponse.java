// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.CidrBlockResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Configuration options for the master authorized networks feature. Enabled master authorized networks will disallow all external traffic to access Kubernetes master through HTTPS except traffic from the given CIDR blocks, Google Compute Engine Public IPs and Google Prod IPs.
 * 
 */
public final class MasterAuthorizedNetworksConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final MasterAuthorizedNetworksConfigResponse Empty = new MasterAuthorizedNetworksConfigResponse();

    /**
     * cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    @Import(name="cidrBlocks", required=true)
    private List<CidrBlockResponse> cidrBlocks;

    /**
     * @return cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    public List<CidrBlockResponse> cidrBlocks() {
        return this.cidrBlocks;
    }

    /**
     * Whether or not master authorized networks is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether or not master authorized networks is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private MasterAuthorizedNetworksConfigResponse() {}

    private MasterAuthorizedNetworksConfigResponse(MasterAuthorizedNetworksConfigResponse $) {
        this.cidrBlocks = $.cidrBlocks;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MasterAuthorizedNetworksConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MasterAuthorizedNetworksConfigResponse $;

        public Builder() {
            $ = new MasterAuthorizedNetworksConfigResponse();
        }

        public Builder(MasterAuthorizedNetworksConfigResponse defaults) {
            $ = new MasterAuthorizedNetworksConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<CidrBlockResponse> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(CidrBlockResponse... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        /**
         * @param enabled Whether or not master authorized networks is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public MasterAuthorizedNetworksConfigResponse build() {
            $.cidrBlocks = Objects.requireNonNull($.cidrBlocks, "expected parameter 'cidrBlocks' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
