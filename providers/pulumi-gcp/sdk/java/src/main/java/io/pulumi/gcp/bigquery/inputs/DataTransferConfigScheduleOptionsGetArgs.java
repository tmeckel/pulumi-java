// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataTransferConfigScheduleOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigScheduleOptionsGetArgs Empty = new DataTransferConfigScheduleOptionsGetArgs();

    /**
     * If true, automatic scheduling of data transfer runs for this
     * configuration will be disabled. The runs can be started on ad-hoc
     * basis using transferConfigs.startManualRuns API. When automatic
     * scheduling is disabled, the TransferConfig.schedule field will
     * be ignored.
     * 
     */
    @Import(name="disableAutoScheduling")
      private final @Nullable Output<Boolean> disableAutoScheduling;

    public Output<Boolean> getDisableAutoScheduling() {
        return this.disableAutoScheduling == null ? Codegen.empty() : this.disableAutoScheduling;
    }

    /**
     * Defines time to stop scheduling transfer runs. A transfer run cannot be
     * scheduled at or after the end time. The end time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * Specifies time to start scheduling transfer runs. The first run will be
     * scheduled at or after the start time according to a recurrence pattern
     * defined in the schedule string. The start time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public DataTransferConfigScheduleOptionsGetArgs(
        @Nullable Output<Boolean> disableAutoScheduling,
        @Nullable Output<String> endTime,
        @Nullable Output<String> startTime) {
        this.disableAutoScheduling = disableAutoScheduling;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    private DataTransferConfigScheduleOptionsGetArgs() {
        this.disableAutoScheduling = Codegen.empty();
        this.endTime = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigScheduleOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableAutoScheduling;
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigScheduleOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutoScheduling = defaults.disableAutoScheduling;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder disableAutoScheduling(@Nullable Output<Boolean> disableAutoScheduling) {
            this.disableAutoScheduling = disableAutoScheduling;
            return this;
        }
        public Builder disableAutoScheduling(@Nullable Boolean disableAutoScheduling) {
            this.disableAutoScheduling = Codegen.ofNullable(disableAutoScheduling);
            return this;
        }
        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public DataTransferConfigScheduleOptionsGetArgs build() {
            return new DataTransferConfigScheduleOptionsGetArgs(disableAutoScheduling, endTime, startTime);
        }
    }
}
