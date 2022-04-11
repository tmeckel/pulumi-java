// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs();

    /**
     * Path to the top-level parent that contains the records.
     * 
     */
    @Import(name="recordRowPath", required=true)
      private final Output<String> recordRowPath;

    public Output<String> getRecordRowPath() {
        return this.recordRowPath;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs(Output<String> recordRowPath) {
        this.recordRowPath = Objects.requireNonNull(recordRowPath, "expected parameter 'recordRowPath' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs() {
        this.recordRowPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> recordRowPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordRowPath = defaults.recordRowPath;
        }

        public Builder recordRowPath(Output<String> recordRowPath) {
            this.recordRowPath = Objects.requireNonNull(recordRowPath);
            return this;
        }
        public Builder recordRowPath(String recordRowPath) {
            this.recordRowPath = Output.of(Objects.requireNonNull(recordRowPath));
            return this;
        }        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs(recordRowPath);
        }
    }
}
