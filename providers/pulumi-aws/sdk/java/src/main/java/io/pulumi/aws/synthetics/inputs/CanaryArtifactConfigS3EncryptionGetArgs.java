// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryArtifactConfigS3EncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryArtifactConfigS3EncryptionGetArgs Empty = new CanaryArtifactConfigS3EncryptionGetArgs();

    /**
     * The encryption method to use for artifacts created by this canary. Valid values are: `SSE-S3` and `SSE-KMS`.
     * 
     */
    @InputImport(name="encryptionMode")
      private final @Nullable Input<String> encryptionMode;

    public Input<String> getEncryptionMode() {
        return this.encryptionMode == null ? Input.empty() : this.encryptionMode;
    }

    /**
     * The ARN of the customer-managed KMS key to use, if you specify `SSE-KMS` for `encryption_mode`.
     * 
     */
    @InputImport(name="kmsKeyArn")
      private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    public CanaryArtifactConfigS3EncryptionGetArgs(
        @Nullable Input<String> encryptionMode,
        @Nullable Input<String> kmsKeyArn) {
        this.encryptionMode = encryptionMode;
        this.kmsKeyArn = kmsKeyArn;
    }

    private CanaryArtifactConfigS3EncryptionGetArgs() {
        this.encryptionMode = Input.empty();
        this.kmsKeyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryArtifactConfigS3EncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encryptionMode;
        private @Nullable Input<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryArtifactConfigS3EncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionMode = defaults.encryptionMode;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder encryptionMode(@Nullable Input<String> encryptionMode) {
            this.encryptionMode = encryptionMode;
            return this;
        }

        public Builder encryptionMode(@Nullable String encryptionMode) {
            this.encryptionMode = Input.ofNullable(encryptionMode);
            return this;
        }

        public Builder kmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }
        public CanaryArtifactConfigS3EncryptionGetArgs build() {
            return new CanaryArtifactConfigS3EncryptionGetArgs(encryptionMode, kmsKeyArn);
        }
    }
}
