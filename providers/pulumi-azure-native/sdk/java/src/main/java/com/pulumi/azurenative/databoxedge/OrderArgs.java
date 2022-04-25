// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.enums.ShipmentType;
import com.pulumi.azurenative.databoxedge.inputs.AddressArgs;
import com.pulumi.azurenative.databoxedge.inputs.ContactDetailsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrderArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrderArgs Empty = new OrderArgs();

    /**
     * The contact details.
     * 
     */
    @Import(name="contactInformation", required=true)
    private Output<ContactDetailsArgs> contactInformation;

    /**
     * @return The contact details.
     * 
     */
    public Output<ContactDetailsArgs> contactInformation() {
        return this.contactInformation;
    }

    /**
     * The order details of a device.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The order details of a device.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * ShipmentType of the order
     * 
     */
    @Import(name="shipmentType")
    private @Nullable Output<Either<String,ShipmentType>> shipmentType;

    /**
     * @return ShipmentType of the order
     * 
     */
    public Optional<Output<Either<String,ShipmentType>>> shipmentType() {
        return Optional.ofNullable(this.shipmentType);
    }

    /**
     * The shipping address.
     * 
     */
    @Import(name="shippingAddress")
    private @Nullable Output<AddressArgs> shippingAddress;

    /**
     * @return The shipping address.
     * 
     */
    public Optional<Output<AddressArgs>> shippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    private OrderArgs() {}

    private OrderArgs(OrderArgs $) {
        this.contactInformation = $.contactInformation;
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
        this.shipmentType = $.shipmentType;
        this.shippingAddress = $.shippingAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderArgs $;

        public Builder() {
            $ = new OrderArgs();
        }

        public Builder(OrderArgs defaults) {
            $ = new OrderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactInformation The contact details.
         * 
         * @return builder
         * 
         */
        public Builder contactInformation(Output<ContactDetailsArgs> contactInformation) {
            $.contactInformation = contactInformation;
            return this;
        }

        /**
         * @param contactInformation The contact details.
         * 
         * @return builder
         * 
         */
        public Builder contactInformation(ContactDetailsArgs contactInformation) {
            return contactInformation(Output.of(contactInformation));
        }

        /**
         * @param deviceName The order details of a device.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The order details of a device.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shipmentType ShipmentType of the order
         * 
         * @return builder
         * 
         */
        public Builder shipmentType(@Nullable Output<Either<String,ShipmentType>> shipmentType) {
            $.shipmentType = shipmentType;
            return this;
        }

        /**
         * @param shipmentType ShipmentType of the order
         * 
         * @return builder
         * 
         */
        public Builder shipmentType(Either<String,ShipmentType> shipmentType) {
            return shipmentType(Output.of(shipmentType));
        }

        /**
         * @param shipmentType ShipmentType of the order
         * 
         * @return builder
         * 
         */
        public Builder shipmentType(String shipmentType) {
            return shipmentType(Either.ofLeft(shipmentType));
        }

        /**
         * @param shipmentType ShipmentType of the order
         * 
         * @return builder
         * 
         */
        public Builder shipmentType(ShipmentType shipmentType) {
            return shipmentType(Either.ofRight(shipmentType));
        }

        /**
         * @param shippingAddress The shipping address.
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(@Nullable Output<AddressArgs> shippingAddress) {
            $.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * @param shippingAddress The shipping address.
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(AddressArgs shippingAddress) {
            return shippingAddress(Output.of(shippingAddress));
        }

        public OrderArgs build() {
            $.contactInformation = Objects.requireNonNull($.contactInformation, "expected parameter 'contactInformation' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
