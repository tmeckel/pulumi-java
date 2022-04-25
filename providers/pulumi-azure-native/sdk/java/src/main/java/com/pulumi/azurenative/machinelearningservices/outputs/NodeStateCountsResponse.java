// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NodeStateCountsResponse {
    /**
     * @return Number of compute nodes in idle state.
     * 
     */
    private final Integer idleNodeCount;
    /**
     * @return Number of compute nodes which are leaving the amlCompute.
     * 
     */
    private final Integer leavingNodeCount;
    /**
     * @return Number of compute nodes which are in preempted state.
     * 
     */
    private final Integer preemptedNodeCount;
    /**
     * @return Number of compute nodes which are being prepared.
     * 
     */
    private final Integer preparingNodeCount;
    /**
     * @return Number of compute nodes which are running jobs.
     * 
     */
    private final Integer runningNodeCount;
    /**
     * @return Number of compute nodes which are in unusable state.
     * 
     */
    private final Integer unusableNodeCount;

    @CustomType.Constructor
    private NodeStateCountsResponse(
        @CustomType.Parameter("idleNodeCount") Integer idleNodeCount,
        @CustomType.Parameter("leavingNodeCount") Integer leavingNodeCount,
        @CustomType.Parameter("preemptedNodeCount") Integer preemptedNodeCount,
        @CustomType.Parameter("preparingNodeCount") Integer preparingNodeCount,
        @CustomType.Parameter("runningNodeCount") Integer runningNodeCount,
        @CustomType.Parameter("unusableNodeCount") Integer unusableNodeCount) {
        this.idleNodeCount = idleNodeCount;
        this.leavingNodeCount = leavingNodeCount;
        this.preemptedNodeCount = preemptedNodeCount;
        this.preparingNodeCount = preparingNodeCount;
        this.runningNodeCount = runningNodeCount;
        this.unusableNodeCount = unusableNodeCount;
    }

    /**
     * @return Number of compute nodes in idle state.
     * 
     */
    public Integer idleNodeCount() {
        return this.idleNodeCount;
    }
    /**
     * @return Number of compute nodes which are leaving the amlCompute.
     * 
     */
    public Integer leavingNodeCount() {
        return this.leavingNodeCount;
    }
    /**
     * @return Number of compute nodes which are in preempted state.
     * 
     */
    public Integer preemptedNodeCount() {
        return this.preemptedNodeCount;
    }
    /**
     * @return Number of compute nodes which are being prepared.
     * 
     */
    public Integer preparingNodeCount() {
        return this.preparingNodeCount;
    }
    /**
     * @return Number of compute nodes which are running jobs.
     * 
     */
    public Integer runningNodeCount() {
        return this.runningNodeCount;
    }
    /**
     * @return Number of compute nodes which are in unusable state.
     * 
     */
    public Integer unusableNodeCount() {
        return this.unusableNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeStateCountsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer idleNodeCount;
        private Integer leavingNodeCount;
        private Integer preemptedNodeCount;
        private Integer preparingNodeCount;
        private Integer runningNodeCount;
        private Integer unusableNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeStateCountsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleNodeCount = defaults.idleNodeCount;
    	      this.leavingNodeCount = defaults.leavingNodeCount;
    	      this.preemptedNodeCount = defaults.preemptedNodeCount;
    	      this.preparingNodeCount = defaults.preparingNodeCount;
    	      this.runningNodeCount = defaults.runningNodeCount;
    	      this.unusableNodeCount = defaults.unusableNodeCount;
        }

        public Builder idleNodeCount(Integer idleNodeCount) {
            this.idleNodeCount = Objects.requireNonNull(idleNodeCount);
            return this;
        }
        public Builder leavingNodeCount(Integer leavingNodeCount) {
            this.leavingNodeCount = Objects.requireNonNull(leavingNodeCount);
            return this;
        }
        public Builder preemptedNodeCount(Integer preemptedNodeCount) {
            this.preemptedNodeCount = Objects.requireNonNull(preemptedNodeCount);
            return this;
        }
        public Builder preparingNodeCount(Integer preparingNodeCount) {
            this.preparingNodeCount = Objects.requireNonNull(preparingNodeCount);
            return this;
        }
        public Builder runningNodeCount(Integer runningNodeCount) {
            this.runningNodeCount = Objects.requireNonNull(runningNodeCount);
            return this;
        }
        public Builder unusableNodeCount(Integer unusableNodeCount) {
            this.unusableNodeCount = Objects.requireNonNull(unusableNodeCount);
            return this;
        }        public NodeStateCountsResponse build() {
            return new NodeStateCountsResponse(idleNodeCount, leavingNodeCount, preemptedNodeCount, preparingNodeCount, runningNodeCount, unusableNodeCount);
        }
    }
}
