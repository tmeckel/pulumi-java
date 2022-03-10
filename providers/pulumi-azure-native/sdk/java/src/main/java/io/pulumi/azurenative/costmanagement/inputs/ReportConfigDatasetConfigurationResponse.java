// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of dataset in the report.
 * 
 */
public final class ReportConfigDatasetConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportConfigDatasetConfigurationResponse Empty = new ReportConfigDatasetConfigurationResponse();

    /**
     * Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
     * 
     */
    @InputImport(name="columns")
      private final @Nullable List<String> columns;

    public List<String> getColumns() {
        return this.columns == null ? List.of() : this.columns;
    }

    public ReportConfigDatasetConfigurationResponse(@Nullable List<String> columns) {
        this.columns = columns;
    }

    private ReportConfigDatasetConfigurationResponse() {
        this.columns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigDatasetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigDatasetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder columns(@Nullable List<String> columns) {
            this.columns = columns;
            return this;
        }
        public ReportConfigDatasetConfigurationResponse build() {
            return new ReportConfigDatasetConfigurationResponse(columns);
        }
    }
}
