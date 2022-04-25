// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MLTransformParametersFindMatchesParameters {
    /**
     * @return The value that is selected when tuning your transform for a balance between accuracy and cost.
     * 
     */
    private final @Nullable Double accuracyCostTradeOff;
    /**
     * @return The value to switch on or off to force the output to match the provided labels from users.
     * 
     */
    private final @Nullable Boolean enforceProvidedLabels;
    /**
     * @return The value selected when tuning your transform for a balance between precision and recall.
     * 
     */
    private final @Nullable Double precisionRecallTradeOff;
    /**
     * @return The name of a column that uniquely identifies rows in the source table.
     * 
     */
    private final @Nullable String primaryKeyColumnName;

    @CustomType.Constructor
    private MLTransformParametersFindMatchesParameters(
        @CustomType.Parameter("accuracyCostTradeOff") @Nullable Double accuracyCostTradeOff,
        @CustomType.Parameter("enforceProvidedLabels") @Nullable Boolean enforceProvidedLabels,
        @CustomType.Parameter("precisionRecallTradeOff") @Nullable Double precisionRecallTradeOff,
        @CustomType.Parameter("primaryKeyColumnName") @Nullable String primaryKeyColumnName) {
        this.accuracyCostTradeOff = accuracyCostTradeOff;
        this.enforceProvidedLabels = enforceProvidedLabels;
        this.precisionRecallTradeOff = precisionRecallTradeOff;
        this.primaryKeyColumnName = primaryKeyColumnName;
    }

    /**
     * @return The value that is selected when tuning your transform for a balance between accuracy and cost.
     * 
     */
    public Optional<Double> accuracyCostTradeOff() {
        return Optional.ofNullable(this.accuracyCostTradeOff);
    }
    /**
     * @return The value to switch on or off to force the output to match the provided labels from users.
     * 
     */
    public Optional<Boolean> enforceProvidedLabels() {
        return Optional.ofNullable(this.enforceProvidedLabels);
    }
    /**
     * @return The value selected when tuning your transform for a balance between precision and recall.
     * 
     */
    public Optional<Double> precisionRecallTradeOff() {
        return Optional.ofNullable(this.precisionRecallTradeOff);
    }
    /**
     * @return The name of a column that uniquely identifies rows in the source table.
     * 
     */
    public Optional<String> primaryKeyColumnName() {
        return Optional.ofNullable(this.primaryKeyColumnName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformParametersFindMatchesParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double accuracyCostTradeOff;
        private @Nullable Boolean enforceProvidedLabels;
        private @Nullable Double precisionRecallTradeOff;
        private @Nullable String primaryKeyColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformParametersFindMatchesParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accuracyCostTradeOff = defaults.accuracyCostTradeOff;
    	      this.enforceProvidedLabels = defaults.enforceProvidedLabels;
    	      this.precisionRecallTradeOff = defaults.precisionRecallTradeOff;
    	      this.primaryKeyColumnName = defaults.primaryKeyColumnName;
        }

        public Builder accuracyCostTradeOff(@Nullable Double accuracyCostTradeOff) {
            this.accuracyCostTradeOff = accuracyCostTradeOff;
            return this;
        }
        public Builder enforceProvidedLabels(@Nullable Boolean enforceProvidedLabels) {
            this.enforceProvidedLabels = enforceProvidedLabels;
            return this;
        }
        public Builder precisionRecallTradeOff(@Nullable Double precisionRecallTradeOff) {
            this.precisionRecallTradeOff = precisionRecallTradeOff;
            return this;
        }
        public Builder primaryKeyColumnName(@Nullable String primaryKeyColumnName) {
            this.primaryKeyColumnName = primaryKeyColumnName;
            return this;
        }        public MLTransformParametersFindMatchesParameters build() {
            return new MLTransformParametersFindMatchesParameters(accuracyCostTradeOff, enforceProvidedLabels, precisionRecallTradeOff, primaryKeyColumnName);
        }
    }
}
