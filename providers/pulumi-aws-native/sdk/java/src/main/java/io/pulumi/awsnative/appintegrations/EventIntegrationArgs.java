// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations;

import io.pulumi.awsnative.appintegrations.inputs.EventIntegrationEventFilterArgs;
import io.pulumi.awsnative.appintegrations.inputs.EventIntegrationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventIntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventIntegrationArgs Empty = new EventIntegrationArgs();

    /**
     * The event integration description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Amazon Eventbridge bus for the event integration.
     * 
     */
    @InputImport(name="eventBridgeBus", required=true)
      private final Input<String> eventBridgeBus;

    public Input<String> getEventBridgeBus() {
        return this.eventBridgeBus;
    }

    /**
     * The EventFilter (source) associated with the event integration.
     * 
     */
    @InputImport(name="eventFilter", required=true)
      private final Input<EventIntegrationEventFilterArgs> eventFilter;

    public Input<EventIntegrationEventFilterArgs> getEventFilter() {
        return this.eventFilter;
    }

    /**
     * The name of the event integration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The tags (keys and values) associated with the event integration.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<EventIntegrationTagArgs>> tags;

    public Input<List<EventIntegrationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EventIntegrationArgs(
        @Nullable Input<String> description,
        Input<String> eventBridgeBus,
        Input<EventIntegrationEventFilterArgs> eventFilter,
        @Nullable Input<String> name,
        @Nullable Input<List<EventIntegrationTagArgs>> tags) {
        this.description = description;
        this.eventBridgeBus = Objects.requireNonNull(eventBridgeBus, "expected parameter 'eventBridgeBus' to be non-null");
        this.eventFilter = Objects.requireNonNull(eventFilter, "expected parameter 'eventFilter' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private EventIntegrationArgs() {
        this.description = Input.empty();
        this.eventBridgeBus = Input.empty();
        this.eventFilter = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> eventBridgeBus;
        private Input<EventIntegrationEventFilterArgs> eventFilter;
        private @Nullable Input<String> name;
        private @Nullable Input<List<EventIntegrationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EventIntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventBridgeBus = defaults.eventBridgeBus;
    	      this.eventFilter = defaults.eventFilter;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder eventBridgeBus(Input<String> eventBridgeBus) {
            this.eventBridgeBus = Objects.requireNonNull(eventBridgeBus);
            return this;
        }

        public Builder eventBridgeBus(String eventBridgeBus) {
            this.eventBridgeBus = Input.of(Objects.requireNonNull(eventBridgeBus));
            return this;
        }

        public Builder eventFilter(Input<EventIntegrationEventFilterArgs> eventFilter) {
            this.eventFilter = Objects.requireNonNull(eventFilter);
            return this;
        }

        public Builder eventFilter(EventIntegrationEventFilterArgs eventFilter) {
            this.eventFilter = Input.of(Objects.requireNonNull(eventFilter));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder tags(@Nullable Input<List<EventIntegrationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<EventIntegrationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public EventIntegrationArgs build() {
            return new EventIntegrationArgs(description, eventBridgeBus, eventFilter, name, tags);
        }
    }
}
