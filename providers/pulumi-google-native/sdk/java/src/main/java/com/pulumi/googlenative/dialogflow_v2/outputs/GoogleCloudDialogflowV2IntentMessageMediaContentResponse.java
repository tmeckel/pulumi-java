// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageMediaContentResponse {
    /**
     * @return List of media objects.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;
    /**
     * @return Optional. What type of media is the content (ie &#34;audio&#34;).
     * 
     */
    private final String mediaType;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageMediaContentResponse(
        @CustomType.Parameter("mediaObjects") List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects,
        @CustomType.Parameter("mediaType") String mediaType) {
        this.mediaObjects = mediaObjects;
        this.mediaType = mediaType;
    }

    /**
     * @return List of media objects.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects() {
        return this.mediaObjects;
    }
    /**
     * @return Optional. What type of media is the content (ie &#34;audio&#34;).
     * 
     */
    public String mediaType() {
        return this.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;
        private String mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mediaObjects = defaults.mediaObjects;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder mediaObjects(List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects) {
            this.mediaObjects = Objects.requireNonNull(mediaObjects);
            return this;
        }
        public Builder mediaObjects(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse... mediaObjects) {
            return mediaObjects(List.of(mediaObjects));
        }
        public Builder mediaType(String mediaType) {
            this.mediaType = Objects.requireNonNull(mediaType);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageMediaContentResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponse(mediaObjects, mediaType);
        }
    }
}
