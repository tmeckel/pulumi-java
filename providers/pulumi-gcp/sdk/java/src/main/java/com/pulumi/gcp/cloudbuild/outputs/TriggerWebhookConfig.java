// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerWebhookConfig {
    /**
     * @return Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    private final String secret;
    /**
     * @return -
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private TriggerWebhookConfig(
        @CustomType.Parameter("secret") String secret,
        @CustomType.Parameter("state") @Nullable String state) {
        this.secret = secret;
        this.state = state;
    }

    /**
     * @return Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return -
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerWebhookConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secret;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerWebhookConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public TriggerWebhookConfig build() {
            return new TriggerWebhookConfig(secret, state);
        }
    }
}
