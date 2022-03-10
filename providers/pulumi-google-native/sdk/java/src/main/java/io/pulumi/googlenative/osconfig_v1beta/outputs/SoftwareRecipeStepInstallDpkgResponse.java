// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SoftwareRecipeStepInstallDpkgResponse {
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;

    @OutputCustomType.Constructor
    private SoftwareRecipeStepInstallDpkgResponse(@OutputCustomType.Parameter("artifactId") String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
    */
    public String getArtifactId() {
        return this.artifactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepInstallDpkgResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepInstallDpkgResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public SoftwareRecipeStepInstallDpkgResponse build() {
            return new SoftwareRecipeStepInstallDpkgResponse(artifactId);
        }
    }
}
