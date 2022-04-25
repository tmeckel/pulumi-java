// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduledActionTargetActionPauseCluster {
    /**
     * @return The identifier of the cluster to be resumed.
     * 
     */
    private final String clusterIdentifier;

    @CustomType.Constructor
    private ScheduledActionTargetActionPauseCluster(@CustomType.Parameter("clusterIdentifier") String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * @return The identifier of the cluster to be resumed.
     * 
     */
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionPauseCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionTargetActionPauseCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }        public ScheduledActionTargetActionPauseCluster build() {
            return new ScheduledActionTargetActionPauseCluster(clusterIdentifier);
        }
    }
}
