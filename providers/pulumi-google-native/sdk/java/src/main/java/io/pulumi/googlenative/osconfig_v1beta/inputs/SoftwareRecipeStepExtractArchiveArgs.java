// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.enums.SoftwareRecipeStepExtractArchiveType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Extracts an archive of the type specified in the specified directory.
 * 
 */
public final class SoftwareRecipeStepExtractArchiveArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepExtractArchiveArgs Empty = new SoftwareRecipeStepExtractArchiveArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
    private final Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId;
    }

    /**
     * Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
     * 
     */
    @InputImport(name="destination")
    private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * The type of the archive to extract.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<SoftwareRecipeStepExtractArchiveType> type;

    public Input<SoftwareRecipeStepExtractArchiveType> getType() {
        return this.type;
    }

    public SoftwareRecipeStepExtractArchiveArgs(
        Input<String> artifactId,
        @Nullable Input<String> destination,
        Input<SoftwareRecipeStepExtractArchiveType> type) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.destination = destination;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SoftwareRecipeStepExtractArchiveArgs() {
        this.artifactId = Input.empty();
        this.destination = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepExtractArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> artifactId;
        private @Nullable Input<String> destination;
        private Input<SoftwareRecipeStepExtractArchiveType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepExtractArchiveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.type = defaults.type;
        }

        public Builder setArtifactId(Input<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Input.of(Objects.requireNonNull(artifactId));
            return this;
        }

        public Builder setDestination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setType(Input<SoftwareRecipeStepExtractArchiveType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(SoftwareRecipeStepExtractArchiveType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SoftwareRecipeStepExtractArchiveArgs build() {
            return new SoftwareRecipeStepExtractArchiveArgs(artifactId, destination, type);
        }
    }
}
