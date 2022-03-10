// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaFilterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSourceMappingFilterCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingFilterCriteriaGetArgs Empty = new EventSourceMappingFilterCriteriaGetArgs();

    /**
     * A set of up to 5 filter. If an event satisfies at least one, Lambda sends the event to the function or adds it to the next batch. Detailed below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable Input<List<EventSourceMappingFilterCriteriaFilterGetArgs>> filters;

    public Input<List<EventSourceMappingFilterCriteriaFilterGetArgs>> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    public EventSourceMappingFilterCriteriaGetArgs(@Nullable Input<List<EventSourceMappingFilterCriteriaFilterGetArgs>> filters) {
        this.filters = filters;
    }

    private EventSourceMappingFilterCriteriaGetArgs() {
        this.filters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EventSourceMappingFilterCriteriaFilterGetArgs>> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder filters(@Nullable Input<List<EventSourceMappingFilterCriteriaFilterGetArgs>> filters) {
            this.filters = filters;
            return this;
        }

        public Builder filters(@Nullable List<EventSourceMappingFilterCriteriaFilterGetArgs> filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }
        public EventSourceMappingFilterCriteriaGetArgs build() {
            return new EventSourceMappingFilterCriteriaGetArgs(filters);
        }
    }
}
