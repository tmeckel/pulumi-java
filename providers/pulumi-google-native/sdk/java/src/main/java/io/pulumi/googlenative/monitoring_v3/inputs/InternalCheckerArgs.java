// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v3.enums.InternalCheckerState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An internal checker allows Uptime checks to run on private/internal GCP resources.
 * 
 */
public final class InternalCheckerArgs extends io.pulumi.resources.ResourceArgs {

    public static final InternalCheckerArgs Empty = new InternalCheckerArgs();

    /**
     * The checker's human-readable name. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
     * 
     */
    @Import(name="gcpZone")
      private final @Nullable Output<String> gcpZone;

    public Output<String> getGcpZone() {
        return this.gcpZone == null ? Codegen.empty() : this.gcpZone;
    }

    /**
     * A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Stackdriver Workspace project for the Uptime check config associated with the internal checker.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: "default").
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The GCP project ID where the internal checker lives. Not necessary the same as the Workspace project.
     * 
     */
    @Import(name="peerProjectId")
      private final @Nullable Output<String> peerProjectId;

    public Output<String> getPeerProjectId() {
        return this.peerProjectId == null ? Codegen.empty() : this.peerProjectId;
    }

    /**
     * The current operational state of the internal checker.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<InternalCheckerState> state;

    public Output<InternalCheckerState> getState() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public InternalCheckerArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> gcpZone,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> peerProjectId,
        @Nullable Output<InternalCheckerState> state) {
        this.displayName = displayName;
        this.gcpZone = gcpZone;
        this.name = name;
        this.network = network;
        this.peerProjectId = peerProjectId;
        this.state = state;
    }

    private InternalCheckerArgs() {
        this.displayName = Codegen.empty();
        this.gcpZone = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.peerProjectId = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InternalCheckerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> gcpZone;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> peerProjectId;
        private @Nullable Output<InternalCheckerState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(InternalCheckerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.gcpZone = defaults.gcpZone;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerProjectId = defaults.peerProjectId;
    	      this.state = defaults.state;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder gcpZone(@Nullable Output<String> gcpZone) {
            this.gcpZone = gcpZone;
            return this;
        }
        public Builder gcpZone(@Nullable String gcpZone) {
            this.gcpZone = Codegen.ofNullable(gcpZone);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder peerProjectId(@Nullable Output<String> peerProjectId) {
            this.peerProjectId = peerProjectId;
            return this;
        }
        public Builder peerProjectId(@Nullable String peerProjectId) {
            this.peerProjectId = Codegen.ofNullable(peerProjectId);
            return this;
        }
        public Builder state(@Nullable Output<InternalCheckerState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable InternalCheckerState state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public InternalCheckerArgs build() {
            return new InternalCheckerArgs(displayName, gcpZone, name, network, peerProjectId, state);
        }
    }
}
