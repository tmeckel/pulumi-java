// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.aws.lex.outputs.IntentSlotValueElicitationPrompt;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntentSlot {
    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    private final String name;
    /**
     * Directs Lex the order in which to elicit this slot value from the user.
     * For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for
     * the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits
     * values is arbitrary. Must be between 1 and 100.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    private final @Nullable String responseCard;
    /**
     * If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
     */
    private final @Nullable List<String> sampleUtterances;
    /**
     * Specifies whether the slot is required or optional.
     * 
     */
    private final String slotConstraint;
    /**
     * The type of the slot, either a custom slot type that you defined or one of
     * the built-in slot types. Must be less than or equal to 100 characters in length.
     * 
     */
    private final String slotType;
    /**
     * The version of the slot type. Must be less than or equal to 64 characters in length.
     * 
     */
    private final @Nullable String slotTypeVersion;
    /**
     * The prompt that Amazon Lex uses to elicit the slot value
     * from the user. Attributes are documented under prompt.
     * 
     */
    private final @Nullable IntentSlotValueElicitationPrompt valueElicitationPrompt;

    @OutputCustomType.Constructor
    private IntentSlot(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("priority") @Nullable Integer priority,
        @OutputCustomType.Parameter("responseCard") @Nullable String responseCard,
        @OutputCustomType.Parameter("sampleUtterances") @Nullable List<String> sampleUtterances,
        @OutputCustomType.Parameter("slotConstraint") String slotConstraint,
        @OutputCustomType.Parameter("slotType") String slotType,
        @OutputCustomType.Parameter("slotTypeVersion") @Nullable String slotTypeVersion,
        @OutputCustomType.Parameter("valueElicitationPrompt") @Nullable IntentSlotValueElicitationPrompt valueElicitationPrompt) {
        this.description = description;
        this.name = name;
        this.priority = priority;
        this.responseCard = responseCard;
        this.sampleUtterances = sampleUtterances;
        this.slotConstraint = slotConstraint;
        this.slotType = slotType;
        this.slotTypeVersion = slotTypeVersion;
        this.valueElicitationPrompt = valueElicitationPrompt;
    }

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Directs Lex the order in which to elicit this slot value from the user.
     * For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for
     * the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits
     * values is arbitrary. Must be between 1 and 100.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
    */
    public Optional<String> getResponseCard() {
        return Optional.ofNullable(this.responseCard);
    }
    /**
     * If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
    */
    public List<String> getSampleUtterances() {
        return this.sampleUtterances == null ? List.of() : this.sampleUtterances;
    }
    /**
     * Specifies whether the slot is required or optional.
     * 
    */
    public String getSlotConstraint() {
        return this.slotConstraint;
    }
    /**
     * The type of the slot, either a custom slot type that you defined or one of
     * the built-in slot types. Must be less than or equal to 100 characters in length.
     * 
    */
    public String getSlotType() {
        return this.slotType;
    }
    /**
     * The version of the slot type. Must be less than or equal to 64 characters in length.
     * 
    */
    public Optional<String> getSlotTypeVersion() {
        return Optional.ofNullable(this.slotTypeVersion);
    }
    /**
     * The prompt that Amazon Lex uses to elicit the slot value
     * from the user. Attributes are documented under prompt.
     * 
    */
    public Optional<IntentSlotValueElicitationPrompt> getValueElicitationPrompt() {
        return Optional.ofNullable(this.valueElicitationPrompt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentSlot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String name;
        private @Nullable Integer priority;
        private @Nullable String responseCard;
        private @Nullable List<String> sampleUtterances;
        private String slotConstraint;
        private String slotType;
        private @Nullable String slotTypeVersion;
        private @Nullable IntentSlotValueElicitationPrompt valueElicitationPrompt;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentSlot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.responseCard = defaults.responseCard;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotConstraint = defaults.slotConstraint;
    	      this.slotType = defaults.slotType;
    	      this.slotTypeVersion = defaults.slotTypeVersion;
    	      this.valueElicitationPrompt = defaults.valueElicitationPrompt;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder responseCard(@Nullable String responseCard) {
            this.responseCard = responseCard;
            return this;
        }

        public Builder sampleUtterances(@Nullable List<String> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder slotConstraint(String slotConstraint) {
            this.slotConstraint = Objects.requireNonNull(slotConstraint);
            return this;
        }

        public Builder slotType(String slotType) {
            this.slotType = Objects.requireNonNull(slotType);
            return this;
        }

        public Builder slotTypeVersion(@Nullable String slotTypeVersion) {
            this.slotTypeVersion = slotTypeVersion;
            return this;
        }

        public Builder valueElicitationPrompt(@Nullable IntentSlotValueElicitationPrompt valueElicitationPrompt) {
            this.valueElicitationPrompt = valueElicitationPrompt;
            return this;
        }
        public IntentSlot build() {
            return new IntentSlot(description, name, priority, responseCard, sampleUtterances, slotConstraint, slotType, slotTypeVersion, valueElicitationPrompt);
        }
    }
}
