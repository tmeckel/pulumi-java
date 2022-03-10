// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningJobDestinationS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobDestinationS3GetArgs Empty = new SigningJobDestinationS3GetArgs();

    /**
     * Name of the S3 bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    public SigningJobDestinationS3GetArgs(
        Input<String> bucket,
        @Nullable Input<String> prefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.prefix = prefix;
    }

    private SigningJobDestinationS3GetArgs() {
        this.bucket = Input.empty();
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestinationS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestinationS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder prefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }
        public SigningJobDestinationS3GetArgs build() {
            return new SigningJobDestinationS3GetArgs(bucket, prefix);
        }
    }
}
