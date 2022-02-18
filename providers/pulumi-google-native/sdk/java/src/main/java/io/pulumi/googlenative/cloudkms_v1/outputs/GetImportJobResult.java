// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudkms_v1.outputs.KeyOperationAttestationResponse;
import io.pulumi.googlenative.cloudkms_v1.outputs.WrappingPublicKeyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetImportJobResult {
    /**
     * Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
     * 
     */
    private final KeyOperationAttestationResponse attestation;
    /**
     * The time at which this ImportJob was created.
     * 
     */
    private final String createTime;
    /**
     * The time this ImportJob expired. Only present if state is EXPIRED.
     * 
     */
    private final String expireEventTime;
    /**
     * The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material.
     * 
     */
    private final String expireTime;
    /**
     * The time this ImportJob's key material was generated.
     * 
     */
    private final String generateTime;
    /**
     * Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    private final String importMethod;
    /**
     * The resource name for this ImportJob in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*`.
     * 
     */
    private final String name;
    /**
     * Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    private final String protectionLevel;
    /**
     * The public key with which to wrap key material prior to import. Only returned if state is ACTIVE.
     * 
     */
    private final WrappingPublicKeyResponse publicKey;
    /**
     * The current state of the ImportJob, indicating if it can be used.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"attestation","createTime","expireEventTime","expireTime","generateTime","importMethod","name","protectionLevel","publicKey","state"})
    private GetImportJobResult(
        KeyOperationAttestationResponse attestation,
        String createTime,
        String expireEventTime,
        String expireTime,
        String generateTime,
        String importMethod,
        String name,
        String protectionLevel,
        WrappingPublicKeyResponse publicKey,
        String state) {
        this.attestation = Objects.requireNonNull(attestation);
        this.createTime = Objects.requireNonNull(createTime);
        this.expireEventTime = Objects.requireNonNull(expireEventTime);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.generateTime = Objects.requireNonNull(generateTime);
        this.importMethod = Objects.requireNonNull(importMethod);
        this.name = Objects.requireNonNull(name);
        this.protectionLevel = Objects.requireNonNull(protectionLevel);
        this.publicKey = Objects.requireNonNull(publicKey);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
     * 
     */
    public KeyOperationAttestationResponse getAttestation() {
        return this.attestation;
    }
    /**
     * The time at which this ImportJob was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The time this ImportJob expired. Only present if state is EXPIRED.
     * 
     */
    public String getExpireEventTime() {
        return this.expireEventTime;
    }
    /**
     * The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material.
     * 
     */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * The time this ImportJob's key material was generated.
     * 
     */
    public String getGenerateTime() {
        return this.generateTime;
    }
    /**
     * Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    public String getImportMethod() {
        return this.importMethod;
    }
    /**
     * The resource name for this ImportJob in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}importJobs/*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    public String getProtectionLevel() {
        return this.protectionLevel;
    }
    /**
     * The public key with which to wrap key material prior to import. Only returned if state is ACTIVE.
     * 
     */
    public WrappingPublicKeyResponse getPublicKey() {
        return this.publicKey;
    }
    /**
     * The current state of the ImportJob, indicating if it can be used.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImportJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyOperationAttestationResponse attestation;
        private String createTime;
        private String expireEventTime;
        private String expireTime;
        private String generateTime;
        private String importMethod;
        private String name;
        private String protectionLevel;
        private WrappingPublicKeyResponse publicKey;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImportJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.createTime = defaults.createTime;
    	      this.expireEventTime = defaults.expireEventTime;
    	      this.expireTime = defaults.expireTime;
    	      this.generateTime = defaults.generateTime;
    	      this.importMethod = defaults.importMethod;
    	      this.name = defaults.name;
    	      this.protectionLevel = defaults.protectionLevel;
    	      this.publicKey = defaults.publicKey;
    	      this.state = defaults.state;
        }

        public Builder setAttestation(KeyOperationAttestationResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setExpireEventTime(String expireEventTime) {
            this.expireEventTime = Objects.requireNonNull(expireEventTime);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setGenerateTime(String generateTime) {
            this.generateTime = Objects.requireNonNull(generateTime);
            return this;
        }

        public Builder setImportMethod(String importMethod) {
            this.importMethod = Objects.requireNonNull(importMethod);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public Builder setPublicKey(WrappingPublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetImportJobResult build() {
            return new GetImportJobResult(attestation, createTime, expireEventTime, expireTime, generateTime, importMethod, name, protectionLevel, publicKey, state);
        }
    }
}
