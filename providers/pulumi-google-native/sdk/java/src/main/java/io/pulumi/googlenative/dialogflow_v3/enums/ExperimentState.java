// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The current state of the experiment. Transition triggered by Experiments.StartExperiment: DRAFT->RUNNING. Transition triggered by Experiments.CancelExperiment: DRAFT->DONE or RUNNING->DONE.
     * 
     */
    @EnumType
    public enum ExperimentState {
        /**
         * State unspecified.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The experiment is created but not started yet.
         * 
         */
        Draft("DRAFT"),
        /**
         * The experiment is running.
         * 
         */
        Running("RUNNING"),
        /**
         * The experiment is done.
         * 
         */
        Done("DONE"),
        /**
         * The experiment with auto-rollout enabled has failed.
         * 
         */
        RolloutFailed("ROLLOUT_FAILED");

        private final String value;

        ExperimentState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExperimentState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
