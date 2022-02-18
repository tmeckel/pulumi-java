// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EventHandlerResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3NluSettingsResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetFlowResult {
    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the flow.
     * 
     */
    private final String displayName;
    /**
     * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers;
    /**
     * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    private final String name;
    /**
     * NLU related settings of the flow.
     * 
     */
    private final GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings;
    /**
     * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    private final List<String> transitionRouteGroups;
    /**
     * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified.. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes;

    @OutputCustomType.Constructor({"description","displayName","eventHandlers","name","nluSettings","transitionRouteGroups","transitionRoutes"})
    private GetFlowResult(
        String description,
        String displayName,
        List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers,
        String name,
        GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings,
        List<String> transitionRouteGroups,
        List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes) {
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.eventHandlers = Objects.requireNonNull(eventHandlers);
        this.name = Objects.requireNonNull(name);
        this.nluSettings = Objects.requireNonNull(nluSettings);
        this.transitionRouteGroups = Objects.requireNonNull(transitionRouteGroups);
        this.transitionRoutes = Objects.requireNonNull(transitionRoutes);
    }

    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the flow.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    public List<GoogleCloudDialogflowCxV3EventHandlerResponse> getEventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * NLU related settings of the flow.
     * 
     */
    public GoogleCloudDialogflowCxV3NluSettingsResponse getNluSettings() {
        return this.nluSettings;
    }
    /**
     * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public List<String> getTransitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified.. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    public List<GoogleCloudDialogflowCxV3TransitionRouteResponse> getTransitionRoutes() {
        return this.transitionRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers;
        private String name;
        private GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings;
        private List<String> transitionRouteGroups;
        private List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.name = defaults.name;
    	      this.nluSettings = defaults.nluSettings;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEventHandlers(List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers) {
            this.eventHandlers = Objects.requireNonNull(eventHandlers);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNluSettings(GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings) {
            this.nluSettings = Objects.requireNonNull(nluSettings);
            return this;
        }

        public Builder setTransitionRouteGroups(List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Objects.requireNonNull(transitionRouteGroups);
            return this;
        }

        public Builder setTransitionRoutes(List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes) {
            this.transitionRoutes = Objects.requireNonNull(transitionRoutes);
            return this;
        }

        public GetFlowResult build() {
            return new GetFlowResult(description, displayName, eventHandlers, name, nluSettings, transitionRouteGroups, transitionRoutes);
        }
    }
}
