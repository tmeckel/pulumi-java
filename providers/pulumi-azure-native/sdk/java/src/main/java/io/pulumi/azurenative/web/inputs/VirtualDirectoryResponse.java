// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Directory for virtual application.
 * 
 */
public final class VirtualDirectoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualDirectoryResponse Empty = new VirtualDirectoryResponse();

    /**
     * Physical path.
     * 
     */
    @InputImport(name="physicalPath")
      private final @Nullable String physicalPath;

    public Optional<String> getPhysicalPath() {
        return this.physicalPath == null ? Optional.empty() : Optional.ofNullable(this.physicalPath);
    }

    /**
     * Path to virtual application.
     * 
     */
    @InputImport(name="virtualPath")
      private final @Nullable String virtualPath;

    public Optional<String> getVirtualPath() {
        return this.virtualPath == null ? Optional.empty() : Optional.ofNullable(this.virtualPath);
    }

    public VirtualDirectoryResponse(
        @Nullable String physicalPath,
        @Nullable String virtualPath) {
        this.physicalPath = physicalPath;
        this.virtualPath = virtualPath;
    }

    private VirtualDirectoryResponse() {
        this.physicalPath = null;
        this.virtualPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String physicalPath;
        private @Nullable String virtualPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        public Builder physicalPath(@Nullable String physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }

        public Builder virtualPath(@Nullable String virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }
        public VirtualDirectoryResponse build() {
            return new VirtualDirectoryResponse(physicalPath, virtualPath);
        }
    }
}
