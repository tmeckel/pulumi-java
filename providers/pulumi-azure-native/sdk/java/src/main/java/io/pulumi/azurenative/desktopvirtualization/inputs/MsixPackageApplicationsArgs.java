// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schema for MSIX Package Application properties.
 * 
 */
public final class MsixPackageApplicationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MsixPackageApplicationsArgs Empty = new MsixPackageApplicationsArgs();

    /**
     * Package Application Id, found in appxmanifest.xml.
     * 
     */
    @InputImport(name="appId")
      private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * Used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     * 
     */
    @InputImport(name="appUserModelID")
      private final @Nullable Input<String> appUserModelID;

    public Input<String> getAppUserModelID() {
        return this.appUserModelID == null ? Input.empty() : this.appUserModelID;
    }

    /**
     * Description of Package Application.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User friendly name.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * User friendly name.
     * 
     */
    @InputImport(name="iconImageName")
      private final @Nullable Input<String> iconImageName;

    public Input<String> getIconImageName() {
        return this.iconImageName == null ? Input.empty() : this.iconImageName;
    }

    /**
     * the icon a 64 bit string as a byte array.
     * 
     */
    @InputImport(name="rawIcon")
      private final @Nullable Input<String> rawIcon;

    public Input<String> getRawIcon() {
        return this.rawIcon == null ? Input.empty() : this.rawIcon;
    }

    /**
     * the icon a 64 bit string as a byte array.
     * 
     */
    @InputImport(name="rawPng")
      private final @Nullable Input<String> rawPng;

    public Input<String> getRawPng() {
        return this.rawPng == null ? Input.empty() : this.rawPng;
    }

    public MsixPackageApplicationsArgs(
        @Nullable Input<String> appId,
        @Nullable Input<String> appUserModelID,
        @Nullable Input<String> description,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> iconImageName,
        @Nullable Input<String> rawIcon,
        @Nullable Input<String> rawPng) {
        this.appId = appId;
        this.appUserModelID = appUserModelID;
        this.description = description;
        this.friendlyName = friendlyName;
        this.iconImageName = iconImageName;
        this.rawIcon = rawIcon;
        this.rawPng = rawPng;
    }

    private MsixPackageApplicationsArgs() {
        this.appId = Input.empty();
        this.appUserModelID = Input.empty();
        this.description = Input.empty();
        this.friendlyName = Input.empty();
        this.iconImageName = Input.empty();
        this.rawIcon = Input.empty();
        this.rawPng = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MsixPackageApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<String> appUserModelID;
        private @Nullable Input<String> description;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> iconImageName;
        private @Nullable Input<String> rawIcon;
        private @Nullable Input<String> rawPng;

        public Builder() {
    	      // Empty
        }

        public Builder(MsixPackageApplicationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appUserModelID = defaults.appUserModelID;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.iconImageName = defaults.iconImageName;
    	      this.rawIcon = defaults.rawIcon;
    	      this.rawPng = defaults.rawPng;
        }

        public Builder appId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder appUserModelID(@Nullable Input<String> appUserModelID) {
            this.appUserModelID = appUserModelID;
            return this;
        }

        public Builder appUserModelID(@Nullable String appUserModelID) {
            this.appUserModelID = Input.ofNullable(appUserModelID);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder friendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder iconImageName(@Nullable Input<String> iconImageName) {
            this.iconImageName = iconImageName;
            return this;
        }

        public Builder iconImageName(@Nullable String iconImageName) {
            this.iconImageName = Input.ofNullable(iconImageName);
            return this;
        }

        public Builder rawIcon(@Nullable Input<String> rawIcon) {
            this.rawIcon = rawIcon;
            return this;
        }

        public Builder rawIcon(@Nullable String rawIcon) {
            this.rawIcon = Input.ofNullable(rawIcon);
            return this;
        }

        public Builder rawPng(@Nullable Input<String> rawPng) {
            this.rawPng = rawPng;
            return this;
        }

        public Builder rawPng(@Nullable String rawPng) {
            this.rawPng = Input.ofNullable(rawPng);
            return this;
        }
        public MsixPackageApplicationsArgs build() {
            return new MsixPackageApplicationsArgs(appId, appUserModelID, description, friendlyName, iconImageName, rawIcon, rawPng);
        }
    }
}
