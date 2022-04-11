// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.EventHubAuthorizationRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in a List or Get AuthorizationRule operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:EventHubAuthorizationRule sdk-Authrules-2513 /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/ArunMonocle/providers/Microsoft.EventHub/namespaces/sdk-Namespace-960/eventhubs/sdk-EventHub-532/authorizationRules/sdk-Authrules-2513 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:EventHubAuthorizationRule")
public class EventHubAuthorizationRule extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The rights associated with the rule.
     * 
     */
    @Export(name="rights", type=List.class, parameters={String.class})
    private Output<List<String>> rights;

    /**
     * @return The rights associated with the rule.
     * 
     */
    public Output<List<String>> getRights() {
        return this.rights;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventHubAuthorizationRule(String name) {
        this(name, EventHubAuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventHubAuthorizationRule(String name, EventHubAuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventHubAuthorizationRule(String name, EventHubAuthorizationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:EventHubAuthorizationRule", name, args == null ? EventHubAuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventHubAuthorizationRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:EventHubAuthorizationRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20140901:EventHubAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20150801:EventHubAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20170401:EventHubAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:EventHubAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210101preview:EventHubAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210601preview:EventHubAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20211101:EventHubAuthorizationRule").build())
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
    public static EventHubAuthorizationRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventHubAuthorizationRule(name, id, options);
    }
}
