// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.TransitionRouteGroupArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:TransitionRouteGroup")
public class TransitionRouteGroup extends io.pulumi.resources.CustomResource {
    /**
     * The human-readable name of the transition route group, unique within the Agent. The display name can be no longer than 30 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the transition route group, unique within the Agent. The display name can be no longer than 30 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Transition routes associated with the TransitionRouteGroup.
     * 
     */
    @OutputExport(name="transitionRoutes", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1TransitionRouteResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse>> transitionRoutes;

    /**
     * @return Transition routes associated with the TransitionRouteGroup.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse>> getTransitionRoutes() {
        return this.transitionRoutes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitionRouteGroup(String name, TransitionRouteGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:TransitionRouteGroup", name, args == null ? TransitionRouteGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitionRouteGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:TransitionRouteGroup", name, null, makeResourceOptions(options, id));
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
    public static TransitionRouteGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitionRouteGroup(name, id, options);
    }
}
