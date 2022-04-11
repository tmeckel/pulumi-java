// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.FileNoteFileType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FileNote represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 * 
 */
public final class FileNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileNoteArgs Empty = new FileNoteArgs();

    /**
     * Provide a unique identifier to match analysis information on each specific file in a package
     * 
     */
    @Import(name="checksum")
      private final @Nullable Output<List<String>> checksum;

    public Output<List<String>> getChecksum() {
        return this.checksum == null ? Codegen.empty() : this.checksum;
    }

    /**
     * This field provides information about the type of file identified
     * 
     */
    @Import(name="fileType")
      private final @Nullable Output<FileNoteFileType> fileType;

    public Output<FileNoteFileType> getFileType() {
        return this.fileType == null ? Codegen.empty() : this.fileType;
    }

    /**
     * Identify the full path and filename that corresponds to the file information in this section
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public FileNoteArgs(
        @Nullable Output<List<String>> checksum,
        @Nullable Output<FileNoteFileType> fileType,
        @Nullable Output<String> title) {
        this.checksum = checksum;
        this.fileType = fileType;
        this.title = title;
    }

    private FileNoteArgs() {
        this.checksum = Codegen.empty();
        this.fileType = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> checksum;
        private @Nullable Output<FileNoteFileType> fileType;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(FileNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.fileType = defaults.fileType;
    	      this.title = defaults.title;
        }

        public Builder checksum(@Nullable Output<List<String>> checksum) {
            this.checksum = checksum;
            return this;
        }
        public Builder checksum(@Nullable List<String> checksum) {
            this.checksum = Codegen.ofNullable(checksum);
            return this;
        }
        public Builder checksum(String... checksum) {
            return checksum(List.of(checksum));
        }
        public Builder fileType(@Nullable Output<FileNoteFileType> fileType) {
            this.fileType = fileType;
            return this;
        }
        public Builder fileType(@Nullable FileNoteFileType fileType) {
            this.fileType = Codegen.ofNullable(fileType);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public FileNoteArgs build() {
            return new FileNoteArgs(checksum, fileType, title);
        }
    }
}
