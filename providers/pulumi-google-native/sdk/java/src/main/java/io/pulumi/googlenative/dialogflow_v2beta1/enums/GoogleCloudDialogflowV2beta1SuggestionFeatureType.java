// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of Human Agent Assistant API feature to request.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowV2beta1SuggestionFeatureType {
        /**
         * Unspecified feature type.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Run article suggestion model.
         * 
         */
        ArticleSuggestion("ARTICLE_SUGGESTION"),
        /**
         * Run FAQ model.
         * 
         */
        Faq("FAQ"),
        /**
         * Run smart reply model.
         * 
         */
        SmartReply("SMART_REPLY");

        private final String value;

        GoogleCloudDialogflowV2beta1SuggestionFeatureType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowV2beta1SuggestionFeatureType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
