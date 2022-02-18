// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudkms_v1.outputs.CryptoKeyVersionResponse;
import io.pulumi.googlenative.cloudkms_v1.outputs.CryptoKeyVersionTemplateResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetCryptoKeyResult {
    /**
     * The time at which this CryptoKey was created.
     * 
     */
    private final String createTime;
    /**
     * Immutable. The resource name of the backend environment where the key material for all CryptoKeyVersions associated with this CryptoKey reside and where all related cryptographic operations are performed. Only applicable if CryptoKeyVersions have a ProtectionLevel of EXTERNAL_VPC, with the resource name in the format `projects/*{@literal /}locations/*{@literal /}ekmConnections/*`. Note, this list is non-exhaustive and may apply to additional ProtectionLevels in the future.
     * 
     */
    private final String cryptoKeyBackend;
    /**
     * Immutable. The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED. If not specified at creation time, the default duration is 24 hours.
     * 
     */
    private final String destroyScheduledDuration;
    /**
     * Immutable. Whether this key may contain imported versions only.
     * 
     */
    private final Boolean importOnly;
    /**
     * Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name for this CryptoKey in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    private final String name;
    /**
     * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    private final String nextRotationTime;
    /**
     * A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
     * 
     */
    private final CryptoKeyVersionResponse primary;
    /**
     * Immutable. The immutable purpose of this CryptoKey.
     * 
     */
    private final String purpose;
    /**
     * next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set, next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    private final String rotationPeriod;
    /**
     * A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are controlled by this template.
     * 
     */
    private final CryptoKeyVersionTemplateResponse versionTemplate;

    @OutputCustomType.Constructor({"createTime","cryptoKeyBackend","destroyScheduledDuration","importOnly","labels","name","nextRotationTime","primary","purpose","rotationPeriod","versionTemplate"})
    private GetCryptoKeyResult(
        String createTime,
        String cryptoKeyBackend,
        String destroyScheduledDuration,
        Boolean importOnly,
        Map<String,String> labels,
        String name,
        String nextRotationTime,
        CryptoKeyVersionResponse primary,
        String purpose,
        String rotationPeriod,
        CryptoKeyVersionTemplateResponse versionTemplate) {
        this.createTime = Objects.requireNonNull(createTime);
        this.cryptoKeyBackend = Objects.requireNonNull(cryptoKeyBackend);
        this.destroyScheduledDuration = Objects.requireNonNull(destroyScheduledDuration);
        this.importOnly = Objects.requireNonNull(importOnly);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
        this.primary = Objects.requireNonNull(primary);
        this.purpose = Objects.requireNonNull(purpose);
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
        this.versionTemplate = Objects.requireNonNull(versionTemplate);
    }

    /**
     * The time at which this CryptoKey was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. The resource name of the backend environment where the key material for all CryptoKeyVersions associated with this CryptoKey reside and where all related cryptographic operations are performed. Only applicable if CryptoKeyVersions have a ProtectionLevel of EXTERNAL_VPC, with the resource name in the format `projects/*{@literal /}locations/*{@literal /}ekmConnections/*`. Note, this list is non-exhaustive and may apply to additional ProtectionLevels in the future.
     * 
     */
    public String getCryptoKeyBackend() {
        return this.cryptoKeyBackend;
    }
    /**
     * Immutable. The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED. If not specified at creation time, the default duration is 24 hours.
     * 
     */
    public String getDestroyScheduledDuration() {
        return this.destroyScheduledDuration;
    }
    /**
     * Immutable. Whether this key may contain imported versions only.
     * 
     */
    public Boolean getImportOnly() {
        return this.importOnly;
    }
    /**
     * Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for this CryptoKey in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    public String getNextRotationTime() {
        return this.nextRotationTime;
    }
    /**
     * A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
     * 
     */
    public CryptoKeyVersionResponse getPrimary() {
        return this.primary;
    }
    /**
     * Immutable. The immutable purpose of this CryptoKey.
     * 
     */
    public String getPurpose() {
        return this.purpose;
    }
    /**
     * next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set, next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    public String getRotationPeriod() {
        return this.rotationPeriod;
    }
    /**
     * A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are controlled by this template.
     * 
     */
    public CryptoKeyVersionTemplateResponse getVersionTemplate() {
        return this.versionTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCryptoKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String cryptoKeyBackend;
        private String destroyScheduledDuration;
        private Boolean importOnly;
        private Map<String,String> labels;
        private String name;
        private String nextRotationTime;
        private CryptoKeyVersionResponse primary;
        private String purpose;
        private String rotationPeriod;
        private CryptoKeyVersionTemplateResponse versionTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCryptoKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.cryptoKeyBackend = defaults.cryptoKeyBackend;
    	      this.destroyScheduledDuration = defaults.destroyScheduledDuration;
    	      this.importOnly = defaults.importOnly;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.primary = defaults.primary;
    	      this.purpose = defaults.purpose;
    	      this.rotationPeriod = defaults.rotationPeriod;
    	      this.versionTemplate = defaults.versionTemplate;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCryptoKeyBackend(String cryptoKeyBackend) {
            this.cryptoKeyBackend = Objects.requireNonNull(cryptoKeyBackend);
            return this;
        }

        public Builder setDestroyScheduledDuration(String destroyScheduledDuration) {
            this.destroyScheduledDuration = Objects.requireNonNull(destroyScheduledDuration);
            return this;
        }

        public Builder setImportOnly(Boolean importOnly) {
            this.importOnly = Objects.requireNonNull(importOnly);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }

        public Builder setPrimary(CryptoKeyVersionResponse primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }

        public Builder setPurpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
            return this;
        }

        public Builder setRotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }

        public Builder setVersionTemplate(CryptoKeyVersionTemplateResponse versionTemplate) {
            this.versionTemplate = Objects.requireNonNull(versionTemplate);
            return this;
        }

        public GetCryptoKeyResult build() {
            return new GetCryptoKeyResult(createTime, cryptoKeyBackend, destroyScheduledDuration, importOnly, labels, name, nextRotationTime, primary, purpose, rotationPeriod, versionTemplate);
        }
    }
}
