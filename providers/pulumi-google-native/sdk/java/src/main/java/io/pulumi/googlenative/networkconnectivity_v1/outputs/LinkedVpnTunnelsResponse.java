// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LinkedVpnTunnelsResponse {
    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    private final Boolean siteToSiteDataTransfer;
    /**
     * The URIs of linked VPN tunnel resources.
     * 
     */
    private final List<String> uris;

    @OutputCustomType.Constructor({"siteToSiteDataTransfer","uris"})
    private LinkedVpnTunnelsResponse(
        Boolean siteToSiteDataTransfer,
        List<String> uris) {
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
        this.uris = Objects.requireNonNull(uris);
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    public Boolean getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }
    /**
     * The URIs of linked VPN tunnel resources.
     * 
     */
    public List<String> getUris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedVpnTunnelsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean siteToSiteDataTransfer;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedVpnTunnelsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
    	      this.uris = defaults.uris;
        }

        public Builder setSiteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }

        public Builder setUris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }

        public LinkedVpnTunnelsResponse build() {
            return new LinkedVpnTunnelsResponse(siteToSiteDataTransfer, uris);
        }
    }
}
