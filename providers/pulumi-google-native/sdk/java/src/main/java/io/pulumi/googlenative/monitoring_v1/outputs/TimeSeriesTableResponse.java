// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.TableDataSetResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TimeSeriesTableResponse {
    /**
     * The data displayed in this table.
     * 
     */
    private final List<TableDataSetResponse> dataSets;

    @OutputCustomType.Constructor({"dataSets"})
    private TimeSeriesTableResponse(List<TableDataSetResponse> dataSets) {
        this.dataSets = Objects.requireNonNull(dataSets);
    }

    /**
     * The data displayed in this table.
     * 
     */
    public List<TableDataSetResponse> getDataSets() {
        return this.dataSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TableDataSetResponse> dataSets;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSets = defaults.dataSets;
        }

        public Builder setDataSets(List<TableDataSetResponse> dataSets) {
            this.dataSets = Objects.requireNonNull(dataSets);
            return this;
        }

        public TimeSeriesTableResponse build() {
            return new TimeSeriesTableResponse(dataSets);
        }
    }
}
