// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetScheduleArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetTriggeringDatasetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetTriggerArgs Empty = new DatasetTriggerArgs();

    @InputImport(name="schedule")
      private final @Nullable Input<DatasetScheduleArgs> schedule;

    public Input<DatasetScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    @InputImport(name="triggeringDataset")
      private final @Nullable Input<DatasetTriggeringDatasetArgs> triggeringDataset;

    public Input<DatasetTriggeringDatasetArgs> getTriggeringDataset() {
        return this.triggeringDataset == null ? Input.empty() : this.triggeringDataset;
    }

    public DatasetTriggerArgs(
        @Nullable Input<DatasetScheduleArgs> schedule,
        @Nullable Input<DatasetTriggeringDatasetArgs> triggeringDataset) {
        this.schedule = schedule;
        this.triggeringDataset = triggeringDataset;
    }

    private DatasetTriggerArgs() {
        this.schedule = Input.empty();
        this.triggeringDataset = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetScheduleArgs> schedule;
        private @Nullable Input<DatasetTriggeringDatasetArgs> triggeringDataset;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.triggeringDataset = defaults.triggeringDataset;
        }

        public Builder schedule(@Nullable Input<DatasetScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable DatasetScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder triggeringDataset(@Nullable Input<DatasetTriggeringDatasetArgs> triggeringDataset) {
            this.triggeringDataset = triggeringDataset;
            return this;
        }

        public Builder triggeringDataset(@Nullable DatasetTriggeringDatasetArgs triggeringDataset) {
            this.triggeringDataset = Input.ofNullable(triggeringDataset);
            return this;
        }
        public DatasetTriggerArgs build() {
            return new DatasetTriggerArgs(schedule, triggeringDataset);
        }
    }
}
