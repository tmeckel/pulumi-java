// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketVersioningArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketVersioningArgs Empty = new BucketVersioningArgs();

    /**
     * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    @InputImport(name="mfaDelete")
      private final @Nullable Input<Boolean> mfaDelete;

    public Input<Boolean> getMfaDelete() {
        return this.mfaDelete == null ? Input.empty() : this.mfaDelete;
    }

    public BucketVersioningArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Boolean> mfaDelete) {
        this.enabled = enabled;
        this.mfaDelete = mfaDelete;
    }

    private BucketVersioningArgs() {
        this.enabled = Input.empty();
        this.mfaDelete = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Boolean> mfaDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketVersioningArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.mfaDelete = defaults.mfaDelete;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder mfaDelete(@Nullable Input<Boolean> mfaDelete) {
            this.mfaDelete = mfaDelete;
            return this;
        }

        public Builder mfaDelete(@Nullable Boolean mfaDelete) {
            this.mfaDelete = Input.ofNullable(mfaDelete);
            return this;
        }
        public BucketVersioningArgs build() {
            return new BucketVersioningArgs(enabled, mfaDelete);
        }
    }
}
