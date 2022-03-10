// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetSqsTarget {
    /**
     * The FIFO message group ID to use as the target.
     * 
     */
    private final @Nullable String messageGroupId;

    @OutputCustomType.Constructor
    private EventTargetSqsTarget(@OutputCustomType.Parameter("messageGroupId") @Nullable String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    /**
     * The FIFO message group ID to use as the target.
     * 
    */
    public Optional<String> getMessageGroupId() {
        return Optional.ofNullable(this.messageGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetSqsTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String messageGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetSqsTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageGroupId = defaults.messageGroupId;
        }

        public Builder messageGroupId(@Nullable String messageGroupId) {
            this.messageGroupId = messageGroupId;
            return this;
        }
        public EventTargetSqsTarget build() {
            return new EventTargetSqsTarget(messageGroupId);
        }
    }
}
