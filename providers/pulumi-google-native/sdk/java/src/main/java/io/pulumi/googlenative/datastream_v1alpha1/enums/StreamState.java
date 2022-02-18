// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The state of the stream.
     * 
     */
    @EnumType
    public enum StreamState {
        /**
         * Unspecified stream state.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The stream has been created.
         * 
         */
        Created("CREATED"),
        /**
         * The stream is running.
         * 
         */
        Running("RUNNING"),
        /**
         * The stream is paused.
         * 
         */
        Paused("PAUSED"),
        /**
         * The stream is in maintenance mode. Updates are rejected on the resource in this state.
         * 
         */
        Maintenance("MAINTENANCE"),
        /**
         * The stream is experiencing an error that is preventing data from being streamed.
         * 
         */
        Failed("FAILED"),
        /**
         * The stream has experienced a terminal failure.
         * 
         */
        FailedPermanently("FAILED_PERMANENTLY"),
        /**
         * The stream is starting, but not yet running.
         * 
         */
        Starting("STARTING"),
        /**
         * The Stream is no longer reading new events, but still writing events in the buffer.
         * 
         */
        Draining("DRAINING");

        private final String value;

        StreamState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StreamState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
