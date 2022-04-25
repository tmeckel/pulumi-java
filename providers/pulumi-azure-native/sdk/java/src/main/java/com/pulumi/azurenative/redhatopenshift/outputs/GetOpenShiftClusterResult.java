// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.outputs;

import com.pulumi.azurenative.redhatopenshift.outputs.APIServerProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.ClusterProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.ConsoleProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.IngressProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.MasterProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.ServicePrincipalProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.WorkerProfileResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenShiftClusterResult {
    /**
     * @return The cluster API server profile.
     * 
     */
    private final @Nullable APIServerProfileResponse apiserverProfile;
    /**
     * @return The cluster profile.
     * 
     */
    private final @Nullable ClusterProfileResponse clusterProfile;
    /**
     * @return The console profile.
     * 
     */
    private final @Nullable ConsoleProfileResponse consoleProfile;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The cluster ingress profiles.
     * 
     */
    private final @Nullable List<IngressProfileResponse> ingressProfiles;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The cluster master profile.
     * 
     */
    private final @Nullable MasterProfileResponse masterProfile;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The cluster network profile.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * @return The cluster provisioning state (immutable).
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return The cluster service principal profile.
     * 
     */
    private final @Nullable ServicePrincipalProfileResponse servicePrincipalProfile;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return The cluster worker profiles.
     * 
     */
    private final @Nullable List<WorkerProfileResponse> workerProfiles;

    @CustomType.Constructor
    private GetOpenShiftClusterResult(
        @CustomType.Parameter("apiserverProfile") @Nullable APIServerProfileResponse apiserverProfile,
        @CustomType.Parameter("clusterProfile") @Nullable ClusterProfileResponse clusterProfile,
        @CustomType.Parameter("consoleProfile") @Nullable ConsoleProfileResponse consoleProfile,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ingressProfiles") @Nullable List<IngressProfileResponse> ingressProfiles,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("masterProfile") @Nullable MasterProfileResponse masterProfile,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("servicePrincipalProfile") @Nullable ServicePrincipalProfileResponse servicePrincipalProfile,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("workerProfiles") @Nullable List<WorkerProfileResponse> workerProfiles) {
        this.apiserverProfile = apiserverProfile;
        this.clusterProfile = clusterProfile;
        this.consoleProfile = consoleProfile;
        this.id = id;
        this.ingressProfiles = ingressProfiles;
        this.location = location;
        this.masterProfile = masterProfile;
        this.name = name;
        this.networkProfile = networkProfile;
        this.provisioningState = provisioningState;
        this.servicePrincipalProfile = servicePrincipalProfile;
        this.tags = tags;
        this.type = type;
        this.workerProfiles = workerProfiles;
    }

    /**
     * @return The cluster API server profile.
     * 
     */
    public Optional<APIServerProfileResponse> apiserverProfile() {
        return Optional.ofNullable(this.apiserverProfile);
    }
    /**
     * @return The cluster profile.
     * 
     */
    public Optional<ClusterProfileResponse> clusterProfile() {
        return Optional.ofNullable(this.clusterProfile);
    }
    /**
     * @return The console profile.
     * 
     */
    public Optional<ConsoleProfileResponse> consoleProfile() {
        return Optional.ofNullable(this.consoleProfile);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The cluster ingress profiles.
     * 
     */
    public List<IngressProfileResponse> ingressProfiles() {
        return this.ingressProfiles == null ? List.of() : this.ingressProfiles;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The cluster master profile.
     * 
     */
    public Optional<MasterProfileResponse> masterProfile() {
        return Optional.ofNullable(this.masterProfile);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The cluster network profile.
     * 
     */
    public Optional<NetworkProfileResponse> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * @return The cluster provisioning state (immutable).
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return The cluster service principal profile.
     * 
     */
    public Optional<ServicePrincipalProfileResponse> servicePrincipalProfile() {
        return Optional.ofNullable(this.servicePrincipalProfile);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The cluster worker profiles.
     * 
     */
    public List<WorkerProfileResponse> workerProfiles() {
        return this.workerProfiles == null ? List.of() : this.workerProfiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenShiftClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable APIServerProfileResponse apiserverProfile;
        private @Nullable ClusterProfileResponse clusterProfile;
        private @Nullable ConsoleProfileResponse consoleProfile;
        private String id;
        private @Nullable List<IngressProfileResponse> ingressProfiles;
        private String location;
        private @Nullable MasterProfileResponse masterProfile;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private @Nullable String provisioningState;
        private @Nullable ServicePrincipalProfileResponse servicePrincipalProfile;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<WorkerProfileResponse> workerProfiles;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOpenShiftClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiserverProfile = defaults.apiserverProfile;
    	      this.clusterProfile = defaults.clusterProfile;
    	      this.consoleProfile = defaults.consoleProfile;
    	      this.id = defaults.id;
    	      this.ingressProfiles = defaults.ingressProfiles;
    	      this.location = defaults.location;
    	      this.masterProfile = defaults.masterProfile;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.servicePrincipalProfile = defaults.servicePrincipalProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workerProfiles = defaults.workerProfiles;
        }

        public Builder apiserverProfile(@Nullable APIServerProfileResponse apiserverProfile) {
            this.apiserverProfile = apiserverProfile;
            return this;
        }
        public Builder clusterProfile(@Nullable ClusterProfileResponse clusterProfile) {
            this.clusterProfile = clusterProfile;
            return this;
        }
        public Builder consoleProfile(@Nullable ConsoleProfileResponse consoleProfile) {
            this.consoleProfile = consoleProfile;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ingressProfiles(@Nullable List<IngressProfileResponse> ingressProfiles) {
            this.ingressProfiles = ingressProfiles;
            return this;
        }
        public Builder ingressProfiles(IngressProfileResponse... ingressProfiles) {
            return ingressProfiles(List.of(ingressProfiles));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder masterProfile(@Nullable MasterProfileResponse masterProfile) {
            this.masterProfile = masterProfile;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder servicePrincipalProfile(@Nullable ServicePrincipalProfileResponse servicePrincipalProfile) {
            this.servicePrincipalProfile = servicePrincipalProfile;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder workerProfiles(@Nullable List<WorkerProfileResponse> workerProfiles) {
            this.workerProfiles = workerProfiles;
            return this;
        }
        public Builder workerProfiles(WorkerProfileResponse... workerProfiles) {
            return workerProfiles(List.of(workerProfiles));
        }        public GetOpenShiftClusterResult build() {
            return new GetOpenShiftClusterResult(apiserverProfile, clusterProfile, consoleProfile, id, ingressProfiles, location, masterProfile, name, networkProfile, provisioningState, servicePrincipalProfile, tags, type, workerProfiles);
        }
    }
}
