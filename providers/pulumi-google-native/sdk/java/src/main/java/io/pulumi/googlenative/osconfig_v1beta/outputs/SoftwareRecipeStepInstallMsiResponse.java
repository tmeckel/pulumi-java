// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SoftwareRecipeStepInstallMsiResponse {
    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    private final List<Integer> allowedExitCodes;
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * The flags to use when installing the MSI defaults to ["/i"] (i.e. the install flag).
     * 
     */
    private final List<String> flags;

    @OutputCustomType.Constructor({"allowedExitCodes","artifactId","flags"})
    private SoftwareRecipeStepInstallMsiResponse(
        List<Integer> allowedExitCodes,
        String artifactId,
        List<String> flags) {
        this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
        this.artifactId = Objects.requireNonNull(artifactId);
        this.flags = Objects.requireNonNull(flags);
    }

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> getAllowedExitCodes() {
        return this.allowedExitCodes;
    }
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    public String getArtifactId() {
        return this.artifactId;
    }
    /**
     * The flags to use when installing the MSI defaults to ["/i"] (i.e. the install flag).
     * 
     */
    public List<String> getFlags() {
        return this.flags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepInstallMsiResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedExitCodes;
        private String artifactId;
        private List<String> flags;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepInstallMsiResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.artifactId = defaults.artifactId;
    	      this.flags = defaults.flags;
        }

        public Builder setAllowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setFlags(List<String> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }

        public SoftwareRecipeStepInstallMsiResponse build() {
            return new SoftwareRecipeStepInstallMsiResponse(allowedExitCodes, artifactId, flags);
        }
    }
}
