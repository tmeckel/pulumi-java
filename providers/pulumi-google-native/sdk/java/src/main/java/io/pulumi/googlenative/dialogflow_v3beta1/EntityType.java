// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.EntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an entity type in the specified agent.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:EntityType")
public class EntityType extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether the entity type can be automatically expanded.
     * 
     */
    @OutputExport(name="autoExpansionMode", type=String.class, parameters={})
    private Output<String> autoExpansionMode;

    /**
     * @return Indicates whether the entity type can be automatically expanded.
     * 
     */
    public Output<String> getAutoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the entity type, unique within the agent.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @OutputExport(name="enableFuzzyExtraction", type=Boolean.class, parameters={})
    private Output<Boolean> enableFuzzyExtraction;

    /**
     * @return Enables fuzzy entity extraction during classification.
     * 
     */
    public Output<Boolean> getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * The collection of entity entries associated with the entity type.
     * 
     */
    @OutputExport(name="entities", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse>> entities;

    /**
     * @return The collection of entity entries associated with the entity type.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse>> getEntities() {
        return this.entities;
    }
    /**
     * Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    @OutputExport(name="excludedPhrases", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse>> excludedPhrases;

    /**
     * @return Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse>> getExcludedPhrases() {
        return this.excludedPhrases;
    }
    /**
     * Indicates the kind of entity type.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Indicates the kind of entity type.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    @OutputExport(name="redact", type=Boolean.class, parameters={})
    private Output<Boolean> redact;

    /**
     * @return Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    public Output<Boolean> getRedact() {
        return this.redact;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityType(String name, EntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:EntityType", name, args == null ? EntityTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EntityType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:EntityType", name, null, makeResourceOptions(options, id));
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
    public static EntityType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EntityType(name, id, options);
    }
}
