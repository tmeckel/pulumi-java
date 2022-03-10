// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.datacatalog.outputs.EntryGcsFilesetSpecSampleGcsFileSpec;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EntryGcsFilesetSpec {
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
    private final List<String> filePatterns;
    /**
     * - 
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<EntryGcsFilesetSpecSampleGcsFileSpec> sampleGcsFileSpecs;

    @OutputCustomType.Constructor
    private EntryGcsFilesetSpec(
        @OutputCustomType.Parameter("filePatterns") List<String> filePatterns,
        @OutputCustomType.Parameter("sampleGcsFileSpecs") @Nullable List<EntryGcsFilesetSpecSampleGcsFileSpec> sampleGcsFileSpecs) {
        this.filePatterns = filePatterns;
        this.sampleGcsFileSpecs = sampleGcsFileSpecs;
    }

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
    public List<String> getFilePatterns() {
        return this.filePatterns;
    }
    /**
     * - 
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * Structure is documented below.
     * 
    */
    public List<EntryGcsFilesetSpecSampleGcsFileSpec> getSampleGcsFileSpecs() {
        return this.sampleGcsFileSpecs == null ? List.of() : this.sampleGcsFileSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGcsFilesetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> filePatterns;
        private @Nullable List<EntryGcsFilesetSpecSampleGcsFileSpec> sampleGcsFileSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGcsFilesetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePatterns = defaults.filePatterns;
    	      this.sampleGcsFileSpecs = defaults.sampleGcsFileSpecs;
        }

        public Builder filePatterns(List<String> filePatterns) {
            this.filePatterns = Objects.requireNonNull(filePatterns);
            return this;
        }

        public Builder sampleGcsFileSpecs(@Nullable List<EntryGcsFilesetSpecSampleGcsFileSpec> sampleGcsFileSpecs) {
            this.sampleGcsFileSpecs = sampleGcsFileSpecs;
            return this;
        }
        public EntryGcsFilesetSpec build() {
            return new EntryGcsFilesetSpec(filePatterns, sampleGcsFileSpecs);
        }
    }
}
