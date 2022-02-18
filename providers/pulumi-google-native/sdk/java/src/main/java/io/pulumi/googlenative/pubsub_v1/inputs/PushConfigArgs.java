// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.pubsub_v1.inputs.OidcTokenArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a push delivery endpoint.
 * 
 */
public final class PushConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PushConfigArgs Empty = new PushConfigArgs();

    /**
     * Endpoint configuration attributes that can be used to control different aspects of the message delivery. The only currently supported attribute is `x-goog-version`, which you can use to change the format of the pushed message. This attribute indicates the version of the data expected by the endpoint. This controls the shape of the pushed message (i.e., its fields and metadata). If not present during the `CreateSubscription` call, it will default to the version of the Pub/Sub API used to make such call. If not present in a `ModifyPushConfig` call, its value will not be changed. `GetSubscription` calls will always return a valid version, even if the subscription was created without this attribute. The only supported values for the `x-goog-version` attribute are: * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API. * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API. For example: attributes { "x-goog-version": "v1" }
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as an `Authorization` header in the HTTP request for every pushed message.
     * 
     */
    @InputImport(name="oidcToken")
    private final @Nullable Input<OidcTokenArgs> oidcToken;

    public Input<OidcTokenArgs> getOidcToken() {
        return this.oidcToken == null ? Input.empty() : this.oidcToken;
    }

    /**
     * A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use `https://example.com/push`.
     * 
     */
    @InputImport(name="pushEndpoint")
    private final @Nullable Input<String> pushEndpoint;

    public Input<String> getPushEndpoint() {
        return this.pushEndpoint == null ? Input.empty() : this.pushEndpoint;
    }

    public PushConfigArgs(
        @Nullable Input<Map<String,String>> attributes,
        @Nullable Input<OidcTokenArgs> oidcToken,
        @Nullable Input<String> pushEndpoint) {
        this.attributes = attributes;
        this.oidcToken = oidcToken;
        this.pushEndpoint = pushEndpoint;
    }

    private PushConfigArgs() {
        this.attributes = Input.empty();
        this.oidcToken = Input.empty();
        this.pushEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;
        private @Nullable Input<OidcTokenArgs> oidcToken;
        private @Nullable Input<String> pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PushConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder setAttributes(@Nullable Input<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setOidcToken(@Nullable Input<OidcTokenArgs> oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }

        public Builder setOidcToken(@Nullable OidcTokenArgs oidcToken) {
            this.oidcToken = Input.ofNullable(oidcToken);
            return this;
        }

        public Builder setPushEndpoint(@Nullable Input<String> pushEndpoint) {
            this.pushEndpoint = pushEndpoint;
            return this;
        }

        public Builder setPushEndpoint(@Nullable String pushEndpoint) {
            this.pushEndpoint = Input.ofNullable(pushEndpoint);
            return this;
        }

        public PushConfigArgs build() {
            return new PushConfigArgs(attributes, oidcToken, pushEndpoint);
        }
    }
}
