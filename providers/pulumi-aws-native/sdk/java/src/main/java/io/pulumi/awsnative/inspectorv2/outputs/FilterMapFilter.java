// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.outputs;

import io.pulumi.awsnative.inspectorv2.enums.FilterMapComparison;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FilterMapFilter {
    private final FilterMapComparison comparison;
    private final @Nullable String key;
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private FilterMapFilter(
        @OutputCustomType.Parameter("comparison") FilterMapComparison comparison,
        @OutputCustomType.Parameter("key") @Nullable String key,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.comparison = comparison;
        this.key = key;
        this.value = value;
    }

    public FilterMapComparison getComparison() {
        return this.comparison;
    }
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterMapFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterMapComparison comparison;
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterMapFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder comparison(FilterMapComparison comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public FilterMapFilter build() {
            return new FilterMapFilter(comparison, key, value);
        }
    }
}
