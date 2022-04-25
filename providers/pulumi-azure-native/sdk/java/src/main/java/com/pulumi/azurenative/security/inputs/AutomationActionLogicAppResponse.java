// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The logic app action that should be triggered. To learn more about Security Center&#39;s Workflow Automation capabilities, visit https://aka.ms/ASCWorkflowAutomationLearnMore
 * 
 */
public final class AutomationActionLogicAppResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutomationActionLogicAppResponse Empty = new AutomationActionLogicAppResponse();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is &#39;LogicApp&#39;.
     * 
     */
    @Import(name="actionType", required=true)
    private String actionType;

    /**
     * @return The type of the action that will be triggered by the Automation
     * Expected value is &#39;LogicApp&#39;.
     * 
     */
    public String actionType() {
        return this.actionType;
    }

    /**
     * The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
     * 
     */
    @Import(name="logicAppResourceId")
    private @Nullable String logicAppResourceId;

    /**
     * @return The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
     * 
     */
    public Optional<String> logicAppResourceId() {
        return Optional.ofNullable(this.logicAppResourceId);
    }

    /**
     * The Logic App trigger URI endpoint (it will not be included in any response).
     * 
     */
    @Import(name="uri")
    private @Nullable String uri;

    /**
     * @return The Logic App trigger URI endpoint (it will not be included in any response).
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    private AutomationActionLogicAppResponse() {}

    private AutomationActionLogicAppResponse(AutomationActionLogicAppResponse $) {
        this.actionType = $.actionType;
        this.logicAppResourceId = $.logicAppResourceId;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationActionLogicAppResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationActionLogicAppResponse $;

        public Builder() {
            $ = new AutomationActionLogicAppResponse();
        }

        public Builder(AutomationActionLogicAppResponse defaults) {
            $ = new AutomationActionLogicAppResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The type of the action that will be triggered by the Automation
         * Expected value is &#39;LogicApp&#39;.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param logicAppResourceId The triggered Logic App Azure Resource ID. This can also reside on other subscriptions, given that you have permissions to trigger the Logic App
         * 
         * @return builder
         * 
         */
        public Builder logicAppResourceId(@Nullable String logicAppResourceId) {
            $.logicAppResourceId = logicAppResourceId;
            return this;
        }

        /**
         * @param uri The Logic App trigger URI endpoint (it will not be included in any response).
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable String uri) {
            $.uri = uri;
            return this;
        }

        public AutomationActionLogicAppResponse build() {
            $.actionType = Codegen.stringProp("actionType").arg($.actionType).require();
            return $;
        }
    }

}
