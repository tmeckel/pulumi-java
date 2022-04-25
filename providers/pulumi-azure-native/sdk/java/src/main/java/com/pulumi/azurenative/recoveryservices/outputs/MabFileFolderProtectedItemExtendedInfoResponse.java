// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MabFileFolderProtectedItemExtendedInfoResponse {
    /**
     * @return Last time when the agent data synced to service.
     * 
     */
    private final @Nullable String lastRefreshedAt;
    /**
     * @return The oldest backup copy available.
     * 
     */
    private final @Nullable String oldestRecoveryPoint;
    /**
     * @return Number of backup copies associated with the backup item.
     * 
     */
    private final @Nullable Integer recoveryPointCount;

    @CustomType.Constructor
    private MabFileFolderProtectedItemExtendedInfoResponse(
        @CustomType.Parameter("lastRefreshedAt") @Nullable String lastRefreshedAt,
        @CustomType.Parameter("oldestRecoveryPoint") @Nullable String oldestRecoveryPoint,
        @CustomType.Parameter("recoveryPointCount") @Nullable Integer recoveryPointCount) {
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.recoveryPointCount = recoveryPointCount;
    }

    /**
     * @return Last time when the agent data synced to service.
     * 
     */
    public Optional<String> lastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }
    /**
     * @return The oldest backup copy available.
     * 
     */
    public Optional<String> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }
    /**
     * @return Number of backup copies associated with the backup item.
     * 
     */
    public Optional<Integer> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabFileFolderProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastRefreshedAt;
        private @Nullable String oldestRecoveryPoint;
        private @Nullable Integer recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }
        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }        public MabFileFolderProtectedItemExtendedInfoResponse build() {
            return new MabFileFolderProtectedItemExtendedInfoResponse(lastRefreshedAt, oldestRecoveryPoint, recoveryPointCount);
        }
    }
}
