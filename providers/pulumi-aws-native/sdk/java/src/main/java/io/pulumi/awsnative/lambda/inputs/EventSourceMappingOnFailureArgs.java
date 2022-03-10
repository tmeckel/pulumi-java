// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A destination for events that failed processing.
 * 
 */
public final class EventSourceMappingOnFailureArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingOnFailureArgs Empty = new EventSourceMappingOnFailureArgs();

    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    public EventSourceMappingOnFailureArgs(@Nullable Input<String> destination) {
        this.destination = destination;
    }

    private EventSourceMappingOnFailureArgs() {
        this.destination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destination;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingOnFailureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder destination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }
        public EventSourceMappingOnFailureArgs build() {
            return new EventSourceMappingOnFailureArgs(destination);
        }
    }
}
