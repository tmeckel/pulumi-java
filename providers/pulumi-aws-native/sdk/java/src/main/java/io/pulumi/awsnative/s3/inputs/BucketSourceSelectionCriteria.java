// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketReplicaModifications;
import io.pulumi.awsnative.s3.inputs.BucketSseKmsEncryptedObjects;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container that describes additional filters for identifying the source objects that you want to replicate.
 * 
 */
public final class BucketSourceSelectionCriteria extends io.pulumi.resources.InvokeArgs {

    public static final BucketSourceSelectionCriteria Empty = new BucketSourceSelectionCriteria();

    /**
     * A filter that you can specify for selection for modifications on replicas.
     * 
     */
    @InputImport(name="replicaModifications")
      private final @Nullable BucketReplicaModifications replicaModifications;

    public Optional<BucketReplicaModifications> getReplicaModifications() {
        return this.replicaModifications == null ? Optional.empty() : Optional.ofNullable(this.replicaModifications);
    }

    /**
     * A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS.
     * 
     */
    @InputImport(name="sseKmsEncryptedObjects")
      private final @Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects;

    public Optional<BucketSseKmsEncryptedObjects> getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects == null ? Optional.empty() : Optional.ofNullable(this.sseKmsEncryptedObjects);
    }

    public BucketSourceSelectionCriteria(
        @Nullable BucketReplicaModifications replicaModifications,
        @Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.replicaModifications = replicaModifications;
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    private BucketSourceSelectionCriteria() {
        this.replicaModifications = null;
        this.sseKmsEncryptedObjects = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketSourceSelectionCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicaModifications replicaModifications;
        private @Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketSourceSelectionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaModifications = defaults.replicaModifications;
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder replicaModifications(@Nullable BucketReplicaModifications replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }

        public Builder sseKmsEncryptedObjects(@Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }
        public BucketSourceSelectionCriteria build() {
            return new BucketSourceSelectionCriteria(replicaModifications, sseKmsEncryptedObjects);
        }
    }
}
