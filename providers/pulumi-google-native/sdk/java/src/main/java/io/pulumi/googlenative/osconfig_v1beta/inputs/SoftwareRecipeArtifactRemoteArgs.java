// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies an artifact available via some URI.
 * 
 */
public final class SoftwareRecipeArtifactRemoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeArtifactRemoteArgs Empty = new SoftwareRecipeArtifactRemoteArgs();

    /**
     * Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to the checksum of the artifact. If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any of the steps.
     * 
     */
    @InputImport(name="checksum")
    private final @Nullable Input<String> checksum;

    public Input<String> getChecksum() {
        return this.checksum == null ? Input.empty() : this.checksum;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public SoftwareRecipeArtifactRemoteArgs(
        @Nullable Input<String> checksum,
        @Nullable Input<String> uri) {
        this.checksum = checksum;
        this.uri = uri;
    }

    private SoftwareRecipeArtifactRemoteArgs() {
        this.checksum = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeArtifactRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> checksum;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeArtifactRemoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.uri = defaults.uri;
        }

        public Builder setChecksum(@Nullable Input<String> checksum) {
            this.checksum = checksum;
            return this;
        }

        public Builder setChecksum(@Nullable String checksum) {
            this.checksum = Input.ofNullable(checksum);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public SoftwareRecipeArtifactRemoteArgs build() {
            return new SoftwareRecipeArtifactRemoteArgs(checksum, uri);
        }
    }
}
