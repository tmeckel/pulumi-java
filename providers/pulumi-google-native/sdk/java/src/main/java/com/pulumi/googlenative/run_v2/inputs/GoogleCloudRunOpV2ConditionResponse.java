// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a status condition for a resource.
 * 
 */
public final class GoogleCloudRunOpV2ConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2ConditionResponse Empty = new GoogleCloudRunOpV2ConditionResponse();

    /**
     * A reason for the domain mapping condition.
     * 
     */
    @Import(name="domainMappingReason", required=true)
    private String domainMappingReason;

    /**
     * @return A reason for the domain mapping condition.
     * 
     */
    public String domainMappingReason() {
        return this.domainMappingReason;
    }

    /**
     * A reason for the execution condition.
     * 
     */
    @Import(name="executionReason", required=true)
    private String executionReason;

    /**
     * @return A reason for the execution condition.
     * 
     */
    public String executionReason() {
        return this.executionReason;
    }

    /**
     * A reason for the internal condition.
     * 
     */
    @Import(name="internalReason", required=true)
    private String internalReason;

    /**
     * @return A reason for the internal condition.
     * 
     */
    public String internalReason() {
        return this.internalReason;
    }

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime", required=true)
    private String lastTransitionTime;

    /**
     * @return Last time the condition transitioned from one status to another.
     * 
     */
    public String lastTransitionTime() {
        return this.lastTransitionTime;
    }

    /**
     * Human readable message indicating details about the current status.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return Human readable message indicating details about the current status.
     * 
     */
    public String message() {
        return this.message;
    }

    /**
     * A common (service-level) reason for this condition.
     * 
     */
    @Import(name="reason", required=true)
    private String reason;

    /**
     * @return A common (service-level) reason for this condition.
     * 
     */
    public String reason() {
        return this.reason;
    }

    /**
     * A reason for the revision condition.
     * 
     */
    @Import(name="revisionReason", required=true)
    private String revisionReason;

    /**
     * @return A reason for the revision condition.
     * 
     */
    public String revisionReason() {
        return this.revisionReason;
    }

    /**
     * How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    @Import(name="severity", required=true)
    private String severity;

    /**
     * @return How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    public String severity() {
        return this.severity;
    }

    /**
     * State of the condition.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return State of the condition.
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * &#34;Ready&#34;: True when the Resource is ready.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * &#34;Ready&#34;: True when the Resource is ready.
     * 
     */
    public String type() {
        return this.type;
    }

    private GoogleCloudRunOpV2ConditionResponse() {}

    private GoogleCloudRunOpV2ConditionResponse(GoogleCloudRunOpV2ConditionResponse $) {
        this.domainMappingReason = $.domainMappingReason;
        this.executionReason = $.executionReason;
        this.internalReason = $.internalReason;
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.revisionReason = $.revisionReason;
        this.severity = $.severity;
        this.state = $.state;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunOpV2ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2ConditionResponse $;

        public Builder() {
            $ = new GoogleCloudRunOpV2ConditionResponse();
        }

        public Builder(GoogleCloudRunOpV2ConditionResponse defaults) {
            $ = new GoogleCloudRunOpV2ConditionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainMappingReason A reason for the domain mapping condition.
         * 
         * @return builder
         * 
         */
        public Builder domainMappingReason(String domainMappingReason) {
            $.domainMappingReason = domainMappingReason;
            return this;
        }

        /**
         * @param executionReason A reason for the execution condition.
         * 
         * @return builder
         * 
         */
        public Builder executionReason(String executionReason) {
            $.executionReason = executionReason;
            return this;
        }

        /**
         * @param internalReason A reason for the internal condition.
         * 
         * @return builder
         * 
         */
        public Builder internalReason(String internalReason) {
            $.internalReason = internalReason;
            return this;
        }

        /**
         * @param lastTransitionTime Last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param message Human readable message indicating details about the current status.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        /**
         * @param reason A common (service-level) reason for this condition.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param revisionReason A reason for the revision condition.
         * 
         * @return builder
         * 
         */
        public Builder revisionReason(String revisionReason) {
            $.revisionReason = revisionReason;
            return this;
        }

        /**
         * @param severity How to interpret failures of this condition, one of Error, Warning, Info
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param state State of the condition.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param type type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * &#34;Ready&#34;: True when the Resource is ready.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GoogleCloudRunOpV2ConditionResponse build() {
            $.domainMappingReason = Objects.requireNonNull($.domainMappingReason, "expected parameter 'domainMappingReason' to be non-null");
            $.executionReason = Objects.requireNonNull($.executionReason, "expected parameter 'executionReason' to be non-null");
            $.internalReason = Objects.requireNonNull($.internalReason, "expected parameter 'internalReason' to be non-null");
            $.lastTransitionTime = Objects.requireNonNull($.lastTransitionTime, "expected parameter 'lastTransitionTime' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.reason = Objects.requireNonNull($.reason, "expected parameter 'reason' to be non-null");
            $.revisionReason = Objects.requireNonNull($.revisionReason, "expected parameter 'revisionReason' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
