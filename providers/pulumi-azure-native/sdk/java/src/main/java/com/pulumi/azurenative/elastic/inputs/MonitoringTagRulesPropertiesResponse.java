// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.inputs;

import com.pulumi.azurenative.elastic.inputs.LogRulesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MonitoringTagRulesPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringTagRulesPropertiesResponse Empty = new MonitoringTagRulesPropertiesResponse();

    /**
     * Rules for sending logs.
     * 
     */
    @Import(name="logRules")
    private @Nullable LogRulesResponse logRules;

    /**
     * @return Rules for sending logs.
     * 
     */
    public Optional<LogRulesResponse> logRules() {
        return Optional.ofNullable(this.logRules);
    }

    /**
     * Provisioning state of the monitoring tag rules.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable String provisioningState;

    /**
     * @return Provisioning state of the monitoring tag rules.
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    private MonitoringTagRulesPropertiesResponse() {}

    private MonitoringTagRulesPropertiesResponse(MonitoringTagRulesPropertiesResponse $) {
        this.logRules = $.logRules;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringTagRulesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringTagRulesPropertiesResponse $;

        public Builder() {
            $ = new MonitoringTagRulesPropertiesResponse();
        }

        public Builder(MonitoringTagRulesPropertiesResponse defaults) {
            $ = new MonitoringTagRulesPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param logRules Rules for sending logs.
         * 
         * @return builder
         * 
         */
        public Builder logRules(@Nullable LogRulesResponse logRules) {
            $.logRules = logRules;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the monitoring tag rules.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public MonitoringTagRulesPropertiesResponse build() {
            return $;
        }
    }

}
