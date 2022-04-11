// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * Asset tag of the device.
     * 
     */
    @Import(name="assetTag")
      private final @Nullable Output<String> assetTag;

    public Output<String> getAssetTag() {
        return this.assetTag == null ? Codegen.empty() : this.assetTag;
    }

    /**
     * Most recent time when device synced with this service.
     * 
     */
    @Import(name="lastSyncTime")
      private final @Nullable Output<String> lastSyncTime;

    public Output<String> getLastSyncTime() {
        return this.lastSyncTime == null ? Codegen.empty() : this.lastSyncTime;
    }

    /**
     * Serial Number of device. Example: HT82V1A01076.
     * 
     */
    @Import(name="serialNumber")
      private final @Nullable Output<String> serialNumber;

    public Output<String> getSerialNumber() {
        return this.serialNumber == null ? Codegen.empty() : this.serialNumber;
    }

    /**
     * WiFi MAC addresses of device.
     * 
     */
    @Import(name="wifiMacAddresses")
      private final @Nullable Output<List<String>> wifiMacAddresses;

    public Output<List<String>> getWifiMacAddresses() {
        return this.wifiMacAddresses == null ? Codegen.empty() : this.wifiMacAddresses;
    }

    public DeviceArgs(
        @Nullable Output<String> assetTag,
        @Nullable Output<String> lastSyncTime,
        @Nullable Output<String> serialNumber,
        @Nullable Output<List<String>> wifiMacAddresses) {
        this.assetTag = assetTag;
        this.lastSyncTime = lastSyncTime;
        this.serialNumber = serialNumber;
        this.wifiMacAddresses = wifiMacAddresses;
    }

    private DeviceArgs() {
        this.assetTag = Codegen.empty();
        this.lastSyncTime = Codegen.empty();
        this.serialNumber = Codegen.empty();
        this.wifiMacAddresses = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> assetTag;
        private @Nullable Output<String> lastSyncTime;
        private @Nullable Output<String> serialNumber;
        private @Nullable Output<List<String>> wifiMacAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetTag = defaults.assetTag;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.wifiMacAddresses = defaults.wifiMacAddresses;
        }

        public Builder assetTag(@Nullable Output<String> assetTag) {
            this.assetTag = assetTag;
            return this;
        }
        public Builder assetTag(@Nullable String assetTag) {
            this.assetTag = Codegen.ofNullable(assetTag);
            return this;
        }
        public Builder lastSyncTime(@Nullable Output<String> lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }
        public Builder lastSyncTime(@Nullable String lastSyncTime) {
            this.lastSyncTime = Codegen.ofNullable(lastSyncTime);
            return this;
        }
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = Codegen.ofNullable(serialNumber);
            return this;
        }
        public Builder wifiMacAddresses(@Nullable Output<List<String>> wifiMacAddresses) {
            this.wifiMacAddresses = wifiMacAddresses;
            return this;
        }
        public Builder wifiMacAddresses(@Nullable List<String> wifiMacAddresses) {
            this.wifiMacAddresses = Codegen.ofNullable(wifiMacAddresses);
            return this;
        }
        public Builder wifiMacAddresses(String... wifiMacAddresses) {
            return wifiMacAddresses(List.of(wifiMacAddresses));
        }        public DeviceArgs build() {
            return new DeviceArgs(assetTag, lastSyncTime, serialNumber, wifiMacAddresses);
        }
    }
}
