// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.DatasetArgs;
import io.pulumi.awsnative.databrew.enums.DatasetFormat;
import io.pulumi.awsnative.databrew.outputs.DatasetFormatOptions;
import io.pulumi.awsnative.databrew.outputs.DatasetInput;
import io.pulumi.awsnative.databrew.outputs.DatasetPathOptions;
import io.pulumi.awsnative.databrew.outputs.DatasetTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataBrew::Dataset.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:databrew:Dataset")
public class Dataset extends io.pulumi.resources.CustomResource {
    /**
     * Dataset format
     * 
     */
    @Export(name="format", type=DatasetFormat.class, parameters={})
    private Output</* @Nullable */ DatasetFormat> format;

    /**
     * @return Dataset format
     * 
     */
    public Output</* @Nullable */ DatasetFormat> getFormat() {
        return this.format;
    }
    /**
     * Format options for dataset
     * 
     */
    @Export(name="formatOptions", type=DatasetFormatOptions.class, parameters={})
    private Output</* @Nullable */ DatasetFormatOptions> formatOptions;

    /**
     * @return Format options for dataset
     * 
     */
    public Output</* @Nullable */ DatasetFormatOptions> getFormatOptions() {
        return this.formatOptions;
    }
    /**
     * Input
     * 
     */
    @Export(name="input", type=DatasetInput.class, parameters={})
    private Output<DatasetInput> input;

    /**
     * @return Input
     * 
     */
    public Output<DatasetInput> getInput() {
        return this.input;
    }
    /**
     * Dataset name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Dataset name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * PathOptions
     * 
     */
    @Export(name="pathOptions", type=DatasetPathOptions.class, parameters={})
    private Output</* @Nullable */ DatasetPathOptions> pathOptions;

    /**
     * @return PathOptions
     * 
     */
    public Output</* @Nullable */ DatasetPathOptions> getPathOptions() {
        return this.pathOptions;
    }
    @Export(name="tags", type=List.class, parameters={DatasetTag.class})
    private Output</* @Nullable */ List<DatasetTag>> tags;

    public Output</* @Nullable */ List<DatasetTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, DatasetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dataset(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Dataset", name, null, makeResourceOptions(options, id));
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
    public static Dataset get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, options);
    }
}
