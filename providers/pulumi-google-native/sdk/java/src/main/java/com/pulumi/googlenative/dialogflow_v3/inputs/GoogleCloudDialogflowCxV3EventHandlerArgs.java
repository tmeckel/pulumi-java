// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An event handler specifies an event that can be handled during a session. When the specified event happens, the following actions are taken in order: * If there is a `trigger_fulfillment` associated with the event, it will be called. * If there is a `target_page` associated with the event, the session will transition into the specified page. * If there is a `target_flow` associated with the event, the session will transition into the specified flow.
 * 
 */
public final class GoogleCloudDialogflowCxV3EventHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EventHandlerArgs Empty = new GoogleCloudDialogflowCxV3EventHandlerArgs();

    /**
     * The name of the event to handle.
     * 
     */
    @Import(name="event", required=true)
    private Output<String> event;

    /**
     * @return The name of the event to handle.
     * 
     */
    public Output<String> event() {
        return this.event;
    }

    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="targetFlow")
    private @Nullable Output<String> targetFlow;

    /**
     * @return The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    public Optional<Output<String>> targetFlow() {
        return Optional.ofNullable(this.targetFlow);
    }

    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @Import(name="targetPage")
    private @Nullable Output<String> targetPage;

    /**
     * @return The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    public Optional<Output<String>> targetPage() {
        return Optional.ofNullable(this.targetPage);
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * 
     */
    @Import(name="triggerFulfillment")
    private @Nullable Output<GoogleCloudDialogflowCxV3FulfillmentArgs> triggerFulfillment;

    /**
     * @return The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3FulfillmentArgs>> triggerFulfillment() {
        return Optional.ofNullable(this.triggerFulfillment);
    }

    private GoogleCloudDialogflowCxV3EventHandlerArgs() {}

    private GoogleCloudDialogflowCxV3EventHandlerArgs(GoogleCloudDialogflowCxV3EventHandlerArgs $) {
        this.event = $.event;
        this.targetFlow = $.targetFlow;
        this.targetPage = $.targetPage;
        this.triggerFulfillment = $.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3EventHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3EventHandlerArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3EventHandlerArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3EventHandlerArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3EventHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param event The name of the event to handle.
         * 
         * @return builder
         * 
         */
        public Builder event(Output<String> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event The name of the event to handle.
         * 
         * @return builder
         * 
         */
        public Builder event(String event) {
            return event(Output.of(event));
        }

        /**
         * @param targetFlow The target flow to transition to. Format: `projects//locations//agents//flows/`.
         * 
         * @return builder
         * 
         */
        public Builder targetFlow(@Nullable Output<String> targetFlow) {
            $.targetFlow = targetFlow;
            return this;
        }

        /**
         * @param targetFlow The target flow to transition to. Format: `projects//locations//agents//flows/`.
         * 
         * @return builder
         * 
         */
        public Builder targetFlow(String targetFlow) {
            return targetFlow(Output.of(targetFlow));
        }

        /**
         * @param targetPage The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
         * 
         * @return builder
         * 
         */
        public Builder targetPage(@Nullable Output<String> targetPage) {
            $.targetPage = targetPage;
            return this;
        }

        /**
         * @param targetPage The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
         * 
         * @return builder
         * 
         */
        public Builder targetPage(String targetPage) {
            return targetPage(Output.of(targetPage));
        }

        /**
         * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
         * 
         * @return builder
         * 
         */
        public Builder triggerFulfillment(@Nullable Output<GoogleCloudDialogflowCxV3FulfillmentArgs> triggerFulfillment) {
            $.triggerFulfillment = triggerFulfillment;
            return this;
        }

        /**
         * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
         * 
         * @return builder
         * 
         */
        public Builder triggerFulfillment(GoogleCloudDialogflowCxV3FulfillmentArgs triggerFulfillment) {
            return triggerFulfillment(Output.of(triggerFulfillment));
        }

        public GoogleCloudDialogflowCxV3EventHandlerArgs build() {
            $.event = Objects.requireNonNull($.event, "expected parameter 'event' to be non-null");
            return $;
        }
    }

}
