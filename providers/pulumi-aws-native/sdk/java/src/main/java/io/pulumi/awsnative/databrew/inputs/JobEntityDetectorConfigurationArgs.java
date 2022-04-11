// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobAllowedStatisticsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobEntityDetectorConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobEntityDetectorConfigurationArgs Empty = new JobEntityDetectorConfigurationArgs();

    @Import(name="allowedStatistics")
      private final @Nullable Output<JobAllowedStatisticsArgs> allowedStatistics;

    public Output<JobAllowedStatisticsArgs> getAllowedStatistics() {
        return this.allowedStatistics == null ? Codegen.empty() : this.allowedStatistics;
    }

    @Import(name="entityTypes", required=true)
      private final Output<List<String>> entityTypes;

    public Output<List<String>> getEntityTypes() {
        return this.entityTypes;
    }

    public JobEntityDetectorConfigurationArgs(
        @Nullable Output<JobAllowedStatisticsArgs> allowedStatistics,
        Output<List<String>> entityTypes) {
        this.allowedStatistics = allowedStatistics;
        this.entityTypes = Objects.requireNonNull(entityTypes, "expected parameter 'entityTypes' to be non-null");
    }

    private JobEntityDetectorConfigurationArgs() {
        this.allowedStatistics = Codegen.empty();
        this.entityTypes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobEntityDetectorConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobAllowedStatisticsArgs> allowedStatistics;
        private Output<List<String>> entityTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobEntityDetectorConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedStatistics = defaults.allowedStatistics;
    	      this.entityTypes = defaults.entityTypes;
        }

        public Builder allowedStatistics(@Nullable Output<JobAllowedStatisticsArgs> allowedStatistics) {
            this.allowedStatistics = allowedStatistics;
            return this;
        }
        public Builder allowedStatistics(@Nullable JobAllowedStatisticsArgs allowedStatistics) {
            this.allowedStatistics = Codegen.ofNullable(allowedStatistics);
            return this;
        }
        public Builder entityTypes(Output<List<String>> entityTypes) {
            this.entityTypes = Objects.requireNonNull(entityTypes);
            return this;
        }
        public Builder entityTypes(List<String> entityTypes) {
            this.entityTypes = Output.of(Objects.requireNonNull(entityTypes));
            return this;
        }
        public Builder entityTypes(String... entityTypes) {
            return entityTypes(List.of(entityTypes));
        }        public JobEntityDetectorConfigurationArgs build() {
            return new JobEntityDetectorConfigurationArgs(allowedStatistics, entityTypes);
        }
    }
}
