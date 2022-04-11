// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the schedule you want your task to use for repeated executions.
 * 
 */
public final class TaskScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskScheduleArgs Empty = new TaskScheduleArgs();

    /**
     * A cron expression that specifies when AWS DataSync initiates a scheduled transfer from a source to a destination location
     * 
     */
    @Import(name="scheduleExpression", required=true)
      private final Output<String> scheduleExpression;

    public Output<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public TaskScheduleArgs(Output<String> scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private TaskScheduleArgs() {
        this.scheduleExpression = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder scheduleExpression(Output<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Output.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }        public TaskScheduleArgs build() {
            return new TaskScheduleArgs(scheduleExpression);
        }
    }
}
