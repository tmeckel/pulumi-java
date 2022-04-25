// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketRedirectRuleProtocol;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how requests are redirected. In the event of an error, you can specify a different error code to return.
 * 
 */
public final class BucketRedirectRule extends com.pulumi.resources.InvokeArgs {

    public static final BucketRedirectRule Empty = new BucketRedirectRule();

    /**
     * The host name to use in the redirect request.
     * 
     */
    @Import(name="hostName")
    private @Nullable String hostName;

    /**
     * @return The host name to use in the redirect request.
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * 
     */
    @Import(name="httpRedirectCode")
    private @Nullable String httpRedirectCode;

    /**
     * @return The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * 
     */
    public Optional<String> httpRedirectCode() {
        return Optional.ofNullable(this.httpRedirectCode);
    }

    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @Import(name="protocol")
    private @Nullable BucketRedirectRuleProtocol protocol;

    /**
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    public Optional<BucketRedirectRuleProtocol> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The object key prefix to use in the redirect request.
     * 
     */
    @Import(name="replaceKeyPrefixWith")
    private @Nullable String replaceKeyPrefixWith;

    /**
     * @return The object key prefix to use in the redirect request.
     * 
     */
    public Optional<String> replaceKeyPrefixWith() {
        return Optional.ofNullable(this.replaceKeyPrefixWith);
    }

    /**
     * The specific object key to use in the redirect request.d
     * 
     */
    @Import(name="replaceKeyWith")
    private @Nullable String replaceKeyWith;

    /**
     * @return The specific object key to use in the redirect request.d
     * 
     */
    public Optional<String> replaceKeyWith() {
        return Optional.ofNullable(this.replaceKeyWith);
    }

    private BucketRedirectRule() {}

    private BucketRedirectRule(BucketRedirectRule $) {
        this.hostName = $.hostName;
        this.httpRedirectCode = $.httpRedirectCode;
        this.protocol = $.protocol;
        this.replaceKeyPrefixWith = $.replaceKeyPrefixWith;
        this.replaceKeyWith = $.replaceKeyWith;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketRedirectRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketRedirectRule $;

        public Builder() {
            $ = new BucketRedirectRule();
        }

        public Builder(BucketRedirectRule defaults) {
            $ = new BucketRedirectRule(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName The host name to use in the redirect request.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param httpRedirectCode The HTTP redirect code to use on the response. Not required if one of the siblings is present.
         * 
         * @return builder
         * 
         */
        public Builder httpRedirectCode(@Nullable String httpRedirectCode) {
            $.httpRedirectCode = httpRedirectCode;
            return this;
        }

        /**
         * @param protocol Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable BucketRedirectRuleProtocol protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param replaceKeyPrefixWith The object key prefix to use in the redirect request.
         * 
         * @return builder
         * 
         */
        public Builder replaceKeyPrefixWith(@Nullable String replaceKeyPrefixWith) {
            $.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }

        /**
         * @param replaceKeyWith The specific object key to use in the redirect request.d
         * 
         * @return builder
         * 
         */
        public Builder replaceKeyWith(@Nullable String replaceKeyWith) {
            $.replaceKeyWith = replaceKeyWith;
            return this;
        }

        public BucketRedirectRule build() {
            return $;
        }
    }

}
