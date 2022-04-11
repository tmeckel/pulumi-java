// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ApplicationHealthPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a health policy used to evaluate the health of the cluster or of a cluster node.
 * 
 */
public final class ClusterHealthPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterHealthPolicyArgs Empty = new ClusterHealthPolicyArgs();

    /**
     * Defines the application health policy map used to evaluate the health of an application or one of its children entities.
     * 
     */
    @Import(name="applicationHealthPolicies")
      private final @Nullable Output<Map<String,ApplicationHealthPolicyArgs>> applicationHealthPolicies;

    public Output<Map<String,ApplicationHealthPolicyArgs>> getApplicationHealthPolicies() {
        return this.applicationHealthPolicies == null ? Codegen.empty() : this.applicationHealthPolicies;
    }

    /**
     * The maximum allowed percentage of unhealthy applications before reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy application, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy applications over the total number of application instances in the cluster, excluding applications of application types that are included in the ApplicationTypeHealthPolicyMap.
     * The computation rounds up to tolerate one failure on small numbers of applications. Default percentage is zero.
     * 
     */
    @Import(name="maxPercentUnhealthyApplications")
      private final @Nullable Output<Integer> maxPercentUnhealthyApplications;

    public Output<Integer> getMaxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications == null ? Codegen.empty() : this.maxPercentUnhealthyApplications;
    }

    /**
     * The maximum allowed percentage of unhealthy nodes before reporting an error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy node, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy nodes over the total number of nodes in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     * In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured to tolerate that.
     * 
     */
    @Import(name="maxPercentUnhealthyNodes")
      private final @Nullable Output<Integer> maxPercentUnhealthyNodes;

    public Output<Integer> getMaxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes == null ? Codegen.empty() : this.maxPercentUnhealthyNodes;
    }

    public ClusterHealthPolicyArgs(
        @Nullable Output<Map<String,ApplicationHealthPolicyArgs>> applicationHealthPolicies,
        @Nullable Output<Integer> maxPercentUnhealthyApplications,
        @Nullable Output<Integer> maxPercentUnhealthyNodes) {
        this.applicationHealthPolicies = applicationHealthPolicies;
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications == null ? Codegen.ofNullable(0) : maxPercentUnhealthyApplications;
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes == null ? Codegen.ofNullable(0) : maxPercentUnhealthyNodes;
    }

    private ClusterHealthPolicyArgs() {
        this.applicationHealthPolicies = Codegen.empty();
        this.maxPercentUnhealthyApplications = Codegen.empty();
        this.maxPercentUnhealthyNodes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,ApplicationHealthPolicyArgs>> applicationHealthPolicies;
        private @Nullable Output<Integer> maxPercentUnhealthyApplications;
        private @Nullable Output<Integer> maxPercentUnhealthyNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHealthPolicies = defaults.applicationHealthPolicies;
    	      this.maxPercentUnhealthyApplications = defaults.maxPercentUnhealthyApplications;
    	      this.maxPercentUnhealthyNodes = defaults.maxPercentUnhealthyNodes;
        }

        public Builder applicationHealthPolicies(@Nullable Output<Map<String,ApplicationHealthPolicyArgs>> applicationHealthPolicies) {
            this.applicationHealthPolicies = applicationHealthPolicies;
            return this;
        }
        public Builder applicationHealthPolicies(@Nullable Map<String,ApplicationHealthPolicyArgs> applicationHealthPolicies) {
            this.applicationHealthPolicies = Codegen.ofNullable(applicationHealthPolicies);
            return this;
        }
        public Builder maxPercentUnhealthyApplications(@Nullable Output<Integer> maxPercentUnhealthyApplications) {
            this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
            return this;
        }
        public Builder maxPercentUnhealthyApplications(@Nullable Integer maxPercentUnhealthyApplications) {
            this.maxPercentUnhealthyApplications = Codegen.ofNullable(maxPercentUnhealthyApplications);
            return this;
        }
        public Builder maxPercentUnhealthyNodes(@Nullable Output<Integer> maxPercentUnhealthyNodes) {
            this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
            return this;
        }
        public Builder maxPercentUnhealthyNodes(@Nullable Integer maxPercentUnhealthyNodes) {
            this.maxPercentUnhealthyNodes = Codegen.ofNullable(maxPercentUnhealthyNodes);
            return this;
        }        public ClusterHealthPolicyArgs build() {
            return new ClusterHealthPolicyArgs(applicationHealthPolicies, maxPercentUnhealthyApplications, maxPercentUnhealthyNodes);
        }
    }
}
