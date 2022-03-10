// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub ApnsCredential.
 * 
 */
public final class ApnsCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApnsCredentialArgs Empty = new ApnsCredentialArgs();

    /**
     * The APNS certificate. Specify if using Certificate Authentication Mode.
     * 
     */
    @InputImport(name="apnsCertificate")
      private final @Nullable Input<String> apnsCertificate;

    public Input<String> getApnsCertificate() {
        return this.apnsCertificate == null ? Input.empty() : this.apnsCertificate;
    }

    /**
     * The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="appId")
      private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * The name of the application or BundleId. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="appName")
      private final @Nullable Input<String> appName;

    public Input<String> getAppName() {
        return this.appName == null ? Input.empty() : this.appName;
    }

    /**
     * The APNS certificate password if it exists.
     * 
     */
    @InputImport(name="certificateKey")
      private final @Nullable Input<String> certificateKey;

    public Input<String> getCertificateKey() {
        return this.certificateKey == null ? Input.empty() : this.certificateKey;
    }

    /**
     * The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify 'gateway.sandbox.push.apple.com'. If using Certificate Authentication Mode and Production specify 'gateway.push.apple.com'. If using Token Authentication Mode and Sandbox specify 'https://api.development.push.apple.com:443/3/device'. If using Token Authentication Mode and Production specify 'https://api.push.apple.com:443/3/device'.
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="keyId")
      private final @Nullable Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId == null ? Input.empty() : this.keyId;
    }

    /**
     * The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    /**
     * Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="token")
      private final @Nullable Input<String> token;

    public Input<String> getToken() {
        return this.token == null ? Input.empty() : this.token;
    }

    public ApnsCredentialArgs(
        @Nullable Input<String> apnsCertificate,
        @Nullable Input<String> appId,
        @Nullable Input<String> appName,
        @Nullable Input<String> certificateKey,
        @Nullable Input<String> endpoint,
        @Nullable Input<String> keyId,
        @Nullable Input<String> thumbprint,
        @Nullable Input<String> token) {
        this.apnsCertificate = apnsCertificate;
        this.appId = appId;
        this.appName = appName;
        this.certificateKey = certificateKey;
        this.endpoint = endpoint;
        this.keyId = keyId;
        this.thumbprint = thumbprint;
        this.token = token;
    }

    private ApnsCredentialArgs() {
        this.apnsCertificate = Input.empty();
        this.appId = Input.empty();
        this.appName = Input.empty();
        this.certificateKey = Input.empty();
        this.endpoint = Input.empty();
        this.keyId = Input.empty();
        this.thumbprint = Input.empty();
        this.token = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApnsCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apnsCertificate;
        private @Nullable Input<String> appId;
        private @Nullable Input<String> appName;
        private @Nullable Input<String> certificateKey;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> keyId;
        private @Nullable Input<String> thumbprint;
        private @Nullable Input<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(ApnsCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apnsCertificate = defaults.apnsCertificate;
    	      this.appId = defaults.appId;
    	      this.appName = defaults.appName;
    	      this.certificateKey = defaults.certificateKey;
    	      this.endpoint = defaults.endpoint;
    	      this.keyId = defaults.keyId;
    	      this.thumbprint = defaults.thumbprint;
    	      this.token = defaults.token;
        }

        public Builder apnsCertificate(@Nullable Input<String> apnsCertificate) {
            this.apnsCertificate = apnsCertificate;
            return this;
        }

        public Builder apnsCertificate(@Nullable String apnsCertificate) {
            this.apnsCertificate = Input.ofNullable(apnsCertificate);
            return this;
        }

        public Builder appId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder appName(@Nullable Input<String> appName) {
            this.appName = appName;
            return this;
        }

        public Builder appName(@Nullable String appName) {
            this.appName = Input.ofNullable(appName);
            return this;
        }

        public Builder certificateKey(@Nullable Input<String> certificateKey) {
            this.certificateKey = certificateKey;
            return this;
        }

        public Builder certificateKey(@Nullable String certificateKey) {
            this.certificateKey = Input.ofNullable(certificateKey);
            return this;
        }

        public Builder endpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder keyId(@Nullable Input<String> keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder keyId(@Nullable String keyId) {
            this.keyId = Input.ofNullable(keyId);
            return this;
        }

        public Builder thumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }

        public Builder token(@Nullable Input<String> token) {
            this.token = token;
            return this;
        }

        public Builder token(@Nullable String token) {
            this.token = Input.ofNullable(token);
            return this;
        }
        public ApnsCredentialArgs build() {
            return new ApnsCredentialArgs(apnsCertificate, appId, appName, certificateKey, endpoint, keyId, thumbprint, token);
        }
    }
}
