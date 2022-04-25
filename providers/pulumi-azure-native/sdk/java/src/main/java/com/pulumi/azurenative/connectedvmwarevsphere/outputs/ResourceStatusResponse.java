// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceStatusResponse {
    /**
     * @return The last update time for this condition.
     * 
     */
    private final String lastUpdatedAt;
    /**
     * @return A human readable message indicating details about the status.
     * 
     */
    private final String message;
    /**
     * @return The reason for the condition&#39;s status.
     * 
     */
    private final String reason;
    /**
     * @return Severity with which to treat failures of this type of condition.
     * 
     */
    private final String severity;
    /**
     * @return Status of the condition.
     * 
     */
    private final String status;
    /**
     * @return The type of the condition.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ResourceStatusResponse(
        @CustomType.Parameter("lastUpdatedAt") String lastUpdatedAt,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.lastUpdatedAt = lastUpdatedAt;
        this.message = message;
        this.reason = reason;
        this.severity = severity;
        this.status = status;
        this.type = type;
    }

    /**
     * @return The last update time for this condition.
     * 
     */
    public String lastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * @return A human readable message indicating details about the status.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The reason for the condition&#39;s status.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return Severity with which to treat failures of this type of condition.
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return Status of the condition.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The type of the condition.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdatedAt;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt);
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
        }        public ResourceStatusResponse build() {
            return new ResourceStatusResponse(lastUpdatedAt, message, reason, severity, status, type);
        }
    }
}
