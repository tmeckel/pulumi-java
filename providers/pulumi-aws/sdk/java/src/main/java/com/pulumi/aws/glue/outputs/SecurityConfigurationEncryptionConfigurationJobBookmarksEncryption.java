// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
    /**
     * @return Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
     * 
     */
    private final @Nullable String jobBookmarksEncryptionMode;
    /**
     * @return Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    private final @Nullable String kmsKeyArn;

    @CustomType.Constructor
    private SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption(
        @CustomType.Parameter("jobBookmarksEncryptionMode") @Nullable String jobBookmarksEncryptionMode,
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * @return Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
     * 
     */
    public Optional<String> jobBookmarksEncryptionMode() {
        return Optional.ofNullable(this.jobBookmarksEncryptionMode);
    }
    /**
     * @return Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobBookmarksEncryptionMode;
        private @Nullable String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobBookmarksEncryptionMode = defaults.jobBookmarksEncryptionMode;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder jobBookmarksEncryptionMode(@Nullable String jobBookmarksEncryptionMode) {
            this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }        public SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption build() {
            return new SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption(jobBookmarksEncryptionMode, kmsKeyArn);
        }
    }
}
