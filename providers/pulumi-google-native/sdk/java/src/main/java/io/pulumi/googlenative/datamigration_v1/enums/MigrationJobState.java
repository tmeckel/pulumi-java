// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The current migration job state.
     * 
     */
    @EnumType
    public enum MigrationJobState {
        /**
         * The state of the migration job is unknown.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The migration job is down for maintenance.
         * 
         */
        Maintenance("MAINTENANCE"),
        /**
         * The migration job is in draft mode and no resources are created.
         * 
         */
        Draft("DRAFT"),
        /**
         * The migration job is being created.
         * 
         */
        Creating("CREATING"),
        /**
         * The migration job is created and not started.
         * 
         */
        NotStarted("NOT_STARTED"),
        /**
         * The migration job is running.
         * 
         */
        Running("RUNNING"),
        /**
         * The migration job failed.
         * 
         */
        Failed("FAILED"),
        /**
         * The migration job has been completed.
         * 
         */
        Completed("COMPLETED"),
        /**
         * The migration job is being deleted.
         * 
         */
        Deleting("DELETING"),
        /**
         * The migration job is being stopped.
         * 
         */
        Stopping("STOPPING"),
        /**
         * The migration job is currently stopped.
         * 
         */
        Stopped("STOPPED"),
        /**
         * The migration job has been deleted.
         * 
         */
        Deleted("DELETED"),
        /**
         * The migration job is being updated.
         * 
         */
        Updating("UPDATING"),
        /**
         * The migration job is starting.
         * 
         */
        Starting("STARTING"),
        /**
         * The migration job is restarting.
         * 
         */
        Restarting("RESTARTING"),
        /**
         * The migration job is resuming.
         * 
         */
        Resuming("RESUMING");

        private final String value;

        MigrationJobState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MigrationJobState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
