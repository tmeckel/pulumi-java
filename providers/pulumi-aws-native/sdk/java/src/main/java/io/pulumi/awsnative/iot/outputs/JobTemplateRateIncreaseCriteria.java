// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobTemplateRateIncreaseCriteria {
    private final @Nullable Integer numberOfNotifiedThings;
    private final @Nullable Integer numberOfSucceededThings;

    @OutputCustomType.Constructor
    private JobTemplateRateIncreaseCriteria(
        @OutputCustomType.Parameter("numberOfNotifiedThings") @Nullable Integer numberOfNotifiedThings,
        @OutputCustomType.Parameter("numberOfSucceededThings") @Nullable Integer numberOfSucceededThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
        this.numberOfSucceededThings = numberOfSucceededThings;
    }

    public Optional<Integer> getNumberOfNotifiedThings() {
        return Optional.ofNullable(this.numberOfNotifiedThings);
    }
    public Optional<Integer> getNumberOfSucceededThings() {
        return Optional.ofNullable(this.numberOfSucceededThings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateRateIncreaseCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer numberOfNotifiedThings;
        private @Nullable Integer numberOfSucceededThings;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateRateIncreaseCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numberOfNotifiedThings = defaults.numberOfNotifiedThings;
    	      this.numberOfSucceededThings = defaults.numberOfSucceededThings;
        }

        public Builder numberOfNotifiedThings(@Nullable Integer numberOfNotifiedThings) {
            this.numberOfNotifiedThings = numberOfNotifiedThings;
            return this;
        }

        public Builder numberOfSucceededThings(@Nullable Integer numberOfSucceededThings) {
            this.numberOfSucceededThings = numberOfSucceededThings;
            return this;
        }
        public JobTemplateRateIncreaseCriteria build() {
            return new JobTemplateRateIncreaseCriteria(numberOfNotifiedThings, numberOfSucceededThings);
        }
    }
}
