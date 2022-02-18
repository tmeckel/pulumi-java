// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TableDisplayOptionsResponse {
    /**
     * Optional. Columns to display in the table. Leave empty to display all available columns. Note: This field is for future features and is not currently used.
     * 
     */
    private final List<String> shownColumns;

    @OutputCustomType.Constructor({"shownColumns"})
    private TableDisplayOptionsResponse(List<String> shownColumns) {
        this.shownColumns = Objects.requireNonNull(shownColumns);
    }

    /**
     * Optional. Columns to display in the table. Leave empty to display all available columns. Note: This field is for future features and is not currently used.
     * 
     */
    public List<String> getShownColumns() {
        return this.shownColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableDisplayOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> shownColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(TableDisplayOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shownColumns = defaults.shownColumns;
        }

        public Builder setShownColumns(List<String> shownColumns) {
            this.shownColumns = Objects.requireNonNull(shownColumns);
            return this;
        }

        public TableDisplayOptionsResponse build() {
            return new TableDisplayOptionsResponse(shownColumns);
        }
    }
}
