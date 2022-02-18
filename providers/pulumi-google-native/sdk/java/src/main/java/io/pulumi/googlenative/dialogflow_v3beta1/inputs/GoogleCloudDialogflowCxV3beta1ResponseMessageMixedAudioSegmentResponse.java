// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents one segment of audio.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse();

    /**
     * Whether the playback of this segment can be interrupted by the end user's speech and the client should then start the next Dialogflow request.
     * 
     */
    @InputImport(name="allowPlaybackInterruption", required=true)
    private final Boolean allowPlaybackInterruption;

    public Boolean getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }

    /**
     * Raw audio synthesized from the Dialogflow agent's response using the output config specified in the request.
     * 
     */
    @InputImport(name="audio", required=true)
    private final String audio;

    public String getAudio() {
        return this.audio;
    }

    /**
     * Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it.
     * 
     */
    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse(
        Boolean allowPlaybackInterruption,
        String audio,
        String uri) {
        this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption, "expected parameter 'allowPlaybackInterruption' to be non-null");
        this.audio = Objects.requireNonNull(audio, "expected parameter 'audio' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse() {
        this.allowPlaybackInterruption = null;
        this.audio = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private String audio;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.audio = defaults.audio;
    	      this.uri = defaults.uri;
        }

        public Builder setAllowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }

        public Builder setAudio(String audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentResponse(allowPlaybackInterruption, audio, uri);
        }
    }
}
