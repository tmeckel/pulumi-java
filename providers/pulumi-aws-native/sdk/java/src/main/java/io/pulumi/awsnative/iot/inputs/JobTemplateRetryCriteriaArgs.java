// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.JobTemplateJobRetryFailureType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how many times a failure type should be retried.
 * 
 */
public final class JobTemplateRetryCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateRetryCriteriaArgs Empty = new JobTemplateRetryCriteriaArgs();

    @Import(name="failureType")
      private final @Nullable Output<JobTemplateJobRetryFailureType> failureType;

    public Output<JobTemplateJobRetryFailureType> getFailureType() {
        return this.failureType == null ? Codegen.empty() : this.failureType;
    }

    @Import(name="numberOfRetries")
      private final @Nullable Output<Integer> numberOfRetries;

    public Output<Integer> getNumberOfRetries() {
        return this.numberOfRetries == null ? Codegen.empty() : this.numberOfRetries;
    }

    public JobTemplateRetryCriteriaArgs(
        @Nullable Output<JobTemplateJobRetryFailureType> failureType,
        @Nullable Output<Integer> numberOfRetries) {
        this.failureType = failureType;
        this.numberOfRetries = numberOfRetries;
    }

    private JobTemplateRetryCriteriaArgs() {
        this.failureType = Codegen.empty();
        this.numberOfRetries = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateRetryCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobTemplateJobRetryFailureType> failureType;
        private @Nullable Output<Integer> numberOfRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateRetryCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureType = defaults.failureType;
    	      this.numberOfRetries = defaults.numberOfRetries;
        }

        public Builder failureType(@Nullable Output<JobTemplateJobRetryFailureType> failureType) {
            this.failureType = failureType;
            return this;
        }
        public Builder failureType(@Nullable JobTemplateJobRetryFailureType failureType) {
            this.failureType = Codegen.ofNullable(failureType);
            return this;
        }
        public Builder numberOfRetries(@Nullable Output<Integer> numberOfRetries) {
            this.numberOfRetries = numberOfRetries;
            return this;
        }
        public Builder numberOfRetries(@Nullable Integer numberOfRetries) {
            this.numberOfRetries = Codegen.ofNullable(numberOfRetries);
            return this;
        }        public JobTemplateRetryCriteriaArgs build() {
            return new JobTemplateRetryCriteriaArgs(failureType, numberOfRetries);
        }
    }
}
