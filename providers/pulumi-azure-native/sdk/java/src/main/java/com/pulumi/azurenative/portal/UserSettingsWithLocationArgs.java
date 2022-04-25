// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal;

import com.pulumi.azurenative.portal.inputs.UserPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserSettingsWithLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserSettingsWithLocationArgs Empty = new UserSettingsWithLocationArgs();

    /**
     * The provider location
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The provider location
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The cloud shell user settings properties.
     * 
     */
    @Import(name="properties", required=true)
    private Output<UserPropertiesArgs> properties;

    /**
     * @return The cloud shell user settings properties.
     * 
     */
    public Output<UserPropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the user settings
     * 
     */
    @Import(name="userSettingsName")
    private @Nullable Output<String> userSettingsName;

    /**
     * @return The name of the user settings
     * 
     */
    public Optional<Output<String>> userSettingsName() {
        return Optional.ofNullable(this.userSettingsName);
    }

    private UserSettingsWithLocationArgs() {}

    private UserSettingsWithLocationArgs(UserSettingsWithLocationArgs $) {
        this.location = $.location;
        this.properties = $.properties;
        this.userSettingsName = $.userSettingsName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSettingsWithLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSettingsWithLocationArgs $;

        public Builder() {
            $ = new UserSettingsWithLocationArgs();
        }

        public Builder(UserSettingsWithLocationArgs defaults) {
            $ = new UserSettingsWithLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The provider location
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The provider location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The cloud shell user settings properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<UserPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The cloud shell user settings properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(UserPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param userSettingsName The name of the user settings
         * 
         * @return builder
         * 
         */
        public Builder userSettingsName(@Nullable Output<String> userSettingsName) {
            $.userSettingsName = userSettingsName;
            return this;
        }

        /**
         * @param userSettingsName The name of the user settings
         * 
         * @return builder
         * 
         */
        public Builder userSettingsName(String userSettingsName) {
            return userSettingsName(Output.of(userSettingsName));
        }

        public UserSettingsWithLocationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
