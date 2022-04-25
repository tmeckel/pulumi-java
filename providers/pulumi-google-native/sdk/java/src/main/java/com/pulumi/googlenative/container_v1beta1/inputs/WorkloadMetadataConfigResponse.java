// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * WorkloadMetadataConfig defines the metadata configuration to expose to workloads on the node pool.
 * 
 */
public final class WorkloadMetadataConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkloadMetadataConfigResponse Empty = new WorkloadMetadataConfigResponse();

    /**
     * Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    /**
     * @return Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
     */
    public String mode() {
        return this.mode;
    }

    /**
     * NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
     */
    @Import(name="nodeMetadata", required=true)
    private String nodeMetadata;

    /**
     * @return NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
     */
    public String nodeMetadata() {
        return this.nodeMetadata;
    }

    private WorkloadMetadataConfigResponse() {}

    private WorkloadMetadataConfigResponse(WorkloadMetadataConfigResponse $) {
        this.mode = $.mode;
        this.nodeMetadata = $.nodeMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadMetadataConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadMetadataConfigResponse $;

        public Builder() {
            $ = new WorkloadMetadataConfigResponse();
        }

        public Builder(WorkloadMetadataConfigResponse defaults) {
            $ = new WorkloadMetadataConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Mode is the configuration for how to expose metadata to workloads running on the node pool.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param nodeMetadata NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
         * 
         * @return builder
         * 
         */
        public Builder nodeMetadata(String nodeMetadata) {
            $.nodeMetadata = nodeMetadata;
            return this;
        }

        public WorkloadMetadataConfigResponse build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.nodeMetadata = Objects.requireNonNull($.nodeMetadata, "expected parameter 'nodeMetadata' to be non-null");
            return $;
        }
    }

}
