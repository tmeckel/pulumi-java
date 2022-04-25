// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Url signing key parameters
 * 
 */
public final class UrlSigningKeyParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlSigningKeyParametersResponse Empty = new UrlSigningKeyParametersResponse();

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    @Import(name="keyId", required=true)
    private String keyId;

    /**
     * @return Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @Import(name="secretSource", required=true)
    private ResourceReferenceResponse secretSource;

    /**
     * @return Resource reference to the KV secret
     * 
     */
    public ResourceReferenceResponse secretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @Import(name="secretVersion")
    private @Nullable String secretVersion;

    /**
     * @return Version of the secret to be used
     * 
     */
    public Optional<String> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    /**
     * The type of the Secret to create.
     * Expected value is &#39;UrlSigningKey&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the Secret to create.
     * Expected value is &#39;UrlSigningKey&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private UrlSigningKeyParametersResponse() {}

    private UrlSigningKeyParametersResponse(UrlSigningKeyParametersResponse $) {
        this.keyId = $.keyId;
        this.secretSource = $.secretSource;
        this.secretVersion = $.secretVersion;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlSigningKeyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlSigningKeyParametersResponse $;

        public Builder() {
            $ = new UrlSigningKeyParametersResponse();
        }

        public Builder(UrlSigningKeyParametersResponse defaults) {
            $ = new UrlSigningKeyParametersResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param secretSource Resource reference to the KV secret
         * 
         * @return builder
         * 
         */
        public Builder secretSource(ResourceReferenceResponse secretSource) {
            $.secretSource = secretSource;
            return this;
        }

        /**
         * @param secretVersion Version of the secret to be used
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(@Nullable String secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        /**
         * @param type The type of the Secret to create.
         * Expected value is &#39;UrlSigningKey&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public UrlSigningKeyParametersResponse build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.secretSource = Objects.requireNonNull($.secretSource, "expected parameter 'secretSource' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
