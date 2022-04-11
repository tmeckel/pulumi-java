// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs();

    @Import(name="referenceId")
      private final @Nullable Output<String> referenceId;

    public Output<String> getReferenceId() {
        return this.referenceId == null ? Codegen.empty() : this.referenceId;
    }

    /**
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
     * 
     */
    @Import(name="referenceSchema", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs> referenceSchema;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs> getReferenceSchema() {
        return this.referenceSchema;
    }

    /**
     * Identifies the S3 bucket and object that contains the reference data.
     * 
     */
    @Import(name="s3ReferenceDataSource", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs> s3ReferenceDataSource;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs> getS3ReferenceDataSource() {
        return this.s3ReferenceDataSource;
    }

    /**
     * The name of the in-application table to create.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs(
        @Nullable Output<String> referenceId,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs> referenceSchema,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs> s3ReferenceDataSource,
        Output<String> tableName) {
        this.referenceId = referenceId;
        this.referenceSchema = Objects.requireNonNull(referenceSchema, "expected parameter 'referenceSchema' to be non-null");
        this.s3ReferenceDataSource = Objects.requireNonNull(s3ReferenceDataSource, "expected parameter 's3ReferenceDataSource' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs() {
        this.referenceId = Codegen.empty();
        this.referenceSchema = Codegen.empty();
        this.s3ReferenceDataSource = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> referenceId;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs> referenceSchema;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs> s3ReferenceDataSource;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceId = defaults.referenceId;
    	      this.referenceSchema = defaults.referenceSchema;
    	      this.s3ReferenceDataSource = defaults.s3ReferenceDataSource;
    	      this.tableName = defaults.tableName;
        }

        public Builder referenceId(@Nullable Output<String> referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public Builder referenceId(@Nullable String referenceId) {
            this.referenceId = Codegen.ofNullable(referenceId);
            return this;
        }
        public Builder referenceSchema(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs> referenceSchema) {
            this.referenceSchema = Objects.requireNonNull(referenceSchema);
            return this;
        }
        public Builder referenceSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs referenceSchema) {
            this.referenceSchema = Output.of(Objects.requireNonNull(referenceSchema));
            return this;
        }
        public Builder s3ReferenceDataSource(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs> s3ReferenceDataSource) {
            this.s3ReferenceDataSource = Objects.requireNonNull(s3ReferenceDataSource);
            return this;
        }
        public Builder s3ReferenceDataSource(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs s3ReferenceDataSource) {
            this.s3ReferenceDataSource = Output.of(Objects.requireNonNull(s3ReferenceDataSource));
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs(referenceId, referenceSchema, s3ReferenceDataSource, tableName);
        }
    }
}
