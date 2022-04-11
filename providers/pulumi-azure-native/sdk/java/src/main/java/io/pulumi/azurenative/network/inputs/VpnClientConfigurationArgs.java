// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.VpnAuthenticationType;
import io.pulumi.azurenative.network.enums.VpnClientProtocol;
import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.RadiusServerArgs;
import io.pulumi.azurenative.network.inputs.VpnClientRevokedCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnClientRootCertificateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VpnClientConfiguration for P2S client.
 * 
 */
public final class VpnClientConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnClientConfigurationArgs Empty = new VpnClientConfigurationArgs();

    /**
     * The AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    @Import(name="aadAudience")
      private final @Nullable Output<String> aadAudience;

    public Output<String> getAadAudience() {
        return this.aadAudience == null ? Codegen.empty() : this.aadAudience;
    }

    /**
     * The AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    @Import(name="aadIssuer")
      private final @Nullable Output<String> aadIssuer;

    public Output<String> getAadIssuer() {
        return this.aadIssuer == null ? Codegen.empty() : this.aadIssuer;
    }

    /**
     * The AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    @Import(name="aadTenant")
      private final @Nullable Output<String> aadTenant;

    public Output<String> getAadTenant() {
        return this.aadTenant == null ? Codegen.empty() : this.aadTenant;
    }

    /**
     * The radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    @Import(name="radiusServerAddress")
      private final @Nullable Output<String> radiusServerAddress;

    public Output<String> getRadiusServerAddress() {
        return this.radiusServerAddress == null ? Codegen.empty() : this.radiusServerAddress;
    }

    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    @Import(name="radiusServerSecret")
      private final @Nullable Output<String> radiusServerSecret;

    public Output<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Codegen.empty() : this.radiusServerSecret;
    }

    /**
     * The radiusServers property for multiple radius server configuration.
     * 
     */
    @Import(name="radiusServers")
      private final @Nullable Output<List<RadiusServerArgs>> radiusServers;

    public Output<List<RadiusServerArgs>> getRadiusServers() {
        return this.radiusServers == null ? Codegen.empty() : this.radiusServers;
    }

    /**
     * VPN authentication types for the virtual network gateway..
     * 
     */
    @Import(name="vpnAuthenticationTypes")
      private final @Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;

    public Output<List<Either<String,VpnAuthenticationType>>> getVpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? Codegen.empty() : this.vpnAuthenticationTypes;
    }

    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    @Import(name="vpnClientAddressPool")
      private final @Nullable Output<AddressSpaceArgs> vpnClientAddressPool;

    public Output<AddressSpaceArgs> getVpnClientAddressPool() {
        return this.vpnClientAddressPool == null ? Codegen.empty() : this.vpnClientAddressPool;
    }

    /**
     * VpnClientIpsecPolicies for virtual network gateway P2S client.
     * 
     */
    @Import(name="vpnClientIpsecPolicies")
      private final @Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;

    public Output<List<IpsecPolicyArgs>> getVpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? Codegen.empty() : this.vpnClientIpsecPolicies;
    }

    /**
     * VpnClientProtocols for Virtual network gateway.
     * 
     */
    @Import(name="vpnClientProtocols")
      private final @Nullable Output<List<Either<String,VpnClientProtocol>>> vpnClientProtocols;

    public Output<List<Either<String,VpnClientProtocol>>> getVpnClientProtocols() {
        return this.vpnClientProtocols == null ? Codegen.empty() : this.vpnClientProtocols;
    }

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     * 
     */
    @Import(name="vpnClientRevokedCertificates")
      private final @Nullable Output<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;

    public Output<List<VpnClientRevokedCertificateArgs>> getVpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? Codegen.empty() : this.vpnClientRevokedCertificates;
    }

    /**
     * VpnClientRootCertificate for virtual network gateway.
     * 
     */
    @Import(name="vpnClientRootCertificates")
      private final @Nullable Output<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates;

    public Output<List<VpnClientRootCertificateArgs>> getVpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? Codegen.empty() : this.vpnClientRootCertificates;
    }

    public VpnClientConfigurationArgs(
        @Nullable Output<String> aadAudience,
        @Nullable Output<String> aadIssuer,
        @Nullable Output<String> aadTenant,
        @Nullable Output<String> radiusServerAddress,
        @Nullable Output<String> radiusServerSecret,
        @Nullable Output<List<RadiusServerArgs>> radiusServers,
        @Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes,
        @Nullable Output<AddressSpaceArgs> vpnClientAddressPool,
        @Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies,
        @Nullable Output<List<Either<String,VpnClientProtocol>>> vpnClientProtocols,
        @Nullable Output<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates,
        @Nullable Output<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerSecret = radiusServerSecret;
        this.radiusServers = radiusServers;
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        this.vpnClientAddressPool = vpnClientAddressPool;
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnClientProtocols = vpnClientProtocols;
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        this.vpnClientRootCertificates = vpnClientRootCertificates;
    }

    private VpnClientConfigurationArgs() {
        this.aadAudience = Codegen.empty();
        this.aadIssuer = Codegen.empty();
        this.aadTenant = Codegen.empty();
        this.radiusServerAddress = Codegen.empty();
        this.radiusServerSecret = Codegen.empty();
        this.radiusServers = Codegen.empty();
        this.vpnAuthenticationTypes = Codegen.empty();
        this.vpnClientAddressPool = Codegen.empty();
        this.vpnClientIpsecPolicies = Codegen.empty();
        this.vpnClientProtocols = Codegen.empty();
        this.vpnClientRevokedCertificates = Codegen.empty();
        this.vpnClientRootCertificates = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aadAudience;
        private @Nullable Output<String> aadIssuer;
        private @Nullable Output<String> aadTenant;
        private @Nullable Output<String> radiusServerAddress;
        private @Nullable Output<String> radiusServerSecret;
        private @Nullable Output<List<RadiusServerArgs>> radiusServers;
        private @Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;
        private @Nullable Output<AddressSpaceArgs> vpnClientAddressPool;
        private @Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;
        private @Nullable Output<List<Either<String,VpnClientProtocol>>> vpnClientProtocols;
        private @Nullable Output<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;
        private @Nullable Output<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAudience = defaults.aadAudience;
    	      this.aadIssuer = defaults.aadIssuer;
    	      this.aadTenant = defaults.aadTenant;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServers = defaults.radiusServers;
    	      this.vpnAuthenticationTypes = defaults.vpnAuthenticationTypes;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnClientProtocols = defaults.vpnClientProtocols;
    	      this.vpnClientRevokedCertificates = defaults.vpnClientRevokedCertificates;
    	      this.vpnClientRootCertificates = defaults.vpnClientRootCertificates;
        }

        public Builder aadAudience(@Nullable Output<String> aadAudience) {
            this.aadAudience = aadAudience;
            return this;
        }
        public Builder aadAudience(@Nullable String aadAudience) {
            this.aadAudience = Codegen.ofNullable(aadAudience);
            return this;
        }
        public Builder aadIssuer(@Nullable Output<String> aadIssuer) {
            this.aadIssuer = aadIssuer;
            return this;
        }
        public Builder aadIssuer(@Nullable String aadIssuer) {
            this.aadIssuer = Codegen.ofNullable(aadIssuer);
            return this;
        }
        public Builder aadTenant(@Nullable Output<String> aadTenant) {
            this.aadTenant = aadTenant;
            return this;
        }
        public Builder aadTenant(@Nullable String aadTenant) {
            this.aadTenant = Codegen.ofNullable(aadTenant);
            return this;
        }
        public Builder radiusServerAddress(@Nullable Output<String> radiusServerAddress) {
            this.radiusServerAddress = radiusServerAddress;
            return this;
        }
        public Builder radiusServerAddress(@Nullable String radiusServerAddress) {
            this.radiusServerAddress = Codegen.ofNullable(radiusServerAddress);
            return this;
        }
        public Builder radiusServerSecret(@Nullable Output<String> radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }
        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = Codegen.ofNullable(radiusServerSecret);
            return this;
        }
        public Builder radiusServers(@Nullable Output<List<RadiusServerArgs>> radiusServers) {
            this.radiusServers = radiusServers;
            return this;
        }
        public Builder radiusServers(@Nullable List<RadiusServerArgs> radiusServers) {
            this.radiusServers = Codegen.ofNullable(radiusServers);
            return this;
        }
        public Builder radiusServers(RadiusServerArgs... radiusServers) {
            return radiusServers(List.of(radiusServers));
        }
        public Builder vpnAuthenticationTypes(@Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = vpnAuthenticationTypes;
            return this;
        }
        public Builder vpnAuthenticationTypes(@Nullable List<Either<String,VpnAuthenticationType>> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = Codegen.ofNullable(vpnAuthenticationTypes);
            return this;
        }
        public Builder vpnAuthenticationTypes(Either<String,VpnAuthenticationType>... vpnAuthenticationTypes) {
            return vpnAuthenticationTypes(List.of(vpnAuthenticationTypes));
        }
        public Builder vpnClientAddressPool(@Nullable Output<AddressSpaceArgs> vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }
        public Builder vpnClientAddressPool(@Nullable AddressSpaceArgs vpnClientAddressPool) {
            this.vpnClientAddressPool = Codegen.ofNullable(vpnClientAddressPool);
            return this;
        }
        public Builder vpnClientIpsecPolicies(@Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }
        public Builder vpnClientIpsecPolicies(@Nullable List<IpsecPolicyArgs> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = Codegen.ofNullable(vpnClientIpsecPolicies);
            return this;
        }
        public Builder vpnClientIpsecPolicies(IpsecPolicyArgs... vpnClientIpsecPolicies) {
            return vpnClientIpsecPolicies(List.of(vpnClientIpsecPolicies));
        }
        public Builder vpnClientProtocols(@Nullable Output<List<Either<String,VpnClientProtocol>>> vpnClientProtocols) {
            this.vpnClientProtocols = vpnClientProtocols;
            return this;
        }
        public Builder vpnClientProtocols(@Nullable List<Either<String,VpnClientProtocol>> vpnClientProtocols) {
            this.vpnClientProtocols = Codegen.ofNullable(vpnClientProtocols);
            return this;
        }
        public Builder vpnClientProtocols(Either<String,VpnClientProtocol>... vpnClientProtocols) {
            return vpnClientProtocols(List.of(vpnClientProtocols));
        }
        public Builder vpnClientRevokedCertificates(@Nullable Output<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }
        public Builder vpnClientRevokedCertificates(@Nullable List<VpnClientRevokedCertificateArgs> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = Codegen.ofNullable(vpnClientRevokedCertificates);
            return this;
        }
        public Builder vpnClientRevokedCertificates(VpnClientRevokedCertificateArgs... vpnClientRevokedCertificates) {
            return vpnClientRevokedCertificates(List.of(vpnClientRevokedCertificates));
        }
        public Builder vpnClientRootCertificates(@Nullable Output<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }
        public Builder vpnClientRootCertificates(@Nullable List<VpnClientRootCertificateArgs> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = Codegen.ofNullable(vpnClientRootCertificates);
            return this;
        }
        public Builder vpnClientRootCertificates(VpnClientRootCertificateArgs... vpnClientRootCertificates) {
            return vpnClientRootCertificates(List.of(vpnClientRootCertificates));
        }        public VpnClientConfigurationArgs build() {
            return new VpnClientConfigurationArgs(aadAudience, aadIssuer, aadTenant, radiusServerAddress, radiusServerSecret, radiusServers, vpnAuthenticationTypes, vpnClientAddressPool, vpnClientIpsecPolicies, vpnClientProtocols, vpnClientRevokedCertificates, vpnClientRootCertificates);
        }
    }
}
