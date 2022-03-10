// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.enums.BotSlotValueResolutionStrategy;
import io.pulumi.awsnative.lex.outputs.BotSlotValueRegexFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotSlotValueSelectionSetting {
    private final @Nullable BotSlotValueRegexFilter regexFilter;
    private final BotSlotValueResolutionStrategy resolutionStrategy;

    @OutputCustomType.Constructor
    private BotSlotValueSelectionSetting(
        @OutputCustomType.Parameter("regexFilter") @Nullable BotSlotValueRegexFilter regexFilter,
        @OutputCustomType.Parameter("resolutionStrategy") BotSlotValueResolutionStrategy resolutionStrategy) {
        this.regexFilter = regexFilter;
        this.resolutionStrategy = resolutionStrategy;
    }

    public Optional<BotSlotValueRegexFilter> getRegexFilter() {
        return Optional.ofNullable(this.regexFilter);
    }
    public BotSlotValueResolutionStrategy getResolutionStrategy() {
        return this.resolutionStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotValueSelectionSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotSlotValueRegexFilter regexFilter;
        private BotSlotValueResolutionStrategy resolutionStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotValueSelectionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFilter = defaults.regexFilter;
    	      this.resolutionStrategy = defaults.resolutionStrategy;
        }

        public Builder regexFilter(@Nullable BotSlotValueRegexFilter regexFilter) {
            this.regexFilter = regexFilter;
            return this;
        }

        public Builder resolutionStrategy(BotSlotValueResolutionStrategy resolutionStrategy) {
            this.resolutionStrategy = Objects.requireNonNull(resolutionStrategy);
            return this;
        }
        public BotSlotValueSelectionSetting build() {
            return new BotSlotValueSelectionSetting(regexFilter, resolutionStrategy);
        }
    }
}
