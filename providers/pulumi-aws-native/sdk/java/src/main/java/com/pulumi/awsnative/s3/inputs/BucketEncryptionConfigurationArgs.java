// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
 * 
 */
public final class BucketEncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketEncryptionConfigurationArgs Empty = new BucketEncryptionConfigurationArgs();

    /**
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    @Import(name="replicaKmsKeyID", required=true)
    private Output<String> replicaKmsKeyID;

    /**
     * @return Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    public Output<String> replicaKmsKeyID() {
        return this.replicaKmsKeyID;
    }

    private BucketEncryptionConfigurationArgs() {}

    private BucketEncryptionConfigurationArgs(BucketEncryptionConfigurationArgs $) {
        this.replicaKmsKeyID = $.replicaKmsKeyID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketEncryptionConfigurationArgs $;

        public Builder() {
            $ = new BucketEncryptionConfigurationArgs();
        }

        public Builder(BucketEncryptionConfigurationArgs defaults) {
            $ = new BucketEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param replicaKmsKeyID Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
         * 
         * @return builder
         * 
         */
        public Builder replicaKmsKeyID(Output<String> replicaKmsKeyID) {
            $.replicaKmsKeyID = replicaKmsKeyID;
            return this;
        }

        /**
         * @param replicaKmsKeyID Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
         * 
         * @return builder
         * 
         */
        public Builder replicaKmsKeyID(String replicaKmsKeyID) {
            return replicaKmsKeyID(Output.of(replicaKmsKeyID));
        }

        public BucketEncryptionConfigurationArgs build() {
            $.replicaKmsKeyID = Objects.requireNonNull($.replicaKmsKeyID, "expected parameter 'replicaKmsKeyID' to be non-null");
            return $;
        }
    }

}
