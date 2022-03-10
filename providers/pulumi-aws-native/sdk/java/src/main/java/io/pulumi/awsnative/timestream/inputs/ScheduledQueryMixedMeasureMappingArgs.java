// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.enums.ScheduledQueryMixedMeasureMappingMeasureValueType;
import io.pulumi.awsnative.timestream.inputs.ScheduledQueryMultiMeasureAttributeMappingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MixedMeasureMappings are mappings that can be used to ingest data into a mixture of narrow and multi measures in the derived table.
 * 
 */
public final class ScheduledQueryMixedMeasureMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryMixedMeasureMappingArgs Empty = new ScheduledQueryMixedMeasureMappingArgs();

    @InputImport(name="measureName")
      private final @Nullable Input<String> measureName;

    public Input<String> getMeasureName() {
        return this.measureName == null ? Input.empty() : this.measureName;
    }

    @InputImport(name="measureValueType", required=true)
      private final Input<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType;

    public Input<ScheduledQueryMixedMeasureMappingMeasureValueType> getMeasureValueType() {
        return this.measureValueType;
    }

    @InputImport(name="multiMeasureAttributeMappings")
      private final @Nullable Input<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings;

    public Input<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> getMultiMeasureAttributeMappings() {
        return this.multiMeasureAttributeMappings == null ? Input.empty() : this.multiMeasureAttributeMappings;
    }

    @InputImport(name="sourceColumn")
      private final @Nullable Input<String> sourceColumn;

    public Input<String> getSourceColumn() {
        return this.sourceColumn == null ? Input.empty() : this.sourceColumn;
    }

    @InputImport(name="targetMeasureName")
      private final @Nullable Input<String> targetMeasureName;

    public Input<String> getTargetMeasureName() {
        return this.targetMeasureName == null ? Input.empty() : this.targetMeasureName;
    }

    public ScheduledQueryMixedMeasureMappingArgs(
        @Nullable Input<String> measureName,
        Input<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType,
        @Nullable Input<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings,
        @Nullable Input<String> sourceColumn,
        @Nullable Input<String> targetMeasureName) {
        this.measureName = measureName;
        this.measureValueType = Objects.requireNonNull(measureValueType, "expected parameter 'measureValueType' to be non-null");
        this.multiMeasureAttributeMappings = multiMeasureAttributeMappings;
        this.sourceColumn = sourceColumn;
        this.targetMeasureName = targetMeasureName;
    }

    private ScheduledQueryMixedMeasureMappingArgs() {
        this.measureName = Input.empty();
        this.measureValueType = Input.empty();
        this.multiMeasureAttributeMappings = Input.empty();
        this.sourceColumn = Input.empty();
        this.targetMeasureName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryMixedMeasureMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> measureName;
        private Input<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType;
        private @Nullable Input<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings;
        private @Nullable Input<String> sourceColumn;
        private @Nullable Input<String> targetMeasureName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryMixedMeasureMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.measureName = defaults.measureName;
    	      this.measureValueType = defaults.measureValueType;
    	      this.multiMeasureAttributeMappings = defaults.multiMeasureAttributeMappings;
    	      this.sourceColumn = defaults.sourceColumn;
    	      this.targetMeasureName = defaults.targetMeasureName;
        }

        public Builder measureName(@Nullable Input<String> measureName) {
            this.measureName = measureName;
            return this;
        }

        public Builder measureName(@Nullable String measureName) {
            this.measureName = Input.ofNullable(measureName);
            return this;
        }

        public Builder measureValueType(Input<ScheduledQueryMixedMeasureMappingMeasureValueType> measureValueType) {
            this.measureValueType = Objects.requireNonNull(measureValueType);
            return this;
        }

        public Builder measureValueType(ScheduledQueryMixedMeasureMappingMeasureValueType measureValueType) {
            this.measureValueType = Input.of(Objects.requireNonNull(measureValueType));
            return this;
        }

        public Builder multiMeasureAttributeMappings(@Nullable Input<List<ScheduledQueryMultiMeasureAttributeMappingArgs>> multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings = multiMeasureAttributeMappings;
            return this;
        }

        public Builder multiMeasureAttributeMappings(@Nullable List<ScheduledQueryMultiMeasureAttributeMappingArgs> multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings = Input.ofNullable(multiMeasureAttributeMappings);
            return this;
        }

        public Builder sourceColumn(@Nullable Input<String> sourceColumn) {
            this.sourceColumn = sourceColumn;
            return this;
        }

        public Builder sourceColumn(@Nullable String sourceColumn) {
            this.sourceColumn = Input.ofNullable(sourceColumn);
            return this;
        }

        public Builder targetMeasureName(@Nullable Input<String> targetMeasureName) {
            this.targetMeasureName = targetMeasureName;
            return this;
        }

        public Builder targetMeasureName(@Nullable String targetMeasureName) {
            this.targetMeasureName = Input.ofNullable(targetMeasureName);
            return this;
        }
        public ScheduledQueryMixedMeasureMappingArgs build() {
            return new ScheduledQueryMixedMeasureMappingArgs(measureName, measureValueType, multiMeasureAttributeMappings, sourceColumn, targetMeasureName);
        }
    }
}
