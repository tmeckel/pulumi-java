// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1alpha.FeatureArgs;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.CommonFeatureSpecResponse;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.CommonFeatureStateResponse;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.FeatureResourceStateResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Adds a new Feature.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:gkehub/v1alpha:Feature")
public class Feature extends io.pulumi.resources.CustomResource {
    /**
     * When the Feature resource was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return When the Feature resource was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * When the Feature resource was deleted.
     * 
     */
    @OutputExport(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return When the Feature resource was deleted.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * GCP labels for this Feature.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return GCP labels for this Feature.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature's project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    @OutputExport(name="membershipSpecs", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> membershipSpecs;

    /**
     * @return Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature's project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    public Output<Map<String,String>> getMembershipSpecs() {
        return this.membershipSpecs;
    }
    /**
     * Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project number, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} MUST match the Feature's project number.
     * 
     */
    @OutputExport(name="membershipStates", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> membershipStates;

    /**
     * @return Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project number, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} MUST match the Feature's project number.
     * 
     */
    public Output<Map<String,String>> getMembershipStates() {
        return this.membershipStates;
    }
    /**
     * The full, unique name of this Feature resource in the format `projects/*{@literal /}locations/*{@literal /}features/*`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full, unique name of this Feature resource in the format `projects/*{@literal /}locations/*{@literal /}features/*`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the Feature resource itself.
     * 
     */
    @OutputExport(name="resourceState", type=FeatureResourceStateResponse.class, parameters={})
    private Output<FeatureResourceStateResponse> resourceState;

    /**
     * @return State of the Feature resource itself.
     * 
     */
    public Output<FeatureResourceStateResponse> getResourceState() {
        return this.resourceState;
    }
    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    @OutputExport(name="spec", type=CommonFeatureSpecResponse.class, parameters={})
    private Output<CommonFeatureSpecResponse> spec;

    /**
     * @return Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    public Output<CommonFeatureSpecResponse> getSpec() {
        return this.spec;
    }
    /**
     * The Hub-wide Feature state.
     * 
     */
    @OutputExport(name="state", type=CommonFeatureStateResponse.class, parameters={})
    private Output<CommonFeatureStateResponse> state;

    /**
     * @return The Hub-wide Feature state.
     * 
     */
    public Output<CommonFeatureStateResponse> getState() {
        return this.state;
    }
    /**
     * When the Feature resource was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return When the Feature resource was last updated.
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
    public Feature(String name, @Nullable FeatureArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1alpha:Feature", name, args == null ? FeatureArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Feature(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1alpha:Feature", name, null, makeResourceOptions(options, id));
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
    public static Feature get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Feature(name, id, options);
    }
}
