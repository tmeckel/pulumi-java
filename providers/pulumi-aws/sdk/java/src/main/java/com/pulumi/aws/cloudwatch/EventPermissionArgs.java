// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventPermissionArgs Empty = new EventPermissionArgs();

    /**
     * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<EventPermissionConditionArgs> condition;

    /**
     * @return Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    public Optional<Output<EventPermissionConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Import(name="eventBusName")
    private @Nullable Output<String> eventBusName;

    /**
     * @return The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    public Optional<Output<String>> eventBusName() {
        return Optional.ofNullable(this.eventBusName);
    }

    /**
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    /**
     * @return The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }

    /**
     * An identifier string for the external account that you are granting permissions to.
     * 
     */
    @Import(name="statementId", required=true)
    private Output<String> statementId;

    /**
     * @return An identifier string for the external account that you are granting permissions to.
     * 
     */
    public Output<String> statementId() {
        return this.statementId;
    }

    private EventPermissionArgs() {}

    private EventPermissionArgs(EventPermissionArgs $) {
        this.action = $.action;
        this.condition = $.condition;
        this.eventBusName = $.eventBusName;
        this.principal = $.principal;
        this.statementId = $.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventPermissionArgs $;

        public Builder() {
            $ = new EventPermissionArgs();
        }

        public Builder(EventPermissionArgs defaults) {
            $ = new EventPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param condition Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<EventPermissionConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
         * 
         * @return builder
         * 
         */
        public Builder condition(EventPermissionConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param eventBusName The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
         * 
         * @return builder
         * 
         */
        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            $.eventBusName = eventBusName;
            return this;
        }

        /**
         * @param eventBusName The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
         * 
         * @return builder
         * 
         */
        public Builder eventBusName(String eventBusName) {
            return eventBusName(Output.of(eventBusName));
        }

        /**
         * @param principal The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
         * 
         * @return builder
         * 
         */
        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param statementId An identifier string for the external account that you are granting permissions to.
         * 
         * @return builder
         * 
         */
        public Builder statementId(Output<String> statementId) {
            $.statementId = statementId;
            return this;
        }

        /**
         * @param statementId An identifier string for the external account that you are granting permissions to.
         * 
         * @return builder
         * 
         */
        public Builder statementId(String statementId) {
            return statementId(Output.of(statementId));
        }

        public EventPermissionArgs build() {
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            $.statementId = Objects.requireNonNull($.statementId, "expected parameter 'statementId' to be non-null");
            return $;
        }
    }

}
