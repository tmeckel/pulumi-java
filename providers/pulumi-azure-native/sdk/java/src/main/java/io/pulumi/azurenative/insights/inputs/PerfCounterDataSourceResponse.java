// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of which performance counters will be collected and how they will be collected by this data collection rule.
 * Collected from both Windows and Linux machines where the counter is present.
 * 
 */
public final class PerfCounterDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final PerfCounterDataSourceResponse Empty = new PerfCounterDataSourceResponse();

    /**
     * A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command 'typeperf'.
     * 
     */
    @InputImport(name="counterSpecifiers")
      private final @Nullable List<String> counterSpecifiers;

    public List<String> getCounterSpecifiers() {
        return this.counterSpecifiers == null ? List.of() : this.counterSpecifiers;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The number of seconds between consecutive counter measurements (samples).
     * 
     */
    @InputImport(name="samplingFrequencyInSeconds")
      private final @Nullable Integer samplingFrequencyInSeconds;

    public Optional<Integer> getSamplingFrequencyInSeconds() {
        return this.samplingFrequencyInSeconds == null ? Optional.empty() : Optional.ofNullable(this.samplingFrequencyInSeconds);
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @InputImport(name="streams")
      private final @Nullable List<String> streams;

    public List<String> getStreams() {
        return this.streams == null ? List.of() : this.streams;
    }

    public PerfCounterDataSourceResponse(
        @Nullable List<String> counterSpecifiers,
        @Nullable String name,
        @Nullable Integer samplingFrequencyInSeconds,
        @Nullable List<String> streams) {
        this.counterSpecifiers = counterSpecifiers;
        this.name = name;
        this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
        this.streams = streams;
    }

    private PerfCounterDataSourceResponse() {
        this.counterSpecifiers = List.of();
        this.name = null;
        this.samplingFrequencyInSeconds = null;
        this.streams = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerfCounterDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> counterSpecifiers;
        private @Nullable String name;
        private @Nullable Integer samplingFrequencyInSeconds;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(PerfCounterDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSpecifiers = defaults.counterSpecifiers;
    	      this.name = defaults.name;
    	      this.samplingFrequencyInSeconds = defaults.samplingFrequencyInSeconds;
    	      this.streams = defaults.streams;
        }

        public Builder counterSpecifiers(@Nullable List<String> counterSpecifiers) {
            this.counterSpecifiers = counterSpecifiers;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder samplingFrequencyInSeconds(@Nullable Integer samplingFrequencyInSeconds) {
            this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
            return this;
        }

        public Builder streams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }
        public PerfCounterDataSourceResponse build() {
            return new PerfCounterDataSourceResponse(counterSpecifiers, name, samplingFrequencyInSeconds, streams);
        }
    }
}
