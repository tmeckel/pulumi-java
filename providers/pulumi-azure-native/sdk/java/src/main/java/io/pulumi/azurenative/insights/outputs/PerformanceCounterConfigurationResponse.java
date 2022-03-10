// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PerformanceCounterConfigurationResponse {
    private final @Nullable String instance;
    private final String name;
    private final String samplingPeriod;

    @OutputCustomType.Constructor
    private PerformanceCounterConfigurationResponse(
        @OutputCustomType.Parameter("instance") @Nullable String instance,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("samplingPeriod") String samplingPeriod) {
        this.instance = instance;
        this.name = name;
        this.samplingPeriod = samplingPeriod;
    }

    public Optional<String> getInstance() {
        return Optional.ofNullable(this.instance);
    }
    public String getName() {
        return this.name;
    }
    public String getSamplingPeriod() {
        return this.samplingPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceCounterConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instance;
        private String name;
        private String samplingPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceCounterConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.samplingPeriod = defaults.samplingPeriod;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder samplingPeriod(String samplingPeriod) {
            this.samplingPeriod = Objects.requireNonNull(samplingPeriod);
            return this;
        }
        public PerformanceCounterConfigurationResponse build() {
            return new PerformanceCounterConfigurationResponse(instance, name, samplingPeriod);
        }
    }
}
