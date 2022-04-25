// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatusResponse {
    /**
     * @return The short label for the status.
     * 
     */
    private final String displayStatus;
    /**
     * @return The detailed message for the status, including alerts and error messages.
     * 
     */
    private final String message;
    /**
     * @return The timestamp when the status was changed to the current value.
     * 
     */
    private final String timestamp;

    @CustomType.Constructor
    private StatusResponse(
        @CustomType.Parameter("displayStatus") String displayStatus,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("timestamp") String timestamp) {
        this.displayStatus = displayStatus;
        this.message = message;
        this.timestamp = timestamp;
    }

    /**
     * @return The short label for the status.
     * 
     */
    public String displayStatus() {
        return this.displayStatus;
    }
    /**
     * @return The detailed message for the status, including alerts and error messages.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The timestamp when the status was changed to the current value.
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayStatus;
        private String message;
        private String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayStatus = defaults.displayStatus;
    	      this.message = defaults.message;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder displayStatus(String displayStatus) {
            this.displayStatus = Objects.requireNonNull(displayStatus);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }        public StatusResponse build() {
            return new StatusResponse(displayStatus, message, timestamp);
        }
    }
}
