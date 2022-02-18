// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EventHandlerArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FormArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The states of a CX session are represented by pages. For each flow, you define many pages, where your combined pages can handle a complete conversation on the topics the flow is designed for. At any given moment, exactly one page is the current page, the current page is considered active, and the flow associated with that page is considered active. Every flow has a special start page. When a flow initially becomes active, the start page page becomes the current page. For each conversational turn, the current page will either stay the same or transition to another page. You configure each page to collect information from the end-user that is relevant for the conversational state represented by the page. For more information, see the [Page guide](https://cloud.google.com/dialogflow/cx/docs/concept/page).
 * 
 */
public final class GoogleCloudDialogflowCxV3PageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3PageArgs Empty = new GoogleCloudDialogflowCxV3PageArgs();

    /**
     * The human-readable name of the page, unique within the agent.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The fulfillment to call when the session is entering the page.
     * 
     */
    @InputImport(name="entryFulfillment")
    private final @Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> entryFulfillment;

    public Input<GoogleCloudDialogflowCxV3FulfillmentArgs> getEntryFulfillment() {
        return this.entryFulfillment == null ? Input.empty() : this.entryFulfillment;
    }

    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    @InputImport(name="eventHandlers")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3EventHandlerArgs>> eventHandlers;

    public Input<List<GoogleCloudDialogflowCxV3EventHandlerArgs>> getEventHandlers() {
        return this.eventHandlers == null ? Input.empty() : this.eventHandlers;
    }

    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    @InputImport(name="form")
    private final @Nullable Input<GoogleCloudDialogflowCxV3FormArgs> form;

    public Input<GoogleCloudDialogflowCxV3FormArgs> getForm() {
        return this.form == null ? Input.empty() : this.form;
    }

    /**
     * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page's transition route -> page's transition route group -> flow's transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @InputImport(name="transitionRouteGroups")
    private final @Nullable Input<List<String>> transitionRouteGroups;

    public Input<List<String>> getTransitionRouteGroups() {
        return this.transitionRouteGroups == null ? Input.empty() : this.transitionRouteGroups;
    }

    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    @InputImport(name="transitionRoutes")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> transitionRoutes;

    public Input<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> getTransitionRoutes() {
        return this.transitionRoutes == null ? Input.empty() : this.transitionRoutes;
    }

    public GoogleCloudDialogflowCxV3PageArgs(
        Input<String> displayName,
        @Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> entryFulfillment,
        @Nullable Input<List<GoogleCloudDialogflowCxV3EventHandlerArgs>> eventHandlers,
        @Nullable Input<GoogleCloudDialogflowCxV3FormArgs> form,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> transitionRouteGroups,
        @Nullable Input<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> transitionRoutes) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entryFulfillment = entryFulfillment;
        this.eventHandlers = eventHandlers;
        this.form = form;
        this.name = name;
        this.transitionRouteGroups = transitionRouteGroups;
        this.transitionRoutes = transitionRoutes;
    }

    private GoogleCloudDialogflowCxV3PageArgs() {
        this.displayName = Input.empty();
        this.entryFulfillment = Input.empty();
        this.eventHandlers = Input.empty();
        this.form = Input.empty();
        this.name = Input.empty();
        this.transitionRouteGroups = Input.empty();
        this.transitionRoutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3PageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> entryFulfillment;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3EventHandlerArgs>> eventHandlers;
        private @Nullable Input<GoogleCloudDialogflowCxV3FormArgs> form;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> transitionRouteGroups;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3PageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entryFulfillment = defaults.entryFulfillment;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.form = defaults.form;
    	      this.name = defaults.name;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEntryFulfillment(@Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> entryFulfillment) {
            this.entryFulfillment = entryFulfillment;
            return this;
        }

        public Builder setEntryFulfillment(@Nullable GoogleCloudDialogflowCxV3FulfillmentArgs entryFulfillment) {
            this.entryFulfillment = Input.ofNullable(entryFulfillment);
            return this;
        }

        public Builder setEventHandlers(@Nullable Input<List<GoogleCloudDialogflowCxV3EventHandlerArgs>> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }

        public Builder setEventHandlers(@Nullable List<GoogleCloudDialogflowCxV3EventHandlerArgs> eventHandlers) {
            this.eventHandlers = Input.ofNullable(eventHandlers);
            return this;
        }

        public Builder setForm(@Nullable Input<GoogleCloudDialogflowCxV3FormArgs> form) {
            this.form = form;
            return this;
        }

        public Builder setForm(@Nullable GoogleCloudDialogflowCxV3FormArgs form) {
            this.form = Input.ofNullable(form);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTransitionRouteGroups(@Nullable Input<List<String>> transitionRouteGroups) {
            this.transitionRouteGroups = transitionRouteGroups;
            return this;
        }

        public Builder setTransitionRouteGroups(@Nullable List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Input.ofNullable(transitionRouteGroups);
            return this;
        }

        public Builder setTransitionRoutes(@Nullable Input<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> transitionRoutes) {
            this.transitionRoutes = transitionRoutes;
            return this;
        }

        public Builder setTransitionRoutes(@Nullable List<GoogleCloudDialogflowCxV3TransitionRouteArgs> transitionRoutes) {
            this.transitionRoutes = Input.ofNullable(transitionRoutes);
            return this;
        }

        public GoogleCloudDialogflowCxV3PageArgs build() {
            return new GoogleCloudDialogflowCxV3PageArgs(displayName, entryFulfillment, eventHandlers, form, name, transitionRouteGroups, transitionRoutes);
        }
    }
}
