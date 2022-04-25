// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotMessage;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BotMessageGroup {
    private final BotMessage message;
    /**
     * @return Message variations to send to the user.
     * 
     */
    private final @Nullable List<BotMessage> variations;

    @CustomType.Constructor
    private BotMessageGroup(
        @CustomType.Parameter("message") BotMessage message,
        @CustomType.Parameter("variations") @Nullable List<BotMessage> variations) {
        this.message = message;
        this.variations = variations;
    }

    public BotMessage message() {
        return this.message;
    }
    /**
     * @return Message variations to send to the user.
     * 
     */
    public List<BotMessage> variations() {
        return this.variations == null ? List.of() : this.variations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotMessageGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotMessage message;
        private @Nullable List<BotMessage> variations;

        public Builder() {
    	      // Empty
        }

        public Builder(BotMessageGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.variations = defaults.variations;
        }

        public Builder message(BotMessage message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder variations(@Nullable List<BotMessage> variations) {
            this.variations = variations;
            return this;
        }
        public Builder variations(BotMessage... variations) {
            return variations(List.of(variations));
        }        public BotMessageGroup build() {
            return new BotMessageGroup(message, variations);
        }
    }
}
