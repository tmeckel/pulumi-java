// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ReplicationvCenterArgs;
import io.pulumi.azurenative.recoveryservices.outputs.VCenterPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * vCenter definition.
 * API Version: 2018-07-10.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ReplicationvCenter esx-78 /Subscriptions/7c943c1b-5122-4097-90c8-861411bdd574/resourceGroups/MadhaviVRG/providers/Microsoft.RecoveryServices/vaults/MadhaviVault/replicationFabrics/239f778f368e34f78216d81f030725cdf2033174b47879b9f2eeede06fdd9c4d/replicationvCenters/esx-78 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ReplicationvCenter")
public class ReplicationvCenter extends io.pulumi.resources.CustomResource {
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * VCenter related data.
     * 
     */
    @Export(name="properties", type=VCenterPropertiesResponse.class, parameters={})
    private Output<VCenterPropertiesResponse> properties;

    /**
     * @return VCenter related data.
     * 
     */
    public Output<VCenterPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationvCenter(String name) {
        this(name, ReplicationvCenterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationvCenter(String name, ReplicationvCenterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationvCenter(String name, ReplicationvCenterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationvCenter", name, args == null ? ReplicationvCenterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationvCenter(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationvCenter", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20160810:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180110:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20180710:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211101:ReplicationvCenter").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ReplicationvCenter").build())
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
    public static ReplicationvCenter get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationvCenter(name, id, options);
    }
}
