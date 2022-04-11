// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.QueueArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:Queue queue6185 /subscriptions/{subscription-id}/resourceGroups/res3376/providers/Microsoft.Storage/storageAccounts/sto328/queueServices/default/queues/queue6185 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    /**
     * Integer indicating an approximate number of messages in the queue. This number is not lower than the actual number of messages in the queue, but could be higher.
     * 
     */
    @Export(name="approximateMessageCount", type=Integer.class, parameters={})
    private Output<Integer> approximateMessageCount;

    /**
     * @return Integer indicating an approximate number of messages in the queue. This number is not lower than the actual number of messages in the queue, but could be higher.
     * 
     */
    public Output<Integer> getApproximateMessageCount() {
        return this.approximateMessageCount;
    }
    /**
     * A name-value pair that represents queue metadata.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A name-value pair that represents queue metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
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
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:Queue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:Queue").build())
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
    public static Queue get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, options);
    }
}
