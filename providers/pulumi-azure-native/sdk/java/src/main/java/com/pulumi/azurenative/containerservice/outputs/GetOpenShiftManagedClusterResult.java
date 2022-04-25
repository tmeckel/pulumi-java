// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.azurenative.containerservice.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAgentPoolProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAuthProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterMasterPoolProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftRouterProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.PurchasePlanResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenShiftManagedClusterResult {
    /**
     * @return Configuration of OpenShift cluster VMs.
     * 
     */
    private final @Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles;
    /**
     * @return Configures OpenShift authentication.
     * 
     */
    private final @Nullable OpenShiftManagedClusterAuthProfileResponse authProfile;
    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    private final String clusterVersion;
    /**
     * @return Service generated FQDN for OpenShift API server loadbalancer internal hostname.
     * 
     */
    private final String fqdn;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return Configuration for OpenShift master VMs.
     * 
     */
    private final @Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Configuration for OpenShift networking.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    private final String openShiftVersion;
    /**
     * @return Define the resource plan as required by ARM for billing purposes
     * 
     */
    private final @Nullable PurchasePlanResponse plan;
    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * @return Service generated FQDN for OpenShift API server.
     * 
     */
    private final String publicHostname;
    /**
     * @return Configuration for OpenShift router(s).
     * 
     */
    private final @Nullable List<OpenShiftRouterProfileResponse> routerProfiles;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetOpenShiftManagedClusterResult(
        @CustomType.Parameter("agentPoolProfiles") @Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles,
        @CustomType.Parameter("authProfile") @Nullable OpenShiftManagedClusterAuthProfileResponse authProfile,
        @CustomType.Parameter("clusterVersion") String clusterVersion,
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("masterPoolProfile") @Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @CustomType.Parameter("openShiftVersion") String openShiftVersion,
        @CustomType.Parameter("plan") @Nullable PurchasePlanResponse plan,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicHostname") String publicHostname,
        @CustomType.Parameter("routerProfiles") @Nullable List<OpenShiftRouterProfileResponse> routerProfiles,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.agentPoolProfiles = agentPoolProfiles;
        this.authProfile = authProfile;
        this.clusterVersion = clusterVersion;
        this.fqdn = fqdn;
        this.id = id;
        this.location = location;
        this.masterPoolProfile = masterPoolProfile;
        this.name = name;
        this.networkProfile = networkProfile;
        this.openShiftVersion = openShiftVersion;
        this.plan = plan;
        this.provisioningState = provisioningState;
        this.publicHostname = publicHostname;
        this.routerProfiles = routerProfiles;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Configuration of OpenShift cluster VMs.
     * 
     */
    public List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles() {
        return this.agentPoolProfiles == null ? List.of() : this.agentPoolProfiles;
    }
    /**
     * @return Configures OpenShift authentication.
     * 
     */
    public Optional<OpenShiftManagedClusterAuthProfileResponse> authProfile() {
        return Optional.ofNullable(this.authProfile);
    }
    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * @return Service generated FQDN for OpenShift API server loadbalancer internal hostname.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Configuration for OpenShift master VMs.
     * 
     */
    public Optional<OpenShiftManagedClusterMasterPoolProfileResponse> masterPoolProfile() {
        return Optional.ofNullable(this.masterPoolProfile);
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configuration for OpenShift networking.
     * 
     */
    public Optional<NetworkProfileResponse> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    public String openShiftVersion() {
        return this.openShiftVersion;
    }
    /**
     * @return Define the resource plan as required by ARM for billing purposes
     * 
     */
    public Optional<PurchasePlanResponse> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Service generated FQDN for OpenShift API server.
     * 
     */
    public String publicHostname() {
        return this.publicHostname;
    }
    /**
     * @return Configuration for OpenShift router(s).
     * 
     */
    public List<OpenShiftRouterProfileResponse> routerProfiles() {
        return this.routerProfiles == null ? List.of() : this.routerProfiles;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenShiftManagedClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles;
        private @Nullable OpenShiftManagedClusterAuthProfileResponse authProfile;
        private String clusterVersion;
        private String fqdn;
        private String id;
        private String location;
        private @Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private String openShiftVersion;
        private @Nullable PurchasePlanResponse plan;
        private String provisioningState;
        private String publicHostname;
        private @Nullable List<OpenShiftRouterProfileResponse> routerProfiles;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOpenShiftManagedClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.authProfile = defaults.authProfile;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.masterPoolProfile = defaults.masterPoolProfile;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.openShiftVersion = defaults.openShiftVersion;
    	      this.plan = defaults.plan;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicHostname = defaults.publicHostname;
    	      this.routerProfiles = defaults.routerProfiles;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder agentPoolProfiles(@Nullable List<OpenShiftManagedClusterAgentPoolProfileResponse> agentPoolProfiles) {
            this.agentPoolProfiles = agentPoolProfiles;
            return this;
        }
        public Builder agentPoolProfiles(OpenShiftManagedClusterAgentPoolProfileResponse... agentPoolProfiles) {
            return agentPoolProfiles(List.of(agentPoolProfiles));
        }
        public Builder authProfile(@Nullable OpenShiftManagedClusterAuthProfileResponse authProfile) {
            this.authProfile = authProfile;
            return this;
        }
        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder masterPoolProfile(@Nullable OpenShiftManagedClusterMasterPoolProfileResponse masterPoolProfile) {
            this.masterPoolProfile = masterPoolProfile;
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
        public Builder openShiftVersion(String openShiftVersion) {
            this.openShiftVersion = Objects.requireNonNull(openShiftVersion);
            return this;
        }
        public Builder plan(@Nullable PurchasePlanResponse plan) {
            this.plan = plan;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicHostname(String publicHostname) {
            this.publicHostname = Objects.requireNonNull(publicHostname);
            return this;
        }
        public Builder routerProfiles(@Nullable List<OpenShiftRouterProfileResponse> routerProfiles) {
            this.routerProfiles = routerProfiles;
            return this;
        }
        public Builder routerProfiles(OpenShiftRouterProfileResponse... routerProfiles) {
            return routerProfiles(List.of(routerProfiles));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetOpenShiftManagedClusterResult build() {
            return new GetOpenShiftManagedClusterResult(agentPoolProfiles, authProfile, clusterVersion, fqdn, id, location, masterPoolProfile, name, networkProfile, openShiftVersion, plan, provisioningState, publicHostname, routerProfiles, tags, type);
        }
    }
}
