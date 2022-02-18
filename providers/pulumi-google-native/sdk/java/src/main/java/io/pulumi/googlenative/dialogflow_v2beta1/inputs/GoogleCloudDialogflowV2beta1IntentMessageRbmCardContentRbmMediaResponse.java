// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Rich Business Messaging (RBM) Media displayed in Cards The following media-types are currently supported: Image Types * image/jpeg * image/jpg' * image/gif * image/png Video Types * video/h263 * video/m4v * video/mp4 * video/mpeg * video/mpeg4 * video/webm
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse();

    /**
     * Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the file. The content-type field must be present and accurate in the HTTP response from the URL.
     * 
     */
    @InputImport(name="fileUri", required=true)
    private final String fileUri;

    public String getFileUri() {
        return this.fileUri;
    }

    /**
     * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
     * 
     */
    @InputImport(name="height", required=true)
    private final String height;

    public String getHeight() {
        return this.height;
    }

    /**
     * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
     * 
     */
    @InputImport(name="thumbnailUri", required=true)
    private final String thumbnailUri;

    public String getThumbnailUri() {
        return this.thumbnailUri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse(
        String fileUri,
        String height,
        String thumbnailUri) {
        this.fileUri = Objects.requireNonNull(fileUri, "expected parameter 'fileUri' to be non-null");
        this.height = Objects.requireNonNull(height, "expected parameter 'height' to be non-null");
        this.thumbnailUri = Objects.requireNonNull(thumbnailUri, "expected parameter 'thumbnailUri' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse() {
        this.fileUri = null;
        this.height = null;
        this.thumbnailUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileUri;
        private String height;
        private String thumbnailUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileUri = defaults.fileUri;
    	      this.height = defaults.height;
    	      this.thumbnailUri = defaults.thumbnailUri;
        }

        public Builder setFileUri(String fileUri) {
            this.fileUri = Objects.requireNonNull(fileUri);
            return this;
        }

        public Builder setHeight(String height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }

        public Builder setThumbnailUri(String thumbnailUri) {
            this.thumbnailUri = Objects.requireNonNull(thumbnailUri);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse(fileUri, height, thumbnailUri);
        }
    }
}
