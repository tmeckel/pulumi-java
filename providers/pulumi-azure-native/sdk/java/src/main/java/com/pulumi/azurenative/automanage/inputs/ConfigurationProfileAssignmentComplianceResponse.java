// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automanage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The compliance status for the configuration profile assignment.
 * 
 */
public final class ConfigurationProfileAssignmentComplianceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationProfileAssignmentComplianceResponse Empty = new ConfigurationProfileAssignmentComplianceResponse();

    /**
     * The state of compliance, which only appears in the response.
     * 
     */
    @Import(name="updateStatus", required=true)
    private String updateStatus;

    /**
     * @return The state of compliance, which only appears in the response.
     * 
     */
    public String updateStatus() {
        return this.updateStatus;
    }

    private ConfigurationProfileAssignmentComplianceResponse() {}

    private ConfigurationProfileAssignmentComplianceResponse(ConfigurationProfileAssignmentComplianceResponse $) {
        this.updateStatus = $.updateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationProfileAssignmentComplianceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationProfileAssignmentComplianceResponse $;

        public Builder() {
            $ = new ConfigurationProfileAssignmentComplianceResponse();
        }

        public Builder(ConfigurationProfileAssignmentComplianceResponse defaults) {
            $ = new ConfigurationProfileAssignmentComplianceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param updateStatus The state of compliance, which only appears in the response.
         * 
         * @return builder
         * 
         */
        public Builder updateStatus(String updateStatus) {
            $.updateStatus = updateStatus;
            return this;
        }

        public ConfigurationProfileAssignmentComplianceResponse build() {
            $.updateStatus = Objects.requireNonNull($.updateStatus, "expected parameter 'updateStatus' to be non-null");
            return $;
        }
    }

}
