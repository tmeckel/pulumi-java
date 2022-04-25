// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.azurenative.botservice.outputs.SiteResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelSettingsResponse {
    /**
     * @return The bot icon url
     * 
     */
    private final @Nullable String botIconUrl;
    /**
     * @return The bot id
     * 
     */
    private final @Nullable String botId;
    /**
     * @return The channel display name
     * 
     */
    private final @Nullable String channelDisplayName;
    /**
     * @return The channel id
     * 
     */
    private final @Nullable String channelId;
    /**
     * @return Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
     */
    private final @Nullable Boolean disableLocalAuth;
    /**
     * @return The extensionKey1
     * 
     */
    private final @Nullable String extensionKey1;
    /**
     * @return The extensionKey2
     * 
     */
    private final @Nullable String extensionKey2;
    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    private final @Nullable Boolean isEnabled;
    /**
     * @return The list of sites
     * 
     */
    private final @Nullable List<SiteResponse> sites;

    @CustomType.Constructor
    private ChannelSettingsResponse(
        @CustomType.Parameter("botIconUrl") @Nullable String botIconUrl,
        @CustomType.Parameter("botId") @Nullable String botId,
        @CustomType.Parameter("channelDisplayName") @Nullable String channelDisplayName,
        @CustomType.Parameter("channelId") @Nullable String channelId,
        @CustomType.Parameter("disableLocalAuth") @Nullable Boolean disableLocalAuth,
        @CustomType.Parameter("extensionKey1") @Nullable String extensionKey1,
        @CustomType.Parameter("extensionKey2") @Nullable String extensionKey2,
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @CustomType.Parameter("sites") @Nullable List<SiteResponse> sites) {
        this.botIconUrl = botIconUrl;
        this.botId = botId;
        this.channelDisplayName = channelDisplayName;
        this.channelId = channelId;
        this.disableLocalAuth = disableLocalAuth;
        this.extensionKey1 = extensionKey1;
        this.extensionKey2 = extensionKey2;
        this.isEnabled = isEnabled;
        this.sites = sites;
    }

    /**
     * @return The bot icon url
     * 
     */
    public Optional<String> botIconUrl() {
        return Optional.ofNullable(this.botIconUrl);
    }
    /**
     * @return The bot id
     * 
     */
    public Optional<String> botId() {
        return Optional.ofNullable(this.botId);
    }
    /**
     * @return The channel display name
     * 
     */
    public Optional<String> channelDisplayName() {
        return Optional.ofNullable(this.channelDisplayName);
    }
    /**
     * @return The channel id
     * 
     */
    public Optional<String> channelId() {
        return Optional.ofNullable(this.channelId);
    }
    /**
     * @return Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
     */
    public Optional<Boolean> disableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }
    /**
     * @return The extensionKey1
     * 
     */
    public Optional<String> extensionKey1() {
        return Optional.ofNullable(this.extensionKey1);
    }
    /**
     * @return The extensionKey2
     * 
     */
    public Optional<String> extensionKey2() {
        return Optional.ofNullable(this.extensionKey2);
    }
    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return The list of sites
     * 
     */
    public List<SiteResponse> sites() {
        return this.sites == null ? List.of() : this.sites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String botIconUrl;
        private @Nullable String botId;
        private @Nullable String channelDisplayName;
        private @Nullable String channelId;
        private @Nullable Boolean disableLocalAuth;
        private @Nullable String extensionKey1;
        private @Nullable String extensionKey2;
        private @Nullable Boolean isEnabled;
        private @Nullable List<SiteResponse> sites;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botIconUrl = defaults.botIconUrl;
    	      this.botId = defaults.botId;
    	      this.channelDisplayName = defaults.channelDisplayName;
    	      this.channelId = defaults.channelId;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.extensionKey1 = defaults.extensionKey1;
    	      this.extensionKey2 = defaults.extensionKey2;
    	      this.isEnabled = defaults.isEnabled;
    	      this.sites = defaults.sites;
        }

        public Builder botIconUrl(@Nullable String botIconUrl) {
            this.botIconUrl = botIconUrl;
            return this;
        }
        public Builder botId(@Nullable String botId) {
            this.botId = botId;
            return this;
        }
        public Builder channelDisplayName(@Nullable String channelDisplayName) {
            this.channelDisplayName = channelDisplayName;
            return this;
        }
        public Builder channelId(@Nullable String channelId) {
            this.channelId = channelId;
            return this;
        }
        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }
        public Builder extensionKey1(@Nullable String extensionKey1) {
            this.extensionKey1 = extensionKey1;
            return this;
        }
        public Builder extensionKey2(@Nullable String extensionKey2) {
            this.extensionKey2 = extensionKey2;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder sites(@Nullable List<SiteResponse> sites) {
            this.sites = sites;
            return this;
        }
        public Builder sites(SiteResponse... sites) {
            return sites(List.of(sites));
        }        public ChannelSettingsResponse build() {
            return new ChannelSettingsResponse(botIconUrl, botId, channelDisplayName, channelId, disableLocalAuth, extensionKey1, extensionKey2, isEnabled, sites);
        }
    }
}
