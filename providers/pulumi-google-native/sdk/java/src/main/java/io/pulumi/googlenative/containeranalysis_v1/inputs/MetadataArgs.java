// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.CompletenessArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Other properties of the build.
 * 
 */
public final class MetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataArgs Empty = new MetadataArgs();

    /**
     * The timestamp of when the build completed.
     * 
     */
    @InputImport(name="buildFinishedOn")
      private final @Nullable Input<String> buildFinishedOn;

    public Input<String> getBuildFinishedOn() {
        return this.buildFinishedOn == null ? Input.empty() : this.buildFinishedOn;
    }

    /**
     * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    @InputImport(name="buildInvocationId")
      private final @Nullable Input<String> buildInvocationId;

    public Input<String> getBuildInvocationId() {
        return this.buildInvocationId == null ? Input.empty() : this.buildInvocationId;
    }

    /**
     * The timestamp of when the build started.
     * 
     */
    @InputImport(name="buildStartedOn")
      private final @Nullable Input<String> buildStartedOn;

    public Input<String> getBuildStartedOn() {
        return this.buildStartedOn == null ? Input.empty() : this.buildStartedOn;
    }

    /**
     * Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    @InputImport(name="completeness")
      private final @Nullable Input<CompletenessArgs> completeness;

    public Input<CompletenessArgs> getCompleteness() {
        return this.completeness == null ? Input.empty() : this.completeness;
    }

    /**
     * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    @InputImport(name="reproducible")
      private final @Nullable Input<Boolean> reproducible;

    public Input<Boolean> getReproducible() {
        return this.reproducible == null ? Input.empty() : this.reproducible;
    }

    public MetadataArgs(
        @Nullable Input<String> buildFinishedOn,
        @Nullable Input<String> buildInvocationId,
        @Nullable Input<String> buildStartedOn,
        @Nullable Input<CompletenessArgs> completeness,
        @Nullable Input<Boolean> reproducible) {
        this.buildFinishedOn = buildFinishedOn;
        this.buildInvocationId = buildInvocationId;
        this.buildStartedOn = buildStartedOn;
        this.completeness = completeness;
        this.reproducible = reproducible;
    }

    private MetadataArgs() {
        this.buildFinishedOn = Input.empty();
        this.buildInvocationId = Input.empty();
        this.buildStartedOn = Input.empty();
        this.completeness = Input.empty();
        this.reproducible = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> buildFinishedOn;
        private @Nullable Input<String> buildInvocationId;
        private @Nullable Input<String> buildStartedOn;
        private @Nullable Input<CompletenessArgs> completeness;
        private @Nullable Input<Boolean> reproducible;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildFinishedOn = defaults.buildFinishedOn;
    	      this.buildInvocationId = defaults.buildInvocationId;
    	      this.buildStartedOn = defaults.buildStartedOn;
    	      this.completeness = defaults.completeness;
    	      this.reproducible = defaults.reproducible;
        }

        public Builder buildFinishedOn(@Nullable Input<String> buildFinishedOn) {
            this.buildFinishedOn = buildFinishedOn;
            return this;
        }

        public Builder buildFinishedOn(@Nullable String buildFinishedOn) {
            this.buildFinishedOn = Input.ofNullable(buildFinishedOn);
            return this;
        }

        public Builder buildInvocationId(@Nullable Input<String> buildInvocationId) {
            this.buildInvocationId = buildInvocationId;
            return this;
        }

        public Builder buildInvocationId(@Nullable String buildInvocationId) {
            this.buildInvocationId = Input.ofNullable(buildInvocationId);
            return this;
        }

        public Builder buildStartedOn(@Nullable Input<String> buildStartedOn) {
            this.buildStartedOn = buildStartedOn;
            return this;
        }

        public Builder buildStartedOn(@Nullable String buildStartedOn) {
            this.buildStartedOn = Input.ofNullable(buildStartedOn);
            return this;
        }

        public Builder completeness(@Nullable Input<CompletenessArgs> completeness) {
            this.completeness = completeness;
            return this;
        }

        public Builder completeness(@Nullable CompletenessArgs completeness) {
            this.completeness = Input.ofNullable(completeness);
            return this;
        }

        public Builder reproducible(@Nullable Input<Boolean> reproducible) {
            this.reproducible = reproducible;
            return this;
        }

        public Builder reproducible(@Nullable Boolean reproducible) {
            this.reproducible = Input.ofNullable(reproducible);
            return this;
        }
        public MetadataArgs build() {
            return new MetadataArgs(buildFinishedOn, buildInvocationId, buildStartedOn, completeness, reproducible);
        }
    }
}
