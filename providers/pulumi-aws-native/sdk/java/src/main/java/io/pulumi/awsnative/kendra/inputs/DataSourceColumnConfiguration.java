// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceColumnConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceColumnConfiguration Empty = new DataSourceColumnConfiguration();

    @InputImport(name="changeDetectingColumns", required=true)
      private final List<String> changeDetectingColumns;

    public List<String> getChangeDetectingColumns() {
        return this.changeDetectingColumns;
    }

    @InputImport(name="documentDataColumnName", required=true)
      private final String documentDataColumnName;

    public String getDocumentDataColumnName() {
        return this.documentDataColumnName;
    }

    @InputImport(name="documentIdColumnName", required=true)
      private final String documentIdColumnName;

    public String getDocumentIdColumnName() {
        return this.documentIdColumnName;
    }

    @InputImport(name="documentTitleColumnName")
      private final @Nullable String documentTitleColumnName;

    public Optional<String> getDocumentTitleColumnName() {
        return this.documentTitleColumnName == null ? Optional.empty() : Optional.ofNullable(this.documentTitleColumnName);
    }

    @InputImport(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public DataSourceColumnConfiguration(
        List<String> changeDetectingColumns,
        String documentDataColumnName,
        String documentIdColumnName,
        @Nullable String documentTitleColumnName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.changeDetectingColumns = Objects.requireNonNull(changeDetectingColumns, "expected parameter 'changeDetectingColumns' to be non-null");
        this.documentDataColumnName = Objects.requireNonNull(documentDataColumnName, "expected parameter 'documentDataColumnName' to be non-null");
        this.documentIdColumnName = Objects.requireNonNull(documentIdColumnName, "expected parameter 'documentIdColumnName' to be non-null");
        this.documentTitleColumnName = documentTitleColumnName;
        this.fieldMappings = fieldMappings;
    }

    private DataSourceColumnConfiguration() {
        this.changeDetectingColumns = List.of();
        this.documentDataColumnName = null;
        this.documentIdColumnName = null;
        this.documentTitleColumnName = null;
        this.fieldMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceColumnConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> changeDetectingColumns;
        private String documentDataColumnName;
        private String documentIdColumnName;
        private @Nullable String documentTitleColumnName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceColumnConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeDetectingColumns = defaults.changeDetectingColumns;
    	      this.documentDataColumnName = defaults.documentDataColumnName;
    	      this.documentIdColumnName = defaults.documentIdColumnName;
    	      this.documentTitleColumnName = defaults.documentTitleColumnName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder changeDetectingColumns(List<String> changeDetectingColumns) {
            this.changeDetectingColumns = Objects.requireNonNull(changeDetectingColumns);
            return this;
        }

        public Builder documentDataColumnName(String documentDataColumnName) {
            this.documentDataColumnName = Objects.requireNonNull(documentDataColumnName);
            return this;
        }

        public Builder documentIdColumnName(String documentIdColumnName) {
            this.documentIdColumnName = Objects.requireNonNull(documentIdColumnName);
            return this;
        }

        public Builder documentTitleColumnName(@Nullable String documentTitleColumnName) {
            this.documentTitleColumnName = documentTitleColumnName;
            return this;
        }

        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public DataSourceColumnConfiguration build() {
            return new DataSourceColumnConfiguration(changeDetectingColumns, documentDataColumnName, documentIdColumnName, documentTitleColumnName, fieldMappings);
        }
    }
}
