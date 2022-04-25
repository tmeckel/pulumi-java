// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxPageEventHandlerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxPageEventHandlerGetArgs Empty = new CxPageEventHandlerGetArgs();

    /**
     * The name of the event to handle.
     * 
     */
    @Import(name="event")
    private @Nullable Output<String> event;

    /**
     * @return The name of the event to handle.
     * 
     */
    public Optional<Output<String>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return -
     * The unique identifier of this event handler.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The target flow to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    @Import(name="targetFlow")
    private @Nullable Output<String> targetFlow;

    /**
     * @return The target flow to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    public Optional<Output<String>> targetFlow() {
        return Optional.ofNullable(this.targetFlow);
    }

    /**
     * The target page to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
     * 
     */
    @Import(name="targetPage")
    private @Nullable Output<String> targetPage;

    /**
     * @return The target page to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
     * 
     */
    public Optional<Output<String>> targetPage() {
        return Optional.ofNullable(this.targetPage);
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    @Import(name="triggerFulfillment")
    private @Nullable Output<CxPageEventHandlerTriggerFulfillmentGetArgs> triggerFulfillment;

    /**
     * @return The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxPageEventHandlerTriggerFulfillmentGetArgs>> triggerFulfillment() {
        return Optional.ofNullable(this.triggerFulfillment);
    }

    private CxPageEventHandlerGetArgs() {}

    private CxPageEventHandlerGetArgs(CxPageEventHandlerGetArgs $) {
        this.event = $.event;
        this.name = $.name;
        this.targetFlow = $.targetFlow;
        this.targetPage = $.targetPage;
        this.triggerFulfillment = $.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxPageEventHandlerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxPageEventHandlerGetArgs $;

        public Builder() {
            $ = new CxPageEventHandlerGetArgs();
        }

        public Builder(CxPageEventHandlerGetArgs defaults) {
            $ = new CxPageEventHandlerGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param event The name of the event to handle.
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<String> event) {
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
         * @param name -
         * The unique identifier of this event handler.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name -
         * The unique identifier of this event handler.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param targetFlow The target flow to transition to.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder targetFlow(@Nullable Output<String> targetFlow) {
            $.targetFlow = targetFlow;
            return this;
        }

        /**
         * @param targetFlow The target flow to transition to.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder targetFlow(String targetFlow) {
            return targetFlow(Output.of(targetFlow));
        }

        /**
         * @param targetPage The target page to transition to.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder targetPage(@Nullable Output<String> targetPage) {
            $.targetPage = targetPage;
            return this;
        }

        /**
         * @param targetPage The target page to transition to.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder targetPage(String targetPage) {
            return targetPage(Output.of(targetPage));
        }

        /**
         * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggerFulfillment(@Nullable Output<CxPageEventHandlerTriggerFulfillmentGetArgs> triggerFulfillment) {
            $.triggerFulfillment = triggerFulfillment;
            return this;
        }

        /**
         * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggerFulfillment(CxPageEventHandlerTriggerFulfillmentGetArgs triggerFulfillment) {
            return triggerFulfillment(Output.of(triggerFulfillment));
        }

        public CxPageEventHandlerGetArgs build() {
            return $;
        }
    }

}
