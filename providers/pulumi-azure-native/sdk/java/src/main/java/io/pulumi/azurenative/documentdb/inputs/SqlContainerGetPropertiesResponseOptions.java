// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.AutoscaleSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlContainerGetPropertiesResponseOptions extends io.pulumi.resources.InvokeArgs {

    public static final SqlContainerGetPropertiesResponseOptions Empty = new SqlContainerGetPropertiesResponseOptions();

    /**
     * Specifies the Autoscale settings.
     * 
     */
    @InputImport(name="autoscaleSettings")
      private final @Nullable AutoscaleSettingsResponse autoscaleSettings;

    public Optional<AutoscaleSettingsResponse> getAutoscaleSettings() {
        return this.autoscaleSettings == null ? Optional.empty() : Optional.ofNullable(this.autoscaleSettings);
    }

    /**
     * Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
     */
    @InputImport(name="throughput")
      private final @Nullable Integer throughput;

    public Optional<Integer> getThroughput() {
        return this.throughput == null ? Optional.empty() : Optional.ofNullable(this.throughput);
    }

    public SqlContainerGetPropertiesResponseOptions(
        @Nullable AutoscaleSettingsResponse autoscaleSettings,
        @Nullable Integer throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    private SqlContainerGetPropertiesResponseOptions() {
        this.autoscaleSettings = null;
        this.throughput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleSettingsResponse autoscaleSettings;
        private @Nullable Integer throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerGetPropertiesResponseOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder autoscaleSettings(@Nullable AutoscaleSettingsResponse autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }

        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public SqlContainerGetPropertiesResponseOptions build() {
            return new SqlContainerGetPropertiesResponseOptions(autoscaleSettings, throughput);
        }
    }
}
