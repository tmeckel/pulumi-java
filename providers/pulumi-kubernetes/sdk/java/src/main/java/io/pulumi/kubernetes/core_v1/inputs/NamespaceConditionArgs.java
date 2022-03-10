// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NamespaceCondition contains details about state of namespace.
 * 
 */
public final class NamespaceConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceConditionArgs Empty = new NamespaceConditionArgs();

    @InputImport(name="lastTransitionTime")
      private final @Nullable Input<String> lastTransitionTime;

    public Input<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Input.empty() : this.lastTransitionTime;
    }

    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    /**
     * Type of namespace controller condition.
     * 
     * Possible enum values:
     *  - `"NamespaceContentRemaining"` contains information about resources remaining in a namespace.
     *  - `"NamespaceDeletionContentFailure"` contains information about namespace deleter errors during deletion of resources.
     *  - `"NamespaceDeletionDiscoveryFailure"` contains information about namespace deleter errors during resource discovery.
     *  - `"NamespaceDeletionGroupVersionParsingFailure"` contains information about namespace deleter errors parsing GV for legacy types.
     *  - `"NamespaceFinalizersRemaining"` contains information about which finalizers are on resources remaining in a namespace.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public NamespaceConditionArgs(
        @Nullable Input<String> lastTransitionTime,
        @Nullable Input<String> message,
        @Nullable Input<String> reason,
        Input<String> status,
        Input<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NamespaceConditionArgs() {
        this.lastTransitionTime = Input.empty();
        this.message = Input.empty();
        this.reason = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> lastTransitionTime;
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;
        private Input<String> status;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceConditionArgs defaults) {
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

        public Builder status(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public NamespaceConditionArgs build() {
            return new NamespaceConditionArgs(lastTransitionTime, message, reason, status, type);
        }
    }
}
