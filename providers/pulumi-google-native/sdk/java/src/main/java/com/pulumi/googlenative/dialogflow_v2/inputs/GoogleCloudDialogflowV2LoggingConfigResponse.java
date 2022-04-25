// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Defines logging behavior for conversation lifecycle events.
 * 
 */
public final class GoogleCloudDialogflowV2LoggingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2LoggingConfigResponse Empty = new GoogleCloudDialogflowV2LoggingConfigResponse();

    /**
     * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
     */
    @Import(name="enableStackdriverLogging", required=true)
    private Boolean enableStackdriverLogging;

    /**
     * @return Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
     */
    public Boolean enableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    private GoogleCloudDialogflowV2LoggingConfigResponse() {}

    private GoogleCloudDialogflowV2LoggingConfigResponse(GoogleCloudDialogflowV2LoggingConfigResponse $) {
        this.enableStackdriverLogging = $.enableStackdriverLogging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2LoggingConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2LoggingConfigResponse();
        }

        public Builder(GoogleCloudDialogflowV2LoggingConfigResponse defaults) {
            $ = new GoogleCloudDialogflowV2LoggingConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableStackdriverLogging Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            $.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public GoogleCloudDialogflowV2LoggingConfigResponse build() {
            $.enableStackdriverLogging = Objects.requireNonNull($.enableStackdriverLogging, "expected parameter 'enableStackdriverLogging' to be non-null");
            return $;
        }
    }

}
