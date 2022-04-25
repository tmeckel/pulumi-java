// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer.outputs;

import com.pulumi.awsnative.accessanalyzer.outputs.AnalyzerArchiveRule;
import com.pulumi.awsnative.accessanalyzer.outputs.AnalyzerTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAnalyzerResult {
    private final @Nullable List<AnalyzerArchiveRule> archiveRules;
    /**
     * @return Amazon Resource Name (ARN) of the analyzer
     * 
     */
    private final @Nullable String arn;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<AnalyzerTag> tags;

    @CustomType.Constructor
    private GetAnalyzerResult(
        @CustomType.Parameter("archiveRules") @Nullable List<AnalyzerArchiveRule> archiveRules,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("tags") @Nullable List<AnalyzerTag> tags) {
        this.archiveRules = archiveRules;
        this.arn = arn;
        this.tags = tags;
    }

    public List<AnalyzerArchiveRule> archiveRules() {
        return this.archiveRules == null ? List.of() : this.archiveRules;
    }
    /**
     * @return Amazon Resource Name (ARN) of the analyzer
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<AnalyzerTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyzerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AnalyzerArchiveRule> archiveRules;
        private @Nullable String arn;
        private @Nullable List<AnalyzerTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyzerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveRules = defaults.archiveRules;
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder archiveRules(@Nullable List<AnalyzerArchiveRule> archiveRules) {
            this.archiveRules = archiveRules;
            return this;
        }
        public Builder archiveRules(AnalyzerArchiveRule... archiveRules) {
            return archiveRules(List.of(archiveRules));
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder tags(@Nullable List<AnalyzerTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(AnalyzerTag... tags) {
            return tags(List.of(tags));
        }        public GetAnalyzerResult build() {
            return new GetAnalyzerResult(archiveRules, arn, tags);
        }
    }
}
