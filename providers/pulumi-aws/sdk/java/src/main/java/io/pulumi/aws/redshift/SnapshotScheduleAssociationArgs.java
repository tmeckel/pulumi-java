// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class SnapshotScheduleAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotScheduleAssociationArgs Empty = new SnapshotScheduleAssociationArgs();

    /**
     * The cluster identifier.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
      private final Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The snapshot schedule identifier.
     * 
     */
    @Import(name="scheduleIdentifier", required=true)
      private final Output<String> scheduleIdentifier;

    public Output<String> getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    public SnapshotScheduleAssociationArgs(
        Output<String> clusterIdentifier,
        Output<String> scheduleIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.scheduleIdentifier = Objects.requireNonNull(scheduleIdentifier, "expected parameter 'scheduleIdentifier' to be non-null");
    }

    private SnapshotScheduleAssociationArgs() {
        this.clusterIdentifier = Codegen.empty();
        this.scheduleIdentifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotScheduleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterIdentifier;
        private Output<String> scheduleIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotScheduleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.scheduleIdentifier = defaults.scheduleIdentifier;
        }

        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Output.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }
        public Builder scheduleIdentifier(Output<String> scheduleIdentifier) {
            this.scheduleIdentifier = Objects.requireNonNull(scheduleIdentifier);
            return this;
        }
        public Builder scheduleIdentifier(String scheduleIdentifier) {
            this.scheduleIdentifier = Output.of(Objects.requireNonNull(scheduleIdentifier));
            return this;
        }        public SnapshotScheduleAssociationArgs build() {
            return new SnapshotScheduleAssociationArgs(clusterIdentifier, scheduleIdentifier);
        }
    }
}
