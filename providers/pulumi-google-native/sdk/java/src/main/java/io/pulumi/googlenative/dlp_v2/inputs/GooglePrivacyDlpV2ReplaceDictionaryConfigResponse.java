// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;


/**
 * Replace each input value with a value randomly selected from the dictionary.
 * 
 */
public final class GooglePrivacyDlpV2ReplaceDictionaryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ReplaceDictionaryConfigResponse Empty = new GooglePrivacyDlpV2ReplaceDictionaryConfigResponse();

    /**
     * A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * 
     */
    @InputImport(name="wordList", required=true)
    private final GooglePrivacyDlpV2WordListResponse wordList;

    public GooglePrivacyDlpV2WordListResponse getWordList() {
        return this.wordList;
    }

    public GooglePrivacyDlpV2ReplaceDictionaryConfigResponse(GooglePrivacyDlpV2WordListResponse wordList) {
        this.wordList = Objects.requireNonNull(wordList, "expected parameter 'wordList' to be non-null");
    }

    private GooglePrivacyDlpV2ReplaceDictionaryConfigResponse() {
        this.wordList = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2WordListResponse wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wordList = defaults.wordList;
        }

        public Builder setWordList(GooglePrivacyDlpV2WordListResponse wordList) {
            this.wordList = Objects.requireNonNull(wordList);
            return this;
        }

        public GooglePrivacyDlpV2ReplaceDictionaryConfigResponse build() {
            return new GooglePrivacyDlpV2ReplaceDictionaryConfigResponse(wordList);
        }
    }
}
