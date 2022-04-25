// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceGatewayConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceGatewayConfigGetArgs Empty = new DeviceGatewayConfigGetArgs();

    /**
     * Indicates whether the device is a gateway.
     * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
     * 
     */
    @Import(name="gatewayAuthMethod")
    private @Nullable Output<String> gatewayAuthMethod;

    /**
     * @return Indicates whether the device is a gateway.
     * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
     * 
     */
    public Optional<Output<String>> gatewayAuthMethod() {
        return Optional.ofNullable(this.gatewayAuthMethod);
    }

    /**
     * Indicates whether the device is a gateway.
     * Default value is `NON_GATEWAY`.
     * Possible values are `GATEWAY` and `NON_GATEWAY`.
     * 
     */
    @Import(name="gatewayType")
    private @Nullable Output<String> gatewayType;

    /**
     * @return Indicates whether the device is a gateway.
     * Default value is `NON_GATEWAY`.
     * Possible values are `GATEWAY` and `NON_GATEWAY`.
     * 
     */
    public Optional<Output<String>> gatewayType() {
        return Optional.ofNullable(this.gatewayType);
    }

    /**
     * - 
     * The ID of the gateway the device accessed most recently.
     * 
     */
    @Import(name="lastAccessedGatewayId")
    private @Nullable Output<String> lastAccessedGatewayId;

    /**
     * @return -
     * The ID of the gateway the device accessed most recently.
     * 
     */
    public Optional<Output<String>> lastAccessedGatewayId() {
        return Optional.ofNullable(this.lastAccessedGatewayId);
    }

    /**
     * - 
     * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
     * 
     */
    @Import(name="lastAccessedGatewayTime")
    private @Nullable Output<String> lastAccessedGatewayTime;

    /**
     * @return -
     * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
     * 
     */
    public Optional<Output<String>> lastAccessedGatewayTime() {
        return Optional.ofNullable(this.lastAccessedGatewayTime);
    }

    private DeviceGatewayConfigGetArgs() {}

    private DeviceGatewayConfigGetArgs(DeviceGatewayConfigGetArgs $) {
        this.gatewayAuthMethod = $.gatewayAuthMethod;
        this.gatewayType = $.gatewayType;
        this.lastAccessedGatewayId = $.lastAccessedGatewayId;
        this.lastAccessedGatewayTime = $.lastAccessedGatewayTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceGatewayConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceGatewayConfigGetArgs $;

        public Builder() {
            $ = new DeviceGatewayConfigGetArgs();
        }

        public Builder(DeviceGatewayConfigGetArgs defaults) {
            $ = new DeviceGatewayConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayAuthMethod Indicates whether the device is a gateway.
         * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayAuthMethod(@Nullable Output<String> gatewayAuthMethod) {
            $.gatewayAuthMethod = gatewayAuthMethod;
            return this;
        }

        /**
         * @param gatewayAuthMethod Indicates whether the device is a gateway.
         * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayAuthMethod(String gatewayAuthMethod) {
            return gatewayAuthMethod(Output.of(gatewayAuthMethod));
        }

        /**
         * @param gatewayType Indicates whether the device is a gateway.
         * Default value is `NON_GATEWAY`.
         * Possible values are `GATEWAY` and `NON_GATEWAY`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayType(@Nullable Output<String> gatewayType) {
            $.gatewayType = gatewayType;
            return this;
        }

        /**
         * @param gatewayType Indicates whether the device is a gateway.
         * Default value is `NON_GATEWAY`.
         * Possible values are `GATEWAY` and `NON_GATEWAY`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayType(String gatewayType) {
            return gatewayType(Output.of(gatewayType));
        }

        /**
         * @param lastAccessedGatewayId -
         * The ID of the gateway the device accessed most recently.
         * 
         * @return builder
         * 
         */
        public Builder lastAccessedGatewayId(@Nullable Output<String> lastAccessedGatewayId) {
            $.lastAccessedGatewayId = lastAccessedGatewayId;
            return this;
        }

        /**
         * @param lastAccessedGatewayId -
         * The ID of the gateway the device accessed most recently.
         * 
         * @return builder
         * 
         */
        public Builder lastAccessedGatewayId(String lastAccessedGatewayId) {
            return lastAccessedGatewayId(Output.of(lastAccessedGatewayId));
        }

        /**
         * @param lastAccessedGatewayTime -
         * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
         * 
         * @return builder
         * 
         */
        public Builder lastAccessedGatewayTime(@Nullable Output<String> lastAccessedGatewayTime) {
            $.lastAccessedGatewayTime = lastAccessedGatewayTime;
            return this;
        }

        /**
         * @param lastAccessedGatewayTime -
         * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
         * 
         * @return builder
         * 
         */
        public Builder lastAccessedGatewayTime(String lastAccessedGatewayTime) {
            return lastAccessedGatewayTime(Output.of(lastAccessedGatewayTime));
        }

        public DeviceGatewayConfigGetArgs build() {
            return $;
        }
    }

}
