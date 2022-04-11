// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.LinkArgs;
import io.pulumi.azurenative.customerinsights.outputs.ParticipantPropertyReferenceResponse;
import io.pulumi.azurenative.customerinsights.outputs.TypePropertiesMappingResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The link resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customerinsights:Link azSdkTestHub/linkTest4806 /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/azSdkTestHub/links/linkTest4806 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:Link")
public class Link extends io.pulumi.resources.CustomResource {
    /**
     * Localized descriptions for the Link.
     * 
     */
    @Export(name="description", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> description;

    /**
     * @return Localized descriptions for the Link.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDescription() {
        return this.description;
    }
    /**
     * Localized display name for the Link.
     * 
     */
    @Export(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    /**
     * @return Localized display name for the Link.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDisplayName() {
        return this.displayName;
    }
    /**
     * The link name.
     * 
     */
    @Export(name="linkName", type=String.class, parameters={})
    private Output<String> linkName;

    /**
     * @return The link name.
     * 
     */
    public Output<String> getLinkName() {
        return this.linkName;
    }
    /**
     * The set of properties mappings between the source and target Types.
     * 
     */
    @Export(name="mappings", type=List.class, parameters={TypePropertiesMappingResponse.class})
    private Output</* @Nullable */ List<TypePropertiesMappingResponse>> mappings;

    /**
     * @return The set of properties mappings between the source and target Types.
     * 
     */
    public Output</* @Nullable */ List<TypePropertiesMappingResponse>> getMappings() {
        return this.mappings;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Determines whether this link is supposed to create or delete instances if Link is NOT Reference Only.
     * 
     */
    @Export(name="operationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationType;

    /**
     * @return Determines whether this link is supposed to create or delete instances if Link is NOT Reference Only.
     * 
     */
    public Output</* @Nullable */ String> getOperationType() {
        return this.operationType;
    }
    /**
     * The properties that represent the participating profile.
     * 
     */
    @Export(name="participantPropertyReferences", type=List.class, parameters={ParticipantPropertyReferenceResponse.class})
    private Output<List<ParticipantPropertyReferenceResponse>> participantPropertyReferences;

    /**
     * @return The properties that represent the participating profile.
     * 
     */
    public Output<List<ParticipantPropertyReferenceResponse>> getParticipantPropertyReferences() {
        return this.participantPropertyReferences;
    }
    /**
     * Provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Indicating whether the link is reference only link. This flag is ignored if the Mappings are defined. If the mappings are not defined and it is set to true, links processing will not create or update profiles.
     * 
     */
    @Export(name="referenceOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> referenceOnly;

    /**
     * @return Indicating whether the link is reference only link. This flag is ignored if the Mappings are defined. If the mappings are not defined and it is set to true, links processing will not create or update profiles.
     * 
     */
    public Output</* @Nullable */ Boolean> getReferenceOnly() {
        return this.referenceOnly;
    }
    /**
     * Type of source entity.
     * 
     */
    @Export(name="sourceEntityType", type=String.class, parameters={})
    private Output<String> sourceEntityType;

    /**
     * @return Type of source entity.
     * 
     */
    public Output<String> getSourceEntityType() {
        return this.sourceEntityType;
    }
    /**
     * Name of the source Entity Type.
     * 
     */
    @Export(name="sourceEntityTypeName", type=String.class, parameters={})
    private Output<String> sourceEntityTypeName;

    /**
     * @return Name of the source Entity Type.
     * 
     */
    public Output<String> getSourceEntityTypeName() {
        return this.sourceEntityTypeName;
    }
    /**
     * Type of target entity.
     * 
     */
    @Export(name="targetEntityType", type=String.class, parameters={})
    private Output<String> targetEntityType;

    /**
     * @return Type of target entity.
     * 
     */
    public Output<String> getTargetEntityType() {
        return this.targetEntityType;
    }
    /**
     * Name of the target Entity Type.
     * 
     */
    @Export(name="targetEntityTypeName", type=String.class, parameters={})
    private Output<String> targetEntityTypeName;

    /**
     * @return Name of the target Entity Type.
     * 
     */
    public Output<String> getTargetEntityTypeName() {
        return this.targetEntityTypeName;
    }
    /**
     * The hub name.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Link(String name) {
        this(name, LinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Link(String name, LinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Link(String name, LinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Link", name, args == null ? LinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Link(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Link", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170101:Link").build()),
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170426:Link").build())
            ))
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
    public static Link get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Link(name, id, options);
    }
}
