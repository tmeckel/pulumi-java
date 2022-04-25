// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Akamai Signature Header authentication key.
 * 
 */
public final class AkamaiSignatureHeaderAuthenticationKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AkamaiSignatureHeaderAuthenticationKeyArgs Empty = new AkamaiSignatureHeaderAuthenticationKeyArgs();

    /**
     * authentication key
     * 
     */
    @Import(name="base64Key")
    private @Nullable Output<String> base64Key;

    /**
     * @return authentication key
     * 
     */
    public Optional<Output<String>> base64Key() {
        return Optional.ofNullable(this.base64Key);
    }

    /**
     * The expiration time of the authentication key.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    /**
     * @return The expiration time of the authentication key.
     * 
     */
    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * identifier of the key
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return identifier of the key
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    private AkamaiSignatureHeaderAuthenticationKeyArgs() {}

    private AkamaiSignatureHeaderAuthenticationKeyArgs(AkamaiSignatureHeaderAuthenticationKeyArgs $) {
        this.base64Key = $.base64Key;
        this.expiration = $.expiration;
        this.identifier = $.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AkamaiSignatureHeaderAuthenticationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AkamaiSignatureHeaderAuthenticationKeyArgs $;

        public Builder() {
            $ = new AkamaiSignatureHeaderAuthenticationKeyArgs();
        }

        public Builder(AkamaiSignatureHeaderAuthenticationKeyArgs defaults) {
            $ = new AkamaiSignatureHeaderAuthenticationKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param base64Key authentication key
         * 
         * @return builder
         * 
         */
        public Builder base64Key(@Nullable Output<String> base64Key) {
            $.base64Key = base64Key;
            return this;
        }

        /**
         * @param base64Key authentication key
         * 
         * @return builder
         * 
         */
        public Builder base64Key(String base64Key) {
            return base64Key(Output.of(base64Key));
        }

        /**
         * @param expiration The expiration time of the authentication key.
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration The expiration time of the authentication key.
         * 
         * @return builder
         * 
         */
        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param identifier identifier of the key
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier identifier of the key
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public AkamaiSignatureHeaderAuthenticationKeyArgs build() {
            return $;
        }
    }

}
