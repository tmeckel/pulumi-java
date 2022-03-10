// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecSampleGcsFileSpecGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGcsFilesetSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryGcsFilesetSpecGetArgs Empty = new EntryGcsFilesetSpecGetArgs();

    /**
     * Patterns to identify a set of files in Google Cloud Storage.
     * See [Cloud Storage documentation](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames)
     * for more information. Note that bucket wildcards are currently not supported. Examples of valid filePatterns:
     * * gs://bucket_name/dir/*: matches all files within bucket_name/dir directory.
     * * gs://bucket_name/dir/**: matches all files in bucket_name/dir spanning all subdirectories.
     * * gs://bucket_name/file*: matches files prefixed by file in bucket_name
     * * gs://bucket_name/??.txt: matches files with two characters followed by .txt in bucket_name
     * * gs://bucket_name/[aeiou].txt: matches files that contain a single vowel character followed by .txt in bucket_name
     * * gs://bucket_name/[a-m].txt: matches files that contain a, b, ... or m followed by .txt in bucket_name
     * * gs://bucket_name/a/*{@literal /}b: matches all files in bucket_name that match a/*{@literal /}b pattern, such as a/c/b, a/d/b
     * * gs://another_bucket/a.txt: matches gs://another_bucket/a.txt
     * 
     */
    @InputImport(name="filePatterns", required=true)
      private final Input<List<String>> filePatterns;

    public Input<List<String>> getFilePatterns() {
        return this.filePatterns;
    }

    /**
     * - 
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sampleGcsFileSpecs")
      private final @Nullable Input<List<EntryGcsFilesetSpecSampleGcsFileSpecGetArgs>> sampleGcsFileSpecs;

    public Input<List<EntryGcsFilesetSpecSampleGcsFileSpecGetArgs>> getSampleGcsFileSpecs() {
        return this.sampleGcsFileSpecs == null ? Input.empty() : this.sampleGcsFileSpecs;
    }

    public EntryGcsFilesetSpecGetArgs(
        Input<List<String>> filePatterns,
        @Nullable Input<List<EntryGcsFilesetSpecSampleGcsFileSpecGetArgs>> sampleGcsFileSpecs) {
        this.filePatterns = Objects.requireNonNull(filePatterns, "expected parameter 'filePatterns' to be non-null");
        this.sampleGcsFileSpecs = sampleGcsFileSpecs;
    }

    private EntryGcsFilesetSpecGetArgs() {
        this.filePatterns = Input.empty();
        this.sampleGcsFileSpecs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGcsFilesetSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> filePatterns;
        private @Nullable Input<List<EntryGcsFilesetSpecSampleGcsFileSpecGetArgs>> sampleGcsFileSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGcsFilesetSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePatterns = defaults.filePatterns;
    	      this.sampleGcsFileSpecs = defaults.sampleGcsFileSpecs;
        }

        public Builder filePatterns(Input<List<String>> filePatterns) {
            this.filePatterns = Objects.requireNonNull(filePatterns);
            return this;
        }

        public Builder filePatterns(List<String> filePatterns) {
            this.filePatterns = Input.of(Objects.requireNonNull(filePatterns));
            return this;
        }

        public Builder sampleGcsFileSpecs(@Nullable Input<List<EntryGcsFilesetSpecSampleGcsFileSpecGetArgs>> sampleGcsFileSpecs) {
            this.sampleGcsFileSpecs = sampleGcsFileSpecs;
            return this;
        }

        public Builder sampleGcsFileSpecs(@Nullable List<EntryGcsFilesetSpecSampleGcsFileSpecGetArgs> sampleGcsFileSpecs) {
            this.sampleGcsFileSpecs = Input.ofNullable(sampleGcsFileSpecs);
            return this;
        }
        public EntryGcsFilesetSpecGetArgs build() {
            return new EntryGcsFilesetSpecGetArgs(filePatterns, sampleGcsFileSpecs);
        }
    }
}
