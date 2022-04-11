// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Actions on Google action to open a given url.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs Empty = new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs();

    /**
     * URL
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    /**
     * Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
     * 
     */
    @Import(name="urlTypeHint")
      private final @Nullable Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> urlTypeHint;

    public Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> getUrlTypeHint() {
        return this.urlTypeHint == null ? Codegen.empty() : this.urlTypeHint;
    }

    public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs(
        Output<String> url,
        @Nullable Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> urlTypeHint) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.urlTypeHint = urlTypeHint;
    }

    private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs() {
        this.url = Codegen.empty();
        this.urlTypeHint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> url;
        private @Nullable Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> urlTypeHint;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
    	      this.urlTypeHint = defaults.urlTypeHint;
        }

        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }
        public Builder urlTypeHint(@Nullable Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> urlTypeHint) {
            this.urlTypeHint = urlTypeHint;
            return this;
        }
        public Builder urlTypeHint(@Nullable GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint urlTypeHint) {
            this.urlTypeHint = Codegen.ofNullable(urlTypeHint);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs(url, urlTypeHint);
        }
    }
}
