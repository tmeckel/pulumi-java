// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2WordListArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Replace each input value with a value randomly selected from the dictionary.
 * 
 */
public final class GooglePrivacyDlpV2ReplaceDictionaryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ReplaceDictionaryConfigArgs Empty = new GooglePrivacyDlpV2ReplaceDictionaryConfigArgs();

    /**
     * A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * 
     */
    @Import(name="wordList")
    private @Nullable Output<GooglePrivacyDlpV2WordListArgs> wordList;

    /**
     * @return A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2WordListArgs>> wordList() {
        return Optional.ofNullable(this.wordList);
    }

    private GooglePrivacyDlpV2ReplaceDictionaryConfigArgs() {}

    private GooglePrivacyDlpV2ReplaceDictionaryConfigArgs(GooglePrivacyDlpV2ReplaceDictionaryConfigArgs $) {
        this.wordList = $.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2ReplaceDictionaryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ReplaceDictionaryConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2ReplaceDictionaryConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2ReplaceDictionaryConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2ReplaceDictionaryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
         * 
         * @return builder
         * 
         */
        public Builder wordList(@Nullable Output<GooglePrivacyDlpV2WordListArgs> wordList) {
            $.wordList = wordList;
            return this;
        }

        /**
         * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
         * 
         * @return builder
         * 
         */
        public Builder wordList(GooglePrivacyDlpV2WordListArgs wordList) {
            return wordList(Output.of(wordList));
        }

        public GooglePrivacyDlpV2ReplaceDictionaryConfigArgs build() {
            return $;
        }
    }

}
