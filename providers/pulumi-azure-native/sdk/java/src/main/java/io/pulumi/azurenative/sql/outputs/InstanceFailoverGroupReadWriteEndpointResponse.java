// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFailoverGroupReadWriteEndpointResponse {
    /**
     * Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    private final String failoverPolicy;
    /**
     * Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    private final @Nullable Integer failoverWithDataLossGracePeriodMinutes;

    @OutputCustomType.Constructor
    private InstanceFailoverGroupReadWriteEndpointResponse(
        @OutputCustomType.Parameter("failoverPolicy") String failoverPolicy,
        @OutputCustomType.Parameter("failoverWithDataLossGracePeriodMinutes") @Nullable Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverPolicy = failoverPolicy;
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
    }

    /**
     * Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
    */
    public String getFailoverPolicy() {
        return this.failoverPolicy;
    }
    /**
     * Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
    */
    public Optional<Integer> getFailoverWithDataLossGracePeriodMinutes() {
        return Optional.ofNullable(this.failoverWithDataLossGracePeriodMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverGroupReadWriteEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failoverPolicy;
        private @Nullable Integer failoverWithDataLossGracePeriodMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverGroupReadWriteEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.failoverWithDataLossGracePeriodMinutes = defaults.failoverWithDataLossGracePeriodMinutes;
        }

        public Builder failoverPolicy(String failoverPolicy) {
            this.failoverPolicy = Objects.requireNonNull(failoverPolicy);
            return this;
        }

        public Builder failoverWithDataLossGracePeriodMinutes(@Nullable Integer failoverWithDataLossGracePeriodMinutes) {
            this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
            return this;
        }
        public InstanceFailoverGroupReadWriteEndpointResponse build() {
            return new InstanceFailoverGroupReadWriteEndpointResponse(failoverPolicy, failoverWithDataLossGracePeriodMinutes);
        }
    }
}
