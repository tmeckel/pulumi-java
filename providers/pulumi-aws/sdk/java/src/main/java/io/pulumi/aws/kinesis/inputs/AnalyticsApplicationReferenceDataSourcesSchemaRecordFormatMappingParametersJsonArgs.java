// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs();

    /**
     * Path to the top-level parent that contains the records.
     * 
     */
    @InputImport(name="recordRowPath", required=true)
      private final Input<String> recordRowPath;

    public Input<String> getRecordRowPath() {
        return this.recordRowPath;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs(Input<String> recordRowPath) {
        this.recordRowPath = Objects.requireNonNull(recordRowPath, "expected parameter 'recordRowPath' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs() {
        this.recordRowPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> recordRowPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordRowPath = defaults.recordRowPath;
        }

        public Builder recordRowPath(Input<String> recordRowPath) {
            this.recordRowPath = Objects.requireNonNull(recordRowPath);
            return this;
        }

        public Builder recordRowPath(String recordRowPath) {
            this.recordRowPath = Input.of(Objects.requireNonNull(recordRowPath));
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs(recordRowPath);
        }
    }
}
