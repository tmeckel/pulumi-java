// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iot.RegistryArgs;
import io.pulumi.gcp.iot.inputs.RegistryState;
import io.pulumi.gcp.iot.outputs.RegistryCredential;
import io.pulumi.gcp.iot.outputs.RegistryEventNotificationConfigItem;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Google Cloud IoT Core device registry.
 * 
 * To get more information about DeviceRegistry, see:
 * 
 * * [API documentation](https://cloud.google.com/iot/docs/reference/cloudiot/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/iot/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DeviceRegistry can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registry:Registry default {{project}}/locations/{{region}}/registries/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registry:Registry default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registry:Registry default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registry:Registry default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:iot/registry:Registry")
public class Registry extends io.pulumi.resources.CustomResource {
    /**
     * List of public key certificates to authenticate devices.
     * The structure is documented below.
     * 
     */
    @Export(name="credentials", type=List.class, parameters={RegistryCredential.class})
    private Output</* @Nullable */ List<RegistryCredential>> credentials;

    /**
     * @return List of public key certificates to authenticate devices.
     * The structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RegistryCredential>> getCredentials() {
        return this.credentials;
    }
    /**
     * List of configurations for event notifications, such as PubSub topics
     * to publish device events to.
     * Structure is documented below.
     * 
     */
    @Export(name="eventNotificationConfigs", type=List.class, parameters={RegistryEventNotificationConfigItem.class})
    private Output<List<RegistryEventNotificationConfigItem>> eventNotificationConfigs;

    /**
     * @return List of configurations for event notifications, such as PubSub topics
     * to publish device events to.
     * Structure is documented below.
     * 
     */
    public Output<List<RegistryEventNotificationConfigItem>> getEventNotificationConfigs() {
        return this.eventNotificationConfigs;
    }
    /**
     * Activate or deactivate HTTP.
     * The structure is documented below.
     * 
     */
    @Export(name="httpConfig", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> httpConfig;

    /**
     * @return Activate or deactivate HTTP.
     * The structure is documented below.
     * 
     */
    public Output<Map<String,Object>> getHttpConfig() {
        return this.httpConfig;
    }
    /**
     * The default logging verbosity for activity from devices in this
     * registry. Specifies which events should be written to logs. For
     * example, if the LogLevel is ERROR, only events that terminate in
     * errors will be logged. LogLevel is inclusive; enabling INFO logging
     * will also enable ERROR logging.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ERROR`, `INFO`, and `DEBUG`.
     * 
     */
    @Export(name="logLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> logLevel;

    /**
     * @return The default logging verbosity for activity from devices in this
     * registry. Specifies which events should be written to logs. For
     * example, if the LogLevel is ERROR, only events that terminate in
     * errors will be logged. LogLevel is inclusive; enabling INFO logging
     * will also enable ERROR logging.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ERROR`, `INFO`, and `DEBUG`.
     * 
     */
    public Output</* @Nullable */ String> getLogLevel() {
        return this.logLevel;
    }
    /**
     * Activate or deactivate MQTT.
     * The structure is documented below.
     * 
     */
    @Export(name="mqttConfig", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> mqttConfig;

    /**
     * @return Activate or deactivate MQTT.
     * The structure is documented below.
     * 
     */
    public Output<Map<String,Object>> getMqttConfig() {
        return this.mqttConfig;
    }
    /**
     * A unique name for the resource, required by device registry.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by device registry.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region in which the created registry should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region in which the created registry should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * A PubSub topic to publish device state updates.
     * The structure is documented below.
     * 
     */
    @Export(name="stateNotificationConfig", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> stateNotificationConfig;

    /**
     * @return A PubSub topic to publish device state updates.
     * The structure is documented below.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getStateNotificationConfig() {
        return this.stateNotificationConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Registry(String name) {
        this(name, RegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Registry(String name, @Nullable RegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Registry(String name, @Nullable RegistryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iot/registry:Registry", name, args == null ? RegistryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Registry(String name, Output<String> id, @Nullable RegistryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iot/registry:Registry", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("gcp:kms/registry:Registry").build())
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Registry get(String name, Output<String> id, @Nullable RegistryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Registry(name, id, state, options);
    }
}
