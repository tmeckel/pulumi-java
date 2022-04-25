// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional info about the select item for when it is triggered in a dialog.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs();

    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return A unique key that will be sent back to the agent if this response is given.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    @Import(name="synonyms")
    private @Nullable Output<List<String>> synonyms;

    /**
     * @return Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    public Optional<Output<List<String>>> synonyms() {
        return Optional.ofNullable(this.synonyms);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs $) {
        this.key = $.key;
        this.synonyms = $.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A unique key that will be sent back to the agent if this response is given.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A unique key that will be sent back to the agent if this response is given.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param synonyms Optional. A list of synonyms that can also be used to trigger this item in dialog.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(@Nullable Output<List<String>> synonyms) {
            $.synonyms = synonyms;
            return this;
        }

        /**
         * @param synonyms Optional. A list of synonyms that can also be used to trigger this item in dialog.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(List<String> synonyms) {
            return synonyms(Output.of(synonyms));
        }

        /**
         * @param synonyms Optional. A list of synonyms that can also be used to trigger this item in dialog.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
