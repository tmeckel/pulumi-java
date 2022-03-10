// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfigurationCondition defines the condition of priority level.
 * 
 */
public final class PriorityLevelConfigurationConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationConditionArgs Empty = new PriorityLevelConfigurationConditionArgs();

    /**
     * `lastTransitionTime` is the last time the condition transitioned from one status to another.
     * 
     */
    @InputImport(name="lastTransitionTime")
      private final @Nullable Input<String> lastTransitionTime;

    public Input<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Input.empty() : this.lastTransitionTime;
    }

    /**
     * `message` is a human-readable message indicating details about last transition.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    /**
     * `status` is the status of the condition. Can be True, False, Unknown. Required.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * `type` is the type of the condition. Required.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public PriorityLevelConfigurationConditionArgs(
        @Nullable Input<String> lastTransitionTime,
        @Nullable Input<String> message,
        @Nullable Input<String> reason,
        @Nullable Input<String> status,
        @Nullable Input<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    private PriorityLevelConfigurationConditionArgs() {
        this.lastTransitionTime = Input.empty();
        this.message = Input.empty();
        this.reason = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> lastTransitionTime;
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;
        private @Nullable Input<String> status;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable Input<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Input.ofNullable(lastTransitionTime);
            return this;
        }

        public Builder message(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder reason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public PriorityLevelConfigurationConditionArgs build() {
            return new PriorityLevelConfigurationConditionArgs(lastTransitionTime, message, reason, status, type);
        }
    }
}
