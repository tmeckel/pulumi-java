// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledAuditArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduledAuditArgs Empty = new GetScheduledAuditArgs();

    /**
     * The name you want to give to the scheduled audit.
     * 
     */
    @InputImport(name="scheduledAuditName", required=true)
      private final String scheduledAuditName;

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    public GetScheduledAuditArgs(String scheduledAuditName) {
        this.scheduledAuditName = Objects.requireNonNull(scheduledAuditName, "expected parameter 'scheduledAuditName' to be non-null");
    }

    private GetScheduledAuditArgs() {
        this.scheduledAuditName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledAuditArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduledAuditName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledAuditArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduledAuditName = defaults.scheduledAuditName;
        }

        public Builder scheduledAuditName(String scheduledAuditName) {
            this.scheduledAuditName = Objects.requireNonNull(scheduledAuditName);
            return this;
        }
        public GetScheduledAuditArgs build() {
            return new GetScheduledAuditArgs(scheduledAuditName);
        }
    }
}
