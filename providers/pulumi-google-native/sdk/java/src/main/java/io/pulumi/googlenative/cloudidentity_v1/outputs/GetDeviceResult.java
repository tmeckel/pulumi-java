// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudidentity_v1.outputs.GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDeviceResult {
    /**
     * Attributes specific to Android devices.
     * 
     */
    private final GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse androidSpecificAttributes;
    /**
     * Asset tag of the device.
     * 
     */
    private final String assetTag;
    /**
     * Baseband version of the device.
     * 
     */
    private final String basebandVersion;
    /**
     * Device bootloader version. Example: 0.6.7.
     * 
     */
    private final String bootloaderVersion;
    /**
     * Device brand. Example: Samsung.
     * 
     */
    private final String brand;
    /**
     * Build number of the device.
     * 
     */
    private final String buildNumber;
    /**
     * Represents whether the Device is compromised.
     * 
     */
    private final String compromisedState;
    /**
     * When the Company-Owned device was imported. This field is empty for BYOD devices.
     * 
     */
    private final String createTime;
    /**
     * Type of device.
     * 
     */
    private final String deviceType;
    /**
     * Whether developer options is enabled on device.
     * 
     */
    private final Boolean enabledDeveloperOptions;
    /**
     * Whether USB debugging is enabled on device.
     * 
     */
    private final Boolean enabledUsbDebugging;
    /**
     * Device encryption state.
     * 
     */
    private final String encryptionState;
    /**
     * IMEI number of device if GSM device; empty otherwise.
     * 
     */
    private final String imei;
    /**
     * Kernel version of the device.
     * 
     */
    private final String kernelVersion;
    /**
     * Most recent time when device synced with this service.
     * 
     */
    private final String lastSyncTime;
    /**
     * Management state of the device
     * 
     */
    private final String managementState;
    /**
     * Device manufacturer. Example: Motorola.
     * 
     */
    private final String manufacturer;
    /**
     * MEID number of device if CDMA device; empty otherwise.
     * 
     */
    private final String meid;
    /**
     * Model name of device. Example: Pixel 3.
     * 
     */
    private final String model;
    /**
     * [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device}`, where device is the unique id assigned to the Device.
     * 
     */
    private final String name;
    /**
     * Mobile or network operator of device, if available.
     * 
     */
    private final String networkOperator;
    /**
     * OS version of the device. Example: Android 8.1.0.
     * 
     */
    private final String osVersion;
    /**
     * Domain name for Google accounts on device. Type for other accounts on device. On Android, will only be populated if |ownership_privilege| is |PROFILE_OWNER| or |DEVICE_OWNER|. Does not include the account signed in to the device policy app if that account's domain has only one account. Examples: "com.example", "xyz.com".
     * 
     */
    private final List<String> otherAccounts;
    /**
     * Whether the device is owned by the company or an individual
     * 
     */
    private final String ownerType;
    /**
     * OS release version. Example: 6.0.
     * 
     */
    private final String releaseVersion;
    /**
     * OS security patch update time on device.
     * 
     */
    private final String securityPatchTime;
    /**
     * Serial Number of device. Example: HT82V1A01076.
     * 
     */
    private final String serialNumber;
    /**
     * WiFi MAC addresses of device.
     * 
     */
    private final List<String> wifiMacAddresses;

    @OutputCustomType.Constructor({"androidSpecificAttributes","assetTag","basebandVersion","bootloaderVersion","brand","buildNumber","compromisedState","createTime","deviceType","enabledDeveloperOptions","enabledUsbDebugging","encryptionState","imei","kernelVersion","lastSyncTime","managementState","manufacturer","meid","model","name","networkOperator","osVersion","otherAccounts","ownerType","releaseVersion","securityPatchTime","serialNumber","wifiMacAddresses"})
    private GetDeviceResult(
        GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse androidSpecificAttributes,
        String assetTag,
        String basebandVersion,
        String bootloaderVersion,
        String brand,
        String buildNumber,
        String compromisedState,
        String createTime,
        String deviceType,
        Boolean enabledDeveloperOptions,
        Boolean enabledUsbDebugging,
        String encryptionState,
        String imei,
        String kernelVersion,
        String lastSyncTime,
        String managementState,
        String manufacturer,
        String meid,
        String model,
        String name,
        String networkOperator,
        String osVersion,
        List<String> otherAccounts,
        String ownerType,
        String releaseVersion,
        String securityPatchTime,
        String serialNumber,
        List<String> wifiMacAddresses) {
        this.androidSpecificAttributes = Objects.requireNonNull(androidSpecificAttributes);
        this.assetTag = Objects.requireNonNull(assetTag);
        this.basebandVersion = Objects.requireNonNull(basebandVersion);
        this.bootloaderVersion = Objects.requireNonNull(bootloaderVersion);
        this.brand = Objects.requireNonNull(brand);
        this.buildNumber = Objects.requireNonNull(buildNumber);
        this.compromisedState = Objects.requireNonNull(compromisedState);
        this.createTime = Objects.requireNonNull(createTime);
        this.deviceType = Objects.requireNonNull(deviceType);
        this.enabledDeveloperOptions = Objects.requireNonNull(enabledDeveloperOptions);
        this.enabledUsbDebugging = Objects.requireNonNull(enabledUsbDebugging);
        this.encryptionState = Objects.requireNonNull(encryptionState);
        this.imei = Objects.requireNonNull(imei);
        this.kernelVersion = Objects.requireNonNull(kernelVersion);
        this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
        this.managementState = Objects.requireNonNull(managementState);
        this.manufacturer = Objects.requireNonNull(manufacturer);
        this.meid = Objects.requireNonNull(meid);
        this.model = Objects.requireNonNull(model);
        this.name = Objects.requireNonNull(name);
        this.networkOperator = Objects.requireNonNull(networkOperator);
        this.osVersion = Objects.requireNonNull(osVersion);
        this.otherAccounts = Objects.requireNonNull(otherAccounts);
        this.ownerType = Objects.requireNonNull(ownerType);
        this.releaseVersion = Objects.requireNonNull(releaseVersion);
        this.securityPatchTime = Objects.requireNonNull(securityPatchTime);
        this.serialNumber = Objects.requireNonNull(serialNumber);
        this.wifiMacAddresses = Objects.requireNonNull(wifiMacAddresses);
    }

    /**
     * Attributes specific to Android devices.
     * 
     */
    public GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse getAndroidSpecificAttributes() {
        return this.androidSpecificAttributes;
    }
    /**
     * Asset tag of the device.
     * 
     */
    public String getAssetTag() {
        return this.assetTag;
    }
    /**
     * Baseband version of the device.
     * 
     */
    public String getBasebandVersion() {
        return this.basebandVersion;
    }
    /**
     * Device bootloader version. Example: 0.6.7.
     * 
     */
    public String getBootloaderVersion() {
        return this.bootloaderVersion;
    }
    /**
     * Device brand. Example: Samsung.
     * 
     */
    public String getBrand() {
        return this.brand;
    }
    /**
     * Build number of the device.
     * 
     */
    public String getBuildNumber() {
        return this.buildNumber;
    }
    /**
     * Represents whether the Device is compromised.
     * 
     */
    public String getCompromisedState() {
        return this.compromisedState;
    }
    /**
     * When the Company-Owned device was imported. This field is empty for BYOD devices.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Type of device.
     * 
     */
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * Whether developer options is enabled on device.
     * 
     */
    public Boolean getEnabledDeveloperOptions() {
        return this.enabledDeveloperOptions;
    }
    /**
     * Whether USB debugging is enabled on device.
     * 
     */
    public Boolean getEnabledUsbDebugging() {
        return this.enabledUsbDebugging;
    }
    /**
     * Device encryption state.
     * 
     */
    public String getEncryptionState() {
        return this.encryptionState;
    }
    /**
     * IMEI number of device if GSM device; empty otherwise.
     * 
     */
    public String getImei() {
        return this.imei;
    }
    /**
     * Kernel version of the device.
     * 
     */
    public String getKernelVersion() {
        return this.kernelVersion;
    }
    /**
     * Most recent time when device synced with this service.
     * 
     */
    public String getLastSyncTime() {
        return this.lastSyncTime;
    }
    /**
     * Management state of the device
     * 
     */
    public String getManagementState() {
        return this.managementState;
    }
    /**
     * Device manufacturer. Example: Motorola.
     * 
     */
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * MEID number of device if CDMA device; empty otherwise.
     * 
     */
    public String getMeid() {
        return this.meid;
    }
    /**
     * Model name of device. Example: Pixel 3.
     * 
     */
    public String getModel() {
        return this.model;
    }
    /**
     * [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device}`, where device is the unique id assigned to the Device.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Mobile or network operator of device, if available.
     * 
     */
    public String getNetworkOperator() {
        return this.networkOperator;
    }
    /**
     * OS version of the device. Example: Android 8.1.0.
     * 
     */
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Domain name for Google accounts on device. Type for other accounts on device. On Android, will only be populated if |ownership_privilege| is |PROFILE_OWNER| or |DEVICE_OWNER|. Does not include the account signed in to the device policy app if that account's domain has only one account. Examples: "com.example", "xyz.com".
     * 
     */
    public List<String> getOtherAccounts() {
        return this.otherAccounts;
    }
    /**
     * Whether the device is owned by the company or an individual
     * 
     */
    public String getOwnerType() {
        return this.ownerType;
    }
    /**
     * OS release version. Example: 6.0.
     * 
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }
    /**
     * OS security patch update time on device.
     * 
     */
    public String getSecurityPatchTime() {
        return this.securityPatchTime;
    }
    /**
     * Serial Number of device. Example: HT82V1A01076.
     * 
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * WiFi MAC addresses of device.
     * 
     */
    public List<String> getWifiMacAddresses() {
        return this.wifiMacAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse androidSpecificAttributes;
        private String assetTag;
        private String basebandVersion;
        private String bootloaderVersion;
        private String brand;
        private String buildNumber;
        private String compromisedState;
        private String createTime;
        private String deviceType;
        private Boolean enabledDeveloperOptions;
        private Boolean enabledUsbDebugging;
        private String encryptionState;
        private String imei;
        private String kernelVersion;
        private String lastSyncTime;
        private String managementState;
        private String manufacturer;
        private String meid;
        private String model;
        private String name;
        private String networkOperator;
        private String osVersion;
        private List<String> otherAccounts;
        private String ownerType;
        private String releaseVersion;
        private String securityPatchTime;
        private String serialNumber;
        private List<String> wifiMacAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidSpecificAttributes = defaults.androidSpecificAttributes;
    	      this.assetTag = defaults.assetTag;
    	      this.basebandVersion = defaults.basebandVersion;
    	      this.bootloaderVersion = defaults.bootloaderVersion;
    	      this.brand = defaults.brand;
    	      this.buildNumber = defaults.buildNumber;
    	      this.compromisedState = defaults.compromisedState;
    	      this.createTime = defaults.createTime;
    	      this.deviceType = defaults.deviceType;
    	      this.enabledDeveloperOptions = defaults.enabledDeveloperOptions;
    	      this.enabledUsbDebugging = defaults.enabledUsbDebugging;
    	      this.encryptionState = defaults.encryptionState;
    	      this.imei = defaults.imei;
    	      this.kernelVersion = defaults.kernelVersion;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.managementState = defaults.managementState;
    	      this.manufacturer = defaults.manufacturer;
    	      this.meid = defaults.meid;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.networkOperator = defaults.networkOperator;
    	      this.osVersion = defaults.osVersion;
    	      this.otherAccounts = defaults.otherAccounts;
    	      this.ownerType = defaults.ownerType;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.securityPatchTime = defaults.securityPatchTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.wifiMacAddresses = defaults.wifiMacAddresses;
        }

        public Builder setAndroidSpecificAttributes(GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse androidSpecificAttributes) {
            this.androidSpecificAttributes = Objects.requireNonNull(androidSpecificAttributes);
            return this;
        }

        public Builder setAssetTag(String assetTag) {
            this.assetTag = Objects.requireNonNull(assetTag);
            return this;
        }

        public Builder setBasebandVersion(String basebandVersion) {
            this.basebandVersion = Objects.requireNonNull(basebandVersion);
            return this;
        }

        public Builder setBootloaderVersion(String bootloaderVersion) {
            this.bootloaderVersion = Objects.requireNonNull(bootloaderVersion);
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = Objects.requireNonNull(brand);
            return this;
        }

        public Builder setBuildNumber(String buildNumber) {
            this.buildNumber = Objects.requireNonNull(buildNumber);
            return this;
        }

        public Builder setCompromisedState(String compromisedState) {
            this.compromisedState = Objects.requireNonNull(compromisedState);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeviceType(String deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }

        public Builder setEnabledDeveloperOptions(Boolean enabledDeveloperOptions) {
            this.enabledDeveloperOptions = Objects.requireNonNull(enabledDeveloperOptions);
            return this;
        }

        public Builder setEnabledUsbDebugging(Boolean enabledUsbDebugging) {
            this.enabledUsbDebugging = Objects.requireNonNull(enabledUsbDebugging);
            return this;
        }

        public Builder setEncryptionState(String encryptionState) {
            this.encryptionState = Objects.requireNonNull(encryptionState);
            return this;
        }

        public Builder setImei(String imei) {
            this.imei = Objects.requireNonNull(imei);
            return this;
        }

        public Builder setKernelVersion(String kernelVersion) {
            this.kernelVersion = Objects.requireNonNull(kernelVersion);
            return this;
        }

        public Builder setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }

        public Builder setManagementState(String managementState) {
            this.managementState = Objects.requireNonNull(managementState);
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = Objects.requireNonNull(manufacturer);
            return this;
        }

        public Builder setMeid(String meid) {
            this.meid = Objects.requireNonNull(meid);
            return this;
        }

        public Builder setModel(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkOperator(String networkOperator) {
            this.networkOperator = Objects.requireNonNull(networkOperator);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }

        public Builder setOtherAccounts(List<String> otherAccounts) {
            this.otherAccounts = Objects.requireNonNull(otherAccounts);
            return this;
        }

        public Builder setOwnerType(String ownerType) {
            this.ownerType = Objects.requireNonNull(ownerType);
            return this;
        }

        public Builder setReleaseVersion(String releaseVersion) {
            this.releaseVersion = Objects.requireNonNull(releaseVersion);
            return this;
        }

        public Builder setSecurityPatchTime(String securityPatchTime) {
            this.securityPatchTime = Objects.requireNonNull(securityPatchTime);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setWifiMacAddresses(List<String> wifiMacAddresses) {
            this.wifiMacAddresses = Objects.requireNonNull(wifiMacAddresses);
            return this;
        }

        public GetDeviceResult build() {
            return new GetDeviceResult(androidSpecificAttributes, assetTag, basebandVersion, bootloaderVersion, brand, buildNumber, compromisedState, createTime, deviceType, enabledDeveloperOptions, enabledUsbDebugging, encryptionState, imei, kernelVersion, lastSyncTime, managementState, manufacturer, meid, model, name, networkOperator, osVersion, otherAccounts, ownerType, releaseVersion, securityPatchTime, serialNumber, wifiMacAddresses);
        }
    }
}
