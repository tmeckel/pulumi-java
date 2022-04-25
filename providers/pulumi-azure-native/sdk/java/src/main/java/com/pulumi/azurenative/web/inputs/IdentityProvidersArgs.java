// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AppleArgs;
import com.pulumi.azurenative.web.inputs.AzureActiveDirectoryArgs;
import com.pulumi.azurenative.web.inputs.AzureStaticWebAppsArgs;
import com.pulumi.azurenative.web.inputs.CustomOpenIdConnectProviderArgs;
import com.pulumi.azurenative.web.inputs.FacebookArgs;
import com.pulumi.azurenative.web.inputs.GitHubArgs;
import com.pulumi.azurenative.web.inputs.GoogleArgs;
import com.pulumi.azurenative.web.inputs.LegacyMicrosoftAccountArgs;
import com.pulumi.azurenative.web.inputs.TwitterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
 * 
 */
public final class IdentityProvidersArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityProvidersArgs Empty = new IdentityProvidersArgs();

    /**
     * The configuration settings of the Apple provider.
     * 
     */
    @Import(name="apple")
    private @Nullable Output<AppleArgs> apple;

    /**
     * @return The configuration settings of the Apple provider.
     * 
     */
    public Optional<Output<AppleArgs>> apple() {
        return Optional.ofNullable(this.apple);
    }

    /**
     * The configuration settings of the Azure Active directory provider.
     * 
     */
    @Import(name="azureActiveDirectory")
    private @Nullable Output<AzureActiveDirectoryArgs> azureActiveDirectory;

    /**
     * @return The configuration settings of the Azure Active directory provider.
     * 
     */
    public Optional<Output<AzureActiveDirectoryArgs>> azureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }

    /**
     * The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    @Import(name="azureStaticWebApps")
    private @Nullable Output<AzureStaticWebAppsArgs> azureStaticWebApps;

    /**
     * @return The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    public Optional<Output<AzureStaticWebAppsArgs>> azureStaticWebApps() {
        return Optional.ofNullable(this.azureStaticWebApps);
    }

    /**
     * The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    @Import(name="customOpenIdConnectProviders")
    private @Nullable Output<Map<String,CustomOpenIdConnectProviderArgs>> customOpenIdConnectProviders;

    /**
     * @return The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    public Optional<Output<Map<String,CustomOpenIdConnectProviderArgs>>> customOpenIdConnectProviders() {
        return Optional.ofNullable(this.customOpenIdConnectProviders);
    }

    /**
     * The configuration settings of the Facebook provider.
     * 
     */
    @Import(name="facebook")
    private @Nullable Output<FacebookArgs> facebook;

    /**
     * @return The configuration settings of the Facebook provider.
     * 
     */
    public Optional<Output<FacebookArgs>> facebook() {
        return Optional.ofNullable(this.facebook);
    }

    /**
     * The configuration settings of the GitHub provider.
     * 
     */
    @Import(name="gitHub")
    private @Nullable Output<GitHubArgs> gitHub;

    /**
     * @return The configuration settings of the GitHub provider.
     * 
     */
    public Optional<Output<GitHubArgs>> gitHub() {
        return Optional.ofNullable(this.gitHub);
    }

    /**
     * The configuration settings of the Google provider.
     * 
     */
    @Import(name="google")
    private @Nullable Output<GoogleArgs> google;

    /**
     * @return The configuration settings of the Google provider.
     * 
     */
    public Optional<Output<GoogleArgs>> google() {
        return Optional.ofNullable(this.google);
    }

    /**
     * The configuration settings of the legacy Microsoft Account provider.
     * 
     */
    @Import(name="legacyMicrosoftAccount")
    private @Nullable Output<LegacyMicrosoftAccountArgs> legacyMicrosoftAccount;

    /**
     * @return The configuration settings of the legacy Microsoft Account provider.
     * 
     */
    public Optional<Output<LegacyMicrosoftAccountArgs>> legacyMicrosoftAccount() {
        return Optional.ofNullable(this.legacyMicrosoftAccount);
    }

    /**
     * The configuration settings of the Twitter provider.
     * 
     */
    @Import(name="twitter")
    private @Nullable Output<TwitterArgs> twitter;

    /**
     * @return The configuration settings of the Twitter provider.
     * 
     */
    public Optional<Output<TwitterArgs>> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    private IdentityProvidersArgs() {}

    private IdentityProvidersArgs(IdentityProvidersArgs $) {
        this.apple = $.apple;
        this.azureActiveDirectory = $.azureActiveDirectory;
        this.azureStaticWebApps = $.azureStaticWebApps;
        this.customOpenIdConnectProviders = $.customOpenIdConnectProviders;
        this.facebook = $.facebook;
        this.gitHub = $.gitHub;
        this.google = $.google;
        this.legacyMicrosoftAccount = $.legacyMicrosoftAccount;
        this.twitter = $.twitter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityProvidersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityProvidersArgs $;

        public Builder() {
            $ = new IdentityProvidersArgs();
        }

        public Builder(IdentityProvidersArgs defaults) {
            $ = new IdentityProvidersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apple The configuration settings of the Apple provider.
         * 
         * @return builder
         * 
         */
        public Builder apple(@Nullable Output<AppleArgs> apple) {
            $.apple = apple;
            return this;
        }

        /**
         * @param apple The configuration settings of the Apple provider.
         * 
         * @return builder
         * 
         */
        public Builder apple(AppleArgs apple) {
            return apple(Output.of(apple));
        }

        /**
         * @param azureActiveDirectory The configuration settings of the Azure Active directory provider.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectory(@Nullable Output<AzureActiveDirectoryArgs> azureActiveDirectory) {
            $.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        /**
         * @param azureActiveDirectory The configuration settings of the Azure Active directory provider.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectory(AzureActiveDirectoryArgs azureActiveDirectory) {
            return azureActiveDirectory(Output.of(azureActiveDirectory));
        }

        /**
         * @param azureStaticWebApps The configuration settings of the Azure Static Web Apps provider.
         * 
         * @return builder
         * 
         */
        public Builder azureStaticWebApps(@Nullable Output<AzureStaticWebAppsArgs> azureStaticWebApps) {
            $.azureStaticWebApps = azureStaticWebApps;
            return this;
        }

        /**
         * @param azureStaticWebApps The configuration settings of the Azure Static Web Apps provider.
         * 
         * @return builder
         * 
         */
        public Builder azureStaticWebApps(AzureStaticWebAppsArgs azureStaticWebApps) {
            return azureStaticWebApps(Output.of(azureStaticWebApps));
        }

        /**
         * @param customOpenIdConnectProviders The map of the name of the alias of each custom Open ID Connect provider to the
         * configuration settings of the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder customOpenIdConnectProviders(@Nullable Output<Map<String,CustomOpenIdConnectProviderArgs>> customOpenIdConnectProviders) {
            $.customOpenIdConnectProviders = customOpenIdConnectProviders;
            return this;
        }

        /**
         * @param customOpenIdConnectProviders The map of the name of the alias of each custom Open ID Connect provider to the
         * configuration settings of the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder customOpenIdConnectProviders(Map<String,CustomOpenIdConnectProviderArgs> customOpenIdConnectProviders) {
            return customOpenIdConnectProviders(Output.of(customOpenIdConnectProviders));
        }

        /**
         * @param facebook The configuration settings of the Facebook provider.
         * 
         * @return builder
         * 
         */
        public Builder facebook(@Nullable Output<FacebookArgs> facebook) {
            $.facebook = facebook;
            return this;
        }

        /**
         * @param facebook The configuration settings of the Facebook provider.
         * 
         * @return builder
         * 
         */
        public Builder facebook(FacebookArgs facebook) {
            return facebook(Output.of(facebook));
        }

        /**
         * @param gitHub The configuration settings of the GitHub provider.
         * 
         * @return builder
         * 
         */
        public Builder gitHub(@Nullable Output<GitHubArgs> gitHub) {
            $.gitHub = gitHub;
            return this;
        }

        /**
         * @param gitHub The configuration settings of the GitHub provider.
         * 
         * @return builder
         * 
         */
        public Builder gitHub(GitHubArgs gitHub) {
            return gitHub(Output.of(gitHub));
        }

        /**
         * @param google The configuration settings of the Google provider.
         * 
         * @return builder
         * 
         */
        public Builder google(@Nullable Output<GoogleArgs> google) {
            $.google = google;
            return this;
        }

        /**
         * @param google The configuration settings of the Google provider.
         * 
         * @return builder
         * 
         */
        public Builder google(GoogleArgs google) {
            return google(Output.of(google));
        }

        /**
         * @param legacyMicrosoftAccount The configuration settings of the legacy Microsoft Account provider.
         * 
         * @return builder
         * 
         */
        public Builder legacyMicrosoftAccount(@Nullable Output<LegacyMicrosoftAccountArgs> legacyMicrosoftAccount) {
            $.legacyMicrosoftAccount = legacyMicrosoftAccount;
            return this;
        }

        /**
         * @param legacyMicrosoftAccount The configuration settings of the legacy Microsoft Account provider.
         * 
         * @return builder
         * 
         */
        public Builder legacyMicrosoftAccount(LegacyMicrosoftAccountArgs legacyMicrosoftAccount) {
            return legacyMicrosoftAccount(Output.of(legacyMicrosoftAccount));
        }

        /**
         * @param twitter The configuration settings of the Twitter provider.
         * 
         * @return builder
         * 
         */
        public Builder twitter(@Nullable Output<TwitterArgs> twitter) {
            $.twitter = twitter;
            return this;
        }

        /**
         * @param twitter The configuration settings of the Twitter provider.
         * 
         * @return builder
         * 
         */
        public Builder twitter(TwitterArgs twitter) {
            return twitter(Output.of(twitter));
        }

        public IdentityProvidersArgs build() {
            return $;
        }
    }

}
