// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an audio clip to be played by the client as part of the response.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse();

    /**
     * Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption", required=true)
    private Boolean allowPlaybackInterruption;

    /**
     * @return Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    public Boolean allowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }

    /**
     * URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    @Import(name="audioUri", required=true)
    private String audioUri;

    /**
     * @return URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    public String audioUri() {
        return this.audioUri;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse() {}

    private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse $) {
        this.allowPlaybackInterruption = $.allowPlaybackInterruption;
        this.audioUri = $.audioUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowPlaybackInterruption Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
         * 
         * @return builder
         * 
         */
        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            $.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        /**
         * @param audioUri URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
         * 
         * @return builder
         * 
         */
        public Builder audioUri(String audioUri) {
            $.audioUri = audioUri;
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse build() {
            $.allowPlaybackInterruption = Objects.requireNonNull($.allowPlaybackInterruption, "expected parameter 'allowPlaybackInterruption' to be non-null");
            $.audioUri = Objects.requireNonNull($.audioUri, "expected parameter 'audioUri' to be non-null");
            return $;
        }
    }

}
