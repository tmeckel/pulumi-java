// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Asset content type. If not specified, no content but the asset name and type will be returned.
     * 
     */
    @EnumType
    public enum FeedContentType {
        /**
         * Unspecified content type.
         * 
         */
        ContentTypeUnspecified("CONTENT_TYPE_UNSPECIFIED"),
        /**
         * Resource metadata.
         * 
         */
        Resource("RESOURCE"),
        /**
         * The actual IAM policy set on a resource.
         * 
         */
        IamPolicy("IAM_POLICY"),
        /**
         * The Cloud Organization Policy set on an asset.
         * 
         */
        OrgPolicy("ORG_POLICY"),
        /**
         * The Cloud Access context manager Policy set on an asset.
         * 
         */
        AccessPolicy("ACCESS_POLICY"),
        /**
         * The runtime OS Inventory information.
         * 
         */
        OsInventory("OS_INVENTORY"),
        /**
         * The related resources.
         * 
         */
        Relationship("RELATIONSHIP");

        private final String value;

        FeedContentType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FeedContentType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
