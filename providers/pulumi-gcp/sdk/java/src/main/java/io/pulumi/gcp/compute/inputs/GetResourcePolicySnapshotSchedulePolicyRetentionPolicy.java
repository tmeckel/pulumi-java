// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicyRetentionPolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicyRetentionPolicy Empty = new GetResourcePolicySnapshotSchedulePolicyRetentionPolicy();

    @InputImport(name="maxRetentionDays", required=true)
      private final Integer maxRetentionDays;

    public Integer getMaxRetentionDays() {
        return this.maxRetentionDays;
    }

    @InputImport(name="onSourceDiskDelete", required=true)
      private final String onSourceDiskDelete;

    public String getOnSourceDiskDelete() {
        return this.onSourceDiskDelete;
    }

    public GetResourcePolicySnapshotSchedulePolicyRetentionPolicy(
        Integer maxRetentionDays,
        String onSourceDiskDelete) {
        this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays, "expected parameter 'maxRetentionDays' to be non-null");
        this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete, "expected parameter 'onSourceDiskDelete' to be non-null");
    }

    private GetResourcePolicySnapshotSchedulePolicyRetentionPolicy() {
        this.maxRetentionDays = null;
        this.onSourceDiskDelete = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRetentionDays;
        private String onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder maxRetentionDays(Integer maxRetentionDays) {
            this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays);
            return this;
        }

        public Builder onSourceDiskDelete(String onSourceDiskDelete) {
            this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete);
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicyRetentionPolicy build() {
            return new GetResourcePolicySnapshotSchedulePolicyRetentionPolicy(maxRetentionDays, onSourceDiskDelete);
        }
    }
}
