// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class InventoryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationArgs Empty = new InventoryDestinationArgs();

    /**
     * The S3 bucket configuration where inventory results are published (documented below).
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<InventoryDestinationBucketArgs> bucket;

    public Input<InventoryDestinationBucketArgs> getBucket() {
        return this.bucket;
    }

    public InventoryDestinationArgs(Input<InventoryDestinationBucketArgs> bucket) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
    }

    private InventoryDestinationArgs() {
        this.bucket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<InventoryDestinationBucketArgs> bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        public Builder bucket(Input<InventoryDestinationBucketArgs> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(InventoryDestinationBucketArgs bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }
        public InventoryDestinationArgs build() {
            return new InventoryDestinationArgs(bucket);
        }
    }
}
