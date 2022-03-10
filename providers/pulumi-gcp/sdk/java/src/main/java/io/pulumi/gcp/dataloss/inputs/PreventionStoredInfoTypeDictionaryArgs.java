// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryCloudStoragePathArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryWordListArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeDictionaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeDictionaryArgs Empty = new PreventionStoredInfoTypeDictionaryArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudStoragePath")
      private final @Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath;

    public Input<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> getCloudStoragePath() {
        return this.cloudStoragePath == null ? Input.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @InputImport(name="wordList")
      private final @Nullable Input<PreventionStoredInfoTypeDictionaryWordListArgs> wordList;

    public Input<PreventionStoredInfoTypeDictionaryWordListArgs> getWordList() {
        return this.wordList == null ? Input.empty() : this.wordList;
    }

    public PreventionStoredInfoTypeDictionaryArgs(
        @Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath,
        @Nullable Input<PreventionStoredInfoTypeDictionaryWordListArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionStoredInfoTypeDictionaryArgs() {
        this.cloudStoragePath = Input.empty();
        this.wordList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath;
        private @Nullable Input<PreventionStoredInfoTypeDictionaryWordListArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeDictionaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(@Nullable Input<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }

        public Builder cloudStoragePath(@Nullable PreventionStoredInfoTypeDictionaryCloudStoragePathArgs cloudStoragePath) {
            this.cloudStoragePath = Input.ofNullable(cloudStoragePath);
            return this;
        }

        public Builder wordList(@Nullable Input<PreventionStoredInfoTypeDictionaryWordListArgs> wordList) {
            this.wordList = wordList;
            return this;
        }

        public Builder wordList(@Nullable PreventionStoredInfoTypeDictionaryWordListArgs wordList) {
            this.wordList = Input.ofNullable(wordList);
            return this;
        }
        public PreventionStoredInfoTypeDictionaryArgs build() {
            return new PreventionStoredInfoTypeDictionaryArgs(cloudStoragePath, wordList);
        }
    }
}
