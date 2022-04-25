// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.AutoScalingPolicyResponse;
import com.pulumi.azurenative.servicefabricmesh.inputs.ContainerCodePackagePropertiesResponse;
import com.pulumi.azurenative.servicefabricmesh.inputs.DiagnosticsRefResponse;
import com.pulumi.azurenative.servicefabricmesh.inputs.NetworkRefResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This type describes a service resource.
 * 
 */
public final class ServiceResourceDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceResourceDescriptionResponse Empty = new ServiceResourceDescriptionResponse();

    /**
     * Auto scaling policies
     * 
     */
    @Import(name="autoScalingPolicies")
    private @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;

    /**
     * @return Auto scaling policies
     * 
     */
    public Optional<List<AutoScalingPolicyResponse>> autoScalingPolicies() {
        return Optional.ofNullable(this.autoScalingPolicies);
    }

    /**
     * Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    @Import(name="codePackages", required=true)
    private List<ContainerCodePackagePropertiesResponse> codePackages;

    /**
     * @return Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    public List<ContainerCodePackagePropertiesResponse> codePackages() {
        return this.codePackages;
    }

    /**
     * User readable description of the service.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return User readable description of the service.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    @Import(name="diagnostics")
    private @Nullable DiagnosticsRefResponse diagnostics;

    /**
     * @return Reference to sinks in DiagnosticsDescription.
     * 
     */
    public Optional<DiagnosticsRefResponse> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }

    /**
     * Describes the health state of an application resource.
     * 
     */
    @Import(name="healthState", required=true)
    private String healthState;

    /**
     * @return Describes the health state of an application resource.
     * 
     */
    public String healthState() {
        return this.healthState;
    }

    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the resource
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The names of the private networks that this service needs to be part of.
     * 
     */
    @Import(name="networkRefs")
    private @Nullable List<NetworkRefResponse> networkRefs;

    /**
     * @return The names of the private networks that this service needs to be part of.
     * 
     */
    public Optional<List<NetworkRefResponse>> networkRefs() {
        return Optional.ofNullable(this.networkRefs);
    }

    /**
     * The operation system required by the code in service.
     * 
     */
    @Import(name="osType", required=true)
    private String osType;

    /**
     * @return The operation system required by the code in service.
     * 
     */
    public String osType() {
        return this.osType;
    }

    /**
     * State of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    @Import(name="replicaCount")
    private @Nullable Integer replicaCount;

    /**
     * @return The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    public Optional<Integer> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    /**
     * Status of the service.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return Status of the service.
     * 
     */
    public String status() {
        return this.status;
    }

    /**
     * Gives additional information about the current status of the service.
     * 
     */
    @Import(name="statusDetails", required=true)
    private String statusDetails;

    /**
     * @return Gives additional information about the current status of the service.
     * 
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * When the service&#39;s health state is not &#39;Ok&#39;, this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    @Import(name="unhealthyEvaluation", required=true)
    private String unhealthyEvaluation;

    /**
     * @return When the service&#39;s health state is not &#39;Ok&#39;, this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    public String unhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    private ServiceResourceDescriptionResponse() {}

    private ServiceResourceDescriptionResponse(ServiceResourceDescriptionResponse $) {
        this.autoScalingPolicies = $.autoScalingPolicies;
        this.codePackages = $.codePackages;
        this.description = $.description;
        this.diagnostics = $.diagnostics;
        this.healthState = $.healthState;
        this.id = $.id;
        this.name = $.name;
        this.networkRefs = $.networkRefs;
        this.osType = $.osType;
        this.provisioningState = $.provisioningState;
        this.replicaCount = $.replicaCount;
        this.status = $.status;
        this.statusDetails = $.statusDetails;
        this.type = $.type;
        this.unhealthyEvaluation = $.unhealthyEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceResourceDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceResourceDescriptionResponse $;

        public Builder() {
            $ = new ServiceResourceDescriptionResponse();
        }

        public Builder(ServiceResourceDescriptionResponse defaults) {
            $ = new ServiceResourceDescriptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScalingPolicies Auto scaling policies
         * 
         * @return builder
         * 
         */
        public Builder autoScalingPolicies(@Nullable List<AutoScalingPolicyResponse> autoScalingPolicies) {
            $.autoScalingPolicies = autoScalingPolicies;
            return this;
        }

        /**
         * @param autoScalingPolicies Auto scaling policies
         * 
         * @return builder
         * 
         */
        public Builder autoScalingPolicies(AutoScalingPolicyResponse... autoScalingPolicies) {
            return autoScalingPolicies(List.of(autoScalingPolicies));
        }

        /**
         * @param codePackages Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
         * 
         * @return builder
         * 
         */
        public Builder codePackages(List<ContainerCodePackagePropertiesResponse> codePackages) {
            $.codePackages = codePackages;
            return this;
        }

        /**
         * @param codePackages Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
         * 
         * @return builder
         * 
         */
        public Builder codePackages(ContainerCodePackagePropertiesResponse... codePackages) {
            return codePackages(List.of(codePackages));
        }

        /**
         * @param description User readable description of the service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param diagnostics Reference to sinks in DiagnosticsDescription.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(@Nullable DiagnosticsRefResponse diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        /**
         * @param healthState Describes the health state of an application resource.
         * 
         * @return builder
         * 
         */
        public Builder healthState(String healthState) {
            $.healthState = healthState;
            return this;
        }

        /**
         * @param id Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param networkRefs The names of the private networks that this service needs to be part of.
         * 
         * @return builder
         * 
         */
        public Builder networkRefs(@Nullable List<NetworkRefResponse> networkRefs) {
            $.networkRefs = networkRefs;
            return this;
        }

        /**
         * @param networkRefs The names of the private networks that this service needs to be part of.
         * 
         * @return builder
         * 
         */
        public Builder networkRefs(NetworkRefResponse... networkRefs) {
            return networkRefs(List.of(networkRefs));
        }

        /**
         * @param osType The operation system required by the code in service.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param provisioningState State of the resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param replicaCount The number of replicas of the service to create. Defaults to 1 if not specified.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(@Nullable Integer replicaCount) {
            $.replicaCount = replicaCount;
            return this;
        }

        /**
         * @param status Status of the service.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        /**
         * @param statusDetails Gives additional information about the current status of the service.
         * 
         * @return builder
         * 
         */
        public Builder statusDetails(String statusDetails) {
            $.statusDetails = statusDetails;
            return this;
        }

        /**
         * @param type The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param unhealthyEvaluation When the service&#39;s health state is not &#39;Ok&#39;, this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyEvaluation(String unhealthyEvaluation) {
            $.unhealthyEvaluation = unhealthyEvaluation;
            return this;
        }

        public ServiceResourceDescriptionResponse build() {
            $.codePackages = Objects.requireNonNull($.codePackages, "expected parameter 'codePackages' to be non-null");
            $.healthState = Objects.requireNonNull($.healthState, "expected parameter 'healthState' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.statusDetails = Objects.requireNonNull($.statusDetails, "expected parameter 'statusDetails' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.unhealthyEvaluation = Objects.requireNonNull($.unhealthyEvaluation, "expected parameter 'unhealthyEvaluation' to be non-null");
            return $;
        }
    }

}
