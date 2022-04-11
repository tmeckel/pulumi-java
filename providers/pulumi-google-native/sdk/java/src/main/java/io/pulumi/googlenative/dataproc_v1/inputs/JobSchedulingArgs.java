// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Job scheduling options.
 * 
 */
public final class JobSchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSchedulingArgs Empty = new JobSchedulingArgs();

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    @Import(name="maxFailuresPerHour")
      private final @Nullable Output<Integer> maxFailuresPerHour;

    public Output<Integer> getMaxFailuresPerHour() {
        return this.maxFailuresPerHour == null ? Codegen.empty() : this.maxFailuresPerHour;
    }

    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    @Import(name="maxFailuresTotal")
      private final @Nullable Output<Integer> maxFailuresTotal;

    public Output<Integer> getMaxFailuresTotal() {
        return this.maxFailuresTotal == null ? Codegen.empty() : this.maxFailuresTotal;
    }

    public JobSchedulingArgs(
        @Nullable Output<Integer> maxFailuresPerHour,
        @Nullable Output<Integer> maxFailuresTotal) {
        this.maxFailuresPerHour = maxFailuresPerHour;
        this.maxFailuresTotal = maxFailuresTotal;
    }

    private JobSchedulingArgs() {
        this.maxFailuresPerHour = Codegen.empty();
        this.maxFailuresTotal = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxFailuresPerHour;
        private @Nullable Output<Integer> maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder maxFailuresPerHour(@Nullable Output<Integer> maxFailuresPerHour) {
            this.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }
        public Builder maxFailuresPerHour(@Nullable Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Codegen.ofNullable(maxFailuresPerHour);
            return this;
        }
        public Builder maxFailuresTotal(@Nullable Output<Integer> maxFailuresTotal) {
            this.maxFailuresTotal = maxFailuresTotal;
            return this;
        }
        public Builder maxFailuresTotal(@Nullable Integer maxFailuresTotal) {
            this.maxFailuresTotal = Codegen.ofNullable(maxFailuresTotal);
            return this;
        }        public JobSchedulingArgs build() {
            return new JobSchedulingArgs(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
