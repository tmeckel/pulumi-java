// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskDiskEncryptionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskDiskEncryptionKeyArgs Empty = new DiskDiskEncryptionKeyArgs();

    /**
     * The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
     * in the cloud console. Your project&#39;s Compute Engine System service account
     * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
     * 
     */
    @Import(name="kmsKeySelfLink")
    private @Nullable Output<String> kmsKeySelfLink;

    /**
     * @return The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
     * in the cloud console. Your project&#39;s Compute Engine System service account
     * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
     * 
     */
    public Optional<Output<String>> kmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }

    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    @Import(name="kmsKeyServiceAccount")
    private @Nullable Output<String> kmsKeyServiceAccount;

    /**
     * @return The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    public Optional<Output<String>> kmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    @Import(name="rawKey")
    private @Nullable Output<String> rawKey;

    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    public Optional<Output<String>> rawKey() {
        return Optional.ofNullable(this.rawKey);
    }

    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    @Import(name="sha256")
    private @Nullable Output<String> sha256;

    /**
     * @return -
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    public Optional<Output<String>> sha256() {
        return Optional.ofNullable(this.sha256);
    }

    private DiskDiskEncryptionKeyArgs() {}

    private DiskDiskEncryptionKeyArgs(DiskDiskEncryptionKeyArgs $) {
        this.kmsKeySelfLink = $.kmsKeySelfLink;
        this.kmsKeyServiceAccount = $.kmsKeyServiceAccount;
        this.rawKey = $.rawKey;
        this.sha256 = $.sha256;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskDiskEncryptionKeyArgs $;

        public Builder() {
            $ = new DiskDiskEncryptionKeyArgs();
        }

        public Builder(DiskDiskEncryptionKeyArgs defaults) {
            $ = new DiskDiskEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeySelfLink The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
         * in the cloud console. Your project&#39;s Compute Engine System service account
         * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
         * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
         * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
         * 
         * @return builder
         * 
         */
        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            $.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        /**
         * @param kmsKeySelfLink The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
         * in the cloud console. Your project&#39;s Compute Engine System service account
         * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
         * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
         * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
         * 
         * @return builder
         * 
         */
        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            return kmsKeySelfLink(Output.of(kmsKeySelfLink));
        }

        /**
         * @param kmsKeyServiceAccount The service account used for the encryption request for the given KMS key.
         * If absent, the Compute Engine Service Agent service account is used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyServiceAccount(@Nullable Output<String> kmsKeyServiceAccount) {
            $.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        /**
         * @param kmsKeyServiceAccount The service account used for the encryption request for the given KMS key.
         * If absent, the Compute Engine Service Agent service account is used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyServiceAccount(String kmsKeyServiceAccount) {
            return kmsKeyServiceAccount(Output.of(kmsKeyServiceAccount));
        }

        /**
         * @param rawKey Specifies a 256-bit customer-supplied encryption key, encoded in
         * RFC 4648 base64 to either encrypt or decrypt this resource.
         * 
         * @return builder
         * 
         */
        public Builder rawKey(@Nullable Output<String> rawKey) {
            $.rawKey = rawKey;
            return this;
        }

        /**
         * @param rawKey Specifies a 256-bit customer-supplied encryption key, encoded in
         * RFC 4648 base64 to either encrypt or decrypt this resource.
         * 
         * @return builder
         * 
         */
        public Builder rawKey(String rawKey) {
            return rawKey(Output.of(rawKey));
        }

        /**
         * @param sha256 -
         * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
         * encryption key that protects this resource.
         * 
         * @return builder
         * 
         */
        public Builder sha256(@Nullable Output<String> sha256) {
            $.sha256 = sha256;
            return this;
        }

        /**
         * @param sha256 -
         * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
         * encryption key that protects this resource.
         * 
         * @return builder
         * 
         */
        public Builder sha256(String sha256) {
            return sha256(Output.of(sha256));
        }

        public DiskDiskEncryptionKeyArgs build() {
            return $;
        }
    }

}
