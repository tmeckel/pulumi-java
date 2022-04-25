// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketReplicaModificationsStatus;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketReplicaModifications extends com.pulumi.resources.InvokeArgs {

    public static final BucketReplicaModifications Empty = new BucketReplicaModifications();

    /**
     * Specifies whether Amazon S3 replicates modifications on replicas.
     * 
     */
    @Import(name="status", required=true)
    private BucketReplicaModificationsStatus status;

    /**
     * @return Specifies whether Amazon S3 replicates modifications on replicas.
     * 
     */
    public BucketReplicaModificationsStatus status() {
        return this.status;
    }

    private BucketReplicaModifications() {}

    private BucketReplicaModifications(BucketReplicaModifications $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicaModifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicaModifications $;

        public Builder() {
            $ = new BucketReplicaModifications();
        }

        public Builder(BucketReplicaModifications defaults) {
            $ = new BucketReplicaModifications(Objects.requireNonNull(defaults));
        }

        /**
         * @param status Specifies whether Amazon S3 replicates modifications on replicas.
         * 
         * @return builder
         * 
         */
        public Builder status(BucketReplicaModificationsStatus status) {
            $.status = status;
            return this;
        }

        public BucketReplicaModifications build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
