// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A POSIX filesystem resource.
 * 
 */
public final class PosixFilesystemResponse extends io.pulumi.resources.InvokeArgs {

    public static final PosixFilesystemResponse Empty = new PosixFilesystemResponse();

    /**
     * Root directory path to the filesystem.
     * 
     */
    @InputImport(name="rootDirectory", required=true)
    private final String rootDirectory;

    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public PosixFilesystemResponse(String rootDirectory) {
        this.rootDirectory = Objects.requireNonNull(rootDirectory, "expected parameter 'rootDirectory' to be non-null");
    }

    private PosixFilesystemResponse() {
        this.rootDirectory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixFilesystemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixFilesystemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder setRootDirectory(String rootDirectory) {
            this.rootDirectory = Objects.requireNonNull(rootDirectory);
            return this;
        }

        public PosixFilesystemResponse build() {
            return new PosixFilesystemResponse(rootDirectory);
        }
    }
}
