// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Opens the given URI.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs Empty = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs();

    /**
     * The HTTP or HTTPS scheme URI.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The HTTP or HTTPS scheme URI.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs() {}

    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs $) {
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uri The HTTP or HTTPS scheme URI.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The HTTP or HTTPS scheme URI.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
