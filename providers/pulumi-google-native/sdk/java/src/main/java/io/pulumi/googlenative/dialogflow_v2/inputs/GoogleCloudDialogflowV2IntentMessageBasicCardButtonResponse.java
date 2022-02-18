// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The button object that appears at the bottom of a card.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse Empty = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse();

    /**
     * Action to take when a user taps on the button.
     * 
     */
    @InputImport(name="openUriAction", required=true)
    private final GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;

    public GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse getOpenUriAction() {
        return this.openUriAction;
    }

    /**
     * The title of the button.
     * 
     */
    @InputImport(name="title", required=true)
    private final String title;

    public String getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse(
        GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction,
        String title) {
        this.openUriAction = Objects.requireNonNull(openUriAction, "expected parameter 'openUriAction' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse() {
        this.openUriAction = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openUriAction = defaults.openUriAction;
    	      this.title = defaults.title;
        }

        public Builder setOpenUriAction(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction) {
            this.openUriAction = Objects.requireNonNull(openUriAction);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse(openUriAction, title);
        }
    }
}
