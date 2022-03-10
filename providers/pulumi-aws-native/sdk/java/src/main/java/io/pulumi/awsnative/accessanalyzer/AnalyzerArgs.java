// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.accessanalyzer;

import io.pulumi.awsnative.accessanalyzer.inputs.AnalyzerArchiveRuleArgs;
import io.pulumi.awsnative.accessanalyzer.inputs.AnalyzerTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyzerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyzerArgs Empty = new AnalyzerArgs();

    /**
     * Analyzer name
     * 
     */
    @InputImport(name="analyzerName")
      private final @Nullable Input<String> analyzerName;

    public Input<String> getAnalyzerName() {
        return this.analyzerName == null ? Input.empty() : this.analyzerName;
    }

    @InputImport(name="archiveRules")
      private final @Nullable Input<List<AnalyzerArchiveRuleArgs>> archiveRules;

    public Input<List<AnalyzerArchiveRuleArgs>> getArchiveRules() {
        return this.archiveRules == null ? Input.empty() : this.archiveRules;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<AnalyzerTagArgs>> tags;

    public Input<List<AnalyzerTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of the analyzer, must be ACCOUNT or ORGANIZATION
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AnalyzerArgs(
        @Nullable Input<String> analyzerName,
        @Nullable Input<List<AnalyzerArchiveRuleArgs>> archiveRules,
        @Nullable Input<List<AnalyzerTagArgs>> tags,
        Input<String> type) {
        this.analyzerName = analyzerName;
        this.archiveRules = archiveRules;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AnalyzerArgs() {
        this.analyzerName = Input.empty();
        this.archiveRules = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> analyzerName;
        private @Nullable Input<List<AnalyzerArchiveRuleArgs>> archiveRules;
        private @Nullable Input<List<AnalyzerTagArgs>> tags;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyzerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzerName = defaults.analyzerName;
    	      this.archiveRules = defaults.archiveRules;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder analyzerName(@Nullable Input<String> analyzerName) {
            this.analyzerName = analyzerName;
            return this;
        }

        public Builder analyzerName(@Nullable String analyzerName) {
            this.analyzerName = Input.ofNullable(analyzerName);
            return this;
        }

        public Builder archiveRules(@Nullable Input<List<AnalyzerArchiveRuleArgs>> archiveRules) {
            this.archiveRules = archiveRules;
            return this;
        }

        public Builder archiveRules(@Nullable List<AnalyzerArchiveRuleArgs> archiveRules) {
            this.archiveRules = Input.ofNullable(archiveRules);
            return this;
        }

        public Builder tags(@Nullable Input<List<AnalyzerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<AnalyzerTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public AnalyzerArgs build() {
            return new AnalyzerArgs(analyzerName, archiveRules, tags, type);
        }
    }
}
