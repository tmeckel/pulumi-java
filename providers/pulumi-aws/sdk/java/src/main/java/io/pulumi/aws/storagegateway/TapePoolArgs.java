// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TapePoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final TapePoolArgs Empty = new TapePoolArgs();

    /**
     * The name of the new custom tape pool.
     * 
     */
    @InputImport(name="poolName", required=true)
      private final Input<String> poolName;

    public Input<String> getPoolName() {
        return this.poolName;
    }

    /**
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
     * 
     */
    @InputImport(name="retentionLockTimeInDays")
      private final @Nullable Input<Integer> retentionLockTimeInDays;

    public Input<Integer> getRetentionLockTimeInDays() {
        return this.retentionLockTimeInDays == null ? Input.empty() : this.retentionLockTimeInDays;
    }

    /**
     * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
     * 
     */
    @InputImport(name="retentionLockType")
      private final @Nullable Input<String> retentionLockType;

    public Input<String> getRetentionLockType() {
        return this.retentionLockType == null ? Input.empty() : this.retentionLockType;
    }

    /**
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
     * 
     */
    @InputImport(name="storageClass", required=true)
      private final Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TapePoolArgs(
        Input<String> poolName,
        @Nullable Input<Integer> retentionLockTimeInDays,
        @Nullable Input<String> retentionLockType,
        Input<String> storageClass,
        @Nullable Input<Map<String,String>> tags) {
        this.poolName = Objects.requireNonNull(poolName, "expected parameter 'poolName' to be non-null");
        this.retentionLockTimeInDays = retentionLockTimeInDays;
        this.retentionLockType = retentionLockType;
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
        this.tags = tags;
    }

    private TapePoolArgs() {
        this.poolName = Input.empty();
        this.retentionLockTimeInDays = Input.empty();
        this.retentionLockType = Input.empty();
        this.storageClass = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TapePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> poolName;
        private @Nullable Input<Integer> retentionLockTimeInDays;
        private @Nullable Input<String> retentionLockType;
        private Input<String> storageClass;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TapePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.poolName = defaults.poolName;
    	      this.retentionLockTimeInDays = defaults.retentionLockTimeInDays;
    	      this.retentionLockType = defaults.retentionLockType;
    	      this.storageClass = defaults.storageClass;
    	      this.tags = defaults.tags;
        }

        public Builder poolName(Input<String> poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }

        public Builder poolName(String poolName) {
            this.poolName = Input.of(Objects.requireNonNull(poolName));
            return this;
        }

        public Builder retentionLockTimeInDays(@Nullable Input<Integer> retentionLockTimeInDays) {
            this.retentionLockTimeInDays = retentionLockTimeInDays;
            return this;
        }

        public Builder retentionLockTimeInDays(@Nullable Integer retentionLockTimeInDays) {
            this.retentionLockTimeInDays = Input.ofNullable(retentionLockTimeInDays);
            return this;
        }

        public Builder retentionLockType(@Nullable Input<String> retentionLockType) {
            this.retentionLockType = retentionLockType;
            return this;
        }

        public Builder retentionLockType(@Nullable String retentionLockType) {
            this.retentionLockType = Input.ofNullable(retentionLockType);
            return this;
        }

        public Builder storageClass(Input<String> storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder storageClass(String storageClass) {
            this.storageClass = Input.of(Objects.requireNonNull(storageClass));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public TapePoolArgs build() {
            return new TapePoolArgs(poolName, retentionLockTimeInDays, retentionLockType, storageClass, tags);
        }
    }
}
