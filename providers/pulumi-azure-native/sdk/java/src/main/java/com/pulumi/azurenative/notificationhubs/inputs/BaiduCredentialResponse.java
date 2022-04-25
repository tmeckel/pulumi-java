// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub BaiduCredential.
 * 
 */
public final class BaiduCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final BaiduCredentialResponse Empty = new BaiduCredentialResponse();

    /**
     * Baidu Api Key.
     * 
     */
    @Import(name="baiduApiKey")
    private @Nullable String baiduApiKey;

    /**
     * @return Baidu Api Key.
     * 
     */
    public Optional<String> baiduApiKey() {
        return Optional.ofNullable(this.baiduApiKey);
    }

    /**
     * Baidu Endpoint.
     * 
     */
    @Import(name="baiduEndPoint")
    private @Nullable String baiduEndPoint;

    /**
     * @return Baidu Endpoint.
     * 
     */
    public Optional<String> baiduEndPoint() {
        return Optional.ofNullable(this.baiduEndPoint);
    }

    /**
     * Baidu Secret Key
     * 
     */
    @Import(name="baiduSecretKey")
    private @Nullable String baiduSecretKey;

    /**
     * @return Baidu Secret Key
     * 
     */
    public Optional<String> baiduSecretKey() {
        return Optional.ofNullable(this.baiduSecretKey);
    }

    private BaiduCredentialResponse() {}

    private BaiduCredentialResponse(BaiduCredentialResponse $) {
        this.baiduApiKey = $.baiduApiKey;
        this.baiduEndPoint = $.baiduEndPoint;
        this.baiduSecretKey = $.baiduSecretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaiduCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaiduCredentialResponse $;

        public Builder() {
            $ = new BaiduCredentialResponse();
        }

        public Builder(BaiduCredentialResponse defaults) {
            $ = new BaiduCredentialResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param baiduApiKey Baidu Api Key.
         * 
         * @return builder
         * 
         */
        public Builder baiduApiKey(@Nullable String baiduApiKey) {
            $.baiduApiKey = baiduApiKey;
            return this;
        }

        /**
         * @param baiduEndPoint Baidu Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder baiduEndPoint(@Nullable String baiduEndPoint) {
            $.baiduEndPoint = baiduEndPoint;
            return this;
        }

        /**
         * @param baiduSecretKey Baidu Secret Key
         * 
         * @return builder
         * 
         */
        public Builder baiduSecretKey(@Nullable String baiduSecretKey) {
            $.baiduSecretKey = baiduSecretKey;
            return this;
        }

        public BaiduCredentialResponse build() {
            return $;
        }
    }

}
