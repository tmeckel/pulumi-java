// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxPageEventHandlerTriggerFulfillment;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageEventHandler {
    /**
     * @return The name of the event to handle.
     * 
     */
    private final @Nullable String event;
    /**
     * @return -
     * The unique identifier of this event handler.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The target flow to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    private final @Nullable String targetFlow;
    /**
     * @return The target page to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
     * 
     */
    private final @Nullable String targetPage;
    /**
     * @return The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    private final @Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment;

    @CustomType.Constructor
    private CxPageEventHandler(
        @CustomType.Parameter("event") @Nullable String event,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("targetFlow") @Nullable String targetFlow,
        @CustomType.Parameter("targetPage") @Nullable String targetPage,
        @CustomType.Parameter("triggerFulfillment") @Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment) {
        this.event = event;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    /**
     * @return The name of the event to handle.
     * 
     */
    public Optional<String> event() {
        return Optional.ofNullable(this.event);
    }
    /**
     * @return -
     * The unique identifier of this event handler.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The target flow to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    public Optional<String> targetFlow() {
        return Optional.ofNullable(this.targetFlow);
    }
    /**
     * @return The target page to transition to.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
     * 
     */
    public Optional<String> targetPage() {
        return Optional.ofNullable(this.targetPage);
    }
    /**
     * @return The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    public Optional<CxPageEventHandlerTriggerFulfillment> triggerFulfillment() {
        return Optional.ofNullable(this.triggerFulfillment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEventHandler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String event;
        private @Nullable String name;
        private @Nullable String targetFlow;
        private @Nullable String targetPage;
        private @Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEventHandler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder event(@Nullable String event) {
            this.event = event;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder targetFlow(@Nullable String targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }
        public Builder targetPage(@Nullable String targetPage) {
            this.targetPage = targetPage;
            return this;
        }
        public Builder triggerFulfillment(@Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }        public CxPageEventHandler build() {
            return new CxPageEventHandler(event, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
