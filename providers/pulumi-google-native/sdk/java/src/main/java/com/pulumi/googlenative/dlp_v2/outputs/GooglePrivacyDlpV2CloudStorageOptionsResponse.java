// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FileSetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CloudStorageOptionsResponse {
    /**
     * @return Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    private final String bytesLimitPerFile;
    /**
     * @return Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    private final Integer bytesLimitPerFilePercent;
    /**
     * @return The set of one or more files to scan.
     * 
     */
    private final GooglePrivacyDlpV2FileSetResponse fileSet;
    /**
     * @return List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
     * 
     */
    private final List<String> fileTypes;
    /**
     * @return Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    private final Integer filesLimitPercent;
    private final String sampleMethod;

    @CustomType.Constructor
    private GooglePrivacyDlpV2CloudStorageOptionsResponse(
        @CustomType.Parameter("bytesLimitPerFile") String bytesLimitPerFile,
        @CustomType.Parameter("bytesLimitPerFilePercent") Integer bytesLimitPerFilePercent,
        @CustomType.Parameter("fileSet") GooglePrivacyDlpV2FileSetResponse fileSet,
        @CustomType.Parameter("fileTypes") List<String> fileTypes,
        @CustomType.Parameter("filesLimitPercent") Integer filesLimitPercent,
        @CustomType.Parameter("sampleMethod") String sampleMethod) {
        this.bytesLimitPerFile = bytesLimitPerFile;
        this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
        this.fileSet = fileSet;
        this.fileTypes = fileTypes;
        this.filesLimitPercent = filesLimitPercent;
        this.sampleMethod = sampleMethod;
    }

    /**
     * @return Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    public String bytesLimitPerFile() {
        return this.bytesLimitPerFile;
    }
    /**
     * @return Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    public Integer bytesLimitPerFilePercent() {
        return this.bytesLimitPerFilePercent;
    }
    /**
     * @return The set of one or more files to scan.
     * 
     */
    public GooglePrivacyDlpV2FileSetResponse fileSet() {
        return this.fileSet;
    }
    /**
     * @return List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
     * 
     */
    public List<String> fileTypes() {
        return this.fileTypes;
    }
    /**
     * @return Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    public Integer filesLimitPercent() {
        return this.filesLimitPercent;
    }
    public String sampleMethod() {
        return this.sampleMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bytesLimitPerFile;
        private Integer bytesLimitPerFilePercent;
        private GooglePrivacyDlpV2FileSetResponse fileSet;
        private List<String> fileTypes;
        private Integer filesLimitPercent;
        private String sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder bytesLimitPerFile(String bytesLimitPerFile) {
            this.bytesLimitPerFile = Objects.requireNonNull(bytesLimitPerFile);
            return this;
        }
        public Builder bytesLimitPerFilePercent(Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = Objects.requireNonNull(bytesLimitPerFilePercent);
            return this;
        }
        public Builder fileSet(GooglePrivacyDlpV2FileSetResponse fileSet) {
            this.fileSet = Objects.requireNonNull(fileSet);
            return this;
        }
        public Builder fileTypes(List<String> fileTypes) {
            this.fileTypes = Objects.requireNonNull(fileTypes);
            return this;
        }
        public Builder fileTypes(String... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }
        public Builder filesLimitPercent(Integer filesLimitPercent) {
            this.filesLimitPercent = Objects.requireNonNull(filesLimitPercent);
            return this;
        }
        public Builder sampleMethod(String sampleMethod) {
            this.sampleMethod = Objects.requireNonNull(sampleMethod);
            return this;
        }        public GooglePrivacyDlpV2CloudStorageOptionsResponse build() {
            return new GooglePrivacyDlpV2CloudStorageOptionsResponse(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
