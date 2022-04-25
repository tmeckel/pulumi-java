// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse;
import java.util.List;
import java.util.Objects;


/**
 * The card for presenting a carousel of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse();

    /**
     * Carousel items.
     * 
     */
    @Import(name="items", required=true)
    private List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items;

    /**
     * @return Carousel items.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items() {
        return this.items;
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse() {}

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param items Carousel items.
         * 
         * @return builder
         * 
         */
        public Builder items(List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items Carousel items.
         * 
         * @return builder
         * 
         */
        public Builder items(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse... items) {
            return items(List.of(items));
        }

        public GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
