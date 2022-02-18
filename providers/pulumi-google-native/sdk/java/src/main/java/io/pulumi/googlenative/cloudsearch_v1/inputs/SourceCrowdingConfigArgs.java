// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set search results crowding limits. Crowding is a situation in which multiple results from the same source or host "crowd out" other results, diminishing the quality of search for users. To foster better search quality and source diversity in search results, you can set a condition to reduce repetitive results by source.
 * 
 */
public final class SourceCrowdingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceCrowdingConfigArgs Empty = new SourceCrowdingConfigArgs();

    /**
     * Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    @InputImport(name="numResults")
    private final @Nullable Input<Integer> numResults;

    public Input<Integer> getNumResults() {
        return this.numResults == null ? Input.empty() : this.numResults;
    }

    /**
     * Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    @InputImport(name="numSuggestions")
    private final @Nullable Input<Integer> numSuggestions;

    public Input<Integer> getNumSuggestions() {
        return this.numSuggestions == null ? Input.empty() : this.numSuggestions;
    }

    public SourceCrowdingConfigArgs(
        @Nullable Input<Integer> numResults,
        @Nullable Input<Integer> numSuggestions) {
        this.numResults = numResults;
        this.numSuggestions = numSuggestions;
    }

    private SourceCrowdingConfigArgs() {
        this.numResults = Input.empty();
        this.numSuggestions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceCrowdingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numResults;
        private @Nullable Input<Integer> numSuggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceCrowdingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numResults = defaults.numResults;
    	      this.numSuggestions = defaults.numSuggestions;
        }

        public Builder setNumResults(@Nullable Input<Integer> numResults) {
            this.numResults = numResults;
            return this;
        }

        public Builder setNumResults(@Nullable Integer numResults) {
            this.numResults = Input.ofNullable(numResults);
            return this;
        }

        public Builder setNumSuggestions(@Nullable Input<Integer> numSuggestions) {
            this.numSuggestions = numSuggestions;
            return this;
        }

        public Builder setNumSuggestions(@Nullable Integer numSuggestions) {
            this.numSuggestions = Input.ofNullable(numSuggestions);
            return this;
        }

        public SourceCrowdingConfigArgs build() {
            return new SourceCrowdingConfigArgs(numResults, numSuggestions);
        }
    }
}
