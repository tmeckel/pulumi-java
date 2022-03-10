// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduledActionTargetActionResumeCluster {
    /**
     * The identifier of the cluster to be resumed.
     * 
     */
    private final String clusterIdentifier;

    @OutputCustomType.Constructor
    private ScheduledActionTargetActionResumeCluster(@OutputCustomType.Parameter("clusterIdentifier") String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * The identifier of the cluster to be resumed.
     * 
    */
    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionResumeCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionTargetActionResumeCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public ScheduledActionTargetActionResumeCluster build() {
            return new ScheduledActionTargetActionResumeCluster(clusterIdentifier);
        }
    }
}
