// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs Empty = new BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs();

    /**
     * The ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    @Import(name="replicaKmsKeyId", required=true)
      private final Output<String> replicaKmsKeyId;

    public Output<String> getReplicaKmsKeyId() {
        return this.replicaKmsKeyId;
    }

    public BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs(Output<String> replicaKmsKeyId) {
        this.replicaKmsKeyId = Objects.requireNonNull(replicaKmsKeyId, "expected parameter 'replicaKmsKeyId' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs() {
        this.replicaKmsKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> replicaKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaKmsKeyId = defaults.replicaKmsKeyId;
        }

        public Builder replicaKmsKeyId(Output<String> replicaKmsKeyId) {
            this.replicaKmsKeyId = Objects.requireNonNull(replicaKmsKeyId);
            return this;
        }
        public Builder replicaKmsKeyId(String replicaKmsKeyId) {
            this.replicaKmsKeyId = Output.of(Objects.requireNonNull(replicaKmsKeyId));
            return this;
        }        public BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs build() {
            return new BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs(replicaKmsKeyId);
        }
    }
}
