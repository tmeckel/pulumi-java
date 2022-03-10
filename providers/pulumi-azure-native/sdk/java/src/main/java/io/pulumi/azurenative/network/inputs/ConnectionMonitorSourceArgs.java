// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the source of connection monitor.
 * 
 */
public final class ConnectionMonitorSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorSourceArgs Empty = new ConnectionMonitorSourceArgs();

    /**
     * The source port used by connection monitor.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The ID of the resource used as the source by connection monitor.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public ConnectionMonitorSourceArgs(
        @Nullable Input<Integer> port,
        Input<String> resourceId) {
        this.port = port;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private ConnectionMonitorSourceArgs() {
        this.port = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> port;
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder resourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public ConnectionMonitorSourceArgs build() {
            return new ConnectionMonitorSourceArgs(port, resourceId);
        }
    }
}
