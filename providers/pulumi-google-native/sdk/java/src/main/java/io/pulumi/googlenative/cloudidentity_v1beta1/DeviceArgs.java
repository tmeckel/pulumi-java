// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="assetTag")
    private final @Nullable Input<String> assetTag;

    public Input<String> getAssetTag() {
        return this.assetTag == null ? Input.empty() : this.assetTag;
    }

    /**
     * Most recent time when device synced with this service.
     * 
     */
    @InputImport(name="lastSyncTime")
    private final @Nullable Input<String> lastSyncTime;

    public Input<String> getLastSyncTime() {
        return this.lastSyncTime == null ? Input.empty() : this.lastSyncTime;
    }

    /**
     * Serial Number of device. Example: HT82V1A01076.
     * 
     */
    @InputImport(name="serialNumber")
    private final @Nullable Input<String> serialNumber;

    public Input<String> getSerialNumber() {
        return this.serialNumber == null ? Input.empty() : this.serialNumber;
    }

    /**
     * WiFi MAC addresses of device.
     * 
     */
    @InputImport(name="wifiMacAddresses")
    private final @Nullable Input<List<String>> wifiMacAddresses;

    public Input<List<String>> getWifiMacAddresses() {
        return this.wifiMacAddresses == null ? Input.empty() : this.wifiMacAddresses;
    }

    public DeviceArgs(
        @Nullable Input<String> assetTag,
        @Nullable Input<String> lastSyncTime,
        @Nullable Input<String> serialNumber,
        @Nullable Input<List<String>> wifiMacAddresses) {
        this.assetTag = assetTag;
        this.lastSyncTime = lastSyncTime;
        this.serialNumber = serialNumber;
        this.wifiMacAddresses = wifiMacAddresses;
    }

    private DeviceArgs() {
        this.assetTag = Input.empty();
        this.lastSyncTime = Input.empty();
        this.serialNumber = Input.empty();
        this.wifiMacAddresses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assetTag;
        private @Nullable Input<String> lastSyncTime;
        private @Nullable Input<String> serialNumber;
        private @Nullable Input<List<String>> wifiMacAddresses;

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

        public Builder setAssetTag(@Nullable Input<String> assetTag) {
            this.assetTag = assetTag;
            return this;
        }

        public Builder setAssetTag(@Nullable String assetTag) {
            this.assetTag = Input.ofNullable(assetTag);
            return this;
        }

        public Builder setLastSyncTime(@Nullable Input<String> lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }

        public Builder setLastSyncTime(@Nullable String lastSyncTime) {
            this.lastSyncTime = Input.ofNullable(lastSyncTime);
            return this;
        }

        public Builder setSerialNumber(@Nullable Input<String> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setSerialNumber(@Nullable String serialNumber) {
            this.serialNumber = Input.ofNullable(serialNumber);
            return this;
        }

        public Builder setWifiMacAddresses(@Nullable Input<List<String>> wifiMacAddresses) {
            this.wifiMacAddresses = wifiMacAddresses;
            return this;
        }

        public Builder setWifiMacAddresses(@Nullable List<String> wifiMacAddresses) {
            this.wifiMacAddresses = Input.ofNullable(wifiMacAddresses);
            return this;
        }

        public DeviceArgs build() {
            return new DeviceArgs(assetTag, lastSyncTime, serialNumber, wifiMacAddresses);
        }
    }
}
