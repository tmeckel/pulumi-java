// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.enums.EventSourceKind;
import io.pulumi.azurenative.timeseriesinsights.inputs.LocalTimestampArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceArgs Empty = new EventSourceArgs();

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @InputImport(name="environmentName", required=true)
      private final Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * Name of the event source.
     * 
     */
    @InputImport(name="eventSourceName")
      private final @Nullable Input<String> eventSourceName;

    public Input<String> getEventSourceName() {
        return this.eventSourceName == null ? Input.empty() : this.eventSourceName;
    }

    /**
     * The kind of the event source.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,EventSourceKind>> kind;

    public Input<Either<String,EventSourceKind>> getKind() {
        return this.kind;
    }

    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    @InputImport(name="localTimestamp")
      private final @Nullable Input<LocalTimestampArgs> localTimestamp;

    public Input<LocalTimestampArgs> getLocalTimestamp() {
        return this.localTimestamp == null ? Input.empty() : this.localTimestamp;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EventSourceArgs(
        Input<String> environmentName,
        @Nullable Input<String> eventSourceName,
        Input<Either<String,EventSourceKind>> kind,
        @Nullable Input<LocalTimestampArgs> localTimestamp,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.eventSourceName = eventSourceName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.localTimestamp = localTimestamp;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private EventSourceArgs() {
        this.environmentName = Input.empty();
        this.eventSourceName = Input.empty();
        this.kind = Input.empty();
        this.localTimestamp = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> environmentName;
        private @Nullable Input<String> eventSourceName;
        private Input<Either<String,EventSourceKind>> kind;
        private @Nullable Input<LocalTimestampArgs> localTimestamp;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.eventSourceName = defaults.eventSourceName;
    	      this.kind = defaults.kind;
    	      this.localTimestamp = defaults.localTimestamp;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder environmentName(Input<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Input.of(Objects.requireNonNull(environmentName));
            return this;
        }

        public Builder eventSourceName(@Nullable Input<String> eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }

        public Builder eventSourceName(@Nullable String eventSourceName) {
            this.eventSourceName = Input.ofNullable(eventSourceName);
            return this;
        }

        public Builder kind(Input<Either<String,EventSourceKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(Either<String,EventSourceKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder localTimestamp(@Nullable Input<LocalTimestampArgs> localTimestamp) {
            this.localTimestamp = localTimestamp;
            return this;
        }

        public Builder localTimestamp(@Nullable LocalTimestampArgs localTimestamp) {
            this.localTimestamp = Input.ofNullable(localTimestamp);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public EventSourceArgs build() {
            return new EventSourceArgs(environmentName, eventSourceName, kind, localTimestamp, location, resourceGroupName, tags);
        }
    }
}
