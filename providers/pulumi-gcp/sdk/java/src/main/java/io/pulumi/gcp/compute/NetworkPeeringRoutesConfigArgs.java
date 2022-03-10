// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkPeeringRoutesConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringRoutesConfigArgs Empty = new NetworkPeeringRoutesConfigArgs();

    /**
     * Whether to export the custom routes to the peer network.
     * 
     */
    @InputImport(name="exportCustomRoutes", required=true)
      private final Input<Boolean> exportCustomRoutes;

    public Input<Boolean> getExportCustomRoutes() {
        return this.exportCustomRoutes;
    }

    /**
     * Whether to import the custom routes to the peer network.
     * 
     */
    @InputImport(name="importCustomRoutes", required=true)
      private final Input<Boolean> importCustomRoutes;

    public Input<Boolean> getImportCustomRoutes() {
        return this.importCustomRoutes;
    }

    /**
     * The name of the primary network for the peering.
     * 
     */
    @InputImport(name="network", required=true)
      private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    /**
     * Name of the peering.
     * 
     */
    @InputImport(name="peering", required=true)
      private final Input<String> peering;

    public Input<String> getPeering() {
        return this.peering;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public NetworkPeeringRoutesConfigArgs(
        Input<Boolean> exportCustomRoutes,
        Input<Boolean> importCustomRoutes,
        Input<String> network,
        Input<String> peering,
        @Nullable Input<String> project) {
        this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes, "expected parameter 'exportCustomRoutes' to be non-null");
        this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes, "expected parameter 'importCustomRoutes' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.peering = Objects.requireNonNull(peering, "expected parameter 'peering' to be non-null");
        this.project = project;
    }

    private NetworkPeeringRoutesConfigArgs() {
        this.exportCustomRoutes = Input.empty();
        this.importCustomRoutes = Input.empty();
        this.network = Input.empty();
        this.peering = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPeeringRoutesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> exportCustomRoutes;
        private Input<Boolean> importCustomRoutes;
        private Input<String> network;
        private Input<String> peering;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPeeringRoutesConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.network = defaults.network;
    	      this.peering = defaults.peering;
    	      this.project = defaults.project;
        }

        public Builder exportCustomRoutes(Input<Boolean> exportCustomRoutes) {
            this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes);
            return this;
        }

        public Builder exportCustomRoutes(Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Input.of(Objects.requireNonNull(exportCustomRoutes));
            return this;
        }

        public Builder importCustomRoutes(Input<Boolean> importCustomRoutes) {
            this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes);
            return this;
        }

        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            this.importCustomRoutes = Input.of(Objects.requireNonNull(importCustomRoutes));
            return this;
        }

        public Builder network(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder network(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder peering(Input<String> peering) {
            this.peering = Objects.requireNonNull(peering);
            return this;
        }

        public Builder peering(String peering) {
            this.peering = Input.of(Objects.requireNonNull(peering));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public NetworkPeeringRoutesConfigArgs build() {
            return new NetworkPeeringRoutesConfigArgs(exportCustomRoutes, importCustomRoutes, network, peering, project);
        }
    }
}
