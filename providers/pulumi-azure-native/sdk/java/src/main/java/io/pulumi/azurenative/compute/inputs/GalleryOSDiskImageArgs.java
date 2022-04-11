// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.HostCaching;
import io.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is the OS disk image.
 * 
 */
public final class GalleryOSDiskImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryOSDiskImageArgs Empty = new GalleryOSDiskImageArgs();

    /**
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'
     * 
     */
    @Import(name="hostCaching")
      private final @Nullable Output<HostCaching> hostCaching;

    public Output<HostCaching> getHostCaching() {
        return this.hostCaching == null ? Codegen.empty() : this.hostCaching;
    }

    /**
     * The gallery artifact version source.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<GalleryArtifactVersionSourceArgs> source;

    public Output<GalleryArtifactVersionSourceArgs> getSource() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    public GalleryOSDiskImageArgs(
        @Nullable Output<HostCaching> hostCaching,
        @Nullable Output<GalleryArtifactVersionSourceArgs> source) {
        this.hostCaching = hostCaching;
        this.source = source;
    }

    private GalleryOSDiskImageArgs() {
        this.hostCaching = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryOSDiskImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HostCaching> hostCaching;
        private @Nullable Output<GalleryArtifactVersionSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryOSDiskImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostCaching = defaults.hostCaching;
    	      this.source = defaults.source;
        }

        public Builder hostCaching(@Nullable Output<HostCaching> hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }
        public Builder hostCaching(@Nullable HostCaching hostCaching) {
            this.hostCaching = Codegen.ofNullable(hostCaching);
            return this;
        }
        public Builder source(@Nullable Output<GalleryArtifactVersionSourceArgs> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable GalleryArtifactVersionSourceArgs source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }        public GalleryOSDiskImageArgs build() {
            return new GalleryOSDiskImageArgs(hostCaching, source);
        }
    }
}
