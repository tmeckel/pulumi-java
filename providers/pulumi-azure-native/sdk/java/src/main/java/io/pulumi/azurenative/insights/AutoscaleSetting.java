// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.AutoscaleSettingArgs;
import io.pulumi.azurenative.insights.outputs.AutoscaleNotificationResponse;
import io.pulumi.azurenative.insights.outputs.AutoscaleProfileResponse;
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
 * The autoscale setting resource.
 * API Version: 2015-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:AutoscaleSetting MySetting /subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/microsoft.insights/autoscalesettings/MySetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:AutoscaleSetting")
public class AutoscaleSetting extends io.pulumi.resources.CustomResource {
    /**
     * the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is 'true'.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is 'true'.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * the collection of notifications.
     * 
     */
    @Export(name="notifications", type=List.class, parameters={AutoscaleNotificationResponse.class})
    private Output</* @Nullable */ List<AutoscaleNotificationResponse>> notifications;

    /**
     * @return the collection of notifications.
     * 
     */
    public Output</* @Nullable */ List<AutoscaleNotificationResponse>> getNotifications() {
        return this.notifications;
    }
    /**
     * the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    @Export(name="profiles", type=List.class, parameters={AutoscaleProfileResponse.class})
    private Output<List<AutoscaleProfileResponse>> profiles;

    /**
     * @return the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    public Output<List<AutoscaleProfileResponse>> getProfiles() {
        return this.profiles;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * the location of the resource that the autoscale setting should be added to.
     * 
     */
    @Export(name="targetResourceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceLocation;

    /**
     * @return the location of the resource that the autoscale setting should be added to.
     * 
     */
    public Output</* @Nullable */ String> getTargetResourceLocation() {
        return this.targetResourceLocation;
    }
    /**
     * the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    @Export(name="targetResourceUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceUri;

    /**
     * @return the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    public Output</* @Nullable */ String> getTargetResourceUri() {
        return this.targetResourceUri;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoscaleSetting(String name) {
        this(name, AutoscaleSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscaleSetting(String name, AutoscaleSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscaleSetting(String name, AutoscaleSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:AutoscaleSetting", name, args == null ? AutoscaleSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoscaleSetting(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:AutoscaleSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20140401:AutoscaleSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20150401:AutoscaleSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210501preview:AutoscaleSetting").build())
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
    public static AutoscaleSetting get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutoscaleSetting(name, id, options);
    }
}
