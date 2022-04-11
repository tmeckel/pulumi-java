// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.lex.inputs.BotAliasConversationLogSettingsArgs;
import io.pulumi.awsnative.lex.inputs.BotAliasLocaleSettingsItemArgs;
import io.pulumi.awsnative.lex.inputs.BotAliasTagArgs;
import io.pulumi.awsnative.lex.inputs.SentimentAnalysisSettingsPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasArgs Empty = new BotAliasArgs();

    @Import(name="botAliasLocaleSettings")
      private final @Nullable Output<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings;

    public Output<List<BotAliasLocaleSettingsItemArgs>> getBotAliasLocaleSettings() {
        return this.botAliasLocaleSettings == null ? Codegen.empty() : this.botAliasLocaleSettings;
    }

    @Import(name="botAliasName")
      private final @Nullable Output<String> botAliasName;

    public Output<String> getBotAliasName() {
        return this.botAliasName == null ? Codegen.empty() : this.botAliasName;
    }

    /**
     * A list of tags to add to the bot alias.
     * 
     */
    @Import(name="botAliasTags")
      private final @Nullable Output<List<BotAliasTagArgs>> botAliasTags;

    public Output<List<BotAliasTagArgs>> getBotAliasTags() {
        return this.botAliasTags == null ? Codegen.empty() : this.botAliasTags;
    }

    @Import(name="botId", required=true)
      private final Output<String> botId;

    public Output<String> getBotId() {
        return this.botId;
    }

    @Import(name="botVersion")
      private final @Nullable Output<String> botVersion;

    public Output<String> getBotVersion() {
        return this.botVersion == null ? Codegen.empty() : this.botVersion;
    }

    @Import(name="conversationLogSettings")
      private final @Nullable Output<BotAliasConversationLogSettingsArgs> conversationLogSettings;

    public Output<BotAliasConversationLogSettingsArgs> getConversationLogSettings() {
        return this.conversationLogSettings == null ? Codegen.empty() : this.conversationLogSettings;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    @Import(name="sentimentAnalysisSettings")
      private final @Nullable Output<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings;

    public Output<SentimentAnalysisSettingsPropertiesArgs> getSentimentAnalysisSettings() {
        return this.sentimentAnalysisSettings == null ? Codegen.empty() : this.sentimentAnalysisSettings;
    }

    public BotAliasArgs(
        @Nullable Output<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings,
        @Nullable Output<String> botAliasName,
        @Nullable Output<List<BotAliasTagArgs>> botAliasTags,
        Output<String> botId,
        @Nullable Output<String> botVersion,
        @Nullable Output<BotAliasConversationLogSettingsArgs> conversationLogSettings,
        @Nullable Output<String> description,
        @Nullable Output<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings) {
        this.botAliasLocaleSettings = botAliasLocaleSettings;
        this.botAliasName = botAliasName;
        this.botAliasTags = botAliasTags;
        this.botId = Objects.requireNonNull(botId, "expected parameter 'botId' to be non-null");
        this.botVersion = botVersion;
        this.conversationLogSettings = conversationLogSettings;
        this.description = description;
        this.sentimentAnalysisSettings = sentimentAnalysisSettings;
    }

    private BotAliasArgs() {
        this.botAliasLocaleSettings = Codegen.empty();
        this.botAliasName = Codegen.empty();
        this.botAliasTags = Codegen.empty();
        this.botId = Codegen.empty();
        this.botVersion = Codegen.empty();
        this.conversationLogSettings = Codegen.empty();
        this.description = Codegen.empty();
        this.sentimentAnalysisSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings;
        private @Nullable Output<String> botAliasName;
        private @Nullable Output<List<BotAliasTagArgs>> botAliasTags;
        private Output<String> botId;
        private @Nullable Output<String> botVersion;
        private @Nullable Output<BotAliasConversationLogSettingsArgs> conversationLogSettings;
        private @Nullable Output<String> description;
        private @Nullable Output<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botAliasLocaleSettings = defaults.botAliasLocaleSettings;
    	      this.botAliasName = defaults.botAliasName;
    	      this.botAliasTags = defaults.botAliasTags;
    	      this.botId = defaults.botId;
    	      this.botVersion = defaults.botVersion;
    	      this.conversationLogSettings = defaults.conversationLogSettings;
    	      this.description = defaults.description;
    	      this.sentimentAnalysisSettings = defaults.sentimentAnalysisSettings;
        }

        public Builder botAliasLocaleSettings(@Nullable Output<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings) {
            this.botAliasLocaleSettings = botAliasLocaleSettings;
            return this;
        }
        public Builder botAliasLocaleSettings(@Nullable List<BotAliasLocaleSettingsItemArgs> botAliasLocaleSettings) {
            this.botAliasLocaleSettings = Codegen.ofNullable(botAliasLocaleSettings);
            return this;
        }
        public Builder botAliasLocaleSettings(BotAliasLocaleSettingsItemArgs... botAliasLocaleSettings) {
            return botAliasLocaleSettings(List.of(botAliasLocaleSettings));
        }
        public Builder botAliasName(@Nullable Output<String> botAliasName) {
            this.botAliasName = botAliasName;
            return this;
        }
        public Builder botAliasName(@Nullable String botAliasName) {
            this.botAliasName = Codegen.ofNullable(botAliasName);
            return this;
        }
        public Builder botAliasTags(@Nullable Output<List<BotAliasTagArgs>> botAliasTags) {
            this.botAliasTags = botAliasTags;
            return this;
        }
        public Builder botAliasTags(@Nullable List<BotAliasTagArgs> botAliasTags) {
            this.botAliasTags = Codegen.ofNullable(botAliasTags);
            return this;
        }
        public Builder botAliasTags(BotAliasTagArgs... botAliasTags) {
            return botAliasTags(List.of(botAliasTags));
        }
        public Builder botId(Output<String> botId) {
            this.botId = Objects.requireNonNull(botId);
            return this;
        }
        public Builder botId(String botId) {
            this.botId = Output.of(Objects.requireNonNull(botId));
            return this;
        }
        public Builder botVersion(@Nullable Output<String> botVersion) {
            this.botVersion = botVersion;
            return this;
        }
        public Builder botVersion(@Nullable String botVersion) {
            this.botVersion = Codegen.ofNullable(botVersion);
            return this;
        }
        public Builder conversationLogSettings(@Nullable Output<BotAliasConversationLogSettingsArgs> conversationLogSettings) {
            this.conversationLogSettings = conversationLogSettings;
            return this;
        }
        public Builder conversationLogSettings(@Nullable BotAliasConversationLogSettingsArgs conversationLogSettings) {
            this.conversationLogSettings = Codegen.ofNullable(conversationLogSettings);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder sentimentAnalysisSettings(@Nullable Output<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings) {
            this.sentimentAnalysisSettings = sentimentAnalysisSettings;
            return this;
        }
        public Builder sentimentAnalysisSettings(@Nullable SentimentAnalysisSettingsPropertiesArgs sentimentAnalysisSettings) {
            this.sentimentAnalysisSettings = Codegen.ofNullable(sentimentAnalysisSettings);
            return this;
        }        public BotAliasArgs build() {
            return new BotAliasArgs(botAliasLocaleSettings, botAliasName, botAliasTags, botId, botVersion, conversationLogSettings, description, sentimentAnalysisSettings);
        }
    }
}
