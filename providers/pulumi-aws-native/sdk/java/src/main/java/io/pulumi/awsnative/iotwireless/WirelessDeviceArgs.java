// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.enums.WirelessDeviceType;
import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceLoRaWANDeviceArgs;
import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WirelessDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceArgs Empty = new WirelessDeviceArgs();

    /**
     * Wireless device description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Wireless device destination name
     * 
     */
    @Import(name="destinationName", required=true)
      private final Output<String> destinationName;

    public Output<String> getDestinationName() {
        return this.destinationName;
    }

    /**
     * The date and time when the most recent uplink was received.
     * 
     */
    @Import(name="lastUplinkReceivedAt")
      private final @Nullable Output<String> lastUplinkReceivedAt;

    public Output<String> getLastUplinkReceivedAt() {
        return this.lastUplinkReceivedAt == null ? Codegen.empty() : this.lastUplinkReceivedAt;
    }

    /**
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Device.
     * 
     */
    @Import(name="loRaWAN")
      private final @Nullable Output<WirelessDeviceLoRaWANDeviceArgs> loRaWAN;

    public Output<WirelessDeviceLoRaWANDeviceArgs> getLoRaWAN() {
        return this.loRaWAN == null ? Codegen.empty() : this.loRaWAN;
    }

    /**
     * Wireless device name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the device. Currently not supported, will not create if tags are passed.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<WirelessDeviceTagArgs>> tags;

    public Output<List<WirelessDeviceTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Thing arn. Passed into update to associate Thing with Wireless device.
     * 
     */
    @Import(name="thingArn")
      private final @Nullable Output<String> thingArn;

    public Output<String> getThingArn() {
        return this.thingArn == null ? Codegen.empty() : this.thingArn;
    }

    /**
     * Wireless device type, currently only Sidewalk and LoRa
     * 
     */
    @Import(name="type", required=true)
      private final Output<WirelessDeviceType> type;

    public Output<WirelessDeviceType> getType() {
        return this.type;
    }

    public WirelessDeviceArgs(
        @Nullable Output<String> description,
        Output<String> destinationName,
        @Nullable Output<String> lastUplinkReceivedAt,
        @Nullable Output<WirelessDeviceLoRaWANDeviceArgs> loRaWAN,
        @Nullable Output<String> name,
        @Nullable Output<List<WirelessDeviceTagArgs>> tags,
        @Nullable Output<String> thingArn,
        Output<WirelessDeviceType> type) {
        this.description = description;
        this.destinationName = Objects.requireNonNull(destinationName, "expected parameter 'destinationName' to be non-null");
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
        this.thingArn = thingArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WirelessDeviceArgs() {
        this.description = Codegen.empty();
        this.destinationName = Codegen.empty();
        this.lastUplinkReceivedAt = Codegen.empty();
        this.loRaWAN = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.thingArn = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> destinationName;
        private @Nullable Output<String> lastUplinkReceivedAt;
        private @Nullable Output<WirelessDeviceLoRaWANDeviceArgs> loRaWAN;
        private @Nullable Output<String> name;
        private @Nullable Output<List<WirelessDeviceTagArgs>> tags;
        private @Nullable Output<String> thingArn;
        private Output<WirelessDeviceType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationName = defaults.destinationName;
    	      this.lastUplinkReceivedAt = defaults.lastUplinkReceivedAt;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.thingArn = defaults.thingArn;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationName(Output<String> destinationName) {
            this.destinationName = Objects.requireNonNull(destinationName);
            return this;
        }
        public Builder destinationName(String destinationName) {
            this.destinationName = Output.of(Objects.requireNonNull(destinationName));
            return this;
        }
        public Builder lastUplinkReceivedAt(@Nullable Output<String> lastUplinkReceivedAt) {
            this.lastUplinkReceivedAt = lastUplinkReceivedAt;
            return this;
        }
        public Builder lastUplinkReceivedAt(@Nullable String lastUplinkReceivedAt) {
            this.lastUplinkReceivedAt = Codegen.ofNullable(lastUplinkReceivedAt);
            return this;
        }
        public Builder loRaWAN(@Nullable Output<WirelessDeviceLoRaWANDeviceArgs> loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }
        public Builder loRaWAN(@Nullable WirelessDeviceLoRaWANDeviceArgs loRaWAN) {
            this.loRaWAN = Codegen.ofNullable(loRaWAN);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<WirelessDeviceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<WirelessDeviceTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(WirelessDeviceTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder thingArn(@Nullable Output<String> thingArn) {
            this.thingArn = thingArn;
            return this;
        }
        public Builder thingArn(@Nullable String thingArn) {
            this.thingArn = Codegen.ofNullable(thingArn);
            return this;
        }
        public Builder type(Output<WirelessDeviceType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(WirelessDeviceType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public WirelessDeviceArgs build() {
            return new WirelessDeviceArgs(description, destinationName, lastUplinkReceivedAt, loRaWAN, name, tags, thingArn, type);
        }
    }
}
