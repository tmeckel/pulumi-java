// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1AudioInputResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1DtmfInputResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EventInputResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1IntentInputResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TextInputResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1QueryInputResponse {
    /**
     * @return The natural language speech audio to be processed.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1AudioInputResponse audio;
    /**
     * @return The DTMF event to be handled.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf;
    /**
     * @return The event to be triggered.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1EventInputResponse event;
    /**
     * @return The intent to be triggered.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1IntentInputResponse intent;
    /**
     * @return The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    private final String languageCode;
    /**
     * @return The natural language text to be processed.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1TextInputResponse text;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1QueryInputResponse(
        @CustomType.Parameter("audio") GoogleCloudDialogflowCxV3beta1AudioInputResponse audio,
        @CustomType.Parameter("dtmf") GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf,
        @CustomType.Parameter("event") GoogleCloudDialogflowCxV3beta1EventInputResponse event,
        @CustomType.Parameter("intent") GoogleCloudDialogflowCxV3beta1IntentInputResponse intent,
        @CustomType.Parameter("languageCode") String languageCode,
        @CustomType.Parameter("text") GoogleCloudDialogflowCxV3beta1TextInputResponse text) {
        this.audio = audio;
        this.dtmf = dtmf;
        this.event = event;
        this.intent = intent;
        this.languageCode = languageCode;
        this.text = text;
    }

    /**
     * @return The natural language speech audio to be processed.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1AudioInputResponse audio() {
        return this.audio;
    }
    /**
     * @return The DTMF event to be handled.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf() {
        return this.dtmf;
    }
    /**
     * @return The event to be triggered.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1EventInputResponse event() {
        return this.event;
    }
    /**
     * @return The intent to be triggered.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1IntentInputResponse intent() {
        return this.intent;
    }
    /**
     * @return The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return The natural language text to be processed.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1TextInputResponse text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1QueryInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1AudioInputResponse audio;
        private GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf;
        private GoogleCloudDialogflowCxV3beta1EventInputResponse event;
        private GoogleCloudDialogflowCxV3beta1IntentInputResponse intent;
        private String languageCode;
        private GoogleCloudDialogflowCxV3beta1TextInputResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1QueryInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.dtmf = defaults.dtmf;
    	      this.event = defaults.event;
    	      this.intent = defaults.intent;
    	      this.languageCode = defaults.languageCode;
    	      this.text = defaults.text;
        }

        public Builder audio(GoogleCloudDialogflowCxV3beta1AudioInputResponse audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }
        public Builder dtmf(GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf) {
            this.dtmf = Objects.requireNonNull(dtmf);
            return this;
        }
        public Builder event(GoogleCloudDialogflowCxV3beta1EventInputResponse event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public Builder intent(GoogleCloudDialogflowCxV3beta1IntentInputResponse intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder text(GoogleCloudDialogflowCxV3beta1TextInputResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1QueryInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1QueryInputResponse(audio, dtmf, event, intent, languageCode, text);
        }
    }
}
