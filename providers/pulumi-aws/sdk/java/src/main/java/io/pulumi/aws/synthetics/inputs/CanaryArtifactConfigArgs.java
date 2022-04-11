// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.aws.synthetics.inputs.CanaryArtifactConfigS3EncryptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryArtifactConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryArtifactConfigArgs Empty = new CanaryArtifactConfigArgs();

    /**
     * Configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See S3 Encryption.
     * 
     */
    @Import(name="s3Encryption")
      private final @Nullable Output<CanaryArtifactConfigS3EncryptionArgs> s3Encryption;

    public Output<CanaryArtifactConfigS3EncryptionArgs> getS3Encryption() {
        return this.s3Encryption == null ? Codegen.empty() : this.s3Encryption;
    }

    public CanaryArtifactConfigArgs(@Nullable Output<CanaryArtifactConfigS3EncryptionArgs> s3Encryption) {
        this.s3Encryption = s3Encryption;
    }

    private CanaryArtifactConfigArgs() {
        this.s3Encryption = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryArtifactConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CanaryArtifactConfigS3EncryptionArgs> s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryArtifactConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder s3Encryption(@Nullable Output<CanaryArtifactConfigS3EncryptionArgs> s3Encryption) {
            this.s3Encryption = s3Encryption;
            return this;
        }
        public Builder s3Encryption(@Nullable CanaryArtifactConfigS3EncryptionArgs s3Encryption) {
            this.s3Encryption = Codegen.ofNullable(s3Encryption);
            return this;
        }        public CanaryArtifactConfigArgs build() {
            return new CanaryArtifactConfigArgs(s3Encryption);
        }
    }
}
