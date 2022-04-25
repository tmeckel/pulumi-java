// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.azurenative.servicefabricmesh.outputs.AutoScalingPolicyResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.ContainerCodePackagePropertiesResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsRefResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.NetworkRefResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceResourceDescriptionResponse {
    /**
     * @return Auto scaling policies
     * 
     */
    private final @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;
    /**
     * @return Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    private final List<ContainerCodePackagePropertiesResponse> codePackages;
    /**
     * @return User readable description of the service.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Reference to sinks in DiagnosticsDescription.
     * 
     */
    private final @Nullable DiagnosticsRefResponse diagnostics;
    /**
     * @return Describes the health state of an application resource.
     * 
     */
    private final String healthState;
    /**
     * @return Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final @Nullable String name;
    /**
     * @return The names of the private networks that this service needs to be part of.
     * 
     */
    private final @Nullable List<NetworkRefResponse> networkRefs;
    /**
     * @return The operation system required by the code in service.
     * 
     */
    private final String osType;
    /**
     * @return State of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    private final @Nullable Integer replicaCount;
    /**
     * @return Status of the service.
     * 
     */
    private final String status;
    /**
     * @return Gives additional information about the current status of the service.
     * 
     */
    private final String statusDetails;
    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;
    /**
     * @return When the service&#39;s health state is not &#39;Ok&#39;, this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    private final String unhealthyEvaluation;

    @CustomType.Constructor
    private ServiceResourceDescriptionResponse(
        @CustomType.Parameter("autoScalingPolicies") @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies,
        @CustomType.Parameter("codePackages") List<ContainerCodePackagePropertiesResponse> codePackages,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("diagnostics") @Nullable DiagnosticsRefResponse diagnostics,
        @CustomType.Parameter("healthState") String healthState,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("networkRefs") @Nullable List<NetworkRefResponse> networkRefs,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("replicaCount") @Nullable Integer replicaCount,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusDetails") String statusDetails,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("unhealthyEvaluation") String unhealthyEvaluation) {
        this.autoScalingPolicies = autoScalingPolicies;
        this.codePackages = codePackages;
        this.description = description;
        this.diagnostics = diagnostics;
        this.healthState = healthState;
        this.id = id;
        this.name = name;
        this.networkRefs = networkRefs;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.replicaCount = replicaCount;
        this.status = status;
        this.statusDetails = statusDetails;
        this.type = type;
        this.unhealthyEvaluation = unhealthyEvaluation;
    }

    /**
     * @return Auto scaling policies
     * 
     */
    public List<AutoScalingPolicyResponse> autoScalingPolicies() {
        return this.autoScalingPolicies == null ? List.of() : this.autoScalingPolicies;
    }
    /**
     * @return Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    public List<ContainerCodePackagePropertiesResponse> codePackages() {
        return this.codePackages;
    }
    /**
     * @return User readable description of the service.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Reference to sinks in DiagnosticsDescription.
     * 
     */
    public Optional<DiagnosticsRefResponse> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * @return Describes the health state of an application resource.
     * 
     */
    public String healthState() {
        return this.healthState;
    }
    /**
     * @return Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The names of the private networks that this service needs to be part of.
     * 
     */
    public List<NetworkRefResponse> networkRefs() {
        return this.networkRefs == null ? List.of() : this.networkRefs;
    }
    /**
     * @return The operation system required by the code in service.
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return State of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    public Optional<Integer> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }
    /**
     * @return Status of the service.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Gives additional information about the current status of the service.
     * 
     */
    public String statusDetails() {
        return this.statusDetails;
    }
    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return When the service&#39;s health state is not &#39;Ok&#39;, this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    public String unhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResourceDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;
        private List<ContainerCodePackagePropertiesResponse> codePackages;
        private @Nullable String description;
        private @Nullable DiagnosticsRefResponse diagnostics;
        private String healthState;
        private String id;
        private @Nullable String name;
        private @Nullable List<NetworkRefResponse> networkRefs;
        private String osType;
        private String provisioningState;
        private @Nullable Integer replicaCount;
        private String status;
        private String statusDetails;
        private String type;
        private String unhealthyEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResourceDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingPolicies = defaults.autoScalingPolicies;
    	      this.codePackages = defaults.codePackages;
    	      this.description = defaults.description;
    	      this.diagnostics = defaults.diagnostics;
    	      this.healthState = defaults.healthState;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkRefs = defaults.networkRefs;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.replicaCount = defaults.replicaCount;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.type = defaults.type;
    	      this.unhealthyEvaluation = defaults.unhealthyEvaluation;
        }

        public Builder autoScalingPolicies(@Nullable List<AutoScalingPolicyResponse> autoScalingPolicies) {
            this.autoScalingPolicies = autoScalingPolicies;
            return this;
        }
        public Builder autoScalingPolicies(AutoScalingPolicyResponse... autoScalingPolicies) {
            return autoScalingPolicies(List.of(autoScalingPolicies));
        }
        public Builder codePackages(List<ContainerCodePackagePropertiesResponse> codePackages) {
            this.codePackages = Objects.requireNonNull(codePackages);
            return this;
        }
        public Builder codePackages(ContainerCodePackagePropertiesResponse... codePackages) {
            return codePackages(List.of(codePackages));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder diagnostics(@Nullable DiagnosticsRefResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }
        public Builder healthState(String healthState) {
            this.healthState = Objects.requireNonNull(healthState);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder networkRefs(@Nullable List<NetworkRefResponse> networkRefs) {
            this.networkRefs = networkRefs;
            return this;
        }
        public Builder networkRefs(NetworkRefResponse... networkRefs) {
            return networkRefs(List.of(networkRefs));
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder unhealthyEvaluation(String unhealthyEvaluation) {
            this.unhealthyEvaluation = Objects.requireNonNull(unhealthyEvaluation);
            return this;
        }        public ServiceResourceDescriptionResponse build() {
            return new ServiceResourceDescriptionResponse(autoScalingPolicies, codePackages, description, diagnostics, healthState, id, name, networkRefs, osType, provisioningState, replicaCount, status, statusDetails, type, unhealthyEvaluation);
        }
    }
}
