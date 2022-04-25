// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.extendedlocation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is optional input that contains the authentication that should be used to generate the namespace.
 * 
 */
public final class CustomLocationPropertiesAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomLocationPropertiesAuthenticationArgs Empty = new CustomLocationPropertiesAuthenticationArgs();

    /**
     * The type of the Custom Locations authentication
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the Custom Locations authentication
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The kubeconfig value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The kubeconfig value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CustomLocationPropertiesAuthenticationArgs() {}

    private CustomLocationPropertiesAuthenticationArgs(CustomLocationPropertiesAuthenticationArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomLocationPropertiesAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomLocationPropertiesAuthenticationArgs $;

        public Builder() {
            $ = new CustomLocationPropertiesAuthenticationArgs();
        }

        public Builder(CustomLocationPropertiesAuthenticationArgs defaults) {
            $ = new CustomLocationPropertiesAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of the Custom Locations authentication
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Custom Locations authentication
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The kubeconfig value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The kubeconfig value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CustomLocationPropertiesAuthenticationArgs build() {
            return $;
        }
    }

}
