// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schema for MSIX Package Application properties.
 * 
 */
public final class MsixPackageApplicationsResponse extends com.pulumi.resources.InvokeArgs {

    public static final MsixPackageApplicationsResponse Empty = new MsixPackageApplicationsResponse();

    /**
     * Package Application Id, found in appxmanifest.xml.
     * 
     */
    @Import(name="appId")
    private @Nullable String appId;

    /**
     * @return Package Application Id, found in appxmanifest.xml.
     * 
     */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * Used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     * 
     */
    @Import(name="appUserModelID")
    private @Nullable String appUserModelID;

    /**
     * @return Used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     * 
     */
    public Optional<String> appUserModelID() {
        return Optional.ofNullable(this.appUserModelID);
    }

    /**
     * Description of Package Application.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of Package Application.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User friendly name.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return User friendly name.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * User friendly name.
     * 
     */
    @Import(name="iconImageName")
    private @Nullable String iconImageName;

    /**
     * @return User friendly name.
     * 
     */
    public Optional<String> iconImageName() {
        return Optional.ofNullable(this.iconImageName);
    }

    /**
     * the icon a 64 bit string as a byte array.
     * 
     */
    @Import(name="rawIcon")
    private @Nullable String rawIcon;

    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    public Optional<String> rawIcon() {
        return Optional.ofNullable(this.rawIcon);
    }

    /**
     * the icon a 64 bit string as a byte array.
     * 
     */
    @Import(name="rawPng")
    private @Nullable String rawPng;

    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    public Optional<String> rawPng() {
        return Optional.ofNullable(this.rawPng);
    }

    private MsixPackageApplicationsResponse() {}

    private MsixPackageApplicationsResponse(MsixPackageApplicationsResponse $) {
        this.appId = $.appId;
        this.appUserModelID = $.appUserModelID;
        this.description = $.description;
        this.friendlyName = $.friendlyName;
        this.iconImageName = $.iconImageName;
        this.rawIcon = $.rawIcon;
        this.rawPng = $.rawPng;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MsixPackageApplicationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MsixPackageApplicationsResponse $;

        public Builder() {
            $ = new MsixPackageApplicationsResponse();
        }

        public Builder(MsixPackageApplicationsResponse defaults) {
            $ = new MsixPackageApplicationsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Package Application Id, found in appxmanifest.xml.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable String appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appUserModelID Used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
         * 
         * @return builder
         * 
         */
        public Builder appUserModelID(@Nullable String appUserModelID) {
            $.appUserModelID = appUserModelID;
            return this;
        }

        /**
         * @param description Description of Package Application.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param friendlyName User friendly name.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param iconImageName User friendly name.
         * 
         * @return builder
         * 
         */
        public Builder iconImageName(@Nullable String iconImageName) {
            $.iconImageName = iconImageName;
            return this;
        }

        /**
         * @param rawIcon the icon a 64 bit string as a byte array.
         * 
         * @return builder
         * 
         */
        public Builder rawIcon(@Nullable String rawIcon) {
            $.rawIcon = rawIcon;
            return this;
        }

        /**
         * @param rawPng the icon a 64 bit string as a byte array.
         * 
         * @return builder
         * 
         */
        public Builder rawPng(@Nullable String rawPng) {
            $.rawPng = rawPng;
            return this;
        }

        public MsixPackageApplicationsResponse build() {
            return $;
        }
    }

}
