// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FileNoteResponse {
    /**
     * Provide a unique identifier to match analysis information on each specific file in a package
     * 
     */
    private final List<String> checksum;
    /**
     * This field provides information about the type of file identified
     * 
     */
    private final String fileType;
    /**
     * Identify the full path and filename that corresponds to the file information in this section
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"checksum","fileType","title"})
    private FileNoteResponse(
        List<String> checksum,
        String fileType,
        String title) {
        this.checksum = Objects.requireNonNull(checksum);
        this.fileType = Objects.requireNonNull(fileType);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Provide a unique identifier to match analysis information on each specific file in a package
     * 
     */
    public List<String> getChecksum() {
        return this.checksum;
    }
    /**
     * This field provides information about the type of file identified
     * 
     */
    public String getFileType() {
        return this.fileType;
    }
    /**
     * Identify the full path and filename that corresponds to the file information in this section
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> checksum;
        private String fileType;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(FileNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.fileType = defaults.fileType;
    	      this.title = defaults.title;
        }

        public Builder setChecksum(List<String> checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }

        public Builder setFileType(String fileType) {
            this.fileType = Objects.requireNonNull(fileType);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public FileNoteResponse build() {
            return new FileNoteResponse(checksum, fileType, title);
        }
    }
}
