// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @Import(name="accelerators")
      private final @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs>> accelerators;

    public Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs>> getAccelerators() {
        return this.accelerators == null ? Codegen.empty() : this.accelerators;
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig")
      private final @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs> diskConfig;

    public Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs> getDiskConfig() {
        return this.diskConfig == null ? Codegen.empty() : this.diskConfig;
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * - 
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
     */
    @Import(name="instanceNames")
      private final @Nullable Output<List<String>> instanceNames;

    public Output<List<String>> getInstanceNames() {
        return this.instanceNames == null ? Codegen.empty() : this.instanceNames;
    }

    /**
     * - 
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
     */
    @Import(name="isPreemptible")
      private final @Nullable Output<Boolean> isPreemptible;

    public Output<Boolean> getIsPreemptible() {
        return this.isPreemptible == null ? Codegen.empty() : this.isPreemptible;
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Codegen.empty() : this.machineType;
    }

    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    @Import(name="managedGroupConfigs")
      private final @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs>> managedGroupConfigs;

    public Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs>> getManagedGroupConfigs() {
        return this.managedGroupConfigs == null ? Codegen.empty() : this.managedGroupConfigs;
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    @Import(name="numInstances")
      private final @Nullable Output<Integer> numInstances;

    public Output<Integer> getNumInstances() {
        return this.numInstances == null ? Codegen.empty() : this.numInstances;
    }

    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    @Import(name="preemptibility")
      private final @Nullable Output<String> preemptibility;

    public Output<String> getPreemptibility() {
        return this.preemptibility == null ? Codegen.empty() : this.preemptibility;
    }

    public WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs(
        @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs>> accelerators,
        @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs> diskConfig,
        @Nullable Output<String> image,
        @Nullable Output<List<String>> instanceNames,
        @Nullable Output<Boolean> isPreemptible,
        @Nullable Output<String> machineType,
        @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs>> managedGroupConfigs,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<Integer> numInstances,
        @Nullable Output<String> preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.image = image;
        this.instanceNames = instanceNames;
        this.isPreemptible = isPreemptible;
        this.machineType = machineType;
        this.managedGroupConfigs = managedGroupConfigs;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    private WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs() {
        this.accelerators = Codegen.empty();
        this.diskConfig = Codegen.empty();
        this.image = Codegen.empty();
        this.instanceNames = Codegen.empty();
        this.isPreemptible = Codegen.empty();
        this.machineType = Codegen.empty();
        this.managedGroupConfigs = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
        this.numInstances = Codegen.empty();
        this.preemptibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs>> accelerators;
        private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs> diskConfig;
        private @Nullable Output<String> image;
        private @Nullable Output<List<String>> instanceNames;
        private @Nullable Output<Boolean> isPreemptible;
        private @Nullable Output<String> machineType;
        private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs>> managedGroupConfigs;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<Integer> numInstances;
        private @Nullable Output<String> preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.image = defaults.image;
    	      this.instanceNames = defaults.instanceNames;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineType = defaults.machineType;
    	      this.managedGroupConfigs = defaults.managedGroupConfigs;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder accelerators(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public Builder accelerators(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs> accelerators) {
            this.accelerators = Codegen.ofNullable(accelerators);
            return this;
        }
        public Builder accelerators(WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorGetArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder diskConfig(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder diskConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigGetArgs diskConfig) {
            this.diskConfig = Codegen.ofNullable(diskConfig);
            return this;
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder instanceNames(@Nullable Output<List<String>> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }
        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = Codegen.ofNullable(instanceNames);
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder isPreemptible(@Nullable Output<Boolean> isPreemptible) {
            this.isPreemptible = isPreemptible;
            return this;
        }
        public Builder isPreemptible(@Nullable Boolean isPreemptible) {
            this.isPreemptible = Codegen.ofNullable(isPreemptible);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Codegen.ofNullable(machineType);
            return this;
        }
        public Builder managedGroupConfigs(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs>> managedGroupConfigs) {
            this.managedGroupConfigs = managedGroupConfigs;
            return this;
        }
        public Builder managedGroupConfigs(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs> managedGroupConfigs) {
            this.managedGroupConfigs = Codegen.ofNullable(managedGroupConfigs);
            return this;
        }
        public Builder managedGroupConfigs(WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigGetArgs... managedGroupConfigs) {
            return managedGroupConfigs(List.of(managedGroupConfigs));
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Codegen.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            this.numInstances = numInstances;
            return this;
        }
        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = Codegen.ofNullable(numInstances);
            return this;
        }
        public Builder preemptibility(@Nullable Output<String> preemptibility) {
            this.preemptibility = preemptibility;
            return this;
        }
        public Builder preemptibility(@Nullable String preemptibility) {
            this.preemptibility = Codegen.ofNullable(preemptibility);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs(accelerators, diskConfig, image, instanceNames, isPreemptible, machineType, managedGroupConfigs, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
