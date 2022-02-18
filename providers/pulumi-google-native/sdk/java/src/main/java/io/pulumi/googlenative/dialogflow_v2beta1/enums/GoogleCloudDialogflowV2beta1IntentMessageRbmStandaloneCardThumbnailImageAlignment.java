// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment {
        /**
         * Not specified.
         * 
         */
        ThumbnailImageAlignmentUnspecified("THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED"),
        /**
         * Thumbnail preview is left-aligned.
         * 
         */
        Left("LEFT"),
        /**
         * Thumbnail preview is right-aligned.
         * 
         */
        Right("RIGHT");

        private final String value;

        GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
