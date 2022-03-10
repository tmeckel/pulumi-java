// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MLTransformParametersFindMatchesParameters {
    /**
     * The value that is selected when tuning your transform for a balance between accuracy and cost.
     * 
     */
    private final @Nullable Double accuracyCostTradeOff;
    /**
     * The value to switch on or off to force the output to match the provided labels from users.
     * 
     */
    private final @Nullable Boolean enforceProvidedLabels;
    /**
     * The value selected when tuning your transform for a balance between precision and recall.
     * 
     */
    private final @Nullable Double precisionRecallTradeOff;
    /**
     * The name of a column that uniquely identifies rows in the source table.
     * 
     */
    private final @Nullable String primaryKeyColumnName;

    @OutputCustomType.Constructor
    private MLTransformParametersFindMatchesParameters(
        @OutputCustomType.Parameter("accuracyCostTradeOff") @Nullable Double accuracyCostTradeOff,
        @OutputCustomType.Parameter("enforceProvidedLabels") @Nullable Boolean enforceProvidedLabels,
        @OutputCustomType.Parameter("precisionRecallTradeOff") @Nullable Double precisionRecallTradeOff,
        @OutputCustomType.Parameter("primaryKeyColumnName") @Nullable String primaryKeyColumnName) {
        this.accuracyCostTradeOff = accuracyCostTradeOff;
        this.enforceProvidedLabels = enforceProvidedLabels;
        this.precisionRecallTradeOff = precisionRecallTradeOff;
        this.primaryKeyColumnName = primaryKeyColumnName;
    }

    /**
     * The value that is selected when tuning your transform for a balance between accuracy and cost.
     * 
    */
    public Optional<Double> getAccuracyCostTradeOff() {
        return Optional.ofNullable(this.accuracyCostTradeOff);
    }
    /**
     * The value to switch on or off to force the output to match the provided labels from users.
     * 
    */
    public Optional<Boolean> getEnforceProvidedLabels() {
        return Optional.ofNullable(this.enforceProvidedLabels);
    }
    /**
     * The value selected when tuning your transform for a balance between precision and recall.
     * 
    */
    public Optional<Double> getPrecisionRecallTradeOff() {
        return Optional.ofNullable(this.precisionRecallTradeOff);
    }
    /**
     * The name of a column that uniquely identifies rows in the source table.
     * 
    */
    public Optional<String> getPrimaryKeyColumnName() {
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
        }
        public MLTransformParametersFindMatchesParameters build() {
            return new MLTransformParametersFindMatchesParameters(accuracyCostTradeOff, enforceProvidedLabels, precisionRecallTradeOff, primaryKeyColumnName);
        }
    }
}
