// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventHandlerArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for how the filling of a parameter should be handled.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs Empty = new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs();

    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * 
     */
    @InputImport(name="initialPromptFulfillment", required=true)
    private final Input<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment;

    public Input<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> getInitialPromptFulfillment() {
        return this.initialPromptFulfillment;
    }

    /**
     * The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user's response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can't be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
     * 
     */
    @InputImport(name="repromptEventHandlers")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> repromptEventHandlers;

    public Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> getRepromptEventHandlers() {
        return this.repromptEventHandlers == null ? Input.empty() : this.repromptEventHandlers;
    }

    public GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs(
        Input<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment,
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> repromptEventHandlers) {
        this.initialPromptFulfillment = Objects.requireNonNull(initialPromptFulfillment, "expected parameter 'initialPromptFulfillment' to be non-null");
        this.repromptEventHandlers = repromptEventHandlers;
    }

    private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs() {
        this.initialPromptFulfillment = Input.empty();
        this.repromptEventHandlers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> repromptEventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialPromptFulfillment = defaults.initialPromptFulfillment;
    	      this.repromptEventHandlers = defaults.repromptEventHandlers;
        }

        public Builder setInitialPromptFulfillment(Input<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> initialPromptFulfillment) {
            this.initialPromptFulfillment = Objects.requireNonNull(initialPromptFulfillment);
            return this;
        }

        public Builder setInitialPromptFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentArgs initialPromptFulfillment) {
            this.initialPromptFulfillment = Input.of(Objects.requireNonNull(initialPromptFulfillment));
            return this;
        }

        public Builder setRepromptEventHandlers(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> repromptEventHandlers) {
            this.repromptEventHandlers = repromptEventHandlers;
            return this;
        }

        public Builder setRepromptEventHandlers(@Nullable List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs> repromptEventHandlers) {
            this.repromptEventHandlers = Input.ofNullable(repromptEventHandlers);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs(initialPromptFulfillment, repromptEventHandlers);
        }
    }
}
