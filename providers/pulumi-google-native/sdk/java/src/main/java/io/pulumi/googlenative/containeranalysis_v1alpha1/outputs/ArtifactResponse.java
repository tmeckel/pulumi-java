// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ArtifactResponse {
    /**
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
     * 
     */
    private final String checksum;
    /**
     * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
     * 
     */
    private final List<String> names;

    @OutputCustomType.Constructor({"checksum","names"})
    private ArtifactResponse(
        String checksum,
        List<String> names) {
        this.checksum = Objects.requireNonNull(checksum);
        this.names = Objects.requireNonNull(names);
    }

    /**
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
     * 
     */
    public String getChecksum() {
        return this.checksum;
    }
    /**
     * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
     * 
     */
    public List<String> getNames() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checksum;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.names = defaults.names;
        }

        public Builder setChecksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public ArtifactResponse build() {
            return new ArtifactResponse(checksum, names);
        }
    }
}
