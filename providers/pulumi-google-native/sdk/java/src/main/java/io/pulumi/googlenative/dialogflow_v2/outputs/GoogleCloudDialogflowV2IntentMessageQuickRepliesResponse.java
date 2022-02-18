// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse {
    /**
     * Optional. The collection of quick replies.
     * 
     */
    private final List<String> quickReplies;
    /**
     * Optional. The title of the collection of quick replies.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"quickReplies","title"})
    private GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse(
        List<String> quickReplies,
        String title) {
        this.quickReplies = Objects.requireNonNull(quickReplies);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Optional. The collection of quick replies.
     * 
     */
    public List<String> getQuickReplies() {
        return this.quickReplies;
    }
    /**
     * Optional. The title of the collection of quick replies.
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> quickReplies;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quickReplies = defaults.quickReplies;
    	      this.title = defaults.title;
        }

        public Builder setQuickReplies(List<String> quickReplies) {
            this.quickReplies = Objects.requireNonNull(quickReplies);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse(quickReplies, title);
        }
    }
}
