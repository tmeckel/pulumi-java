// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload.
 * 
 */
public final class BucketAbortIncompleteMultipartUploadArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAbortIncompleteMultipartUploadArgs Empty = new BucketAbortIncompleteMultipartUploadArgs();

    /**
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    @Import(name="daysAfterInitiation", required=true)
      private final Output<Integer> daysAfterInitiation;

    public Output<Integer> getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public BucketAbortIncompleteMultipartUploadArgs(Output<Integer> daysAfterInitiation) {
        this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation, "expected parameter 'daysAfterInitiation' to be non-null");
    }

    private BucketAbortIncompleteMultipartUploadArgs() {
        this.daysAfterInitiation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAbortIncompleteMultipartUploadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> daysAfterInitiation;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAbortIncompleteMultipartUploadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        public Builder daysAfterInitiation(Output<Integer> daysAfterInitiation) {
            this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation);
            return this;
        }
        public Builder daysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = Output.of(Objects.requireNonNull(daysAfterInitiation));
            return this;
        }        public BucketAbortIncompleteMultipartUploadArgs build() {
            return new BucketAbortIncompleteMultipartUploadArgs(daysAfterInitiation);
        }
    }
}
