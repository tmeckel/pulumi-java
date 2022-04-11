// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakeanalytics.FirewallRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Data Lake Analytics firewall rule information.
 * API Version: 2016-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datalakeanalytics:FirewallRule test_rule 34adfa4f-cedf-4dc0-ba29-b6d1a69ab345 
 * ```
 * 
 */
@ResourceType(type="azure-native:datalakeanalytics:FirewallRule")
public class FirewallRule extends io.pulumi.resources.CustomResource {
    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Export(name="endIpAddress", type=String.class, parameters={})
    private Output<String> endIpAddress;

    /**
     * @return The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    public Output<String> getEndIpAddress() {
        return this.endIpAddress;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Export(name="startIpAddress", type=String.class, parameters={})
    private Output<String> startIpAddress;

    /**
     * @return The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    public Output<String> getStartIpAddress() {
        return this.startIpAddress;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRule(String name) {
        this(name, FirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRule(String name, FirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRule(String name, FirewallRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datalakeanalytics:FirewallRule", name, args == null ? FirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datalakeanalytics:FirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datalakeanalytics/v20151001preview:FirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:datalakeanalytics/v20161101:FirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:datalakeanalytics/v20191101preview:FirewallRule").build())
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
    public static FirewallRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRule(name, id, options);
    }
}
