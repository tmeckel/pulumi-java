// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.ExecutionArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.ExecutionTemplateResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Execution in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:notebooks/v1:Execution")
public class Execution extends io.pulumi.resources.CustomResource {
    /**
     * Time the Execution was instantiated.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the Execution was instantiated.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A brief description of this execution.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A brief description of this execution.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Name used for UI purposes. Name can only contain alphanumeric characters and underscores '_'.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Name used for UI purposes. Name can only contain alphanumeric characters and underscores '_'.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    @OutputExport(name="executionTemplate", type=ExecutionTemplateResponse.class, parameters={})
    private Output<ExecutionTemplateResponse> executionTemplate;

    /**
     * @return execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    public Output<ExecutionTemplateResponse> getExecutionTemplate() {
        return this.executionTemplate;
    }
    /**
     * The URI of the external job used to execute the notebook.
     * 
     */
    @OutputExport(name="jobUri", type=String.class, parameters={})
    private Output<String> jobUri;

    /**
     * @return The URI of the external job used to execute the notebook.
     * 
     */
    public Output<String> getJobUri() {
        return this.jobUri;
    }
    /**
     * The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output notebook file generated by this execution
     * 
     */
    @OutputExport(name="outputNotebookFile", type=String.class, parameters={})
    private Output<String> outputNotebookFile;

    /**
     * @return Output notebook file generated by this execution
     * 
     */
    public Output<String> getOutputNotebookFile() {
        return this.outputNotebookFile;
    }
    /**
     * State of the underlying AI Platform job.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the underlying AI Platform job.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Time the Execution was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the Execution was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Execution(String name, ExecutionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Execution", name, args == null ? ExecutionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Execution(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Execution", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Execution get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Execution(name, id, options);
    }
}
