// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.WirelessGatewayLoRaWANGatewayArgs;
import io.pulumi.awsnative.iotwireless.inputs.WirelessGatewayTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WirelessGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessGatewayArgs Empty = new WirelessGatewayArgs();

    /**
     * Description of Wireless Gateway.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
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
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
     * 
     */
    @Import(name="loRaWAN", required=true)
      private final Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN;

    public Output<WirelessGatewayLoRaWANGatewayArgs> getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * Name of Wireless Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<WirelessGatewayTagArgs>> tags;

    public Output<List<WirelessGatewayTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
     * 
     */
    @Import(name="thingArn")
      private final @Nullable Output<String> thingArn;

    public Output<String> getThingArn() {
        return this.thingArn == null ? Codegen.empty() : this.thingArn;
    }

    public WirelessGatewayArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> lastUplinkReceivedAt,
        Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN,
        @Nullable Output<String> name,
        @Nullable Output<List<WirelessGatewayTagArgs>> tags,
        @Nullable Output<String> thingArn) {
        this.description = description;
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
        this.loRaWAN = Objects.requireNonNull(loRaWAN, "expected parameter 'loRaWAN' to be non-null");
        this.name = name;
        this.tags = tags;
        this.thingArn = thingArn;
    }

    private WirelessGatewayArgs() {
        this.description = Codegen.empty();
        this.lastUplinkReceivedAt = Codegen.empty();
        this.loRaWAN = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.thingArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> lastUplinkReceivedAt;
        private Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN;
        private @Nullable Output<String> name;
        private @Nullable Output<List<WirelessGatewayTagArgs>> tags;
        private @Nullable Output<String> thingArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.lastUplinkReceivedAt = defaults.lastUplinkReceivedAt;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.thingArn = defaults.thingArn;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder loRaWAN(Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN) {
            this.loRaWAN = Objects.requireNonNull(loRaWAN);
            return this;
        }
        public Builder loRaWAN(WirelessGatewayLoRaWANGatewayArgs loRaWAN) {
            this.loRaWAN = Output.of(Objects.requireNonNull(loRaWAN));
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
        public Builder tags(@Nullable Output<List<WirelessGatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<WirelessGatewayTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(WirelessGatewayTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder thingArn(@Nullable Output<String> thingArn) {
            this.thingArn = thingArn;
            return this;
        }
        public Builder thingArn(@Nullable String thingArn) {
            this.thingArn = Codegen.ofNullable(thingArn);
            return this;
        }        public WirelessGatewayArgs build() {
            return new WirelessGatewayArgs(description, lastUplinkReceivedAt, loRaWAN, name, tags, thingArn);
        }
    }
}
