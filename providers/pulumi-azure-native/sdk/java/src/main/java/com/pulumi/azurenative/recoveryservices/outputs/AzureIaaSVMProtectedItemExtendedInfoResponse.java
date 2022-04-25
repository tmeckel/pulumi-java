// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureIaaSVMProtectedItemExtendedInfoResponse {
    /**
     * @return The oldest backup copy available for this backup item.
     * 
     */
    private final @Nullable String oldestRecoveryPoint;
    /**
     * @return Specifies if backup policy associated with the backup item is inconsistent.
     * 
     */
    private final @Nullable Boolean policyInconsistent;
    /**
     * @return Number of backup copies available for this backup item.
     * 
     */
    private final @Nullable Integer recoveryPointCount;

    @CustomType.Constructor
    private AzureIaaSVMProtectedItemExtendedInfoResponse(
        @CustomType.Parameter("oldestRecoveryPoint") @Nullable String oldestRecoveryPoint,
        @CustomType.Parameter("policyInconsistent") @Nullable Boolean policyInconsistent,
        @CustomType.Parameter("recoveryPointCount") @Nullable Integer recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyInconsistent = policyInconsistent;
        this.recoveryPointCount = recoveryPointCount;
    }

    /**
     * @return The oldest backup copy available for this backup item.
     * 
     */
    public Optional<String> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }
    /**
     * @return Specifies if backup policy associated with the backup item is inconsistent.
     * 
     */
    public Optional<Boolean> policyInconsistent() {
        return Optional.ofNullable(this.policyInconsistent);
    }
    /**
     * @return Number of backup copies available for this backup item.
     * 
     */
    public Optional<Integer> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oldestRecoveryPoint;
        private @Nullable Boolean policyInconsistent;
        private @Nullable Integer recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyInconsistent = defaults.policyInconsistent;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder policyInconsistent(@Nullable Boolean policyInconsistent) {
            this.policyInconsistent = policyInconsistent;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }        public AzureIaaSVMProtectedItemExtendedInfoResponse build() {
            return new AzureIaaSVMProtectedItemExtendedInfoResponse(oldestRecoveryPoint, policyInconsistent, recoveryPointCount);
        }
    }
}
