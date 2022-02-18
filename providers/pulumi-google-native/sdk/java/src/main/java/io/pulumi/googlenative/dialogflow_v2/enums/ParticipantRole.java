// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    @EnumType
    public enum ParticipantRole {
        /**
         * Participant role not set.
         * 
         */
        RoleUnspecified("ROLE_UNSPECIFIED"),
        /**
         * Participant is a human agent.
         * 
         */
        HumanAgent("HUMAN_AGENT"),
        /**
         * Participant is an automated agent, such as a Dialogflow agent.
         * 
         */
        AutomatedAgent("AUTOMATED_AGENT"),
        /**
         * Participant is an end user that has called or chatted with Dialogflow services.
         * 
         */
        EndUser("END_USER");

        private final String value;

        ParticipantRole(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ParticipantRole[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
