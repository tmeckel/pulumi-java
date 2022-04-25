// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AutoHealCustomActionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 * 
 */
public final class AutoHealActionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoHealActionsResponse Empty = new AutoHealActionsResponse();

    /**
     * Predefined action to be taken.
     * 
     */
    @Import(name="actionType")
    private @Nullable String actionType;

    /**
     * @return Predefined action to be taken.
     * 
     */
    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    /**
     * Custom action to be taken.
     * 
     */
    @Import(name="customAction")
    private @Nullable AutoHealCustomActionResponse customAction;

    /**
     * @return Custom action to be taken.
     * 
     */
    public Optional<AutoHealCustomActionResponse> customAction() {
        return Optional.ofNullable(this.customAction);
    }

    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    @Import(name="minProcessExecutionTime")
    private @Nullable String minProcessExecutionTime;

    /**
     * @return Minimum time the process must execute
     * before taking the action
     * 
     */
    public Optional<String> minProcessExecutionTime() {
        return Optional.ofNullable(this.minProcessExecutionTime);
    }

    private AutoHealActionsResponse() {}

    private AutoHealActionsResponse(AutoHealActionsResponse $) {
        this.actionType = $.actionType;
        this.customAction = $.customAction;
        this.minProcessExecutionTime = $.minProcessExecutionTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoHealActionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoHealActionsResponse $;

        public Builder() {
            $ = new AutoHealActionsResponse();
        }

        public Builder(AutoHealActionsResponse defaults) {
            $ = new AutoHealActionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType Predefined action to be taken.
         * 
         * @return builder
         * 
         */
        public Builder actionType(@Nullable String actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param customAction Custom action to be taken.
         * 
         * @return builder
         * 
         */
        public Builder customAction(@Nullable AutoHealCustomActionResponse customAction) {
            $.customAction = customAction;
            return this;
        }

        /**
         * @param minProcessExecutionTime Minimum time the process must execute
         * before taking the action
         * 
         * @return builder
         * 
         */
        public Builder minProcessExecutionTime(@Nullable String minProcessExecutionTime) {
            $.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }

        public AutoHealActionsResponse build() {
            return $;
        }
    }

}
