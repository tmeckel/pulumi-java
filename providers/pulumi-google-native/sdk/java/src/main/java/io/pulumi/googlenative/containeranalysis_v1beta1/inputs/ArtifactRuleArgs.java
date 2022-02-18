// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines an object to declare an in-toto artifact rule
 * 
 */
public final class ArtifactRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactRuleArgs Empty = new ArtifactRuleArgs();

    @InputImport(name="artifactRule")
    private final @Nullable Input<List<String>> artifactRule;

    public Input<List<String>> getArtifactRule() {
        return this.artifactRule == null ? Input.empty() : this.artifactRule;
    }

    public ArtifactRuleArgs(@Nullable Input<List<String>> artifactRule) {
        this.artifactRule = artifactRule;
    }

    private ArtifactRuleArgs() {
        this.artifactRule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> artifactRule;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactRule = defaults.artifactRule;
        }

        public Builder setArtifactRule(@Nullable Input<List<String>> artifactRule) {
            this.artifactRule = artifactRule;
            return this;
        }

        public Builder setArtifactRule(@Nullable List<String> artifactRule) {
            this.artifactRule = Input.ofNullable(artifactRule);
            return this;
        }

        public ArtifactRuleArgs build() {
            return new ArtifactRuleArgs(artifactRule);
        }
    }
}
