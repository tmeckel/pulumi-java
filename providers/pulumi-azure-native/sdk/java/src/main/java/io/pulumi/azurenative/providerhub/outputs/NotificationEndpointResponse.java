// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationEndpointResponse {
    private final @Nullable List<String> locations;
    private final @Nullable String notificationDestination;

    @OutputCustomType.Constructor
    private NotificationEndpointResponse(
        @OutputCustomType.Parameter("locations") @Nullable List<String> locations,
        @OutputCustomType.Parameter("notificationDestination") @Nullable String notificationDestination) {
        this.locations = locations;
        this.notificationDestination = notificationDestination;
    }

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public Optional<String> getNotificationDestination() {
        return Optional.ofNullable(this.notificationDestination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;
        private @Nullable String notificationDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.notificationDestination = defaults.notificationDestination;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder notificationDestination(@Nullable String notificationDestination) {
            this.notificationDestination = notificationDestination;
            return this;
        }
        public NotificationEndpointResponse build() {
            return new NotificationEndpointResponse(locations, notificationDestination);
        }
    }
}
