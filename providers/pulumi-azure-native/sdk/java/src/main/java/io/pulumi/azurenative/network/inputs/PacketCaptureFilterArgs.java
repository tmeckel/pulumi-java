// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PcProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filter that is applied to packet capture request. Multiple filters can be applied.
 * 
 */
public final class PacketCaptureFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketCaptureFilterArgs Empty = new PacketCaptureFilterArgs();

    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @InputImport(name="localIPAddress")
      private final @Nullable Input<String> localIPAddress;

    public Input<String> getLocalIPAddress() {
        return this.localIPAddress == null ? Input.empty() : this.localIPAddress;
    }

    /**
     * Local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @InputImport(name="localPort")
      private final @Nullable Input<String> localPort;

    public Input<String> getLocalPort() {
        return this.localPort == null ? Input.empty() : this.localPort;
    }

    /**
     * Protocol to be filtered on.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<Either<String,PcProtocol>> protocol;

    public Input<Either<String,PcProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @InputImport(name="remoteIPAddress")
      private final @Nullable Input<String> remoteIPAddress;

    public Input<String> getRemoteIPAddress() {
        return this.remoteIPAddress == null ? Input.empty() : this.remoteIPAddress;
    }

    /**
     * Remote port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @InputImport(name="remotePort")
      private final @Nullable Input<String> remotePort;

    public Input<String> getRemotePort() {
        return this.remotePort == null ? Input.empty() : this.remotePort;
    }

    public PacketCaptureFilterArgs(
        @Nullable Input<String> localIPAddress,
        @Nullable Input<String> localPort,
        @Nullable Input<Either<String,PcProtocol>> protocol,
        @Nullable Input<String> remoteIPAddress,
        @Nullable Input<String> remotePort) {
        this.localIPAddress = localIPAddress;
        this.localPort = localPort;
        this.protocol = protocol == null ? Input.ofLeft("Any") : protocol;
        this.remoteIPAddress = remoteIPAddress;
        this.remotePort = remotePort;
    }

    private PacketCaptureFilterArgs() {
        this.localIPAddress = Input.empty();
        this.localPort = Input.empty();
        this.protocol = Input.empty();
        this.remoteIPAddress = Input.empty();
        this.remotePort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketCaptureFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> localIPAddress;
        private @Nullable Input<String> localPort;
        private @Nullable Input<Either<String,PcProtocol>> protocol;
        private @Nullable Input<String> remoteIPAddress;
        private @Nullable Input<String> remotePort;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketCaptureFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localIPAddress = defaults.localIPAddress;
    	      this.localPort = defaults.localPort;
    	      this.protocol = defaults.protocol;
    	      this.remoteIPAddress = defaults.remoteIPAddress;
    	      this.remotePort = defaults.remotePort;
        }

        public Builder localIPAddress(@Nullable Input<String> localIPAddress) {
            this.localIPAddress = localIPAddress;
            return this;
        }

        public Builder localIPAddress(@Nullable String localIPAddress) {
            this.localIPAddress = Input.ofNullable(localIPAddress);
            return this;
        }

        public Builder localPort(@Nullable Input<String> localPort) {
            this.localPort = localPort;
            return this;
        }

        public Builder localPort(@Nullable String localPort) {
            this.localPort = Input.ofNullable(localPort);
            return this;
        }

        public Builder protocol(@Nullable Input<Either<String,PcProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable Either<String,PcProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder remoteIPAddress(@Nullable Input<String> remoteIPAddress) {
            this.remoteIPAddress = remoteIPAddress;
            return this;
        }

        public Builder remoteIPAddress(@Nullable String remoteIPAddress) {
            this.remoteIPAddress = Input.ofNullable(remoteIPAddress);
            return this;
        }

        public Builder remotePort(@Nullable Input<String> remotePort) {
            this.remotePort = remotePort;
            return this;
        }

        public Builder remotePort(@Nullable String remotePort) {
            this.remotePort = Input.ofNullable(remotePort);
            return this;
        }
        public PacketCaptureFilterArgs build() {
            return new PacketCaptureFilterArgs(localIPAddress, localPort, protocol, remoteIPAddress, remotePort);
        }
    }
}
