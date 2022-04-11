// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs Empty = new FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs();

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    @Import(name="s3Uri", required=true)
      private final Output<String> s3Uri;

    public Output<String> getS3Uri() {
        return this.s3Uri;
    }

    public FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs(
        @Nullable Output<String> kmsKeyId,
        Output<String> s3Uri) {
        this.kmsKeyId = kmsKeyId;
        this.s3Uri = Objects.requireNonNull(s3Uri, "expected parameter 's3Uri' to be non-null");
    }

    private FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs() {
        this.kmsKeyId = Codegen.empty();
        this.s3Uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private Output<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder s3Uri(Output<String> s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }
        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Output.of(Objects.requireNonNull(s3Uri));
            return this;
        }        public FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs build() {
            return new FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs(kmsKeyId, s3Uri);
        }
    }
}
