// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines an object to declare an in-toto artifact rule
 * 
 */
public final class ArtifactRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArtifactRuleResponse Empty = new ArtifactRuleResponse();

    @InputImport(name="artifactRule", required=true)
      private final List<String> artifactRule;

    public List<String> getArtifactRule() {
        return this.artifactRule;
    }

    public ArtifactRuleResponse(List<String> artifactRule) {
        this.artifactRule = Objects.requireNonNull(artifactRule, "expected parameter 'artifactRule' to be non-null");
    }

    private ArtifactRuleResponse() {
        this.artifactRule = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> artifactRule;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactRule = defaults.artifactRule;
        }

        public Builder artifactRule(List<String> artifactRule) {
            this.artifactRule = Objects.requireNonNull(artifactRule);
            return this;
        }
        public ArtifactRuleResponse build() {
            return new ArtifactRuleResponse(artifactRule);
        }
    }
}
