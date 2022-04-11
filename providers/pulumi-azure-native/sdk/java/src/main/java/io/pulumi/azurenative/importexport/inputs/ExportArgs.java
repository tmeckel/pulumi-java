// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A property containing information about the blobs to be exported for an export job. This property is required for export jobs, but must not be specified for import jobs.
 * 
 */
public final class ExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportArgs Empty = new ExportArgs();

    /**
     * The relative URI to the block blob that contains the list of blob paths or blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI must begin with $root.
     * 
     */
    @Import(name="blobListBlobPath")
      private final @Nullable Output<String> blobListBlobPath;

    public Output<String> getBlobListBlobPath() {
        return this.blobListBlobPath == null ? Codegen.empty() : this.blobListBlobPath;
    }

    /**
     * A collection of blob-path strings.
     * 
     */
    @Import(name="blobPath")
      private final @Nullable Output<List<String>> blobPath;

    public Output<List<String>> getBlobPath() {
        return this.blobPath == null ? Codegen.empty() : this.blobPath;
    }

    /**
     * A collection of blob-prefix strings.
     * 
     */
    @Import(name="blobPathPrefix")
      private final @Nullable Output<List<String>> blobPathPrefix;

    public Output<List<String>> getBlobPathPrefix() {
        return this.blobPathPrefix == null ? Codegen.empty() : this.blobPathPrefix;
    }

    public ExportArgs(
        @Nullable Output<String> blobListBlobPath,
        @Nullable Output<List<String>> blobPath,
        @Nullable Output<List<String>> blobPathPrefix) {
        this.blobListBlobPath = blobListBlobPath;
        this.blobPath = blobPath;
        this.blobPathPrefix = blobPathPrefix;
    }

    private ExportArgs() {
        this.blobListBlobPath = Codegen.empty();
        this.blobPath = Codegen.empty();
        this.blobPathPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> blobListBlobPath;
        private @Nullable Output<List<String>> blobPath;
        private @Nullable Output<List<String>> blobPathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobListBlobPath = defaults.blobListBlobPath;
    	      this.blobPath = defaults.blobPath;
    	      this.blobPathPrefix = defaults.blobPathPrefix;
        }

        public Builder blobListBlobPath(@Nullable Output<String> blobListBlobPath) {
            this.blobListBlobPath = blobListBlobPath;
            return this;
        }
        public Builder blobListBlobPath(@Nullable String blobListBlobPath) {
            this.blobListBlobPath = Codegen.ofNullable(blobListBlobPath);
            return this;
        }
        public Builder blobPath(@Nullable Output<List<String>> blobPath) {
            this.blobPath = blobPath;
            return this;
        }
        public Builder blobPath(@Nullable List<String> blobPath) {
            this.blobPath = Codegen.ofNullable(blobPath);
            return this;
        }
        public Builder blobPath(String... blobPath) {
            return blobPath(List.of(blobPath));
        }
        public Builder blobPathPrefix(@Nullable Output<List<String>> blobPathPrefix) {
            this.blobPathPrefix = blobPathPrefix;
            return this;
        }
        public Builder blobPathPrefix(@Nullable List<String> blobPathPrefix) {
            this.blobPathPrefix = Codegen.ofNullable(blobPathPrefix);
            return this;
        }
        public Builder blobPathPrefix(String... blobPathPrefix) {
            return blobPathPrefix(List.of(blobPathPrefix));
        }        public ExportArgs build() {
            return new ExportArgs(blobListBlobPath, blobPath, blobPathPrefix);
        }
    }
}
