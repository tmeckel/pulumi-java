// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The feedback that the customer has about a certain answer in the conversation.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse Empty = new GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse();

    /**
     * Indicates whether an answer or item was clicked by the human agent.
     * 
     */
    @InputImport(name="clicked", required=true)
      private final Boolean clicked;

    public Boolean getClicked() {
        return this.clicked;
    }

    /**
     * The correctness level of an answer.
     * 
     */
    @InputImport(name="correctnessLevel", required=true)
      private final String correctnessLevel;

    public String getCorrectnessLevel() {
        return this.correctnessLevel;
    }

    /**
     * Indicates whether an answer or item was displayed to the human agent in the agent desktop UI.
     * 
     */
    @InputImport(name="displayed", required=true)
      private final Boolean displayed;

    public Boolean getDisplayed() {
        return this.displayed;
    }

    public GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse(
        Boolean clicked,
        String correctnessLevel,
        Boolean displayed) {
        this.clicked = Objects.requireNonNull(clicked, "expected parameter 'clicked' to be non-null");
        this.correctnessLevel = Objects.requireNonNull(correctnessLevel, "expected parameter 'correctnessLevel' to be non-null");
        this.displayed = Objects.requireNonNull(displayed, "expected parameter 'displayed' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse() {
        this.clicked = null;
        this.correctnessLevel = null;
        this.displayed = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clicked;
        private String correctnessLevel;
        private Boolean displayed;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clicked = defaults.clicked;
    	      this.correctnessLevel = defaults.correctnessLevel;
    	      this.displayed = defaults.displayed;
        }

        public Builder clicked(Boolean clicked) {
            this.clicked = Objects.requireNonNull(clicked);
            return this;
        }

        public Builder correctnessLevel(String correctnessLevel) {
            this.correctnessLevel = Objects.requireNonNull(correctnessLevel);
            return this;
        }

        public Builder displayed(Boolean displayed) {
            this.displayed = Objects.requireNonNull(displayed);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse build() {
            return new GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse(clicked, correctnessLevel, displayed);
        }
    }
}
