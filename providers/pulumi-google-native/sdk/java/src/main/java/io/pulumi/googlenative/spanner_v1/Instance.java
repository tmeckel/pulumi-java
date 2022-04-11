// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.spanner_v1.InstanceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an instance and begins preparing it to begin serving. The returned long-running operation can be used to track the progress of preparing the new instance. The instance name is assigned by the caller. If the named instance already exists, `CreateInstance` returns `ALREADY_EXISTS`. Immediately upon completion of this request: * The instance is readable via the API, with all requested attributes but no allocated resources. Its state is `CREATING`. Until completion of the returned operation: * Cancelling the operation renders the instance immediately unreadable via the API. * The instance can be deleted. * All other attempts to modify the instance are rejected. Upon completion of the returned operation: * Billing for all successfully-allocated resources begins (some types may have lower than the requested levels). * Databases can be created in the instance. * The instance's allocated resource levels are readable via the API. * The instance's state becomes `READY`. The returned long-running operation will have a name of the format `/operations/` and can be used to track creation of the instance. The metadata field type is CreateInstanceMetadata. The response field type is Instance, if successful.
 * 
 */
@ResourceType(type="google-native:spanner/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output<String> config;

    /**
     * @return The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
     * 
     */
    public Output<String> getConfig() {
        return this.config;
    }
    /**
     * The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the name must be between 2 and 64 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the name must be between 2 and 64 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of nodes allocated to this instance. At most one of either node_count or processing_units should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    @Export(name="nodeCount", type=Integer.class, parameters={})
    private Output<Integer> nodeCount;

    /**
     * @return The number of nodes allocated to this instance. At most one of either node_count or processing_units should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    public Output<Integer> getNodeCount() {
        return this.nodeCount;
    }
    /**
     * The number of processing units allocated to this instance. At most one of processing_units or node_count should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    @Export(name="processingUnits", type=Integer.class, parameters={})
    private Output<Integer> processingUnits;

    /**
     * @return The number of processing units allocated to this instance. At most one of processing_units or node_count should be present in the message. This may be zero in API responses for instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
     * 
     */
    public Output<Integer> getProcessingUnits() {
        return this.processingUnits;
    }
    /**
     * The current instance state. For CreateInstance, the state must be either omitted or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current instance state. For CreateInstance, the state must be either omitted or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:spanner/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:spanner/v1:Instance", name, null, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
