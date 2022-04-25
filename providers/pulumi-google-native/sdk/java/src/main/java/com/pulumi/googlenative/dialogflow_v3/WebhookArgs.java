// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * Indicates whether the webhook is disabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Indicates whether the webhook is disabled.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The human-readable name of the webhook, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the webhook, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Configuration for a generic web service.
     * 
     */
    @Import(name="genericWebService")
    private @Nullable Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService;

    /**
     * @return Configuration for a generic web service.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs>> genericWebService() {
        return Optional.ofNullable(this.genericWebService);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    @Import(name="serviceDirectory")
    private @Nullable Output<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> serviceDirectory;

    /**
     * @return Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs>> serviceDirectory() {
        return Optional.ofNullable(this.serviceDirectory);
    }

    /**
     * Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private WebhookArgs() {}

    private WebhookArgs(WebhookArgs $) {
        this.agentId = $.agentId;
        this.disabled = $.disabled;
        this.displayName = $.displayName;
        this.genericWebService = $.genericWebService;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.serviceDirectory = $.serviceDirectory;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookArgs $;

        public Builder() {
            $ = new WebhookArgs();
        }

        public Builder(WebhookArgs defaults) {
            $ = new WebhookArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param disabled Indicates whether the webhook is disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Indicates whether the webhook is disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param displayName The human-readable name of the webhook, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the webhook, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param genericWebService Configuration for a generic web service.
         * 
         * @return builder
         * 
         */
        public Builder genericWebService(@Nullable Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService) {
            $.genericWebService = genericWebService;
            return this;
        }

        /**
         * @param genericWebService Configuration for a generic web service.
         * 
         * @return builder
         * 
         */
        public Builder genericWebService(GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs genericWebService) {
            return genericWebService(Output.of(genericWebService));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceDirectory Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
         * 
         * @return builder
         * 
         */
        public Builder serviceDirectory(@Nullable Output<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs> serviceDirectory) {
            $.serviceDirectory = serviceDirectory;
            return this;
        }

        /**
         * @param serviceDirectory Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
         * 
         * @return builder
         * 
         */
        public Builder serviceDirectory(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs serviceDirectory) {
            return serviceDirectory(Output.of(serviceDirectory));
        }

        /**
         * @param timeout Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public WebhookArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
