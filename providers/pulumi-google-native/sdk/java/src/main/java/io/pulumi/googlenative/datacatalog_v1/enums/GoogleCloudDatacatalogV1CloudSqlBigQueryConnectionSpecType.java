// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the Cloud SQL database.
     * 
     */
    @EnumType
    public enum GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType {
        /**
         * Unspecified database type.
         * 
         */
        DatabaseTypeUnspecified("DATABASE_TYPE_UNSPECIFIED"),
        /**
         * Cloud SQL for PostgreSQL.
         * 
         */
        Postgres("POSTGRES"),
        /**
         * Cloud SQL for MySQL.
         * 
         */
        Mysql("MYSQL");

        private final String value;

        GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
