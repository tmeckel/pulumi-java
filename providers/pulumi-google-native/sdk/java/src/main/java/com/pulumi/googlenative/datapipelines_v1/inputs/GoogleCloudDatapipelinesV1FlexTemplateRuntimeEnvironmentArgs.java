// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datapipelines_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal;
import com.pulumi.googlenative.datapipelines_v1.enums.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The environment values to be set at runtime for a Flex Template.
 * 
 */
public final class GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs Empty = new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs();

    /**
     * Additional experiment flags for the job.
     * 
     */
    @Import(name="additionalExperiments")
    private @Nullable Output<List<String>> additionalExperiments;

    /**
     * @return Additional experiment flags for the job.
     * 
     */
    public Optional<Output<List<String>>> additionalExperiments() {
        return Optional.ofNullable(this.additionalExperiments);
    }

    /**
     * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    @Import(name="additionalUserLabels")
    private @Nullable Output<Map<String,String>> additionalUserLabels;

    /**
     * @return Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalUserLabels() {
        return Optional.ofNullable(this.additionalUserLabels);
    }

    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    @Import(name="enableStreamingEngine")
    private @Nullable Output<Boolean> enableStreamingEngine;

    /**
     * @return Whether to enable Streaming Engine for the job.
     * 
     */
    public Optional<Output<Boolean>> enableStreamingEngine() {
        return Optional.ofNullable(this.enableStreamingEngine);
    }

    /**
     * Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    @Import(name="flexrsGoal")
    private @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal;

    /**
     * @return Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    public Optional<Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal>> flexrsGoal() {
        return Optional.ofNullable(this.flexrsGoal);
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration;

    /**
     * @return Configuration for VM IPs.
     * 
     */
    public Optional<Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    @Import(name="maxWorkers")
    private @Nullable Output<Integer> maxWorkers;

    /**
     * @return The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    public Optional<Output<Integer>> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The initial number of Compute Engine instances for the job.
     * 
     */
    @Import(name="numWorkers")
    private @Nullable Output<Integer> numWorkers;

    /**
     * @return The initial number of Compute Engine instances for the job.
     * 
     */
    public Optional<Output<Integer>> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }

    /**
     * The email address of the service account to run the job as.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return The email address of the service account to run the job as.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    @Import(name="tempLocation")
    private @Nullable Output<String> tempLocation;

    /**
     * @return The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    public Optional<Output<String>> tempLocation() {
        return Optional.ofNullable(this.tempLocation);
    }

    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
     * 
     */
    @Import(name="workerRegion")
    private @Nullable Output<String> workerRegion;

    /**
     * @return The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
     * 
     */
    public Optional<Output<String>> workerRegion() {
        return Optional.ofNullable(this.workerRegion);
    }

    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    @Import(name="workerZone")
    private @Nullable Output<String> workerZone;

    /**
     * @return The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    public Optional<Output<String>> workerZone() {
        return Optional.ofNullable(this.workerZone);
    }

    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs() {}

    private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs $) {
        this.additionalExperiments = $.additionalExperiments;
        this.additionalUserLabels = $.additionalUserLabels;
        this.enableStreamingEngine = $.enableStreamingEngine;
        this.flexrsGoal = $.flexrsGoal;
        this.ipConfiguration = $.ipConfiguration;
        this.kmsKeyName = $.kmsKeyName;
        this.machineType = $.machineType;
        this.maxWorkers = $.maxWorkers;
        this.network = $.network;
        this.numWorkers = $.numWorkers;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.subnetwork = $.subnetwork;
        this.tempLocation = $.tempLocation;
        this.workerRegion = $.workerRegion;
        this.workerZone = $.workerZone;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs $;

        public Builder() {
            $ = new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs();
        }

        public Builder(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs defaults) {
            $ = new GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExperiments Additional experiment flags for the job.
         * 
         * @return builder
         * 
         */
        public Builder additionalExperiments(@Nullable Output<List<String>> additionalExperiments) {
            $.additionalExperiments = additionalExperiments;
            return this;
        }

        /**
         * @param additionalExperiments Additional experiment flags for the job.
         * 
         * @return builder
         * 
         */
        public Builder additionalExperiments(List<String> additionalExperiments) {
            return additionalExperiments(Output.of(additionalExperiments));
        }

        /**
         * @param additionalExperiments Additional experiment flags for the job.
         * 
         * @return builder
         * 
         */
        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }

        /**
         * @param additionalUserLabels Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder additionalUserLabels(@Nullable Output<Map<String,String>> additionalUserLabels) {
            $.additionalUserLabels = additionalUserLabels;
            return this;
        }

        /**
         * @param additionalUserLabels Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions). An object containing a list of key/value pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder additionalUserLabels(Map<String,String> additionalUserLabels) {
            return additionalUserLabels(Output.of(additionalUserLabels));
        }

        /**
         * @param enableStreamingEngine Whether to enable Streaming Engine for the job.
         * 
         * @return builder
         * 
         */
        public Builder enableStreamingEngine(@Nullable Output<Boolean> enableStreamingEngine) {
            $.enableStreamingEngine = enableStreamingEngine;
            return this;
        }

        /**
         * @param enableStreamingEngine Whether to enable Streaming Engine for the job.
         * 
         * @return builder
         * 
         */
        public Builder enableStreamingEngine(Boolean enableStreamingEngine) {
            return enableStreamingEngine(Output.of(enableStreamingEngine));
        }

        /**
         * @param flexrsGoal Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
         * 
         * @return builder
         * 
         */
        public Builder flexrsGoal(@Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal> flexrsGoal) {
            $.flexrsGoal = flexrsGoal;
            return this;
        }

        /**
         * @param flexrsGoal Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
         * 
         * @return builder
         * 
         */
        public Builder flexrsGoal(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal flexrsGoal) {
            return flexrsGoal(Output.of(flexrsGoal));
        }

        /**
         * @param ipConfiguration Configuration for VM IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(@Nullable Output<GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        /**
         * @param ipConfiguration Configuration for VM IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentIpConfiguration ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        /**
         * @param kmsKeyName Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param machineType The machine type to use for the job. Defaults to the value from the template if not specified.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The machine type to use for the job. Defaults to the value from the template if not specified.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param maxWorkers The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        /**
         * @param maxWorkers The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkers(Integer maxWorkers) {
            return maxWorkers(Output.of(maxWorkers));
        }

        /**
         * @param network Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param numWorkers The initial number of Compute Engine instances for the job.
         * 
         * @return builder
         * 
         */
        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        /**
         * @param numWorkers The initial number of Compute Engine instances for the job.
         * 
         * @return builder
         * 
         */
        public Builder numWorkers(Integer numWorkers) {
            return numWorkers(Output.of(numWorkers));
        }

        /**
         * @param serviceAccountEmail The email address of the service account to run the job as.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail The email address of the service account to run the job as.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param subnetwork Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param tempLocation The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
         * 
         * @return builder
         * 
         */
        public Builder tempLocation(@Nullable Output<String> tempLocation) {
            $.tempLocation = tempLocation;
            return this;
        }

        /**
         * @param tempLocation The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
         * 
         * @return builder
         * 
         */
        public Builder tempLocation(String tempLocation) {
            return tempLocation(Output.of(tempLocation));
        }

        /**
         * @param workerRegion The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
         * 
         * @return builder
         * 
         */
        public Builder workerRegion(@Nullable Output<String> workerRegion) {
            $.workerRegion = workerRegion;
            return this;
        }

        /**
         * @param workerRegion The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, defaults to the control plane region.
         * 
         * @return builder
         * 
         */
        public Builder workerRegion(String workerRegion) {
            return workerRegion(Output.of(workerRegion));
        }

        /**
         * @param workerZone The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder workerZone(@Nullable Output<String> workerZone) {
            $.workerZone = workerZone;
            return this;
        }

        /**
         * @param workerZone The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder workerZone(String workerZone) {
            return workerZone(Output.of(workerZone));
        }

        /**
         * @param zone The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentArgs build() {
            return $;
        }
    }

}
