// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="forceDisableSupplementalResults")
      private final @Nullable Output<Boolean> forceDisableSupplementalResults;

    public Output<Boolean> getForceDisableSupplementalResults() {
        return this.forceDisableSupplementalResults == null ? Codegen.empty() : this.forceDisableSupplementalResults;
    }

    /**
     * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental results retrieval, and usage of synonyms including custom ones. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for verbatim mode.
     * 
     */
    @Import(name="forceVerbatimMode")
      private final @Nullable Output<Boolean> forceVerbatimMode;

    public Output<Boolean> getForceVerbatimMode() {
        return this.forceVerbatimMode == null ? Codegen.empty() : this.forceVerbatimMode;
    }

    public QueryInterpretationConfigArgs(
        @Nullable Output<Boolean> forceDisableSupplementalResults,
        @Nullable Output<Boolean> forceVerbatimMode) {
        this.forceDisableSupplementalResults = forceDisableSupplementalResults;
        this.forceVerbatimMode = forceVerbatimMode;
    }

    private QueryInterpretationConfigArgs() {
        this.forceDisableSupplementalResults = Codegen.empty();
        this.forceVerbatimMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryInterpretationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> forceDisableSupplementalResults;
        private @Nullable Output<Boolean> forceVerbatimMode;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryInterpretationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceDisableSupplementalResults = defaults.forceDisableSupplementalResults;
    	      this.forceVerbatimMode = defaults.forceVerbatimMode;
        }

        public Builder forceDisableSupplementalResults(@Nullable Output<Boolean> forceDisableSupplementalResults) {
            this.forceDisableSupplementalResults = forceDisableSupplementalResults;
            return this;
        }
        public Builder forceDisableSupplementalResults(@Nullable Boolean forceDisableSupplementalResults) {
            this.forceDisableSupplementalResults = Codegen.ofNullable(forceDisableSupplementalResults);
            return this;
        }
        public Builder forceVerbatimMode(@Nullable Output<Boolean> forceVerbatimMode) {
            this.forceVerbatimMode = forceVerbatimMode;
            return this;
        }
        public Builder forceVerbatimMode(@Nullable Boolean forceVerbatimMode) {
            this.forceVerbatimMode = Codegen.ofNullable(forceVerbatimMode);
            return this;
        }        public QueryInterpretationConfigArgs build() {
            return new QueryInterpretationConfigArgs(forceDisableSupplementalResults, forceVerbatimMode);
        }
    }
}
