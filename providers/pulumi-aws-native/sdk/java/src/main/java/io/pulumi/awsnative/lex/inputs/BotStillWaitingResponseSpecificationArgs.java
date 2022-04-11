// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotMessageGroupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StillWaitingResponseSpecification.
 * 
 */
public final class BotStillWaitingResponseSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotStillWaitingResponseSpecificationArgs Empty = new BotStillWaitingResponseSpecificationArgs();

    /**
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * 
     */
    @Import(name="allowInterrupt")
      private final @Nullable Output<Boolean> allowInterrupt;

    public Output<Boolean> getAllowInterrupt() {
        return this.allowInterrupt == null ? Codegen.empty() : this.allowInterrupt;
    }

    @Import(name="frequencyInSeconds", required=true)
      private final Output<Integer> frequencyInSeconds;

    public Output<Integer> getFrequencyInSeconds() {
        return this.frequencyInSeconds;
    }

    @Import(name="messageGroupsList", required=true)
      private final Output<List<BotMessageGroupArgs>> messageGroupsList;

    public Output<List<BotMessageGroupArgs>> getMessageGroupsList() {
        return this.messageGroupsList;
    }

    @Import(name="timeoutInSeconds", required=true)
      private final Output<Integer> timeoutInSeconds;

    public Output<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    public BotStillWaitingResponseSpecificationArgs(
        @Nullable Output<Boolean> allowInterrupt,
        Output<Integer> frequencyInSeconds,
        Output<List<BotMessageGroupArgs>> messageGroupsList,
        Output<Integer> timeoutInSeconds) {
        this.allowInterrupt = allowInterrupt;
        this.frequencyInSeconds = Objects.requireNonNull(frequencyInSeconds, "expected parameter 'frequencyInSeconds' to be non-null");
        this.messageGroupsList = Objects.requireNonNull(messageGroupsList, "expected parameter 'messageGroupsList' to be non-null");
        this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds, "expected parameter 'timeoutInSeconds' to be non-null");
    }

    private BotStillWaitingResponseSpecificationArgs() {
        this.allowInterrupt = Codegen.empty();
        this.frequencyInSeconds = Codegen.empty();
        this.messageGroupsList = Codegen.empty();
        this.timeoutInSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotStillWaitingResponseSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowInterrupt;
        private Output<Integer> frequencyInSeconds;
        private Output<List<BotMessageGroupArgs>> messageGroupsList;
        private Output<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BotStillWaitingResponseSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.frequencyInSeconds = defaults.frequencyInSeconds;
    	      this.messageGroupsList = defaults.messageGroupsList;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder allowInterrupt(@Nullable Output<Boolean> allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }
        public Builder allowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = Codegen.ofNullable(allowInterrupt);
            return this;
        }
        public Builder frequencyInSeconds(Output<Integer> frequencyInSeconds) {
            this.frequencyInSeconds = Objects.requireNonNull(frequencyInSeconds);
            return this;
        }
        public Builder frequencyInSeconds(Integer frequencyInSeconds) {
            this.frequencyInSeconds = Output.of(Objects.requireNonNull(frequencyInSeconds));
            return this;
        }
        public Builder messageGroupsList(Output<List<BotMessageGroupArgs>> messageGroupsList) {
            this.messageGroupsList = Objects.requireNonNull(messageGroupsList);
            return this;
        }
        public Builder messageGroupsList(List<BotMessageGroupArgs> messageGroupsList) {
            this.messageGroupsList = Output.of(Objects.requireNonNull(messageGroupsList));
            return this;
        }
        public Builder messageGroupsList(BotMessageGroupArgs... messageGroupsList) {
            return messageGroupsList(List.of(messageGroupsList));
        }
        public Builder timeoutInSeconds(Output<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds);
            return this;
        }
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = Output.of(Objects.requireNonNull(timeoutInSeconds));
            return this;
        }        public BotStillWaitingResponseSpecificationArgs build() {
            return new BotStillWaitingResponseSpecificationArgs(allowInterrupt, frequencyInSeconds, messageGroupsList, timeoutInSeconds);
        }
    }
}
