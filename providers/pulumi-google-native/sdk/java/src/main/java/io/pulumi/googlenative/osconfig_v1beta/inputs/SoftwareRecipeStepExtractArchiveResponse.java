// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Extracts an archive of the type specified in the specified directory.
 * 
 */
public final class SoftwareRecipeStepExtractArchiveResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeStepExtractArchiveResponse Empty = new SoftwareRecipeStepExtractArchiveResponse();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
      private final String artifactId;

    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
     * 
     */
    @InputImport(name="destination", required=true)
      private final String destination;

    public String getDestination() {
        return this.destination;
    }

    /**
     * The type of the archive to extract.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public SoftwareRecipeStepExtractArchiveResponse(
        String artifactId,
        String destination,
        String type) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SoftwareRecipeStepExtractArchiveResponse() {
        this.artifactId = null;
        this.destination = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepExtractArchiveResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;
        private String destination;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepExtractArchiveResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.type = defaults.type;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SoftwareRecipeStepExtractArchiveResponse build() {
            return new SoftwareRecipeStepExtractArchiveResponse(artifactId, destination, type);
        }
    }
}
