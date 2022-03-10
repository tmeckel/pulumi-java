// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketReplicationRuleAndOperator;
import io.pulumi.awsnative.s3.outputs.BucketTagFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationRuleFilter {
    private final @Nullable BucketReplicationRuleAndOperator and;
    private final @Nullable String prefix;
    private final @Nullable BucketTagFilter tagFilter;

    @OutputCustomType.Constructor
    private BucketReplicationRuleFilter(
        @OutputCustomType.Parameter("and") @Nullable BucketReplicationRuleAndOperator and,
        @OutputCustomType.Parameter("prefix") @Nullable String prefix,
        @OutputCustomType.Parameter("tagFilter") @Nullable BucketTagFilter tagFilter) {
        this.and = and;
        this.prefix = prefix;
        this.tagFilter = tagFilter;
    }

    public Optional<BucketReplicationRuleAndOperator> getAnd() {
        return Optional.ofNullable(this.and);
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    public Optional<BucketTagFilter> getTagFilter() {
        return Optional.ofNullable(this.tagFilter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationRuleAndOperator and;
        private @Nullable String prefix;
        private @Nullable BucketTagFilter tagFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.prefix = defaults.prefix;
    	      this.tagFilter = defaults.tagFilter;
        }

        public Builder and(@Nullable BucketReplicationRuleAndOperator and) {
            this.and = and;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder tagFilter(@Nullable BucketTagFilter tagFilter) {
            this.tagFilter = tagFilter;
            return this;
        }
        public BucketReplicationRuleFilter build() {
            return new BucketReplicationRuleFilter(and, prefix, tagFilter);
        }
    }
}
