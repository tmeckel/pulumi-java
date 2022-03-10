// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobColumnSelectorArgs;
import io.pulumi.awsnative.databrew.inputs.JobStatisticsConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobColumnStatisticsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobColumnStatisticsConfigurationArgs Empty = new JobColumnStatisticsConfigurationArgs();

    @InputImport(name="selectors")
      private final @Nullable Input<List<JobColumnSelectorArgs>> selectors;

    public Input<List<JobColumnSelectorArgs>> getSelectors() {
        return this.selectors == null ? Input.empty() : this.selectors;
    }

    @InputImport(name="statistics", required=true)
      private final Input<JobStatisticsConfigurationArgs> statistics;

    public Input<JobStatisticsConfigurationArgs> getStatistics() {
        return this.statistics;
    }

    public JobColumnStatisticsConfigurationArgs(
        @Nullable Input<List<JobColumnSelectorArgs>> selectors,
        Input<JobStatisticsConfigurationArgs> statistics) {
        this.selectors = selectors;
        this.statistics = Objects.requireNonNull(statistics, "expected parameter 'statistics' to be non-null");
    }

    private JobColumnStatisticsConfigurationArgs() {
        this.selectors = Input.empty();
        this.statistics = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobColumnStatisticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<JobColumnSelectorArgs>> selectors;
        private Input<JobStatisticsConfigurationArgs> statistics;

        public Builder() {
    	      // Empty
        }

        public Builder(JobColumnStatisticsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
    	      this.statistics = defaults.statistics;
        }

        public Builder selectors(@Nullable Input<List<JobColumnSelectorArgs>> selectors) {
            this.selectors = selectors;
            return this;
        }

        public Builder selectors(@Nullable List<JobColumnSelectorArgs> selectors) {
            this.selectors = Input.ofNullable(selectors);
            return this;
        }

        public Builder statistics(Input<JobStatisticsConfigurationArgs> statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }

        public Builder statistics(JobStatisticsConfigurationArgs statistics) {
            this.statistics = Input.of(Objects.requireNonNull(statistics));
            return this;
        }
        public JobColumnStatisticsConfigurationArgs build() {
            return new JobColumnStatisticsConfigurationArgs(selectors, statistics);
        }
    }
}
