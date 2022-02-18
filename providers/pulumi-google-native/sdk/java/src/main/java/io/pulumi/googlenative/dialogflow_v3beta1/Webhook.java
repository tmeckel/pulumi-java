// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.WebhookArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a webhook in the specified agent.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:Webhook")
public class Webhook extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether the webhook is disabled.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Indicates whether the webhook is disabled.
     * 
     */
    public Output<Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The human-readable name of the webhook, unique within the agent.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the webhook, unique within the agent.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Configuration for a generic web service.
     * 
     */
    @OutputExport(name="genericWebService", type=GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse> genericWebService;

    /**
     * @return Configuration for a generic web service.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse> getGenericWebService() {
        return this.genericWebService;
    }
    /**
     * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    @OutputExport(name="serviceDirectory", type=GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse> serviceDirectory;

    /**
     * @return Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse> getServiceDirectory() {
        return this.serviceDirectory;
    }
    /**
     * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    @OutputExport(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    public Output<String> getTimeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Webhook(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Webhook", name, null, makeResourceOptions(options, id));
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
    public static Webhook get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, options);
    }
}
