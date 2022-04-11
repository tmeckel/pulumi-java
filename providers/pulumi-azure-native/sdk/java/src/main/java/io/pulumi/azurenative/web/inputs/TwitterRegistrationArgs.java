// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the app registration for the Twitter provider.
 * 
 */
public final class TwitterRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TwitterRegistrationArgs Empty = new TwitterRegistrationArgs();

    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @Import(name="consumerKey")
      private final @Nullable Output<String> consumerKey;

    public Output<String> getConsumerKey() {
        return this.consumerKey == null ? Codegen.empty() : this.consumerKey;
    }

    /**
     * The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    @Import(name="consumerSecretSettingName")
      private final @Nullable Output<String> consumerSecretSettingName;

    public Output<String> getConsumerSecretSettingName() {
        return this.consumerSecretSettingName == null ? Codegen.empty() : this.consumerSecretSettingName;
    }

    public TwitterRegistrationArgs(
        @Nullable Output<String> consumerKey,
        @Nullable Output<String> consumerSecretSettingName) {
        this.consumerKey = consumerKey;
        this.consumerSecretSettingName = consumerSecretSettingName;
    }

    private TwitterRegistrationArgs() {
        this.consumerKey = Codegen.empty();
        this.consumerSecretSettingName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TwitterRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> consumerKey;
        private @Nullable Output<String> consumerSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(TwitterRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecretSettingName = defaults.consumerSecretSettingName;
        }

        public Builder consumerKey(@Nullable Output<String> consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }
        public Builder consumerKey(@Nullable String consumerKey) {
            this.consumerKey = Codegen.ofNullable(consumerKey);
            return this;
        }
        public Builder consumerSecretSettingName(@Nullable Output<String> consumerSecretSettingName) {
            this.consumerSecretSettingName = consumerSecretSettingName;
            return this;
        }
        public Builder consumerSecretSettingName(@Nullable String consumerSecretSettingName) {
            this.consumerSecretSettingName = Codegen.ofNullable(consumerSecretSettingName);
            return this;
        }        public TwitterRegistrationArgs build() {
            return new TwitterRegistrationArgs(consumerKey, consumerSecretSettingName);
        }
    }
}
