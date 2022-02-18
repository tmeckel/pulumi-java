// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Default options to interpret user query.
 * 
 */
public final class QueryInterpretationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryInterpretationConfigArgs Empty = new QueryInterpretationConfigArgs();

    /**
     * Set this flag to disable supplemental results retrieval, setting a flag here will not retrieve supplemental results for queries associated with a given search application. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for supplemental results.
     * 
     */
    @InputImport(name="forceDisableSupplementalResults")
    private final @Nullable Input<Boolean> forceDisableSupplementalResults;

    public Input<Boolean> getForceDisableSupplementalResults() {
        return this.forceDisableSupplementalResults == null ? Input.empty() : this.forceDisableSupplementalResults;
    }

    /**
     * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental results retrieval, and usage of synonyms including custom ones. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for verbatim mode.
     * 
     */
    @InputImport(name="forceVerbatimMode")
    private final @Nullable Input<Boolean> forceVerbatimMode;

    public Input<Boolean> getForceVerbatimMode() {
        return this.forceVerbatimMode == null ? Input.empty() : this.forceVerbatimMode;
    }

    public QueryInterpretationConfigArgs(
        @Nullable Input<Boolean> forceDisableSupplementalResults,
        @Nullable Input<Boolean> forceVerbatimMode) {
        this.forceDisableSupplementalResults = forceDisableSupplementalResults;
        this.forceVerbatimMode = forceVerbatimMode;
    }

    private QueryInterpretationConfigArgs() {
        this.forceDisableSupplementalResults = Input.empty();
        this.forceVerbatimMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryInterpretationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> forceDisableSupplementalResults;
        private @Nullable Input<Boolean> forceVerbatimMode;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryInterpretationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceDisableSupplementalResults = defaults.forceDisableSupplementalResults;
    	      this.forceVerbatimMode = defaults.forceVerbatimMode;
        }

        public Builder setForceDisableSupplementalResults(@Nullable Input<Boolean> forceDisableSupplementalResults) {
            this.forceDisableSupplementalResults = forceDisableSupplementalResults;
            return this;
        }

        public Builder setForceDisableSupplementalResults(@Nullable Boolean forceDisableSupplementalResults) {
            this.forceDisableSupplementalResults = Input.ofNullable(forceDisableSupplementalResults);
            return this;
        }

        public Builder setForceVerbatimMode(@Nullable Input<Boolean> forceVerbatimMode) {
            this.forceVerbatimMode = forceVerbatimMode;
            return this;
        }

        public Builder setForceVerbatimMode(@Nullable Boolean forceVerbatimMode) {
            this.forceVerbatimMode = Input.ofNullable(forceVerbatimMode);
            return this;
        }

        public QueryInterpretationConfigArgs build() {
            return new QueryInterpretationConfigArgs(forceDisableSupplementalResults, forceVerbatimMode);
        }
    }
}
