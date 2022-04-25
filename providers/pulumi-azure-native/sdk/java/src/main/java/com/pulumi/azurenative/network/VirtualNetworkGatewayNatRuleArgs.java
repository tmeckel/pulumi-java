// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.VpnNatRuleMode;
import com.pulumi.azurenative.network.enums.VpnNatRuleType;
import com.pulumi.azurenative.network.inputs.VpnNatRuleMappingArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayNatRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayNatRuleArgs Empty = new VirtualNetworkGatewayNatRuleArgs();

    /**
     * The private IP address external mapping for NAT.
     * 
     */
    @Import(name="externalMappings")
    private @Nullable Output<List<VpnNatRuleMappingArgs>> externalMappings;

    /**
     * @return The private IP address external mapping for NAT.
     * 
     */
    public Optional<Output<List<VpnNatRuleMappingArgs>>> externalMappings() {
        return Optional.ofNullable(this.externalMappings);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    @Import(name="internalMappings")
    private @Nullable Output<List<VpnNatRuleMappingArgs>> internalMappings;

    /**
     * @return The private IP address internal mapping for NAT.
     * 
     */
    public Optional<Output<List<VpnNatRuleMappingArgs>>> internalMappings() {
        return Optional.ofNullable(this.internalMappings);
    }

    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    @Import(name="ipConfigurationId")
    private @Nullable Output<String> ipConfigurationId;

    /**
     * @return The IP Configuration ID this NAT rule applies to.
     * 
     */
    public Optional<Output<String>> ipConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }

    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,VpnNatRuleMode>> mode;

    /**
     * @return The Source NAT direction of a VPN NAT.
     * 
     */
    public Optional<Output<Either<String,VpnNatRuleMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the nat rule.
     * 
     */
    @Import(name="natRuleName")
    private @Nullable Output<String> natRuleName;

    /**
     * @return The name of the nat rule.
     * 
     */
    public Optional<Output<String>> natRuleName() {
        return Optional.ofNullable(this.natRuleName);
    }

    /**
     * The resource group name of the Virtual Network Gateway.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name of the Virtual Network Gateway.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The type of NAT rule for VPN NAT.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,VpnNatRuleType>> type;

    /**
     * @return The type of NAT rule for VPN NAT.
     * 
     */
    public Optional<Output<Either<String,VpnNatRuleType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
    private Output<String> virtualNetworkGatewayName;

    /**
     * @return The name of the gateway.
     * 
     */
    public Output<String> virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    private VirtualNetworkGatewayNatRuleArgs() {}

    private VirtualNetworkGatewayNatRuleArgs(VirtualNetworkGatewayNatRuleArgs $) {
        this.externalMappings = $.externalMappings;
        this.id = $.id;
        this.internalMappings = $.internalMappings;
        this.ipConfigurationId = $.ipConfigurationId;
        this.mode = $.mode;
        this.name = $.name;
        this.natRuleName = $.natRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.type = $.type;
        this.virtualNetworkGatewayName = $.virtualNetworkGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayNatRuleArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayNatRuleArgs();
        }

        public Builder(VirtualNetworkGatewayNatRuleArgs defaults) {
            $ = new VirtualNetworkGatewayNatRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalMappings The private IP address external mapping for NAT.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(@Nullable Output<List<VpnNatRuleMappingArgs>> externalMappings) {
            $.externalMappings = externalMappings;
            return this;
        }

        /**
         * @param externalMappings The private IP address external mapping for NAT.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(List<VpnNatRuleMappingArgs> externalMappings) {
            return externalMappings(Output.of(externalMappings));
        }

        /**
         * @param externalMappings The private IP address external mapping for NAT.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(VpnNatRuleMappingArgs... externalMappings) {
            return externalMappings(List.of(externalMappings));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param internalMappings The private IP address internal mapping for NAT.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(@Nullable Output<List<VpnNatRuleMappingArgs>> internalMappings) {
            $.internalMappings = internalMappings;
            return this;
        }

        /**
         * @param internalMappings The private IP address internal mapping for NAT.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(List<VpnNatRuleMappingArgs> internalMappings) {
            return internalMappings(Output.of(internalMappings));
        }

        /**
         * @param internalMappings The private IP address internal mapping for NAT.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(VpnNatRuleMappingArgs... internalMappings) {
            return internalMappings(List.of(internalMappings));
        }

        /**
         * @param ipConfigurationId The IP Configuration ID this NAT rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(@Nullable Output<String> ipConfigurationId) {
            $.ipConfigurationId = ipConfigurationId;
            return this;
        }

        /**
         * @param ipConfigurationId The IP Configuration ID this NAT rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(String ipConfigurationId) {
            return ipConfigurationId(Output.of(ipConfigurationId));
        }

        /**
         * @param mode The Source NAT direction of a VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,VpnNatRuleMode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The Source NAT direction of a VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,VpnNatRuleMode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode The Source NAT direction of a VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode The Source NAT direction of a VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder mode(VpnNatRuleMode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param natRuleName The name of the nat rule.
         * 
         * @return builder
         * 
         */
        public Builder natRuleName(@Nullable Output<String> natRuleName) {
            $.natRuleName = natRuleName;
            return this;
        }

        /**
         * @param natRuleName The name of the nat rule.
         * 
         * @return builder
         * 
         */
        public Builder natRuleName(String natRuleName) {
            return natRuleName(Output.of(natRuleName));
        }

        /**
         * @param resourceGroupName The resource group name of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param type The type of NAT rule for VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,VpnNatRuleType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of NAT rule for VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,VpnNatRuleType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of NAT rule for VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of NAT rule for VPN NAT.
         * 
         * @return builder
         * 
         */
        public Builder type(VpnNatRuleType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param virtualNetworkGatewayName The name of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayName(Output<String> virtualNetworkGatewayName) {
            $.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }

        /**
         * @param virtualNetworkGatewayName The name of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            return virtualNetworkGatewayName(Output.of(virtualNetworkGatewayName));
        }

        public VirtualNetworkGatewayNatRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayName = Objects.requireNonNull($.virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
            return $;
        }
    }

}
