// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotGrammarSlotTypeSetting;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotExternalSourceSetting {
    private final @Nullable BotGrammarSlotTypeSetting grammarSlotTypeSetting;

    @OutputCustomType.Constructor
    private BotExternalSourceSetting(@OutputCustomType.Parameter("grammarSlotTypeSetting") @Nullable BotGrammarSlotTypeSetting grammarSlotTypeSetting) {
        this.grammarSlotTypeSetting = grammarSlotTypeSetting;
    }

    public Optional<BotGrammarSlotTypeSetting> getGrammarSlotTypeSetting() {
        return Optional.ofNullable(this.grammarSlotTypeSetting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotExternalSourceSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotGrammarSlotTypeSetting grammarSlotTypeSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(BotExternalSourceSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grammarSlotTypeSetting = defaults.grammarSlotTypeSetting;
        }

        public Builder grammarSlotTypeSetting(@Nullable BotGrammarSlotTypeSetting grammarSlotTypeSetting) {
            this.grammarSlotTypeSetting = grammarSlotTypeSetting;
            return this;
        }
        public BotExternalSourceSetting build() {
            return new BotExternalSourceSetting(grammarSlotTypeSetting);
        }
    }
}
