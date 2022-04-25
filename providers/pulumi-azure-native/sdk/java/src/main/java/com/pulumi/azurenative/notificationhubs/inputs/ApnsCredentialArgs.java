// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub ApnsCredential.
 * 
 */
public final class ApnsCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApnsCredentialArgs Empty = new ApnsCredentialArgs();

    /**
     * The APNS certificate. Specify if using Certificate Authentication Mode.
     * 
     */
    @Import(name="apnsCertificate")
    private @Nullable Output<String> apnsCertificate;

    /**
     * @return The APNS certificate. Specify if using Certificate Authentication Mode.
     * 
     */
    public Optional<Output<String>> apnsCertificate() {
        return Optional.ofNullable(this.apnsCertificate);
    }

    /**
     * The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The name of the application or BundleId. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="appName")
    private @Nullable Output<String> appName;

    /**
     * @return The name of the application or BundleId. Specify if using Token Authentication Mode.
     * 
     */
    public Optional<Output<String>> appName() {
        return Optional.ofNullable(this.appName);
    }

    /**
     * The APNS certificate password if it exists.
     * 
     */
    @Import(name="certificateKey")
    private @Nullable Output<String> certificateKey;

    /**
     * @return The APNS certificate password if it exists.
     * 
     */
    public Optional<Output<String>> certificateKey() {
        return Optional.ofNullable(this.certificateKey);
    }

    /**
     * The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify &#39;gateway.sandbox.push.apple.com&#39;. If using Certificate Authentication Mode and Production specify &#39;gateway.push.apple.com&#39;. If using Token Authentication Mode and Sandbox specify &#39;https://api.development.push.apple.com:443/3/device&#39;. If using Token Authentication Mode and Production specify &#39;https://api.push.apple.com:443/3/device&#39;.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify &#39;gateway.sandbox.push.apple.com&#39;. If using Certificate Authentication Mode and Production specify &#39;gateway.push.apple.com&#39;. If using Token Authentication Mode and Sandbox specify &#39;https://api.development.push.apple.com:443/3/device&#39;. If using Token Authentication Mode and Production specify &#39;https://api.push.apple.com:443/3/device&#39;.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    /**
     * Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private ApnsCredentialArgs() {}

    private ApnsCredentialArgs(ApnsCredentialArgs $) {
        this.apnsCertificate = $.apnsCertificate;
        this.appId = $.appId;
        this.appName = $.appName;
        this.certificateKey = $.certificateKey;
        this.endpoint = $.endpoint;
        this.keyId = $.keyId;
        this.thumbprint = $.thumbprint;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApnsCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApnsCredentialArgs $;

        public Builder() {
            $ = new ApnsCredentialArgs();
        }

        public Builder(ApnsCredentialArgs defaults) {
            $ = new ApnsCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apnsCertificate The APNS certificate. Specify if using Certificate Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder apnsCertificate(@Nullable Output<String> apnsCertificate) {
            $.apnsCertificate = apnsCertificate;
            return this;
        }

        /**
         * @param apnsCertificate The APNS certificate. Specify if using Certificate Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder apnsCertificate(String apnsCertificate) {
            return apnsCertificate(Output.of(apnsCertificate));
        }

        /**
         * @param appId The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param appName The name of the application or BundleId. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder appName(@Nullable Output<String> appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appName The name of the application or BundleId. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        /**
         * @param certificateKey The APNS certificate password if it exists.
         * 
         * @return builder
         * 
         */
        public Builder certificateKey(@Nullable Output<String> certificateKey) {
            $.certificateKey = certificateKey;
            return this;
        }

        /**
         * @param certificateKey The APNS certificate password if it exists.
         * 
         * @return builder
         * 
         */
        public Builder certificateKey(String certificateKey) {
            return certificateKey(Output.of(certificateKey));
        }

        /**
         * @param endpoint The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify &#39;gateway.sandbox.push.apple.com&#39;. If using Certificate Authentication Mode and Production specify &#39;gateway.push.apple.com&#39;. If using Token Authentication Mode and Sandbox specify &#39;https://api.development.push.apple.com:443/3/device&#39;. If using Token Authentication Mode and Production specify &#39;https://api.push.apple.com:443/3/device&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify &#39;gateway.sandbox.push.apple.com&#39;. If using Certificate Authentication Mode and Production specify &#39;gateway.push.apple.com&#39;. If using Token Authentication Mode and Sandbox specify &#39;https://api.development.push.apple.com:443/3/device&#39;. If using Token Authentication Mode and Production specify &#39;https://api.push.apple.com:443/3/device&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param keyId A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param thumbprint The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param token Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ApnsCredentialArgs build() {
            return $;
        }
    }

}
