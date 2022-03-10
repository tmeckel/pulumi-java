// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReplicationControllerCondition {
    /**
     * The last time the condition transitioned from one status to another.
     * 
     */
    private final @Nullable String lastTransitionTime;
    /**
     * A human readable message indicating details about the transition.
     * 
     */
    private final @Nullable String message;
    /**
     * The reason for the condition's last transition.
     * 
     */
    private final @Nullable String reason;
    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    private final String status;
    /**
     * Type of replication controller condition.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ReplicationControllerCondition(
        @OutputCustomType.Parameter("lastTransitionTime") @Nullable String lastTransitionTime,
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("reason") @Nullable String reason,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    /**
     * The last time the condition transitioned from one status to another.
     * 
    */
    public Optional<String> getLastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * A human readable message indicating details about the transition.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The reason for the condition's last transition.
     * 
    */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * Status of the condition, one of True, False, Unknown.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Type of replication controller condition.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationControllerCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationControllerCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ReplicationControllerCondition build() {
            return new ReplicationControllerCondition(lastTransitionTime, message, reason, status, type);
        }
    }
}
