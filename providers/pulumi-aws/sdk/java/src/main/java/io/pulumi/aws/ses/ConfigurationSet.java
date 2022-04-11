// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ConfigurationSetArgs;
import io.pulumi.aws.ses.inputs.ConfigurationSetState;
import io.pulumi.aws.ses.outputs.ConfigurationSetDeliveryOptions;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an SES configuration set resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES Configuration Sets can be imported using their `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/configurationSet:ConfigurationSet test some-configuration-set-test
 * ```
 * 
 */
@ResourceType(type="aws:ses/configurationSet:ConfigurationSet")
public class ConfigurationSet extends io.pulumi.resources.CustomResource {
    /**
     * SES configuration set ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return SES configuration set ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="deliveryOptions", type=ConfigurationSetDeliveryOptions.class, parameters={})
    private Output</* @Nullable */ ConfigurationSetDeliveryOptions> deliveryOptions;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ ConfigurationSetDeliveryOptions> getDeliveryOptions() {
        return this.deliveryOptions;
    }
    /**
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    @Export(name="lastFreshStart", type=String.class, parameters={})
    private Output<String> lastFreshStart;

    /**
     * @return The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    public Output<String> getLastFreshStart() {
        return this.lastFreshStart;
    }
    /**
     * Name of the configuration set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the configuration set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    @Export(name="reputationMetricsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reputationMetricsEnabled;

    /**
     * @return Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }
    /**
     * Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    @Export(name="sendingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendingEnabled;

    /**
     * @return Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationSet(String name) {
        this(name, ConfigurationSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/configurationSet:ConfigurationSet", name, args == null ? ConfigurationSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationSet(String name, Output<String> id, @Nullable ConfigurationSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/configurationSet:ConfigurationSet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:ses/confgurationSet:ConfgurationSet").build())
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
    public static ConfigurationSet get(String name, Output<String> id, @Nullable ConfigurationSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationSet(name, id, state, options);
    }
}
