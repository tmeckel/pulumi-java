// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.PacketCaptureFilterArgs;
import com.pulumi.azurenative.network.inputs.PacketCaptureStorageLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketCaptureArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketCaptureArgs Empty = new PacketCaptureArgs();

    /**
     * Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     */
    @Import(name="bytesToCapturePerPacket")
    private @Nullable Output<Double> bytesToCapturePerPacket;

    /**
     * @return Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     */
    public Optional<Output<Double>> bytesToCapturePerPacket() {
        return Optional.ofNullable(this.bytesToCapturePerPacket);
    }

    /**
     * A list of packet capture filters.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<PacketCaptureFilterArgs>> filters;

    /**
     * @return A list of packet capture filters.
     * 
     */
    public Optional<Output<List<PacketCaptureFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the network watcher.
     * 
     */
    @Import(name="networkWatcherName", required=true)
    private Output<String> networkWatcherName;

    /**
     * @return The name of the network watcher.
     * 
     */
    public Output<String> networkWatcherName() {
        return this.networkWatcherName;
    }

    /**
     * The name of the packet capture session.
     * 
     */
    @Import(name="packetCaptureName")
    private @Nullable Output<String> packetCaptureName;

    /**
     * @return The name of the packet capture session.
     * 
     */
    public Optional<Output<String>> packetCaptureName() {
        return Optional.ofNullable(this.packetCaptureName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage location for a packet capture session.
     * 
     */
    @Import(name="storageLocation", required=true)
    private Output<PacketCaptureStorageLocationArgs> storageLocation;

    /**
     * @return The storage location for a packet capture session.
     * 
     */
    public Output<PacketCaptureStorageLocationArgs> storageLocation() {
        return this.storageLocation;
    }

    /**
     * The ID of the targeted resource, only VM is currently supported.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The ID of the targeted resource, only VM is currently supported.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * Maximum duration of the capture session in seconds.
     * 
     */
    @Import(name="timeLimitInSeconds")
    private @Nullable Output<Integer> timeLimitInSeconds;

    /**
     * @return Maximum duration of the capture session in seconds.
     * 
     */
    public Optional<Output<Integer>> timeLimitInSeconds() {
        return Optional.ofNullable(this.timeLimitInSeconds);
    }

    /**
     * Maximum size of the capture output.
     * 
     */
    @Import(name="totalBytesPerSession")
    private @Nullable Output<Double> totalBytesPerSession;

    /**
     * @return Maximum size of the capture output.
     * 
     */
    public Optional<Output<Double>> totalBytesPerSession() {
        return Optional.ofNullable(this.totalBytesPerSession);
    }

    private PacketCaptureArgs() {}

    private PacketCaptureArgs(PacketCaptureArgs $) {
        this.bytesToCapturePerPacket = $.bytesToCapturePerPacket;
        this.filters = $.filters;
        this.networkWatcherName = $.networkWatcherName;
        this.packetCaptureName = $.packetCaptureName;
        this.resourceGroupName = $.resourceGroupName;
        this.storageLocation = $.storageLocation;
        this.target = $.target;
        this.timeLimitInSeconds = $.timeLimitInSeconds;
        this.totalBytesPerSession = $.totalBytesPerSession;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketCaptureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketCaptureArgs $;

        public Builder() {
            $ = new PacketCaptureArgs();
        }

        public Builder(PacketCaptureArgs defaults) {
            $ = new PacketCaptureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bytesToCapturePerPacket Number of bytes captured per packet, the remaining bytes are truncated.
         * 
         * @return builder
         * 
         */
        public Builder bytesToCapturePerPacket(@Nullable Output<Double> bytesToCapturePerPacket) {
            $.bytesToCapturePerPacket = bytesToCapturePerPacket;
            return this;
        }

        /**
         * @param bytesToCapturePerPacket Number of bytes captured per packet, the remaining bytes are truncated.
         * 
         * @return builder
         * 
         */
        public Builder bytesToCapturePerPacket(Double bytesToCapturePerPacket) {
            return bytesToCapturePerPacket(Output.of(bytesToCapturePerPacket));
        }

        /**
         * @param filters A list of packet capture filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<PacketCaptureFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A list of packet capture filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<PacketCaptureFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A list of packet capture filters.
         * 
         * @return builder
         * 
         */
        public Builder filters(PacketCaptureFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param networkWatcherName The name of the network watcher.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(Output<String> networkWatcherName) {
            $.networkWatcherName = networkWatcherName;
            return this;
        }

        /**
         * @param networkWatcherName The name of the network watcher.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(String networkWatcherName) {
            return networkWatcherName(Output.of(networkWatcherName));
        }

        /**
         * @param packetCaptureName The name of the packet capture session.
         * 
         * @return builder
         * 
         */
        public Builder packetCaptureName(@Nullable Output<String> packetCaptureName) {
            $.packetCaptureName = packetCaptureName;
            return this;
        }

        /**
         * @param packetCaptureName The name of the packet capture session.
         * 
         * @return builder
         * 
         */
        public Builder packetCaptureName(String packetCaptureName) {
            return packetCaptureName(Output.of(packetCaptureName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageLocation The storage location for a packet capture session.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(Output<PacketCaptureStorageLocationArgs> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation The storage location for a packet capture session.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(PacketCaptureStorageLocationArgs storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        /**
         * @param target The ID of the targeted resource, only VM is currently supported.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The ID of the targeted resource, only VM is currently supported.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param timeLimitInSeconds Maximum duration of the capture session in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeLimitInSeconds(@Nullable Output<Integer> timeLimitInSeconds) {
            $.timeLimitInSeconds = timeLimitInSeconds;
            return this;
        }

        /**
         * @param timeLimitInSeconds Maximum duration of the capture session in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeLimitInSeconds(Integer timeLimitInSeconds) {
            return timeLimitInSeconds(Output.of(timeLimitInSeconds));
        }

        /**
         * @param totalBytesPerSession Maximum size of the capture output.
         * 
         * @return builder
         * 
         */
        public Builder totalBytesPerSession(@Nullable Output<Double> totalBytesPerSession) {
            $.totalBytesPerSession = totalBytesPerSession;
            return this;
        }

        /**
         * @param totalBytesPerSession Maximum size of the capture output.
         * 
         * @return builder
         * 
         */
        public Builder totalBytesPerSession(Double totalBytesPerSession) {
            return totalBytesPerSession(Output.of(totalBytesPerSession));
        }

        public PacketCaptureArgs build() {
            $.bytesToCapturePerPacket = Codegen.doubleProp("bytesToCapturePerPacket").output().arg($.bytesToCapturePerPacket).def(0e+00).getNullable();
            $.networkWatcherName = Objects.requireNonNull($.networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageLocation = Objects.requireNonNull($.storageLocation, "expected parameter 'storageLocation' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.timeLimitInSeconds = Codegen.integerProp("timeLimitInSeconds").output().arg($.timeLimitInSeconds).def(18000).getNullable();
            $.totalBytesPerSession = Codegen.doubleProp("totalBytesPerSession").output().arg($.totalBytesPerSession).def(1.073741824e+09).getNullable();
            return $;
        }
    }

}
