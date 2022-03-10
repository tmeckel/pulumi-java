// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class AS2ErrorSettingsResponse {
    /**
     * The value indicating whether to resend message If MDN is not received.
     * 
     */
    private final Boolean resendIfMDNNotReceived;
    /**
     * The value indicating whether to suspend duplicate message.
     * 
     */
    private final Boolean suspendDuplicateMessage;

    @OutputCustomType.Constructor
    private AS2ErrorSettingsResponse(
        @OutputCustomType.Parameter("resendIfMDNNotReceived") Boolean resendIfMDNNotReceived,
        @OutputCustomType.Parameter("suspendDuplicateMessage") Boolean suspendDuplicateMessage) {
        this.resendIfMDNNotReceived = resendIfMDNNotReceived;
        this.suspendDuplicateMessage = suspendDuplicateMessage;
    }

    /**
     * The value indicating whether to resend message If MDN is not received.
     * 
    */
    public Boolean getResendIfMDNNotReceived() {
        return this.resendIfMDNNotReceived;
    }
    /**
     * The value indicating whether to suspend duplicate message.
     * 
    */
    public Boolean getSuspendDuplicateMessage() {
        return this.suspendDuplicateMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ErrorSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean resendIfMDNNotReceived;
        private Boolean suspendDuplicateMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ErrorSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resendIfMDNNotReceived = defaults.resendIfMDNNotReceived;
    	      this.suspendDuplicateMessage = defaults.suspendDuplicateMessage;
        }

        public Builder resendIfMDNNotReceived(Boolean resendIfMDNNotReceived) {
            this.resendIfMDNNotReceived = Objects.requireNonNull(resendIfMDNNotReceived);
            return this;
        }

        public Builder suspendDuplicateMessage(Boolean suspendDuplicateMessage) {
            this.suspendDuplicateMessage = Objects.requireNonNull(suspendDuplicateMessage);
            return this;
        }
        public AS2ErrorSettingsResponse build() {
            return new AS2ErrorSettingsResponse(resendIfMDNNotReceived, suspendDuplicateMessage);
        }
    }
}
