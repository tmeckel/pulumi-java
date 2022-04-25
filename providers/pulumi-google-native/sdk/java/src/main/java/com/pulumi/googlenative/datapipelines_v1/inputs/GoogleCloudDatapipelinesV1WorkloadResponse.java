// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datapipelines_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse;
import com.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse;
import java.util.Objects;


/**
 * Workload details for creating the pipeline jobs.
 * 
 */
public final class GoogleCloudDatapipelinesV1WorkloadResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatapipelinesV1WorkloadResponse Empty = new GoogleCloudDatapipelinesV1WorkloadResponse();

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * 
     */
    @Import(name="dataflowFlexTemplateRequest", required=true)
    private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest;

    /**
     * @return Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * 
     */
    public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest() {
        return this.dataflowFlexTemplateRequest;
    }

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * 
     */
    @Import(name="dataflowLaunchTemplateRequest", required=true)
    private GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest;

    /**
     * @return Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * 
     */
    public GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest() {
        return this.dataflowLaunchTemplateRequest;
    }

    private GoogleCloudDatapipelinesV1WorkloadResponse() {}

    private GoogleCloudDatapipelinesV1WorkloadResponse(GoogleCloudDatapipelinesV1WorkloadResponse $) {
        this.dataflowFlexTemplateRequest = $.dataflowFlexTemplateRequest;
        this.dataflowLaunchTemplateRequest = $.dataflowLaunchTemplateRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatapipelinesV1WorkloadResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatapipelinesV1WorkloadResponse $;

        public Builder() {
            $ = new GoogleCloudDatapipelinesV1WorkloadResponse();
        }

        public Builder(GoogleCloudDatapipelinesV1WorkloadResponse defaults) {
            $ = new GoogleCloudDatapipelinesV1WorkloadResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataflowFlexTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
         * 
         * @return builder
         * 
         */
        public Builder dataflowFlexTemplateRequest(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse dataflowFlexTemplateRequest) {
            $.dataflowFlexTemplateRequest = dataflowFlexTemplateRequest;
            return this;
        }

        /**
         * @param dataflowLaunchTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
         * 
         * @return builder
         * 
         */
        public Builder dataflowLaunchTemplateRequest(GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse dataflowLaunchTemplateRequest) {
            $.dataflowLaunchTemplateRequest = dataflowLaunchTemplateRequest;
            return this;
        }

        public GoogleCloudDatapipelinesV1WorkloadResponse build() {
            $.dataflowFlexTemplateRequest = Objects.requireNonNull($.dataflowFlexTemplateRequest, "expected parameter 'dataflowFlexTemplateRequest' to be non-null");
            $.dataflowLaunchTemplateRequest = Objects.requireNonNull($.dataflowLaunchTemplateRequest, "expected parameter 'dataflowLaunchTemplateRequest' to be non-null");
            return $;
        }
    }

}
