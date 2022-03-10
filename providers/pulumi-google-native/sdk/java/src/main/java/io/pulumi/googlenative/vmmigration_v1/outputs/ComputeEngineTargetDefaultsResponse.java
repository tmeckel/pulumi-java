// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vmmigration_v1.outputs.AppliedLicenseResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.ComputeSchedulingResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.NetworkInterfaceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ComputeEngineTargetDefaultsResponse {
    /**
     * Additional licenses to assign to the VM.
     * 
     */
    private final List<String> additionalLicenses;
    /**
     * The OS license returned from the adaptation module report.
     * 
     */
    private final AppliedLicenseResponse appliedLicense;
    /**
     * The VM Boot Option, as set in the source vm.
     * 
     */
    private final String bootOption;
    /**
     * Compute instance scheduling information (if empty default is used).
     * 
     */
    private final ComputeSchedulingResponse computeScheduling;
    /**
     * The disk type to use in the VM.
     * 
     */
    private final String diskType;
    /**
     * A map of labels to associate with the VM.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The license type to use in OS adaptation.
     * 
     */
    private final String licenseType;
    /**
     * The machine type to create the VM with.
     * 
     */
    private final String machineType;
    /**
     * The machine type series to create the VM with.
     * 
     */
    private final String machineTypeSeries;
    /**
     * The metadata key/value pairs to assign to the VM.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * List of NICs connected to this VM.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * A map of network tags to associate with the VM.
     * 
     */
    private final List<String> networkTags;
    /**
     * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    private final Boolean secureBoot;
    /**
     * The service account to associate the VM with.
     * 
     */
    private final String serviceAccount;
    /**
     * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
     */
    private final String targetProject;
    /**
     * The name of the VM to create.
     * 
     */
    private final String vmName;
    /**
     * The zone in which to create the VM.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor
    private ComputeEngineTargetDefaultsResponse(
        @OutputCustomType.Parameter("additionalLicenses") List<String> additionalLicenses,
        @OutputCustomType.Parameter("appliedLicense") AppliedLicenseResponse appliedLicense,
        @OutputCustomType.Parameter("bootOption") String bootOption,
        @OutputCustomType.Parameter("computeScheduling") ComputeSchedulingResponse computeScheduling,
        @OutputCustomType.Parameter("diskType") String diskType,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("licenseType") String licenseType,
        @OutputCustomType.Parameter("machineType") String machineType,
        @OutputCustomType.Parameter("machineTypeSeries") String machineTypeSeries,
        @OutputCustomType.Parameter("metadata") Map<String,String> metadata,
        @OutputCustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @OutputCustomType.Parameter("networkTags") List<String> networkTags,
        @OutputCustomType.Parameter("secureBoot") Boolean secureBoot,
        @OutputCustomType.Parameter("serviceAccount") String serviceAccount,
        @OutputCustomType.Parameter("targetProject") String targetProject,
        @OutputCustomType.Parameter("vmName") String vmName,
        @OutputCustomType.Parameter("zone") String zone) {
        this.additionalLicenses = additionalLicenses;
        this.appliedLicense = appliedLicense;
        this.bootOption = bootOption;
        this.computeScheduling = computeScheduling;
        this.diskType = diskType;
        this.labels = labels;
        this.licenseType = licenseType;
        this.machineType = machineType;
        this.machineTypeSeries = machineTypeSeries;
        this.metadata = metadata;
        this.networkInterfaces = networkInterfaces;
        this.networkTags = networkTags;
        this.secureBoot = secureBoot;
        this.serviceAccount = serviceAccount;
        this.targetProject = targetProject;
        this.vmName = vmName;
        this.zone = zone;
    }

    /**
     * Additional licenses to assign to the VM.
     * 
    */
    public List<String> getAdditionalLicenses() {
        return this.additionalLicenses;
    }
    /**
     * The OS license returned from the adaptation module report.
     * 
    */
    public AppliedLicenseResponse getAppliedLicense() {
        return this.appliedLicense;
    }
    /**
     * The VM Boot Option, as set in the source vm.
     * 
    */
    public String getBootOption() {
        return this.bootOption;
    }
    /**
     * Compute instance scheduling information (if empty default is used).
     * 
    */
    public ComputeSchedulingResponse getComputeScheduling() {
        return this.computeScheduling;
    }
    /**
     * The disk type to use in the VM.
     * 
    */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * A map of labels to associate with the VM.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The license type to use in OS adaptation.
     * 
    */
    public String getLicenseType() {
        return this.licenseType;
    }
    /**
     * The machine type to create the VM with.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The machine type series to create the VM with.
     * 
    */
    public String getMachineTypeSeries() {
        return this.machineTypeSeries;
    }
    /**
     * The metadata key/value pairs to assign to the VM.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * List of NICs connected to this VM.
     * 
    */
    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * A map of network tags to associate with the VM.
     * 
    */
    public List<String> getNetworkTags() {
        return this.networkTags;
    }
    /**
     * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
    */
    public Boolean getSecureBoot() {
        return this.secureBoot;
    }
    /**
     * The service account to associate the VM with.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
    */
    public String getTargetProject() {
        return this.targetProject;
    }
    /**
     * The name of the VM to create.
     * 
    */
    public String getVmName() {
        return this.vmName;
    }
    /**
     * The zone in which to create the VM.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEngineTargetDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalLicenses;
        private AppliedLicenseResponse appliedLicense;
        private String bootOption;
        private ComputeSchedulingResponse computeScheduling;
        private String diskType;
        private Map<String,String> labels;
        private String licenseType;
        private String machineType;
        private String machineTypeSeries;
        private Map<String,String> metadata;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private List<String> networkTags;
        private Boolean secureBoot;
        private String serviceAccount;
        private String targetProject;
        private String vmName;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEngineTargetDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLicenses = defaults.additionalLicenses;
    	      this.appliedLicense = defaults.appliedLicense;
    	      this.bootOption = defaults.bootOption;
    	      this.computeScheduling = defaults.computeScheduling;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.licenseType = defaults.licenseType;
    	      this.machineType = defaults.machineType;
    	      this.machineTypeSeries = defaults.machineTypeSeries;
    	      this.metadata = defaults.metadata;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkTags = defaults.networkTags;
    	      this.secureBoot = defaults.secureBoot;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.targetProject = defaults.targetProject;
    	      this.vmName = defaults.vmName;
    	      this.zone = defaults.zone;
        }

        public Builder additionalLicenses(List<String> additionalLicenses) {
            this.additionalLicenses = Objects.requireNonNull(additionalLicenses);
            return this;
        }

        public Builder appliedLicense(AppliedLicenseResponse appliedLicense) {
            this.appliedLicense = Objects.requireNonNull(appliedLicense);
            return this;
        }

        public Builder bootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }

        public Builder computeScheduling(ComputeSchedulingResponse computeScheduling) {
            this.computeScheduling = Objects.requireNonNull(computeScheduling);
            return this;
        }

        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder machineTypeSeries(String machineTypeSeries) {
            this.machineTypeSeries = Objects.requireNonNull(machineTypeSeries);
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder networkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }

        public Builder secureBoot(Boolean secureBoot) {
            this.secureBoot = Objects.requireNonNull(secureBoot);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder targetProject(String targetProject) {
            this.targetProject = Objects.requireNonNull(targetProject);
            return this;
        }

        public Builder vmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public ComputeEngineTargetDefaultsResponse build() {
            return new ComputeEngineTargetDefaultsResponse(additionalLicenses, appliedLicense, bootOption, computeScheduling, diskType, labels, licenseType, machineType, machineTypeSeries, metadata, networkInterfaces, networkTags, secureBoot, serviceAccount, targetProject, vmName, zone);
        }
    }
}
