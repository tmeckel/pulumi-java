// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowV2FulfillmentFeatureType {
        /**
         * Feature type not specified.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Fulfillment is enabled for SmallTalk.
         * 
         */
        Smalltalk("SMALLTALK");

        private final String value;

        GoogleCloudDialogflowV2FulfillmentFeatureType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowV2FulfillmentFeatureType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
