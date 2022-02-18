// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.SourceArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.VmwareSourceDetailsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Source in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:Source")
public class Source extends io.pulumi.resources.CustomResource {
    /**
     * The create time timestamp.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time timestamp.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the source.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description of the source.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Provides details on the state of the Source in case of an error.
     * 
     */
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the Source in case of an error.
     * 
     */
    public Output<StatusResponse> getError() {
        return this.error;
    }
    /**
     * The labels of the source.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels of the source.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The Source name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Source name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The update time timestamp.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time timestamp.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Vmware type source details.
     * 
     */
    @OutputExport(name="vmware", type=VmwareSourceDetailsResponse.class, parameters={})
    private Output<VmwareSourceDetailsResponse> vmware;

    /**
     * @return Vmware type source details.
     * 
     */
    public Output<VmwareSourceDetailsResponse> getVmware() {
        return this.vmware;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Source(String name, SourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:Source", name, args == null ? SourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Source(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:Source", name, null, makeResourceOptions(options, id));
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
    public static Source get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Source(name, id, options);
    }
}
