// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PlanRuleCopyActionLifecycle {
    /**
     * @return Specifies the number of days after creation that a recovery point is moved to cold storage.
     * 
     */
    private final @Nullable Integer coldStorageAfter;
    /**
     * @return Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
     * 
     */
    private final @Nullable Integer deleteAfter;

    @CustomType.Constructor
    private PlanRuleCopyActionLifecycle(
        @CustomType.Parameter("coldStorageAfter") @Nullable Integer coldStorageAfter,
        @CustomType.Parameter("deleteAfter") @Nullable Integer deleteAfter) {
        this.coldStorageAfter = coldStorageAfter;
        this.deleteAfter = deleteAfter;
    }

    /**
     * @return Specifies the number of days after creation that a recovery point is moved to cold storage.
     * 
     */
    public Optional<Integer> coldStorageAfter() {
        return Optional.ofNullable(this.coldStorageAfter);
    }
    /**
     * @return Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
     * 
     */
    public Optional<Integer> deleteAfter() {
        return Optional.ofNullable(this.deleteAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanRuleCopyActionLifecycle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer coldStorageAfter;
        private @Nullable Integer deleteAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanRuleCopyActionLifecycle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coldStorageAfter = defaults.coldStorageAfter;
    	      this.deleteAfter = defaults.deleteAfter;
        }

        public Builder coldStorageAfter(@Nullable Integer coldStorageAfter) {
            this.coldStorageAfter = coldStorageAfter;
            return this;
        }
        public Builder deleteAfter(@Nullable Integer deleteAfter) {
            this.deleteAfter = deleteAfter;
            return this;
        }        public PlanRuleCopyActionLifecycle build() {
            return new PlanRuleCopyActionLifecycle(coldStorageAfter, deleteAfter);
        }
    }
}
