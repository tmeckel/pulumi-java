// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeStepInstallMsiResponse {
    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    private final List<Integer> allowedExitCodes;
    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * @return The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
     * 
     */
    private final List<String> flags;

    @CustomType.Constructor
    private SoftwareRecipeStepInstallMsiResponse(
        @CustomType.Parameter("allowedExitCodes") List<Integer> allowedExitCodes,
        @CustomType.Parameter("artifactId") String artifactId,
        @CustomType.Parameter("flags") List<String> flags) {
        this.allowedExitCodes = allowedExitCodes;
        this.artifactId = artifactId;
        this.flags = flags;
    }

    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> allowedExitCodes() {
        return this.allowedExitCodes;
    }
    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public String artifactId() {
        return this.artifactId;
    }
    /**
     * @return The flags to use when installing the MSI defaults to [&#34;/i&#34;] (i.e. the install flag).
     * 
     */
    public List<String> flags() {
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

        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }
        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder flags(List<String> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }        public SoftwareRecipeStepInstallMsiResponse build() {
            return new SoftwareRecipeStepInstallMsiResponse(allowedExitCodes, artifactId, flags);
        }
    }
}
