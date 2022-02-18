// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryFieldResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CloudStorageFileSetResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CloudStoragePathResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse {
    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * 
     */
    private final GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField;
    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     * 
     */
    private final GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet;
    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * 
     */
    private final GooglePrivacyDlpV2CloudStoragePathResponse outputPath;

    @OutputCustomType.Constructor({"bigQueryField","cloudStorageFileSet","outputPath"})
    private GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse(
        GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField,
        GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet,
        GooglePrivacyDlpV2CloudStoragePathResponse outputPath) {
        this.bigQueryField = Objects.requireNonNull(bigQueryField);
        this.cloudStorageFileSet = Objects.requireNonNull(cloudStorageFileSet);
        this.outputPath = Objects.requireNonNull(outputPath);
    }

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * 
     */
    public GooglePrivacyDlpV2BigQueryFieldResponse getBigQueryField() {
        return this.bigQueryField;
    }
    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     * 
     */
    public GooglePrivacyDlpV2CloudStorageFileSetResponse getCloudStorageFileSet() {
        return this.cloudStorageFileSet;
    }
    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * 
     */
    public GooglePrivacyDlpV2CloudStoragePathResponse getOutputPath() {
        return this.outputPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField;
        private GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet;
        private GooglePrivacyDlpV2CloudStoragePathResponse outputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryField = defaults.bigQueryField;
    	      this.cloudStorageFileSet = defaults.cloudStorageFileSet;
    	      this.outputPath = defaults.outputPath;
        }

        public Builder setBigQueryField(GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField) {
            this.bigQueryField = Objects.requireNonNull(bigQueryField);
            return this;
        }

        public Builder setCloudStorageFileSet(GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet) {
            this.cloudStorageFileSet = Objects.requireNonNull(cloudStorageFileSet);
            return this;
        }

        public Builder setOutputPath(GooglePrivacyDlpV2CloudStoragePathResponse outputPath) {
            this.outputPath = Objects.requireNonNull(outputPath);
            return this;
        }

        public GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse build() {
            return new GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse(bigQueryField, cloudStorageFileSet, outputPath);
        }
    }
}
