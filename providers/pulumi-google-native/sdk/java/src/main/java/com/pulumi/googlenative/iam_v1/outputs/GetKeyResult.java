// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeyResult {
    /**
     * @return The key status.
     * 
     */
    private final Boolean disabled;
    /**
     * @return Specifies the algorithm (and possibly key size) for the key.
     * 
     */
    private final String keyAlgorithm;
    /**
     * @return The key origin.
     * 
     */
    private final String keyOrigin;
    /**
     * @return The key type.
     * 
     */
    private final String keyType;
    /**
     * @return The resource name of the service account key in the following format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
     * 
     */
    private final String name;
    /**
     * @return The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep the private key data secure because it allows for the assertion of the service account identity. When base64 decoded, the private key data can be used to authenticate with Google API client libraries and with gcloud auth activate-service-account.
     * 
     */
    private final String privateKeyData;
    /**
     * @return The output format for the private key. Only provided in `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or `ListServiceAccountKey` responses. Google never exposes system-managed private keys, and never retains user-managed private keys.
     * 
     */
    private final String privateKeyType;
    /**
     * @return The public key data. Only provided in `GetServiceAccountKey` responses.
     * 
     */
    private final String publicKeyData;
    /**
     * @return The key can be used after this timestamp.
     * 
     */
    private final String validAfterTime;
    /**
     * @return The key can be used before this timestamp. For system-managed key pairs, this timestamp is the end time for the private key signing operation. The public key could still be used for verification for a few hours after this time.
     * 
     */
    private final String validBeforeTime;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("keyAlgorithm") String keyAlgorithm,
        @CustomType.Parameter("keyOrigin") String keyOrigin,
        @CustomType.Parameter("keyType") String keyType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateKeyData") String privateKeyData,
        @CustomType.Parameter("privateKeyType") String privateKeyType,
        @CustomType.Parameter("publicKeyData") String publicKeyData,
        @CustomType.Parameter("validAfterTime") String validAfterTime,
        @CustomType.Parameter("validBeforeTime") String validBeforeTime) {
        this.disabled = disabled;
        this.keyAlgorithm = keyAlgorithm;
        this.keyOrigin = keyOrigin;
        this.keyType = keyType;
        this.name = name;
        this.privateKeyData = privateKeyData;
        this.privateKeyType = privateKeyType;
        this.publicKeyData = publicKeyData;
        this.validAfterTime = validAfterTime;
        this.validBeforeTime = validBeforeTime;
    }

    /**
     * @return The key status.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return Specifies the algorithm (and possibly key size) for the key.
     * 
     */
    public String keyAlgorithm() {
        return this.keyAlgorithm;
    }
    /**
     * @return The key origin.
     * 
     */
    public String keyOrigin() {
        return this.keyOrigin;
    }
    /**
     * @return The key type.
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    /**
     * @return The resource name of the service account key in the following format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep the private key data secure because it allows for the assertion of the service account identity. When base64 decoded, the private key data can be used to authenticate with Google API client libraries and with gcloud auth activate-service-account.
     * 
     */
    public String privateKeyData() {
        return this.privateKeyData;
    }
    /**
     * @return The output format for the private key. Only provided in `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or `ListServiceAccountKey` responses. Google never exposes system-managed private keys, and never retains user-managed private keys.
     * 
     */
    public String privateKeyType() {
        return this.privateKeyType;
    }
    /**
     * @return The public key data. Only provided in `GetServiceAccountKey` responses.
     * 
     */
    public String publicKeyData() {
        return this.publicKeyData;
    }
    /**
     * @return The key can be used after this timestamp.
     * 
     */
    public String validAfterTime() {
        return this.validAfterTime;
    }
    /**
     * @return The key can be used before this timestamp. For system-managed key pairs, this timestamp is the end time for the private key signing operation. The public key could still be used for verification for a few hours after this time.
     * 
     */
    public String validBeforeTime() {
        return this.validBeforeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;
        private String keyAlgorithm;
        private String keyOrigin;
        private String keyType;
        private String name;
        private String privateKeyData;
        private String privateKeyType;
        private String publicKeyData;
        private String validAfterTime;
        private String validBeforeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.keyOrigin = defaults.keyOrigin;
    	      this.keyType = defaults.keyType;
    	      this.name = defaults.name;
    	      this.privateKeyData = defaults.privateKeyData;
    	      this.privateKeyType = defaults.privateKeyType;
    	      this.publicKeyData = defaults.publicKeyData;
    	      this.validAfterTime = defaults.validAfterTime;
    	      this.validBeforeTime = defaults.validBeforeTime;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
            return this;
        }
        public Builder keyOrigin(String keyOrigin) {
            this.keyOrigin = Objects.requireNonNull(keyOrigin);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateKeyData(String privateKeyData) {
            this.privateKeyData = Objects.requireNonNull(privateKeyData);
            return this;
        }
        public Builder privateKeyType(String privateKeyType) {
            this.privateKeyType = Objects.requireNonNull(privateKeyType);
            return this;
        }
        public Builder publicKeyData(String publicKeyData) {
            this.publicKeyData = Objects.requireNonNull(publicKeyData);
            return this;
        }
        public Builder validAfterTime(String validAfterTime) {
            this.validAfterTime = Objects.requireNonNull(validAfterTime);
            return this;
        }
        public Builder validBeforeTime(String validBeforeTime) {
            this.validBeforeTime = Objects.requireNonNull(validBeforeTime);
            return this;
        }        public GetKeyResult build() {
            return new GetKeyResult(disabled, keyAlgorithm, keyOrigin, keyType, name, privateKeyData, privateKeyType, publicKeyData, validAfterTime, validBeforeTime);
        }
    }
}
