// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageListSelectItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageListSelectResponse {
    /**
     * List items.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items;
    /**
     * Optional. Subtitle of the list.
     * 
     */
    private final String subtitle;
    /**
     * Optional. The overall title of the list.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"items","subtitle","title"})
    private GoogleCloudDialogflowV2IntentMessageListSelectResponse(
        List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items,
        String subtitle,
        String title) {
        this.items = Objects.requireNonNull(items);
        this.subtitle = Objects.requireNonNull(subtitle);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * List items.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> getItems() {
        return this.items;
    }
    /**
     * Optional. Subtitle of the list.
     * 
     */
    public String getSubtitle() {
        return this.subtitle;
    }
    /**
     * Optional. The overall title of the list.
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageListSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageListSelectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setItems(List<GoogleCloudDialogflowV2IntentMessageListSelectItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageListSelectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageListSelectResponse(items, subtitle, title);
        }
    }
}
