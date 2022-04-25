// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MulticastGroupLoRaWANArgs extends com.pulumi.resources.ResourceArgs {

    public static final MulticastGroupLoRaWANArgs Empty = new MulticastGroupLoRaWANArgs();

    /**
     * Multicast group LoRaWAN DL Class
     * 
     */
    @Import(name="dlClass", required=true)
    private Output<String> dlClass;

    /**
     * @return Multicast group LoRaWAN DL Class
     * 
     */
    public Output<String> dlClass() {
        return this.dlClass;
    }

    /**
     * Multicast group number of devices in group. Returned after successful read.
     * 
     */
    @Import(name="numberOfDevicesInGroup")
    private @Nullable Output<Integer> numberOfDevicesInGroup;

    /**
     * @return Multicast group number of devices in group. Returned after successful read.
     * 
     */
    public Optional<Output<Integer>> numberOfDevicesInGroup() {
        return Optional.ofNullable(this.numberOfDevicesInGroup);
    }

    /**
     * Multicast group number of devices requested. Returned after successful read.
     * 
     */
    @Import(name="numberOfDevicesRequested")
    private @Nullable Output<Integer> numberOfDevicesRequested;

    /**
     * @return Multicast group number of devices requested. Returned after successful read.
     * 
     */
    public Optional<Output<Integer>> numberOfDevicesRequested() {
        return Optional.ofNullable(this.numberOfDevicesRequested);
    }

    /**
     * Multicast group LoRaWAN RF region
     * 
     */
    @Import(name="rfRegion", required=true)
    private Output<String> rfRegion;

    /**
     * @return Multicast group LoRaWAN RF region
     * 
     */
    public Output<String> rfRegion() {
        return this.rfRegion;
    }

    private MulticastGroupLoRaWANArgs() {}

    private MulticastGroupLoRaWANArgs(MulticastGroupLoRaWANArgs $) {
        this.dlClass = $.dlClass;
        this.numberOfDevicesInGroup = $.numberOfDevicesInGroup;
        this.numberOfDevicesRequested = $.numberOfDevicesRequested;
        this.rfRegion = $.rfRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MulticastGroupLoRaWANArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MulticastGroupLoRaWANArgs $;

        public Builder() {
            $ = new MulticastGroupLoRaWANArgs();
        }

        public Builder(MulticastGroupLoRaWANArgs defaults) {
            $ = new MulticastGroupLoRaWANArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dlClass Multicast group LoRaWAN DL Class
         * 
         * @return builder
         * 
         */
        public Builder dlClass(Output<String> dlClass) {
            $.dlClass = dlClass;
            return this;
        }

        /**
         * @param dlClass Multicast group LoRaWAN DL Class
         * 
         * @return builder
         * 
         */
        public Builder dlClass(String dlClass) {
            return dlClass(Output.of(dlClass));
        }

        /**
         * @param numberOfDevicesInGroup Multicast group number of devices in group. Returned after successful read.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDevicesInGroup(@Nullable Output<Integer> numberOfDevicesInGroup) {
            $.numberOfDevicesInGroup = numberOfDevicesInGroup;
            return this;
        }

        /**
         * @param numberOfDevicesInGroup Multicast group number of devices in group. Returned after successful read.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDevicesInGroup(Integer numberOfDevicesInGroup) {
            return numberOfDevicesInGroup(Output.of(numberOfDevicesInGroup));
        }

        /**
         * @param numberOfDevicesRequested Multicast group number of devices requested. Returned after successful read.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDevicesRequested(@Nullable Output<Integer> numberOfDevicesRequested) {
            $.numberOfDevicesRequested = numberOfDevicesRequested;
            return this;
        }

        /**
         * @param numberOfDevicesRequested Multicast group number of devices requested. Returned after successful read.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDevicesRequested(Integer numberOfDevicesRequested) {
            return numberOfDevicesRequested(Output.of(numberOfDevicesRequested));
        }

        /**
         * @param rfRegion Multicast group LoRaWAN RF region
         * 
         * @return builder
         * 
         */
        public Builder rfRegion(Output<String> rfRegion) {
            $.rfRegion = rfRegion;
            return this;
        }

        /**
         * @param rfRegion Multicast group LoRaWAN RF region
         * 
         * @return builder
         * 
         */
        public Builder rfRegion(String rfRegion) {
            return rfRegion(Output.of(rfRegion));
        }

        public MulticastGroupLoRaWANArgs build() {
            $.dlClass = Objects.requireNonNull($.dlClass, "expected parameter 'dlClass' to be non-null");
            $.rfRegion = Objects.requireNonNull($.rfRegion, "expected parameter 'rfRegion' to be non-null");
            return $;
        }
    }

}
