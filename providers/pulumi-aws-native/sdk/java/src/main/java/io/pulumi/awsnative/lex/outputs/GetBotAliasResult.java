// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.enums.BotAliasStatus;
import io.pulumi.awsnative.lex.outputs.BotAliasConversationLogSettings;
import io.pulumi.awsnative.lex.outputs.BotAliasLocaleSettingsItem;
import io.pulumi.awsnative.lex.outputs.SentimentAnalysisSettingsProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBotAliasResult {
    private final @Nullable String arn;
    private final @Nullable String botAliasId;
    private final @Nullable List<BotAliasLocaleSettingsItem> botAliasLocaleSettings;
    private final @Nullable String botAliasName;
    private final @Nullable BotAliasStatus botAliasStatus;
    private final @Nullable String botVersion;
    private final @Nullable BotAliasConversationLogSettings conversationLogSettings;
    private final @Nullable String description;
    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    private final @Nullable SentimentAnalysisSettingsProperties sentimentAnalysisSettings;

    @OutputCustomType.Constructor
    private GetBotAliasResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("botAliasId") @Nullable String botAliasId,
        @OutputCustomType.Parameter("botAliasLocaleSettings") @Nullable List<BotAliasLocaleSettingsItem> botAliasLocaleSettings,
        @OutputCustomType.Parameter("botAliasName") @Nullable String botAliasName,
        @OutputCustomType.Parameter("botAliasStatus") @Nullable BotAliasStatus botAliasStatus,
        @OutputCustomType.Parameter("botVersion") @Nullable String botVersion,
        @OutputCustomType.Parameter("conversationLogSettings") @Nullable BotAliasConversationLogSettings conversationLogSettings,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("sentimentAnalysisSettings") @Nullable SentimentAnalysisSettingsProperties sentimentAnalysisSettings) {
        this.arn = arn;
        this.botAliasId = botAliasId;
        this.botAliasLocaleSettings = botAliasLocaleSettings;
        this.botAliasName = botAliasName;
        this.botAliasStatus = botAliasStatus;
        this.botVersion = botVersion;
        this.conversationLogSettings = conversationLogSettings;
        this.description = description;
        this.sentimentAnalysisSettings = sentimentAnalysisSettings;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getBotAliasId() {
        return Optional.ofNullable(this.botAliasId);
    }
    public List<BotAliasLocaleSettingsItem> getBotAliasLocaleSettings() {
        return this.botAliasLocaleSettings == null ? List.of() : this.botAliasLocaleSettings;
    }
    public Optional<String> getBotAliasName() {
        return Optional.ofNullable(this.botAliasName);
    }
    public Optional<BotAliasStatus> getBotAliasStatus() {
        return Optional.ofNullable(this.botAliasStatus);
    }
    public Optional<String> getBotVersion() {
        return Optional.ofNullable(this.botVersion);
    }
    public Optional<BotAliasConversationLogSettings> getConversationLogSettings() {
        return Optional.ofNullable(this.conversationLogSettings);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
    */
    public Optional<SentimentAnalysisSettingsProperties> getSentimentAnalysisSettings() {
        return Optional.ofNullable(this.sentimentAnalysisSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String botAliasId;
        private @Nullable List<BotAliasLocaleSettingsItem> botAliasLocaleSettings;
        private @Nullable String botAliasName;
        private @Nullable BotAliasStatus botAliasStatus;
        private @Nullable String botVersion;
        private @Nullable BotAliasConversationLogSettings conversationLogSettings;
        private @Nullable String description;
        private @Nullable SentimentAnalysisSettingsProperties sentimentAnalysisSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.botAliasId = defaults.botAliasId;
    	      this.botAliasLocaleSettings = defaults.botAliasLocaleSettings;
    	      this.botAliasName = defaults.botAliasName;
    	      this.botAliasStatus = defaults.botAliasStatus;
    	      this.botVersion = defaults.botVersion;
    	      this.conversationLogSettings = defaults.conversationLogSettings;
    	      this.description = defaults.description;
    	      this.sentimentAnalysisSettings = defaults.sentimentAnalysisSettings;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder botAliasId(@Nullable String botAliasId) {
            this.botAliasId = botAliasId;
            return this;
        }

        public Builder botAliasLocaleSettings(@Nullable List<BotAliasLocaleSettingsItem> botAliasLocaleSettings) {
            this.botAliasLocaleSettings = botAliasLocaleSettings;
            return this;
        }

        public Builder botAliasName(@Nullable String botAliasName) {
            this.botAliasName = botAliasName;
            return this;
        }

        public Builder botAliasStatus(@Nullable BotAliasStatus botAliasStatus) {
            this.botAliasStatus = botAliasStatus;
            return this;
        }

        public Builder botVersion(@Nullable String botVersion) {
            this.botVersion = botVersion;
            return this;
        }

        public Builder conversationLogSettings(@Nullable BotAliasConversationLogSettings conversationLogSettings) {
            this.conversationLogSettings = conversationLogSettings;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder sentimentAnalysisSettings(@Nullable SentimentAnalysisSettingsProperties sentimentAnalysisSettings) {
            this.sentimentAnalysisSettings = sentimentAnalysisSettings;
            return this;
        }
        public GetBotAliasResult build() {
            return new GetBotAliasResult(arn, botAliasId, botAliasLocaleSettings, botAliasName, botAliasStatus, botVersion, conversationLogSettings, description, sentimentAnalysisSettings);
        }
    }
}
