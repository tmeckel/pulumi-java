// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryWordListGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeDictionaryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeDictionaryGetArgs Empty = new PreventionStoredInfoTypeDictionaryGetArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudStoragePath")
      private final @Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath;

    public Input<PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs> getCloudStoragePath() {
        return this.cloudStoragePath == null ? Input.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @InputImport(name="wordList")
      private final @Nullable Input<PreventionStoredInfoTypeDictionaryWordListGetArgs> wordList;

    public Input<PreventionStoredInfoTypeDictionaryWordListGetArgs> getWordList() {
        return this.wordList == null ? Input.empty() : this.wordList;
    }

    public PreventionStoredInfoTypeDictionaryGetArgs(
        @Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath,
        @Nullable Input<PreventionStoredInfoTypeDictionaryWordListGetArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionStoredInfoTypeDictionaryGetArgs() {
        this.cloudStoragePath = Input.empty();
        this.wordList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeDictionaryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath;
        private @Nullable Input<PreventionStoredInfoTypeDictionaryWordListGetArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeDictionaryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(@Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }

        public Builder cloudStoragePath(@Nullable PreventionStoredInfoTypeDictionaryCloudStoragePathGetArgs cloudStoragePath) {
            this.cloudStoragePath = Input.ofNullable(cloudStoragePath);
            return this;
        }

        public Builder wordList(@Nullable Input<PreventionStoredInfoTypeDictionaryWordListGetArgs> wordList) {
            this.wordList = wordList;
            return this;
        }

        public Builder wordList(@Nullable PreventionStoredInfoTypeDictionaryWordListGetArgs wordList) {
            this.wordList = Input.ofNullable(wordList);
            return this;
        }
        public PreventionStoredInfoTypeDictionaryGetArgs build() {
            return new PreventionStoredInfoTypeDictionaryGetArgs(cloudStoragePath, wordList);
        }
    }
}
