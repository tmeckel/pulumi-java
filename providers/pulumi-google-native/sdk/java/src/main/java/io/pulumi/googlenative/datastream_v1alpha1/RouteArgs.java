// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Destination address for connection
     * 
     */
    @InputImport(name="destinationAddress", required=true)
    private final Input<String> destinationAddress;

    public Input<String> getDestinationAddress() {
        return this.destinationAddress;
    }

    /**
     * Destination port for connection
     * 
     */
    @InputImport(name="destinationPort")
    private final @Nullable Input<Integer> destinationPort;

    public Input<Integer> getDestinationPort() {
        return this.destinationPort == null ? Input.empty() : this.destinationPort;
    }

    /**
     * Display name.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="privateConnectionId", required=true)
    private final Input<String> privateConnectionId;

    public Input<String> getPrivateConnectionId() {
        return this.privateConnectionId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="routeId", required=true)
    private final Input<String> routeId;

    public Input<String> getRouteId() {
        return this.routeId;
    }

    public RouteArgs(
        Input<String> destinationAddress,
        @Nullable Input<Integer> destinationPort,
        Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        Input<String> privateConnectionId,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        Input<String> routeId) {
        this.destinationAddress = Objects.requireNonNull(destinationAddress, "expected parameter 'destinationAddress' to be non-null");
        this.destinationPort = destinationPort;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.labels = labels;
        this.location = location;
        this.privateConnectionId = Objects.requireNonNull(privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
        this.project = project;
        this.requestId = requestId;
        this.routeId = Objects.requireNonNull(routeId, "expected parameter 'routeId' to be non-null");
    }

    private RouteArgs() {
        this.destinationAddress = Input.empty();
        this.destinationPort = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.privateConnectionId = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.routeId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationAddress;
        private @Nullable Input<Integer> destinationPort;
        private Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private Input<String> privateConnectionId;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private Input<String> routeId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationPort = defaults.destinationPort;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.privateConnectionId = defaults.privateConnectionId;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.routeId = defaults.routeId;
        }

        public Builder setDestinationAddress(Input<String> destinationAddress) {
            this.destinationAddress = Objects.requireNonNull(destinationAddress);
            return this;
        }

        public Builder setDestinationAddress(String destinationAddress) {
            this.destinationAddress = Input.of(Objects.requireNonNull(destinationAddress));
            return this;
        }

        public Builder setDestinationPort(@Nullable Input<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Input.ofNullable(destinationPort);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPrivateConnectionId(Input<String> privateConnectionId) {
            this.privateConnectionId = Objects.requireNonNull(privateConnectionId);
            return this;
        }

        public Builder setPrivateConnectionId(String privateConnectionId) {
            this.privateConnectionId = Input.of(Objects.requireNonNull(privateConnectionId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRouteId(Input<String> routeId) {
            this.routeId = Objects.requireNonNull(routeId);
            return this;
        }

        public Builder setRouteId(String routeId) {
            this.routeId = Input.of(Objects.requireNonNull(routeId));
            return this;
        }

        public RouteArgs build() {
            return new RouteArgs(destinationAddress, destinationPort, displayName, labels, location, privateConnectionId, project, requestId, routeId);
        }
    }
}
