// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.FacebookPageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Facebook channel.
 * 
 */
public final class FacebookChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookChannelPropertiesArgs Empty = new FacebookChannelPropertiesArgs();

    /**
     * Facebook application id
     * 
     */
    @InputImport(name="appId", required=true)
      private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * Facebook application secret. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="appSecret")
      private final @Nullable Input<String> appSecret;

    public Input<String> getAppSecret() {
        return this.appSecret == null ? Input.empty() : this.appSecret;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The list of Facebook pages
     * 
     */
    @InputImport(name="pages")
      private final @Nullable Input<List<FacebookPageArgs>> pages;

    public Input<List<FacebookPageArgs>> getPages() {
        return this.pages == null ? Input.empty() : this.pages;
    }

    public FacebookChannelPropertiesArgs(
        Input<String> appId,
        @Nullable Input<String> appSecret,
        Input<Boolean> isEnabled,
        @Nullable Input<List<FacebookPageArgs>> pages) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.appSecret = appSecret;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.pages = pages;
    }

    private FacebookChannelPropertiesArgs() {
        this.appId = Input.empty();
        this.appSecret = Input.empty();
        this.isEnabled = Input.empty();
        this.pages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<String> appSecret;
        private Input<Boolean> isEnabled;
        private @Nullable Input<List<FacebookPageArgs>> pages;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecret = defaults.appSecret;
    	      this.isEnabled = defaults.isEnabled;
    	      this.pages = defaults.pages;
        }

        public Builder appId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder appId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder appSecret(@Nullable Input<String> appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public Builder appSecret(@Nullable String appSecret) {
            this.appSecret = Input.ofNullable(appSecret);
            return this;
        }

        public Builder isEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder pages(@Nullable Input<List<FacebookPageArgs>> pages) {
            this.pages = pages;
            return this;
        }

        public Builder pages(@Nullable List<FacebookPageArgs> pages) {
            this.pages = Input.ofNullable(pages);
            return this;
        }
        public FacebookChannelPropertiesArgs build() {
            return new FacebookChannelPropertiesArgs(appId, appSecret, isEnabled, pages);
        }
    }
}
