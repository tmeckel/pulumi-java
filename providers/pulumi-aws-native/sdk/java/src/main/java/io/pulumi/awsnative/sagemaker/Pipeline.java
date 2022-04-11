// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.PipelineArgs;
import io.pulumi.awsnative.sagemaker.outputs.ParallelismConfigurationProperties;
import io.pulumi.awsnative.sagemaker.outputs.PipelineTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::Pipeline
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:sagemaker:Pipeline")
public class Pipeline extends io.pulumi.resources.CustomResource {
    @Export(name="parallelismConfiguration", type=ParallelismConfigurationProperties.class, parameters={})
    private Output</* @Nullable */ ParallelismConfigurationProperties> parallelismConfiguration;

    public Output</* @Nullable */ ParallelismConfigurationProperties> getParallelismConfiguration() {
        return this.parallelismConfiguration;
    }
    @Export(name="pipelineDefinition", type=Object.class, parameters={})
    private Output<Object> pipelineDefinition;

    public Output<Object> getPipelineDefinition() {
        return this.pipelineDefinition;
    }
    /**
     * The description of the Pipeline.
     * 
     */
    @Export(name="pipelineDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> pipelineDescription;

    /**
     * @return The description of the Pipeline.
     * 
     */
    public Output</* @Nullable */ String> getPipelineDescription() {
        return this.pipelineDescription;
    }
    /**
     * The display name of the Pipeline.
     * 
     */
    @Export(name="pipelineDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> pipelineDisplayName;

    /**
     * @return The display name of the Pipeline.
     * 
     */
    public Output</* @Nullable */ String> getPipelineDisplayName() {
        return this.pipelineDisplayName;
    }
    /**
     * The name of the Pipeline.
     * 
     */
    @Export(name="pipelineName", type=String.class, parameters={})
    private Output<String> pipelineName;

    /**
     * @return The name of the Pipeline.
     * 
     */
    public Output<String> getPipelineName() {
        return this.pipelineName;
    }
    /**
     * Role Arn
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Role Arn
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @Export(name="tags", type=List.class, parameters={PipelineTag.class})
    private Output</* @Nullable */ List<PipelineTag>> tags;

    public Output</* @Nullable */ List<PipelineTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Pipeline", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Pipeline get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
