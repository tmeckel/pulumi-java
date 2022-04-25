// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobConditionResponse {
    /**
     * @return Optional. Last time the condition transitioned from one status to another.
     * 
     */
    private final String lastTransitionTime;
    /**
     * @return Optional. Human readable message indicating details about the current status.
     * 
     */
    private final String message;
    /**
     * @return Optional. One-word CamelCase reason for the condition&#39;s last transition.
     * 
     */
    private final String reason;
    /**
     * @return Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    private final String severity;
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    private final String status;
    /**
     * @return Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * &#34;Completed&#34;: True when the Job has successfully completed. * &#34;Started&#34;: True when the Job has successfully started running. * &#34;ResourcesAvailable&#34;: True when underlying resources have been provisioned.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private JobConditionResponse(
        @CustomType.Parameter("lastTransitionTime") String lastTransitionTime,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.severity = severity;
        this.status = status;
        this.type = type;
    }

    /**
     * @return Optional. Last time the condition transitioned from one status to another.
     * 
     */
    public String lastTransitionTime() {
        return this.lastTransitionTime;
    }
    /**
     * @return Optional. Human readable message indicating details about the current status.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Optional. One-word CamelCase reason for the condition&#39;s last transition.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * &#34;Completed&#34;: True when the Job has successfully completed. * &#34;Started&#34;: True when the Job has successfully started running. * &#34;ResourcesAvailable&#34;: True when underlying resources have been provisioned.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public JobConditionResponse build() {
            return new JobConditionResponse(lastTransitionTime, message, reason, severity, status, type);
        }
    }
}
