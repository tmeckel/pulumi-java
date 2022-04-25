// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse {
    /**
     * @return Carousel items.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse(@CustomType.Parameter("items") List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items) {
        this.items = items;
    }

    /**
     * @return Carousel items.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse... items) {
            return items(List.of(items));
        }        public GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse(items);
        }
    }
}
