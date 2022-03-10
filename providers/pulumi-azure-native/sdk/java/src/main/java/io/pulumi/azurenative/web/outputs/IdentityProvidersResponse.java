// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AppleResponse;
import io.pulumi.azurenative.web.outputs.AzureActiveDirectoryResponse;
import io.pulumi.azurenative.web.outputs.AzureStaticWebAppsResponse;
import io.pulumi.azurenative.web.outputs.CustomOpenIdConnectProviderResponse;
import io.pulumi.azurenative.web.outputs.FacebookResponse;
import io.pulumi.azurenative.web.outputs.GitHubResponse;
import io.pulumi.azurenative.web.outputs.GoogleResponse;
import io.pulumi.azurenative.web.outputs.LegacyMicrosoftAccountResponse;
import io.pulumi.azurenative.web.outputs.TwitterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityProvidersResponse {
    /**
     * The configuration settings of the Apple provider.
     * 
     */
    private final @Nullable AppleResponse apple;
    /**
     * The configuration settings of the Azure Active directory provider.
     * 
     */
    private final @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
    /**
     * The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    private final @Nullable AzureStaticWebAppsResponse azureStaticWebApps;
    /**
     * The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    private final @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders;
    /**
     * The configuration settings of the Facebook provider.
     * 
     */
    private final @Nullable FacebookResponse facebook;
    /**
     * The configuration settings of the GitHub provider.
     * 
     */
    private final @Nullable GitHubResponse gitHub;
    /**
     * The configuration settings of the Google provider.
     * 
     */
    private final @Nullable GoogleResponse google;
    /**
     * The configuration settings of the legacy Microsoft Account provider.
     * 
     */
    private final @Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount;
    /**
     * The configuration settings of the Twitter provider.
     * 
     */
    private final @Nullable TwitterResponse twitter;

    @OutputCustomType.Constructor
    private IdentityProvidersResponse(
        @OutputCustomType.Parameter("apple") @Nullable AppleResponse apple,
        @OutputCustomType.Parameter("azureActiveDirectory") @Nullable AzureActiveDirectoryResponse azureActiveDirectory,
        @OutputCustomType.Parameter("azureStaticWebApps") @Nullable AzureStaticWebAppsResponse azureStaticWebApps,
        @OutputCustomType.Parameter("customOpenIdConnectProviders") @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders,
        @OutputCustomType.Parameter("facebook") @Nullable FacebookResponse facebook,
        @OutputCustomType.Parameter("gitHub") @Nullable GitHubResponse gitHub,
        @OutputCustomType.Parameter("google") @Nullable GoogleResponse google,
        @OutputCustomType.Parameter("legacyMicrosoftAccount") @Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount,
        @OutputCustomType.Parameter("twitter") @Nullable TwitterResponse twitter) {
        this.apple = apple;
        this.azureActiveDirectory = azureActiveDirectory;
        this.azureStaticWebApps = azureStaticWebApps;
        this.customOpenIdConnectProviders = customOpenIdConnectProviders;
        this.facebook = facebook;
        this.gitHub = gitHub;
        this.google = google;
        this.legacyMicrosoftAccount = legacyMicrosoftAccount;
        this.twitter = twitter;
    }

    /**
     * The configuration settings of the Apple provider.
     * 
    */
    public Optional<AppleResponse> getApple() {
        return Optional.ofNullable(this.apple);
    }
    /**
     * The configuration settings of the Azure Active directory provider.
     * 
    */
    public Optional<AzureActiveDirectoryResponse> getAzureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }
    /**
     * The configuration settings of the Azure Static Web Apps provider.
     * 
    */
    public Optional<AzureStaticWebAppsResponse> getAzureStaticWebApps() {
        return Optional.ofNullable(this.azureStaticWebApps);
    }
    /**
     * The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
    */
    public Map<String,CustomOpenIdConnectProviderResponse> getCustomOpenIdConnectProviders() {
        return this.customOpenIdConnectProviders == null ? Map.of() : this.customOpenIdConnectProviders;
    }
    /**
     * The configuration settings of the Facebook provider.
     * 
    */
    public Optional<FacebookResponse> getFacebook() {
        return Optional.ofNullable(this.facebook);
    }
    /**
     * The configuration settings of the GitHub provider.
     * 
    */
    public Optional<GitHubResponse> getGitHub() {
        return Optional.ofNullable(this.gitHub);
    }
    /**
     * The configuration settings of the Google provider.
     * 
    */
    public Optional<GoogleResponse> getGoogle() {
        return Optional.ofNullable(this.google);
    }
    /**
     * The configuration settings of the legacy Microsoft Account provider.
     * 
    */
    public Optional<LegacyMicrosoftAccountResponse> getLegacyMicrosoftAccount() {
        return Optional.ofNullable(this.legacyMicrosoftAccount);
    }
    /**
     * The configuration settings of the Twitter provider.
     * 
    */
    public Optional<TwitterResponse> getTwitter() {
        return Optional.ofNullable(this.twitter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProvidersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppleResponse apple;
        private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
        private @Nullable AzureStaticWebAppsResponse azureStaticWebApps;
        private @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders;
        private @Nullable FacebookResponse facebook;
        private @Nullable GitHubResponse gitHub;
        private @Nullable GoogleResponse google;
        private @Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount;
        private @Nullable TwitterResponse twitter;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProvidersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apple = defaults.apple;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.azureStaticWebApps = defaults.azureStaticWebApps;
    	      this.customOpenIdConnectProviders = defaults.customOpenIdConnectProviders;
    	      this.facebook = defaults.facebook;
    	      this.gitHub = defaults.gitHub;
    	      this.google = defaults.google;
    	      this.legacyMicrosoftAccount = defaults.legacyMicrosoftAccount;
    	      this.twitter = defaults.twitter;
        }

        public Builder apple(@Nullable AppleResponse apple) {
            this.apple = apple;
            return this;
        }

        public Builder azureActiveDirectory(@Nullable AzureActiveDirectoryResponse azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        public Builder azureStaticWebApps(@Nullable AzureStaticWebAppsResponse azureStaticWebApps) {
            this.azureStaticWebApps = azureStaticWebApps;
            return this;
        }

        public Builder customOpenIdConnectProviders(@Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders) {
            this.customOpenIdConnectProviders = customOpenIdConnectProviders;
            return this;
        }

        public Builder facebook(@Nullable FacebookResponse facebook) {
            this.facebook = facebook;
            return this;
        }

        public Builder gitHub(@Nullable GitHubResponse gitHub) {
            this.gitHub = gitHub;
            return this;
        }

        public Builder google(@Nullable GoogleResponse google) {
            this.google = google;
            return this;
        }

        public Builder legacyMicrosoftAccount(@Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount) {
            this.legacyMicrosoftAccount = legacyMicrosoftAccount;
            return this;
        }

        public Builder twitter(@Nullable TwitterResponse twitter) {
            this.twitter = twitter;
            return this;
        }
        public IdentityProvidersResponse build() {
            return new IdentityProvidersResponse(apple, azureActiveDirectory, azureStaticWebApps, customOpenIdConnectProviders, facebook, gitHub, google, legacyMicrosoftAccount, twitter);
        }
    }
}
