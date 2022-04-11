// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.intune;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IoMAMPolicyByNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoMAMPolicyByNameArgs Empty = new IoMAMPolicyByNameArgs();

    @Import(name="accessRecheckOfflineTimeout")
      private final @Nullable Output<String> accessRecheckOfflineTimeout;

    public Output<String> getAccessRecheckOfflineTimeout() {
        return this.accessRecheckOfflineTimeout == null ? Codegen.empty() : this.accessRecheckOfflineTimeout;
    }

    @Import(name="accessRecheckOnlineTimeout")
      private final @Nullable Output<String> accessRecheckOnlineTimeout;

    public Output<String> getAccessRecheckOnlineTimeout() {
        return this.accessRecheckOnlineTimeout == null ? Codegen.empty() : this.accessRecheckOnlineTimeout;
    }

    @Import(name="appSharingFromLevel")
      private final @Nullable Output<String> appSharingFromLevel;

    public Output<String> getAppSharingFromLevel() {
        return this.appSharingFromLevel == null ? Codegen.empty() : this.appSharingFromLevel;
    }

    @Import(name="appSharingToLevel")
      private final @Nullable Output<String> appSharingToLevel;

    public Output<String> getAppSharingToLevel() {
        return this.appSharingToLevel == null ? Codegen.empty() : this.appSharingToLevel;
    }

    @Import(name="authentication")
      private final @Nullable Output<String> authentication;

    public Output<String> getAuthentication() {
        return this.authentication == null ? Codegen.empty() : this.authentication;
    }

    @Import(name="clipboardSharingLevel")
      private final @Nullable Output<String> clipboardSharingLevel;

    public Output<String> getClipboardSharingLevel() {
        return this.clipboardSharingLevel == null ? Codegen.empty() : this.clipboardSharingLevel;
    }

    @Import(name="dataBackup")
      private final @Nullable Output<String> dataBackup;

    public Output<String> getDataBackup() {
        return this.dataBackup == null ? Codegen.empty() : this.dataBackup;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="deviceCompliance")
      private final @Nullable Output<String> deviceCompliance;

    public Output<String> getDeviceCompliance() {
        return this.deviceCompliance == null ? Codegen.empty() : this.deviceCompliance;
    }

    @Import(name="fileEncryptionLevel")
      private final @Nullable Output<String> fileEncryptionLevel;

    public Output<String> getFileEncryptionLevel() {
        return this.fileEncryptionLevel == null ? Codegen.empty() : this.fileEncryptionLevel;
    }

    @Import(name="fileSharingSaveAs")
      private final @Nullable Output<String> fileSharingSaveAs;

    public Output<String> getFileSharingSaveAs() {
        return this.fileSharingSaveAs == null ? Codegen.empty() : this.fileSharingSaveAs;
    }

    @Import(name="friendlyName", required=true)
      private final Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Location hostName for the tenant
     * 
     */
    @Import(name="hostName", required=true)
      private final Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }

    /**
     * Resource Location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="managedBrowser")
      private final @Nullable Output<String> managedBrowser;

    public Output<String> getManagedBrowser() {
        return this.managedBrowser == null ? Codegen.empty() : this.managedBrowser;
    }

    @Import(name="offlineWipeTimeout")
      private final @Nullable Output<String> offlineWipeTimeout;

    public Output<String> getOfflineWipeTimeout() {
        return this.offlineWipeTimeout == null ? Codegen.empty() : this.offlineWipeTimeout;
    }

    @Import(name="pin")
      private final @Nullable Output<String> pin;

    public Output<String> getPin() {
        return this.pin == null ? Codegen.empty() : this.pin;
    }

    @Import(name="pinNumRetry")
      private final @Nullable Output<Integer> pinNumRetry;

    public Output<Integer> getPinNumRetry() {
        return this.pinNumRetry == null ? Codegen.empty() : this.pinNumRetry;
    }

    /**
     * Unique name for the policy
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName == null ? Codegen.empty() : this.policyName;
    }

    /**
     * Resource Tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="touchId")
      private final @Nullable Output<String> touchId;

    public Output<String> getTouchId() {
        return this.touchId == null ? Codegen.empty() : this.touchId;
    }

    public IoMAMPolicyByNameArgs(
        @Nullable Output<String> accessRecheckOfflineTimeout,
        @Nullable Output<String> accessRecheckOnlineTimeout,
        @Nullable Output<String> appSharingFromLevel,
        @Nullable Output<String> appSharingToLevel,
        @Nullable Output<String> authentication,
        @Nullable Output<String> clipboardSharingLevel,
        @Nullable Output<String> dataBackup,
        @Nullable Output<String> description,
        @Nullable Output<String> deviceCompliance,
        @Nullable Output<String> fileEncryptionLevel,
        @Nullable Output<String> fileSharingSaveAs,
        Output<String> friendlyName,
        Output<String> hostName,
        @Nullable Output<String> location,
        @Nullable Output<String> managedBrowser,
        @Nullable Output<String> offlineWipeTimeout,
        @Nullable Output<String> pin,
        @Nullable Output<Integer> pinNumRetry,
        @Nullable Output<String> policyName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> touchId) {
        this.accessRecheckOfflineTimeout = accessRecheckOfflineTimeout;
        this.accessRecheckOnlineTimeout = accessRecheckOnlineTimeout;
        this.appSharingFromLevel = appSharingFromLevel == null ? Codegen.ofNullable("none") : appSharingFromLevel;
        this.appSharingToLevel = appSharingToLevel == null ? Codegen.ofNullable("none") : appSharingToLevel;
        this.authentication = authentication == null ? Codegen.ofNullable("required") : authentication;
        this.clipboardSharingLevel = clipboardSharingLevel == null ? Codegen.ofNullable("blocked") : clipboardSharingLevel;
        this.dataBackup = dataBackup == null ? Codegen.ofNullable("allow") : dataBackup;
        this.description = description;
        this.deviceCompliance = deviceCompliance == null ? Codegen.ofNullable("enable") : deviceCompliance;
        this.fileEncryptionLevel = fileEncryptionLevel == null ? Codegen.ofNullable("deviceLocked") : fileEncryptionLevel;
        this.fileSharingSaveAs = fileSharingSaveAs == null ? Codegen.ofNullable("allow") : fileSharingSaveAs;
        this.friendlyName = Objects.requireNonNull(friendlyName, "expected parameter 'friendlyName' to be non-null");
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.location = location;
        this.managedBrowser = managedBrowser == null ? Codegen.ofNullable("required") : managedBrowser;
        this.offlineWipeTimeout = offlineWipeTimeout;
        this.pin = pin == null ? Codegen.ofNullable("required") : pin;
        this.pinNumRetry = pinNumRetry;
        this.policyName = policyName;
        this.tags = tags;
        this.touchId = touchId == null ? Codegen.ofNullable("enable") : touchId;
    }

    private IoMAMPolicyByNameArgs() {
        this.accessRecheckOfflineTimeout = Codegen.empty();
        this.accessRecheckOnlineTimeout = Codegen.empty();
        this.appSharingFromLevel = Codegen.empty();
        this.appSharingToLevel = Codegen.empty();
        this.authentication = Codegen.empty();
        this.clipboardSharingLevel = Codegen.empty();
        this.dataBackup = Codegen.empty();
        this.description = Codegen.empty();
        this.deviceCompliance = Codegen.empty();
        this.fileEncryptionLevel = Codegen.empty();
        this.fileSharingSaveAs = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.hostName = Codegen.empty();
        this.location = Codegen.empty();
        this.managedBrowser = Codegen.empty();
        this.offlineWipeTimeout = Codegen.empty();
        this.pin = Codegen.empty();
        this.pinNumRetry = Codegen.empty();
        this.policyName = Codegen.empty();
        this.tags = Codegen.empty();
        this.touchId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoMAMPolicyByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessRecheckOfflineTimeout;
        private @Nullable Output<String> accessRecheckOnlineTimeout;
        private @Nullable Output<String> appSharingFromLevel;
        private @Nullable Output<String> appSharingToLevel;
        private @Nullable Output<String> authentication;
        private @Nullable Output<String> clipboardSharingLevel;
        private @Nullable Output<String> dataBackup;
        private @Nullable Output<String> description;
        private @Nullable Output<String> deviceCompliance;
        private @Nullable Output<String> fileEncryptionLevel;
        private @Nullable Output<String> fileSharingSaveAs;
        private Output<String> friendlyName;
        private Output<String> hostName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedBrowser;
        private @Nullable Output<String> offlineWipeTimeout;
        private @Nullable Output<String> pin;
        private @Nullable Output<Integer> pinNumRetry;
        private @Nullable Output<String> policyName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> touchId;

        public Builder() {
    	      // Empty
        }

        public Builder(IoMAMPolicyByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRecheckOfflineTimeout = defaults.accessRecheckOfflineTimeout;
    	      this.accessRecheckOnlineTimeout = defaults.accessRecheckOnlineTimeout;
    	      this.appSharingFromLevel = defaults.appSharingFromLevel;
    	      this.appSharingToLevel = defaults.appSharingToLevel;
    	      this.authentication = defaults.authentication;
    	      this.clipboardSharingLevel = defaults.clipboardSharingLevel;
    	      this.dataBackup = defaults.dataBackup;
    	      this.description = defaults.description;
    	      this.deviceCompliance = defaults.deviceCompliance;
    	      this.fileEncryptionLevel = defaults.fileEncryptionLevel;
    	      this.fileSharingSaveAs = defaults.fileSharingSaveAs;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostName = defaults.hostName;
    	      this.location = defaults.location;
    	      this.managedBrowser = defaults.managedBrowser;
    	      this.offlineWipeTimeout = defaults.offlineWipeTimeout;
    	      this.pin = defaults.pin;
    	      this.pinNumRetry = defaults.pinNumRetry;
    	      this.policyName = defaults.policyName;
    	      this.tags = defaults.tags;
    	      this.touchId = defaults.touchId;
        }

        public Builder accessRecheckOfflineTimeout(@Nullable Output<String> accessRecheckOfflineTimeout) {
            this.accessRecheckOfflineTimeout = accessRecheckOfflineTimeout;
            return this;
        }
        public Builder accessRecheckOfflineTimeout(@Nullable String accessRecheckOfflineTimeout) {
            this.accessRecheckOfflineTimeout = Codegen.ofNullable(accessRecheckOfflineTimeout);
            return this;
        }
        public Builder accessRecheckOnlineTimeout(@Nullable Output<String> accessRecheckOnlineTimeout) {
            this.accessRecheckOnlineTimeout = accessRecheckOnlineTimeout;
            return this;
        }
        public Builder accessRecheckOnlineTimeout(@Nullable String accessRecheckOnlineTimeout) {
            this.accessRecheckOnlineTimeout = Codegen.ofNullable(accessRecheckOnlineTimeout);
            return this;
        }
        public Builder appSharingFromLevel(@Nullable Output<String> appSharingFromLevel) {
            this.appSharingFromLevel = appSharingFromLevel;
            return this;
        }
        public Builder appSharingFromLevel(@Nullable String appSharingFromLevel) {
            this.appSharingFromLevel = Codegen.ofNullable(appSharingFromLevel);
            return this;
        }
        public Builder appSharingToLevel(@Nullable Output<String> appSharingToLevel) {
            this.appSharingToLevel = appSharingToLevel;
            return this;
        }
        public Builder appSharingToLevel(@Nullable String appSharingToLevel) {
            this.appSharingToLevel = Codegen.ofNullable(appSharingToLevel);
            return this;
        }
        public Builder authentication(@Nullable Output<String> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable String authentication) {
            this.authentication = Codegen.ofNullable(authentication);
            return this;
        }
        public Builder clipboardSharingLevel(@Nullable Output<String> clipboardSharingLevel) {
            this.clipboardSharingLevel = clipboardSharingLevel;
            return this;
        }
        public Builder clipboardSharingLevel(@Nullable String clipboardSharingLevel) {
            this.clipboardSharingLevel = Codegen.ofNullable(clipboardSharingLevel);
            return this;
        }
        public Builder dataBackup(@Nullable Output<String> dataBackup) {
            this.dataBackup = dataBackup;
            return this;
        }
        public Builder dataBackup(@Nullable String dataBackup) {
            this.dataBackup = Codegen.ofNullable(dataBackup);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder deviceCompliance(@Nullable Output<String> deviceCompliance) {
            this.deviceCompliance = deviceCompliance;
            return this;
        }
        public Builder deviceCompliance(@Nullable String deviceCompliance) {
            this.deviceCompliance = Codegen.ofNullable(deviceCompliance);
            return this;
        }
        public Builder fileEncryptionLevel(@Nullable Output<String> fileEncryptionLevel) {
            this.fileEncryptionLevel = fileEncryptionLevel;
            return this;
        }
        public Builder fileEncryptionLevel(@Nullable String fileEncryptionLevel) {
            this.fileEncryptionLevel = Codegen.ofNullable(fileEncryptionLevel);
            return this;
        }
        public Builder fileSharingSaveAs(@Nullable Output<String> fileSharingSaveAs) {
            this.fileSharingSaveAs = fileSharingSaveAs;
            return this;
        }
        public Builder fileSharingSaveAs(@Nullable String fileSharingSaveAs) {
            this.fileSharingSaveAs = Codegen.ofNullable(fileSharingSaveAs);
            return this;
        }
        public Builder friendlyName(Output<String> friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Output.of(Objects.requireNonNull(friendlyName));
            return this;
        }
        public Builder hostName(Output<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder hostName(String hostName) {
            this.hostName = Output.of(Objects.requireNonNull(hostName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managedBrowser(@Nullable Output<String> managedBrowser) {
            this.managedBrowser = managedBrowser;
            return this;
        }
        public Builder managedBrowser(@Nullable String managedBrowser) {
            this.managedBrowser = Codegen.ofNullable(managedBrowser);
            return this;
        }
        public Builder offlineWipeTimeout(@Nullable Output<String> offlineWipeTimeout) {
            this.offlineWipeTimeout = offlineWipeTimeout;
            return this;
        }
        public Builder offlineWipeTimeout(@Nullable String offlineWipeTimeout) {
            this.offlineWipeTimeout = Codegen.ofNullable(offlineWipeTimeout);
            return this;
        }
        public Builder pin(@Nullable Output<String> pin) {
            this.pin = pin;
            return this;
        }
        public Builder pin(@Nullable String pin) {
            this.pin = Codegen.ofNullable(pin);
            return this;
        }
        public Builder pinNumRetry(@Nullable Output<Integer> pinNumRetry) {
            this.pinNumRetry = pinNumRetry;
            return this;
        }
        public Builder pinNumRetry(@Nullable Integer pinNumRetry) {
            this.pinNumRetry = Codegen.ofNullable(pinNumRetry);
            return this;
        }
        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = Codegen.ofNullable(policyName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder touchId(@Nullable Output<String> touchId) {
            this.touchId = touchId;
            return this;
        }
        public Builder touchId(@Nullable String touchId) {
            this.touchId = Codegen.ofNullable(touchId);
            return this;
        }        public IoMAMPolicyByNameArgs build() {
            return new IoMAMPolicyByNameArgs(accessRecheckOfflineTimeout, accessRecheckOnlineTimeout, appSharingFromLevel, appSharingToLevel, authentication, clipboardSharingLevel, dataBackup, description, deviceCompliance, fileEncryptionLevel, fileSharingSaveAs, friendlyName, hostName, location, managedBrowser, offlineWipeTimeout, pin, pinNumRetry, policyName, tags, touchId);
        }
    }
}
