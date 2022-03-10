// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.FunctionSyncConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * The ID of the associated AppSync API.
     * 
     */
    @InputImport(name="apiId")
      private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The ARN of the Function object.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Function DataSource name.
     * 
     */
    @InputImport(name="dataSource")
      private final @Nullable Input<String> dataSource;

    public Input<String> getDataSource() {
        return this.dataSource == null ? Input.empty() : this.dataSource;
    }

    /**
     * The Function description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A unique ID representing the Function object.
     * 
     */
    @InputImport(name="functionId")
      private final @Nullable Input<String> functionId;

    public Input<String> getFunctionId() {
        return this.functionId == null ? Input.empty() : this.functionId;
    }

    /**
     * The version of the request mapping template. Currently the supported value is `2018-05-29`.
     * 
     */
    @InputImport(name="functionVersion")
      private final @Nullable Input<String> functionVersion;

    public Input<String> getFunctionVersion() {
        return this.functionVersion == null ? Input.empty() : this.functionVersion;
    }

    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @InputImport(name="maxBatchSize")
      private final @Nullable Input<Integer> maxBatchSize;

    public Input<Integer> getMaxBatchSize() {
        return this.maxBatchSize == null ? Input.empty() : this.maxBatchSize;
    }

    /**
     * The Function name. The function name does not have to be unique.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
     * 
     */
    @InputImport(name="requestMappingTemplate")
      private final @Nullable Input<String> requestMappingTemplate;

    public Input<String> getRequestMappingTemplate() {
        return this.requestMappingTemplate == null ? Input.empty() : this.requestMappingTemplate;
    }

    /**
     * The Function response mapping template.
     * 
     */
    @InputImport(name="responseMappingTemplate")
      private final @Nullable Input<String> responseMappingTemplate;

    public Input<String> getResponseMappingTemplate() {
        return this.responseMappingTemplate == null ? Input.empty() : this.responseMappingTemplate;
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @InputImport(name="syncConfig")
      private final @Nullable Input<FunctionSyncConfigGetArgs> syncConfig;

    public Input<FunctionSyncConfigGetArgs> getSyncConfig() {
        return this.syncConfig == null ? Input.empty() : this.syncConfig;
    }

    public FunctionState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> arn,
        @Nullable Input<String> dataSource,
        @Nullable Input<String> description,
        @Nullable Input<String> functionId,
        @Nullable Input<String> functionVersion,
        @Nullable Input<Integer> maxBatchSize,
        @Nullable Input<String> name,
        @Nullable Input<String> requestMappingTemplate,
        @Nullable Input<String> responseMappingTemplate,
        @Nullable Input<FunctionSyncConfigGetArgs> syncConfig) {
        this.apiId = apiId;
        this.arn = arn;
        this.dataSource = dataSource;
        this.description = description;
        this.functionId = functionId;
        this.functionVersion = functionVersion;
        this.maxBatchSize = maxBatchSize;
        this.name = name;
        this.requestMappingTemplate = requestMappingTemplate;
        this.responseMappingTemplate = responseMappingTemplate;
        this.syncConfig = syncConfig;
    }

    private FunctionState() {
        this.apiId = Input.empty();
        this.arn = Input.empty();
        this.dataSource = Input.empty();
        this.description = Input.empty();
        this.functionId = Input.empty();
        this.functionVersion = Input.empty();
        this.maxBatchSize = Input.empty();
        this.name = Input.empty();
        this.requestMappingTemplate = Input.empty();
        this.responseMappingTemplate = Input.empty();
        this.syncConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> dataSource;
        private @Nullable Input<String> description;
        private @Nullable Input<String> functionId;
        private @Nullable Input<String> functionVersion;
        private @Nullable Input<Integer> maxBatchSize;
        private @Nullable Input<String> name;
        private @Nullable Input<String> requestMappingTemplate;
        private @Nullable Input<String> responseMappingTemplate;
        private @Nullable Input<FunctionSyncConfigGetArgs> syncConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.arn = defaults.arn;
    	      this.dataSource = defaults.dataSource;
    	      this.description = defaults.description;
    	      this.functionId = defaults.functionId;
    	      this.functionVersion = defaults.functionVersion;
    	      this.maxBatchSize = defaults.maxBatchSize;
    	      this.name = defaults.name;
    	      this.requestMappingTemplate = defaults.requestMappingTemplate;
    	      this.responseMappingTemplate = defaults.responseMappingTemplate;
    	      this.syncConfig = defaults.syncConfig;
        }

        public Builder apiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder apiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder dataSource(@Nullable Input<String> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder dataSource(@Nullable String dataSource) {
            this.dataSource = Input.ofNullable(dataSource);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder functionId(@Nullable Input<String> functionId) {
            this.functionId = functionId;
            return this;
        }

        public Builder functionId(@Nullable String functionId) {
            this.functionId = Input.ofNullable(functionId);
            return this;
        }

        public Builder functionVersion(@Nullable Input<String> functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }

        public Builder functionVersion(@Nullable String functionVersion) {
            this.functionVersion = Input.ofNullable(functionVersion);
            return this;
        }

        public Builder maxBatchSize(@Nullable Input<Integer> maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        public Builder maxBatchSize(@Nullable Integer maxBatchSize) {
            this.maxBatchSize = Input.ofNullable(maxBatchSize);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder requestMappingTemplate(@Nullable Input<String> requestMappingTemplate) {
            this.requestMappingTemplate = requestMappingTemplate;
            return this;
        }

        public Builder requestMappingTemplate(@Nullable String requestMappingTemplate) {
            this.requestMappingTemplate = Input.ofNullable(requestMappingTemplate);
            return this;
        }

        public Builder responseMappingTemplate(@Nullable Input<String> responseMappingTemplate) {
            this.responseMappingTemplate = responseMappingTemplate;
            return this;
        }

        public Builder responseMappingTemplate(@Nullable String responseMappingTemplate) {
            this.responseMappingTemplate = Input.ofNullable(responseMappingTemplate);
            return this;
        }

        public Builder syncConfig(@Nullable Input<FunctionSyncConfigGetArgs> syncConfig) {
            this.syncConfig = syncConfig;
            return this;
        }

        public Builder syncConfig(@Nullable FunctionSyncConfigGetArgs syncConfig) {
            this.syncConfig = Input.ofNullable(syncConfig);
            return this;
        }
        public FunctionState build() {
            return new FunctionState(apiId, arn, dataSource, description, functionId, functionVersion, maxBatchSize, name, requestMappingTemplate, responseMappingTemplate, syncConfig);
        }
    }
}
