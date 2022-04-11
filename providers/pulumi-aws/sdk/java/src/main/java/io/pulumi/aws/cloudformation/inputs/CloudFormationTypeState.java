// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudFormationTypeState extends io.pulumi.resources.ResourceArgs {

    public static final CloudFormationTypeState Empty = new CloudFormationTypeState();

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `type_arn`.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Identifier of the CloudFormation Type default version.
     * 
     */
    @Import(name="defaultVersionId")
      private final @Nullable Output<String> defaultVersionId;

    public Output<String> getDefaultVersionId() {
        return this.defaultVersionId == null ? Codegen.empty() : this.defaultVersionId;
    }

    /**
     * Deprecation status of the version.
     * 
     */
    @Import(name="deprecatedStatus")
      private final @Nullable Output<String> deprecatedStatus;

    public Output<String> getDeprecatedStatus() {
        return this.deprecatedStatus == null ? Codegen.empty() : this.deprecatedStatus;
    }

    /**
     * Description of the version.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * URL of the documentation for the CloudFormation Type.
     * 
     */
    @Import(name="documentationUrl")
      private final @Nullable Output<String> documentationUrl;

    public Output<String> getDocumentationUrl() {
        return this.documentationUrl == null ? Codegen.empty() : this.documentationUrl;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     * 
     */
    @Import(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Codegen.empty() : this.executionRoleArn;
    }

    /**
     * Whether the CloudFormation Type version is the default version.
     * 
     */
    @Import(name="isDefaultVersion")
      private final @Nullable Output<Boolean> isDefaultVersion;

    public Output<Boolean> getIsDefaultVersion() {
        return this.isDefaultVersion == null ? Codegen.empty() : this.isDefaultVersion;
    }

    /**
     * Configuration block containing logging configuration.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<CloudFormationTypeLoggingConfigGetArgs> loggingConfig;

    public Output<CloudFormationTypeLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Codegen.empty() : this.loggingConfig;
    }

    /**
     * Provisioning behavior of the CloudFormation Type.
     * 
     */
    @Import(name="provisioningType")
      private final @Nullable Output<String> provisioningType;

    public Output<String> getProvisioningType() {
        return this.provisioningType == null ? Codegen.empty() : this.provisioningType;
    }

    /**
     * JSON document of the CloudFormation Type schema.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> getSchema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     * 
     */
    @Import(name="schemaHandlerPackage")
      private final @Nullable Output<String> schemaHandlerPackage;

    public Output<String> getSchemaHandlerPackage() {
        return this.schemaHandlerPackage == null ? Codegen.empty() : this.schemaHandlerPackage;
    }

    /**
     * URL of the source code for the CloudFormation Type.
     * 
     */
    @Import(name="sourceUrl")
      private final @Nullable Output<String> sourceUrl;

    public Output<String> getSourceUrl() {
        return this.sourceUrl == null ? Codegen.empty() : this.sourceUrl;
    }

    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     * 
     */
    @Import(name="typeArn")
      private final @Nullable Output<String> typeArn;

    public Output<String> getTypeArn() {
        return this.typeArn == null ? Codegen.empty() : this.typeArn;
    }

    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     * 
     */
    @Import(name="typeName")
      private final @Nullable Output<String> typeName;

    public Output<String> getTypeName() {
        return this.typeName == null ? Codegen.empty() : this.typeName;
    }

    /**
     * (Optional) Identifier of the CloudFormation Type version.
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId == null ? Codegen.empty() : this.versionId;
    }

    /**
     * Scope of the CloudFormation Type.
     * 
     */
    @Import(name="visibility")
      private final @Nullable Output<String> visibility;

    public Output<String> getVisibility() {
        return this.visibility == null ? Codegen.empty() : this.visibility;
    }

    public CloudFormationTypeState(
        @Nullable Output<String> arn,
        @Nullable Output<String> defaultVersionId,
        @Nullable Output<String> deprecatedStatus,
        @Nullable Output<String> description,
        @Nullable Output<String> documentationUrl,
        @Nullable Output<String> executionRoleArn,
        @Nullable Output<Boolean> isDefaultVersion,
        @Nullable Output<CloudFormationTypeLoggingConfigGetArgs> loggingConfig,
        @Nullable Output<String> provisioningType,
        @Nullable Output<String> schema,
        @Nullable Output<String> schemaHandlerPackage,
        @Nullable Output<String> sourceUrl,
        @Nullable Output<String> type,
        @Nullable Output<String> typeArn,
        @Nullable Output<String> typeName,
        @Nullable Output<String> versionId,
        @Nullable Output<String> visibility) {
        this.arn = arn;
        this.defaultVersionId = defaultVersionId;
        this.deprecatedStatus = deprecatedStatus;
        this.description = description;
        this.documentationUrl = documentationUrl;
        this.executionRoleArn = executionRoleArn;
        this.isDefaultVersion = isDefaultVersion;
        this.loggingConfig = loggingConfig;
        this.provisioningType = provisioningType;
        this.schema = schema;
        this.schemaHandlerPackage = schemaHandlerPackage;
        this.sourceUrl = sourceUrl;
        this.type = type;
        this.typeArn = typeArn;
        this.typeName = typeName;
        this.versionId = versionId;
        this.visibility = visibility;
    }

    private CloudFormationTypeState() {
        this.arn = Codegen.empty();
        this.defaultVersionId = Codegen.empty();
        this.deprecatedStatus = Codegen.empty();
        this.description = Codegen.empty();
        this.documentationUrl = Codegen.empty();
        this.executionRoleArn = Codegen.empty();
        this.isDefaultVersion = Codegen.empty();
        this.loggingConfig = Codegen.empty();
        this.provisioningType = Codegen.empty();
        this.schema = Codegen.empty();
        this.schemaHandlerPackage = Codegen.empty();
        this.sourceUrl = Codegen.empty();
        this.type = Codegen.empty();
        this.typeArn = Codegen.empty();
        this.typeName = Codegen.empty();
        this.versionId = Codegen.empty();
        this.visibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> defaultVersionId;
        private @Nullable Output<String> deprecatedStatus;
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentationUrl;
        private @Nullable Output<String> executionRoleArn;
        private @Nullable Output<Boolean> isDefaultVersion;
        private @Nullable Output<CloudFormationTypeLoggingConfigGetArgs> loggingConfig;
        private @Nullable Output<String> provisioningType;
        private @Nullable Output<String> schema;
        private @Nullable Output<String> schemaHandlerPackage;
        private @Nullable Output<String> sourceUrl;
        private @Nullable Output<String> type;
        private @Nullable Output<String> typeArn;
        private @Nullable Output<String> typeName;
        private @Nullable Output<String> versionId;
        private @Nullable Output<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationTypeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultVersionId = defaults.defaultVersionId;
    	      this.deprecatedStatus = defaults.deprecatedStatus;
    	      this.description = defaults.description;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.provisioningType = defaults.provisioningType;
    	      this.schema = defaults.schema;
    	      this.schemaHandlerPackage = defaults.schemaHandlerPackage;
    	      this.sourceUrl = defaults.sourceUrl;
    	      this.type = defaults.type;
    	      this.typeArn = defaults.typeArn;
    	      this.typeName = defaults.typeName;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder defaultVersionId(@Nullable Output<String> defaultVersionId) {
            this.defaultVersionId = defaultVersionId;
            return this;
        }
        public Builder defaultVersionId(@Nullable String defaultVersionId) {
            this.defaultVersionId = Codegen.ofNullable(defaultVersionId);
            return this;
        }
        public Builder deprecatedStatus(@Nullable Output<String> deprecatedStatus) {
            this.deprecatedStatus = deprecatedStatus;
            return this;
        }
        public Builder deprecatedStatus(@Nullable String deprecatedStatus) {
            this.deprecatedStatus = Codegen.ofNullable(deprecatedStatus);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder documentationUrl(@Nullable Output<String> documentationUrl) {
            this.documentationUrl = documentationUrl;
            return this;
        }
        public Builder documentationUrl(@Nullable String documentationUrl) {
            this.documentationUrl = Codegen.ofNullable(documentationUrl);
            return this;
        }
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Codegen.ofNullable(executionRoleArn);
            return this;
        }
        public Builder isDefaultVersion(@Nullable Output<Boolean> isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Builder isDefaultVersion(@Nullable Boolean isDefaultVersion) {
            this.isDefaultVersion = Codegen.ofNullable(isDefaultVersion);
            return this;
        }
        public Builder loggingConfig(@Nullable Output<CloudFormationTypeLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable CloudFormationTypeLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Codegen.ofNullable(loggingConfig);
            return this;
        }
        public Builder provisioningType(@Nullable Output<String> provisioningType) {
            this.provisioningType = provisioningType;
            return this;
        }
        public Builder provisioningType(@Nullable String provisioningType) {
            this.provisioningType = Codegen.ofNullable(provisioningType);
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder schemaHandlerPackage(@Nullable Output<String> schemaHandlerPackage) {
            this.schemaHandlerPackage = schemaHandlerPackage;
            return this;
        }
        public Builder schemaHandlerPackage(@Nullable String schemaHandlerPackage) {
            this.schemaHandlerPackage = Codegen.ofNullable(schemaHandlerPackage);
            return this;
        }
        public Builder sourceUrl(@Nullable Output<String> sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public Builder sourceUrl(@Nullable String sourceUrl) {
            this.sourceUrl = Codegen.ofNullable(sourceUrl);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder typeArn(@Nullable Output<String> typeArn) {
            this.typeArn = typeArn;
            return this;
        }
        public Builder typeArn(@Nullable String typeArn) {
            this.typeArn = Codegen.ofNullable(typeArn);
            return this;
        }
        public Builder typeName(@Nullable Output<String> typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = Codegen.ofNullable(typeName);
            return this;
        }
        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }
        public Builder versionId(@Nullable String versionId) {
            this.versionId = Codegen.ofNullable(versionId);
            return this;
        }
        public Builder visibility(@Nullable Output<String> visibility) {
            this.visibility = visibility;
            return this;
        }
        public Builder visibility(@Nullable String visibility) {
            this.visibility = Codegen.ofNullable(visibility);
            return this;
        }        public CloudFormationTypeState build() {
            return new CloudFormationTypeState(arn, defaultVersionId, deprecatedStatus, description, documentationUrl, executionRoleArn, isDefaultVersion, loggingConfig, provisioningType, schema, schemaHandlerPackage, sourceUrl, type, typeArn, typeName, versionId, visibility);
        }
    }
}
