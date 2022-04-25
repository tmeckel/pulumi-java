// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Kik channel.
 * 
 */
public final class KikChannelPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final KikChannelPropertiesArgs Empty = new KikChannelPropertiesArgs();

    /**
     * Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated")
    private @Nullable Output<Boolean> isValidated;

    /**
     * @return Whether this channel is validated for the bot
     * 
     */
    public Optional<Output<Boolean>> isValidated() {
        return Optional.ofNullable(this.isValidated);
    }

    /**
     * The Kik user name
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The Kik user name
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private KikChannelPropertiesArgs() {}

    private KikChannelPropertiesArgs(KikChannelPropertiesArgs $) {
        this.apiKey = $.apiKey;
        this.isEnabled = $.isEnabled;
        this.isValidated = $.isValidated;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KikChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KikChannelPropertiesArgs $;

        public Builder() {
            $ = new KikChannelPropertiesArgs();
        }

        public Builder(KikChannelPropertiesArgs defaults) {
            $ = new KikChannelPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param isEnabled Whether this channel is enabled for the bot
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Whether this channel is enabled for the bot
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param isValidated Whether this channel is validated for the bot
         * 
         * @return builder
         * 
         */
        public Builder isValidated(@Nullable Output<Boolean> isValidated) {
            $.isValidated = isValidated;
            return this;
        }

        /**
         * @param isValidated Whether this channel is validated for the bot
         * 
         * @return builder
         * 
         */
        public Builder isValidated(Boolean isValidated) {
            return isValidated(Output.of(isValidated));
        }

        /**
         * @param userName The Kik user name
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The Kik user name
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public KikChannelPropertiesArgs build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
