// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HintResponse {
    /**
     * The human readable name of this attestation authority, for example "qa".
     * 
     */
    private final String humanReadableName;

    @OutputCustomType.Constructor({"humanReadableName"})
    private HintResponse(String humanReadableName) {
        this.humanReadableName = Objects.requireNonNull(humanReadableName);
    }

    /**
     * The human readable name of this attestation authority, for example "qa".
     * 
     */
    public String getHumanReadableName() {
        return this.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(HintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder setHumanReadableName(String humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }

        public HintResponse build() {
            return new HintResponse(humanReadableName);
        }
    }
}
