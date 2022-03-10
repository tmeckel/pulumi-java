// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the storage of the tokens if a file system is used.
 * 
 */
public final class FileSystemTokenStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemTokenStoreArgs Empty = new FileSystemTokenStoreArgs();

    /**
     * The directory in which the tokens will be stored.
     * 
     */
    @InputImport(name="directory")
      private final @Nullable Input<String> directory;

    public Input<String> getDirectory() {
        return this.directory == null ? Input.empty() : this.directory;
    }

    public FileSystemTokenStoreArgs(@Nullable Input<String> directory) {
        this.directory = directory;
    }

    private FileSystemTokenStoreArgs() {
        this.directory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemTokenStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> directory;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemTokenStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directory = defaults.directory;
        }

        public Builder directory(@Nullable Input<String> directory) {
            this.directory = directory;
            return this;
        }

        public Builder directory(@Nullable String directory) {
            this.directory = Input.ofNullable(directory);
            return this;
        }
        public FileSystemTokenStoreArgs build() {
            return new FileSystemTokenStoreArgs(directory);
        }
    }
}
