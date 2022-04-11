// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.BotAssociationLexBotGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final BotAssociationState Empty = new BotAssociationState();

    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * 
     */
    @Import(name="lexBot")
      private final @Nullable Output<BotAssociationLexBotGetArgs> lexBot;

    public Output<BotAssociationLexBotGetArgs> getLexBot() {
        return this.lexBot == null ? Codegen.empty() : this.lexBot;
    }

    public BotAssociationState(
        @Nullable Output<String> instanceId,
        @Nullable Output<BotAssociationLexBotGetArgs> lexBot) {
        this.instanceId = instanceId;
        this.lexBot = lexBot;
    }

    private BotAssociationState() {
        this.instanceId = Codegen.empty();
        this.lexBot = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceId;
        private @Nullable Output<BotAssociationLexBotGetArgs> lexBot;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.lexBot = defaults.lexBot;
        }

        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder lexBot(@Nullable Output<BotAssociationLexBotGetArgs> lexBot) {
            this.lexBot = lexBot;
            return this;
        }
        public Builder lexBot(@Nullable BotAssociationLexBotGetArgs lexBot) {
            this.lexBot = Codegen.ofNullable(lexBot);
            return this;
        }        public BotAssociationState build() {
            return new BotAssociationState(instanceId, lexBot);
        }
    }
}
