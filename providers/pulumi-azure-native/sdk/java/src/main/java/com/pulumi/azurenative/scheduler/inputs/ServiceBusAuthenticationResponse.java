// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusAuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceBusAuthenticationResponse Empty = new ServiceBusAuthenticationResponse();

    /**
     * Gets or sets the SAS key.
     * 
     */
    @Import(name="sasKey")
    private @Nullable String sasKey;

    /**
     * @return Gets or sets the SAS key.
     * 
     */
    public Optional<String> sasKey() {
        return Optional.ofNullable(this.sasKey);
    }

    /**
     * Gets or sets the SAS key name.
     * 
     */
    @Import(name="sasKeyName")
    private @Nullable String sasKeyName;

    /**
     * @return Gets or sets the SAS key name.
     * 
     */
    public Optional<String> sasKeyName() {
        return Optional.ofNullable(this.sasKeyName);
    }

    /**
     * Gets or sets the authentication type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Gets or sets the authentication type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceBusAuthenticationResponse() {}

    private ServiceBusAuthenticationResponse(ServiceBusAuthenticationResponse $) {
        this.sasKey = $.sasKey;
        this.sasKeyName = $.sasKeyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceBusAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceBusAuthenticationResponse $;

        public Builder() {
            $ = new ServiceBusAuthenticationResponse();
        }

        public Builder(ServiceBusAuthenticationResponse defaults) {
            $ = new ServiceBusAuthenticationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param sasKey Gets or sets the SAS key.
         * 
         * @return builder
         * 
         */
        public Builder sasKey(@Nullable String sasKey) {
            $.sasKey = sasKey;
            return this;
        }

        /**
         * @param sasKeyName Gets or sets the SAS key name.
         * 
         * @return builder
         * 
         */
        public Builder sasKeyName(@Nullable String sasKeyName) {
            $.sasKeyName = sasKeyName;
            return this;
        }

        /**
         * @param type Gets or sets the authentication type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ServiceBusAuthenticationResponse build() {
            return $;
        }
    }

}
