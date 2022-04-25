// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.enums.PublicKeyType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A PublicKey describes a public key.
 * 
 */
public final class PublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicKeyArgs Empty = new PublicKeyArgs();

    /**
     * A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Optional. The type of public key. If specified, it must match the public key used for the`key` field.
     * 
     */
    @Import(name="type")
    private @Nullable Output<PublicKeyType> type;

    /**
     * @return Optional. The type of public key. If specified, it must match the public key used for the`key` field.
     * 
     */
    public Optional<Output<PublicKeyType>> type() {
        return Optional.ofNullable(this.type);
    }

    private PublicKeyArgs() {}

    private PublicKeyArgs(PublicKeyArgs $) {
        this.key = $.key;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyArgs $;

        public Builder() {
            $ = new PublicKeyArgs();
        }

        public Builder(PublicKeyArgs defaults) {
            $ = new PublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param type Optional. The type of public key. If specified, it must match the public key used for the`key` field.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<PublicKeyType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Optional. The type of public key. If specified, it must match the public key used for the`key` field.
         * 
         * @return builder
         * 
         */
        public Builder type(PublicKeyType type) {
            return type(Output.of(type));
        }

        public PublicKeyArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
