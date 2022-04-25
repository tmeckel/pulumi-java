// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleSourceSelectionCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleSourceSelectionCriteriaArgs Empty = new BucketReplicationConfigRuleSourceSelectionCriteriaArgs();

    /**
     * A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn&#39;t replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * 
     */
    @Import(name="replicaModifications")
    private @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> replicaModifications;

    /**
     * @return A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn&#39;t replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * 
     */
    public Optional<Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs>> replicaModifications() {
        return Optional.ofNullable(this.replicaModifications);
    }

    /**
     * A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
     * 
     */
    @Import(name="sseKmsEncryptedObjects")
    private @Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects;

    /**
     * @return A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
     * 
     */
    public Optional<Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs>> sseKmsEncryptedObjects() {
        return Optional.ofNullable(this.sseKmsEncryptedObjects);
    }

    private BucketReplicationConfigRuleSourceSelectionCriteriaArgs() {}

    private BucketReplicationConfigRuleSourceSelectionCriteriaArgs(BucketReplicationConfigRuleSourceSelectionCriteriaArgs $) {
        this.replicaModifications = $.replicaModifications;
        this.sseKmsEncryptedObjects = $.sseKmsEncryptedObjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleSourceSelectionCriteriaArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleSourceSelectionCriteriaArgs();
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteriaArgs defaults) {
            $ = new BucketReplicationConfigRuleSourceSelectionCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param replicaModifications A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn&#39;t replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
         * 
         * @return builder
         * 
         */
        public Builder replicaModifications(@Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> replicaModifications) {
            $.replicaModifications = replicaModifications;
            return this;
        }

        /**
         * @param replicaModifications A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn&#39;t replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
         * 
         * @return builder
         * 
         */
        public Builder replicaModifications(BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs replicaModifications) {
            return replicaModifications(Output.of(replicaModifications));
        }

        /**
         * @param sseKmsEncryptedObjects A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
         * 
         * @return builder
         * 
         */
        public Builder sseKmsEncryptedObjects(@Nullable Output<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects) {
            $.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        /**
         * @param sseKmsEncryptedObjects A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
         * 
         * @return builder
         * 
         */
        public Builder sseKmsEncryptedObjects(BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs sseKmsEncryptedObjects) {
            return sseKmsEncryptedObjects(Output.of(sseKmsEncryptedObjects));
        }

        public BucketReplicationConfigRuleSourceSelectionCriteriaArgs build() {
            return $;
        }
    }

}
