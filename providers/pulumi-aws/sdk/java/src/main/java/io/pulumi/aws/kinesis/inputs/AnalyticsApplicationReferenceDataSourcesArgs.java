// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesS3Args;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesArgs Empty = new AnalyticsApplicationReferenceDataSourcesArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The S3 configuration for the reference data source. See S3 Reference below for more details.
     * 
     */
    @InputImport(name="s3", required=true)
      private final Input<AnalyticsApplicationReferenceDataSourcesS3Args> s3;

    public Input<AnalyticsApplicationReferenceDataSourcesS3Args> getS3() {
        return this.s3;
    }

    /**
     * The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    @InputImport(name="schema", required=true)
      private final Input<AnalyticsApplicationReferenceDataSourcesSchemaArgs> schema;

    public Input<AnalyticsApplicationReferenceDataSourcesSchemaArgs> getSchema() {
        return this.schema;
    }

    /**
     * The in-application Table Name.
     * 
     */
    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public AnalyticsApplicationReferenceDataSourcesArgs(
        @Nullable Input<String> id,
        Input<AnalyticsApplicationReferenceDataSourcesS3Args> s3,
        Input<AnalyticsApplicationReferenceDataSourcesSchemaArgs> schema,
        Input<String> tableName) {
        this.id = id;
        this.s3 = Objects.requireNonNull(s3, "expected parameter 's3' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesArgs() {
        this.id = Input.empty();
        this.s3 = Input.empty();
        this.schema = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private Input<AnalyticsApplicationReferenceDataSourcesS3Args> s3;
        private Input<AnalyticsApplicationReferenceDataSourcesSchemaArgs> schema;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.s3 = defaults.s3;
    	      this.schema = defaults.schema;
    	      this.tableName = defaults.tableName;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder s3(Input<AnalyticsApplicationReferenceDataSourcesS3Args> s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }

        public Builder s3(AnalyticsApplicationReferenceDataSourcesS3Args s3) {
            this.s3 = Input.of(Objects.requireNonNull(s3));
            return this;
        }

        public Builder schema(Input<AnalyticsApplicationReferenceDataSourcesSchemaArgs> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder schema(AnalyticsApplicationReferenceDataSourcesSchemaArgs schema) {
            this.schema = Input.of(Objects.requireNonNull(schema));
            return this;
        }

        public Builder tableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesArgs(id, s3, schema, tableName);
        }
    }
}
