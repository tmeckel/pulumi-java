// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.outputs.TemplateColumnGroupSchema;
import com.pulumi.awsnative.quicksight.outputs.TemplateDataSetSchema;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateDataSetConfiguration {
    /**
     * @return &lt;p&gt;A structure containing the list of column group schemas.&lt;/p&gt;
     * 
     */
    private final @Nullable List<TemplateColumnGroupSchema> columnGroupSchemaList;
    private final @Nullable TemplateDataSetSchema dataSetSchema;
    /**
     * @return &lt;p&gt;Placeholder.&lt;/p&gt;
     * 
     */
    private final @Nullable String placeholder;

    @CustomType.Constructor
    private TemplateDataSetConfiguration(
        @CustomType.Parameter("columnGroupSchemaList") @Nullable List<TemplateColumnGroupSchema> columnGroupSchemaList,
        @CustomType.Parameter("dataSetSchema") @Nullable TemplateDataSetSchema dataSetSchema,
        @CustomType.Parameter("placeholder") @Nullable String placeholder) {
        this.columnGroupSchemaList = columnGroupSchemaList;
        this.dataSetSchema = dataSetSchema;
        this.placeholder = placeholder;
    }

    /**
     * @return &lt;p&gt;A structure containing the list of column group schemas.&lt;/p&gt;
     * 
     */
    public List<TemplateColumnGroupSchema> columnGroupSchemaList() {
        return this.columnGroupSchemaList == null ? List.of() : this.columnGroupSchemaList;
    }
    public Optional<TemplateDataSetSchema> dataSetSchema() {
        return Optional.ofNullable(this.dataSetSchema);
    }
    /**
     * @return &lt;p&gt;Placeholder.&lt;/p&gt;
     * 
     */
    public Optional<String> placeholder() {
        return Optional.ofNullable(this.placeholder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateDataSetConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TemplateColumnGroupSchema> columnGroupSchemaList;
        private @Nullable TemplateDataSetSchema dataSetSchema;
        private @Nullable String placeholder;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateDataSetConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnGroupSchemaList = defaults.columnGroupSchemaList;
    	      this.dataSetSchema = defaults.dataSetSchema;
    	      this.placeholder = defaults.placeholder;
        }

        public Builder columnGroupSchemaList(@Nullable List<TemplateColumnGroupSchema> columnGroupSchemaList) {
            this.columnGroupSchemaList = columnGroupSchemaList;
            return this;
        }
        public Builder columnGroupSchemaList(TemplateColumnGroupSchema... columnGroupSchemaList) {
            return columnGroupSchemaList(List.of(columnGroupSchemaList));
        }
        public Builder dataSetSchema(@Nullable TemplateDataSetSchema dataSetSchema) {
            this.dataSetSchema = dataSetSchema;
            return this;
        }
        public Builder placeholder(@Nullable String placeholder) {
            this.placeholder = placeholder;
            return this;
        }        public TemplateDataSetConfiguration build() {
            return new TemplateDataSetConfiguration(columnGroupSchemaList, dataSetSchema, placeholder);
        }
    }
}
