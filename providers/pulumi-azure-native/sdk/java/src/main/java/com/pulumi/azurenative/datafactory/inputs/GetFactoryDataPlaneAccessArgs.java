// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFactoryDataPlaneAccessArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFactoryDataPlaneAccessArgs Empty = new GetFactoryDataPlaneAccessArgs();

    /**
     * The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     * 
     */
    @Import(name="accessResourcePath")
    private @Nullable String accessResourcePath;

    /**
     * @return The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     * 
     */
    public Optional<String> accessResourcePath() {
        return Optional.ofNullable(this.accessResourcePath);
    }

    /**
     * Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     * 
     */
    @Import(name="expireTime")
    private @Nullable String expireTime;

    /**
     * @return Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     * 
     */
    public Optional<String> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
     * 
     */
    @Import(name="permissions")
    private @Nullable String permissions;

    /**
     * @return The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
     * 
     */
    public Optional<String> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     * 
     */
    @Import(name="profileName")
    private @Nullable String profileName;

    /**
     * @return The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     * 
     */
    public Optional<String> profileName() {
        return Optional.ofNullable(this.profileName);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Start time for the token. If not specified the current time will be used.
     * 
     */
    @Import(name="startTime")
    private @Nullable String startTime;

    /**
     * @return Start time for the token. If not specified the current time will be used.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private GetFactoryDataPlaneAccessArgs() {}

    private GetFactoryDataPlaneAccessArgs(GetFactoryDataPlaneAccessArgs $) {
        this.accessResourcePath = $.accessResourcePath;
        this.expireTime = $.expireTime;
        this.factoryName = $.factoryName;
        this.permissions = $.permissions;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFactoryDataPlaneAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFactoryDataPlaneAccessArgs $;

        public Builder() {
            $ = new GetFactoryDataPlaneAccessArgs();
        }

        public Builder(GetFactoryDataPlaneAccessArgs defaults) {
            $ = new GetFactoryDataPlaneAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessResourcePath The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
         * 
         * @return builder
         * 
         */
        public Builder accessResourcePath(@Nullable String accessResourcePath) {
            $.accessResourcePath = accessResourcePath;
            return this;
        }

        /**
         * @param expireTime Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable String expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param permissions The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable String permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param profileName The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(@Nullable String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param startTime Start time for the token. If not specified the current time will be used.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable String startTime) {
            $.startTime = startTime;
            return this;
        }

        public GetFactoryDataPlaneAccessArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
