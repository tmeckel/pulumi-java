// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AppendVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerCommandActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFunctionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLBatchExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLUpdateResourceActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ControlActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.CopyActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DataLakeAnalyticsUSQLActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksNotebookActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksSparkJarActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksSparkPythonActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DeleteActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteDataFlowActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteSSISPackageActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteWranglingDataflowActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.FailActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.FilterActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ForEachActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.GetMetadataActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightHiveActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightMapReduceActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightPigActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightSparkActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightStreamingActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.IfConditionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.LookupActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.PipelinePolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.PipelineResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SwitchActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.UntilActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.VariableSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebHookActivityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPipelineResult {
    /**
     * List of activities in pipeline.
     * 
     */
    private final @Nullable List<Object> activities;
    /**
     * List of tags that can be used for describing the Pipeline.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The max number of concurrent runs for the pipeline.
     * 
     */
    private final @Nullable Integer concurrency;
    /**
     * The description of the pipeline.
     * 
     */
    private final @Nullable String description;
    /**
     * Etag identifies change in the resource.
     * 
     */
    private final String etag;
    /**
     * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     * 
     */
    private final @Nullable PipelineResponseFolder folder;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * List of parameters for pipeline.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Pipeline Policy.
     * 
     */
    private final @Nullable PipelinePolicyResponse policy;
    /**
     * Dimensions emitted by Pipeline.
     * 
     */
    private final @Nullable Map<String,Object> runDimensions;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * List of variables for pipeline.
     * 
     */
    private final @Nullable Map<String,VariableSpecificationResponse> variables;

    @OutputCustomType.Constructor
    private GetPipelineResult(
        @OutputCustomType.Parameter("activities") @Nullable List<Object> activities,
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("concurrency") @Nullable Integer concurrency,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("folder") @Nullable PipelineResponseFolder folder,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("policy") @Nullable PipelinePolicyResponse policy,
        @OutputCustomType.Parameter("runDimensions") @Nullable Map<String,Object> runDimensions,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("variables") @Nullable Map<String,VariableSpecificationResponse> variables) {
        this.activities = activities;
        this.annotations = annotations;
        this.concurrency = concurrency;
        this.description = description;
        this.etag = etag;
        this.folder = folder;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.policy = policy;
        this.runDimensions = runDimensions;
        this.type = type;
        this.variables = variables;
    }

    /**
     * List of activities in pipeline.
     * 
    */
    public List<Object> getActivities() {
        return this.activities == null ? List.of() : this.activities;
    }
    /**
     * List of tags that can be used for describing the Pipeline.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The max number of concurrent runs for the pipeline.
     * 
    */
    public Optional<Integer> getConcurrency() {
        return Optional.ofNullable(this.concurrency);
    }
    /**
     * The description of the pipeline.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Etag identifies change in the resource.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     * 
    */
    public Optional<PipelineResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of parameters for pipeline.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Pipeline Policy.
     * 
    */
    public Optional<PipelinePolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Dimensions emitted by Pipeline.
     * 
    */
    public Map<String,Object> getRunDimensions() {
        return this.runDimensions == null ? Map.of() : this.runDimensions;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * List of variables for pipeline.
     * 
    */
    public Map<String,VariableSpecificationResponse> getVariables() {
        return this.variables == null ? Map.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> activities;
        private @Nullable List<Object> annotations;
        private @Nullable Integer concurrency;
        private @Nullable String description;
        private String etag;
        private @Nullable PipelineResponseFolder folder;
        private String id;
        private String name;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable PipelinePolicyResponse policy;
        private @Nullable Map<String,Object> runDimensions;
        private String type;
        private @Nullable Map<String,VariableSpecificationResponse> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.annotations = defaults.annotations;
    	      this.concurrency = defaults.concurrency;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.runDimensions = defaults.runDimensions;
    	      this.type = defaults.type;
    	      this.variables = defaults.variables;
        }

        public Builder activities(@Nullable List<Object> activities) {
            this.activities = activities;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder concurrency(@Nullable Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder folder(@Nullable PipelineResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder policy(@Nullable PipelinePolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder runDimensions(@Nullable Map<String,Object> runDimensions) {
            this.runDimensions = runDimensions;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder variables(@Nullable Map<String,VariableSpecificationResponse> variables) {
            this.variables = variables;
            return this;
        }
        public GetPipelineResult build() {
            return new GetPipelineResult(activities, annotations, concurrency, description, etag, folder, id, name, parameters, policy, runDimensions, type, variables);
        }
    }
}
