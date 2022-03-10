// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VpnLinkBgpSettingsResponse;
import io.pulumi.azurenative.network.inputs.VpnLinkProviderPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VpnSiteLink Resource.
 * 
 */
public final class VpnSiteLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnSiteLinkResponse Empty = new VpnSiteLinkResponse();

    /**
     * The set of bgp properties.
     * 
     */
    @InputImport(name="bgpProperties")
      private final @Nullable VpnLinkBgpSettingsResponse bgpProperties;

    public Optional<VpnLinkBgpSettingsResponse> getBgpProperties() {
        return this.bgpProperties == null ? Optional.empty() : Optional.ofNullable(this.bgpProperties);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * FQDN of vpn-site-link.
     * 
     */
    @InputImport(name="fqdn")
      private final @Nullable String fqdn;

    public Optional<String> getFqdn() {
        return this.fqdn == null ? Optional.empty() : Optional.ofNullable(this.fqdn);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The ip-address for the vpn-site-link.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * The link provider properties.
     * 
     */
    @InputImport(name="linkProperties")
      private final @Nullable VpnLinkProviderPropertiesResponse linkProperties;

    public Optional<VpnLinkProviderPropertiesResponse> getLinkProperties() {
        return this.linkProperties == null ? Optional.empty() : Optional.ofNullable(this.linkProperties);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the VPN site link resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public VpnSiteLinkResponse(
        @Nullable VpnLinkBgpSettingsResponse bgpProperties,
        String etag,
        @Nullable String fqdn,
        @Nullable String id,
        @Nullable String ipAddress,
        @Nullable VpnLinkProviderPropertiesResponse linkProperties,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.bgpProperties = bgpProperties;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.fqdn = fqdn;
        this.id = id;
        this.ipAddress = ipAddress;
        this.linkProperties = linkProperties;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VpnSiteLinkResponse() {
        this.bgpProperties = null;
        this.etag = null;
        this.fqdn = null;
        this.id = null;
        this.ipAddress = null;
        this.linkProperties = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VpnLinkBgpSettingsResponse bgpProperties;
        private String etag;
        private @Nullable String fqdn;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable VpnLinkProviderPropertiesResponse linkProperties;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpProperties = defaults.bgpProperties;
    	      this.etag = defaults.etag;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.linkProperties = defaults.linkProperties;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder bgpProperties(@Nullable VpnLinkBgpSettingsResponse bgpProperties) {
            this.bgpProperties = bgpProperties;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder linkProperties(@Nullable VpnLinkProviderPropertiesResponse linkProperties) {
            this.linkProperties = linkProperties;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VpnSiteLinkResponse build() {
            return new VpnSiteLinkResponse(bgpProperties, etag, fqdn, id, ipAddress, linkProperties, name, provisioningState, type);
        }
    }
}
