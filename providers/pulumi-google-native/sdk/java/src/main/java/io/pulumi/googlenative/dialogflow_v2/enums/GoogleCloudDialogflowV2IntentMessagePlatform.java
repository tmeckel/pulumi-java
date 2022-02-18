// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowV2IntentMessagePlatform {
        /**
         * Default platform.
         * 
         */
        PlatformUnspecified("PLATFORM_UNSPECIFIED"),
        /**
         * Facebook.
         * 
         */
        Facebook("FACEBOOK"),
        /**
         * Slack.
         * 
         */
        Slack("SLACK"),
        /**
         * Telegram.
         * 
         */
        Telegram("TELEGRAM"),
        /**
         * Kik.
         * 
         */
        Kik("KIK"),
        /**
         * Skype.
         * 
         */
        Skype("SKYPE"),
        /**
         * Line.
         * 
         */
        Line("LINE"),
        /**
         * Viber.
         * 
         */
        Viber("VIBER"),
        /**
         * Google Assistant See [Dialogflow webhook format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
         * 
         */
        ActionsOnGoogle("ACTIONS_ON_GOOGLE"),
        /**
         * Google Hangouts.
         * 
         */
        GoogleHangouts("GOOGLE_HANGOUTS");

        private final String value;

        GoogleCloudDialogflowV2IntentMessagePlatform(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowV2IntentMessagePlatform[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
