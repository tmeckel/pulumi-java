// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
     */
    @EnumType
    public enum AppDatabaseType {
        /**
         * Database type is unspecified.
         * 
         */
        DatabaseTypeUnspecified("DATABASE_TYPE_UNSPECIFIED"),
        /**
         * Cloud Datastore
         * 
         */
        CloudDatastore("CLOUD_DATASTORE"),
        /**
         * Cloud Firestore Native
         * 
         */
        CloudFirestore("CLOUD_FIRESTORE"),
        /**
         * Cloud Firestore in Datastore Mode
         * 
         */
        CloudDatastoreCompatibility("CLOUD_DATASTORE_COMPATIBILITY");

        private final String value;

        AppDatabaseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AppDatabaseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
