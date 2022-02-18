// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen).
     * 
     */
    @EnumType
    public enum MaintenanceWindowUpdateTrack {
        /**
         * This is an unknown maintenance timing preference.
         * 
         */
        SqlUpdateTrackUnspecified("SQL_UPDATE_TRACK_UNSPECIFIED"),
        /**
         * For instance update that requires a restart, this update track indicates your instance prefer to restart for new version early in maintenance window.
         * 
         */
        Canary("canary"),
        /**
         * For instance update that requires a restart, this update track indicates your instance prefer to let Cloud SQL choose the timing of restart (within its Maintenance window, if applicable).
         * 
         */
        Stable("stable");

        private final String value;

        MaintenanceWindowUpdateTrack(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MaintenanceWindowUpdateTrack[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
