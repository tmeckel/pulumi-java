// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobDestinationS3GetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class SigningJobDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobDestinationGetArgs Empty = new SigningJobDestinationGetArgs();

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    @InputImport(name="s3", required=true)
      private final Input<SigningJobDestinationS3GetArgs> s3;

    public Input<SigningJobDestinationS3GetArgs> getS3() {
        return this.s3;
    }

    public SigningJobDestinationGetArgs(Input<SigningJobDestinationS3GetArgs> s3) {
        this.s3 = Objects.requireNonNull(s3, "expected parameter 's3' to be non-null");
    }

    private SigningJobDestinationGetArgs() {
        this.s3 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SigningJobDestinationS3GetArgs> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder s3(Input<SigningJobDestinationS3GetArgs> s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }

        public Builder s3(SigningJobDestinationS3GetArgs s3) {
            this.s3 = Input.of(Objects.requireNonNull(s3));
            return this;
        }
        public SigningJobDestinationGetArgs build() {
            return new SigningJobDestinationGetArgs(s3);
        }
    }
}
