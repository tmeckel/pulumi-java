// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryEncryptionConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryEncryptionConfigurationGetArgs Empty = new RepositoryEncryptionConfigurationGetArgs();

    /**
     * The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
     * 
     */
    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    /**
     * @return The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
     * 
     */
    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    /**
     * The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    private RepositoryEncryptionConfigurationGetArgs() {}

    private RepositoryEncryptionConfigurationGetArgs(RepositoryEncryptionConfigurationGetArgs $) {
        this.encryptionType = $.encryptionType;
        this.kmsKey = $.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryEncryptionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryEncryptionConfigurationGetArgs $;

        public Builder() {
            $ = new RepositoryEncryptionConfigurationGetArgs();
        }

        public Builder(RepositoryEncryptionConfigurationGetArgs defaults) {
            $ = new RepositoryEncryptionConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionType The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        /**
         * @param encryptionType The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        /**
         * @param kmsKey The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public RepositoryEncryptionConfigurationGetArgs build() {
            return $;
        }
    }

}
