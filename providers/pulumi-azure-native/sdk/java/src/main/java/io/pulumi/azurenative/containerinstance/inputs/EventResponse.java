// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A container group or container instance event.
 * 
 */
public final class EventResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventResponse Empty = new EventResponse();

    /**
     * The count of the event.
     * 
     */
    @InputImport(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * The date-time of the earliest logged event.
     * 
     */
    @InputImport(name="firstTimestamp", required=true)
      private final String firstTimestamp;

    public String getFirstTimestamp() {
        return this.firstTimestamp;
    }

    /**
     * The date-time of the latest logged event.
     * 
     */
    @InputImport(name="lastTimestamp", required=true)
      private final String lastTimestamp;

    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * The event message.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The event name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The event type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public EventResponse(
        Integer count,
        String firstTimestamp,
        String lastTimestamp,
        String message,
        String name,
        String type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.firstTimestamp = Objects.requireNonNull(firstTimestamp, "expected parameter 'firstTimestamp' to be non-null");
        this.lastTimestamp = Objects.requireNonNull(lastTimestamp, "expected parameter 'lastTimestamp' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventResponse() {
        this.count = null;
        this.firstTimestamp = null;
        this.lastTimestamp = null;
        this.message = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String firstTimestamp;
        private String lastTimestamp;
        private String message;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder firstTimestamp(String firstTimestamp) {
            this.firstTimestamp = Objects.requireNonNull(firstTimestamp);
            return this;
        }

        public Builder lastTimestamp(String lastTimestamp) {
            this.lastTimestamp = Objects.requireNonNull(lastTimestamp);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EventResponse build() {
            return new EventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}
