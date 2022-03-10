// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ServiceTreeInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceProviderManifestPropertiesManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceProviderManifestPropertiesManagementArgs Empty = new ResourceProviderManifestPropertiesManagementArgs();

    @InputImport(name="incidentContactEmail")
      private final @Nullable Input<String> incidentContactEmail;

    public Input<String> getIncidentContactEmail() {
        return this.incidentContactEmail == null ? Input.empty() : this.incidentContactEmail;
    }

    @InputImport(name="incidentRoutingService")
      private final @Nullable Input<String> incidentRoutingService;

    public Input<String> getIncidentRoutingService() {
        return this.incidentRoutingService == null ? Input.empty() : this.incidentRoutingService;
    }

    @InputImport(name="incidentRoutingTeam")
      private final @Nullable Input<String> incidentRoutingTeam;

    public Input<String> getIncidentRoutingTeam() {
        return this.incidentRoutingTeam == null ? Input.empty() : this.incidentRoutingTeam;
    }

    @InputImport(name="manifestOwners")
      private final @Nullable Input<List<String>> manifestOwners;

    public Input<List<String>> getManifestOwners() {
        return this.manifestOwners == null ? Input.empty() : this.manifestOwners;
    }

    @InputImport(name="resourceAccessPolicy")
      private final @Nullable Input<String> resourceAccessPolicy;

    public Input<String> getResourceAccessPolicy() {
        return this.resourceAccessPolicy == null ? Input.empty() : this.resourceAccessPolicy;
    }

    @InputImport(name="resourceAccessRoles")
      private final @Nullable Input<List<Object>> resourceAccessRoles;

    public Input<List<Object>> getResourceAccessRoles() {
        return this.resourceAccessRoles == null ? Input.empty() : this.resourceAccessRoles;
    }

    @InputImport(name="schemaOwners")
      private final @Nullable Input<List<String>> schemaOwners;

    public Input<List<String>> getSchemaOwners() {
        return this.schemaOwners == null ? Input.empty() : this.schemaOwners;
    }

    @InputImport(name="serviceTreeInfos")
      private final @Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos;

    public Input<List<ServiceTreeInfoArgs>> getServiceTreeInfos() {
        return this.serviceTreeInfos == null ? Input.empty() : this.serviceTreeInfos;
    }

    public ResourceProviderManifestPropertiesManagementArgs(
        @Nullable Input<String> incidentContactEmail,
        @Nullable Input<String> incidentRoutingService,
        @Nullable Input<String> incidentRoutingTeam,
        @Nullable Input<List<String>> manifestOwners,
        @Nullable Input<String> resourceAccessPolicy,
        @Nullable Input<List<Object>> resourceAccessRoles,
        @Nullable Input<List<String>> schemaOwners,
        @Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos) {
        this.incidentContactEmail = incidentContactEmail;
        this.incidentRoutingService = incidentRoutingService;
        this.incidentRoutingTeam = incidentRoutingTeam;
        this.manifestOwners = manifestOwners;
        this.resourceAccessPolicy = resourceAccessPolicy;
        this.resourceAccessRoles = resourceAccessRoles;
        this.schemaOwners = schemaOwners;
        this.serviceTreeInfos = serviceTreeInfos;
    }

    private ResourceProviderManifestPropertiesManagementArgs() {
        this.incidentContactEmail = Input.empty();
        this.incidentRoutingService = Input.empty();
        this.incidentRoutingTeam = Input.empty();
        this.manifestOwners = Input.empty();
        this.resourceAccessPolicy = Input.empty();
        this.resourceAccessRoles = Input.empty();
        this.schemaOwners = Input.empty();
        this.serviceTreeInfos = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> incidentContactEmail;
        private @Nullable Input<String> incidentRoutingService;
        private @Nullable Input<String> incidentRoutingTeam;
        private @Nullable Input<List<String>> manifestOwners;
        private @Nullable Input<String> resourceAccessPolicy;
        private @Nullable Input<List<Object>> resourceAccessRoles;
        private @Nullable Input<List<String>> schemaOwners;
        private @Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentContactEmail = defaults.incidentContactEmail;
    	      this.incidentRoutingService = defaults.incidentRoutingService;
    	      this.incidentRoutingTeam = defaults.incidentRoutingTeam;
    	      this.manifestOwners = defaults.manifestOwners;
    	      this.resourceAccessPolicy = defaults.resourceAccessPolicy;
    	      this.resourceAccessRoles = defaults.resourceAccessRoles;
    	      this.schemaOwners = defaults.schemaOwners;
    	      this.serviceTreeInfos = defaults.serviceTreeInfos;
        }

        public Builder incidentContactEmail(@Nullable Input<String> incidentContactEmail) {
            this.incidentContactEmail = incidentContactEmail;
            return this;
        }

        public Builder incidentContactEmail(@Nullable String incidentContactEmail) {
            this.incidentContactEmail = Input.ofNullable(incidentContactEmail);
            return this;
        }

        public Builder incidentRoutingService(@Nullable Input<String> incidentRoutingService) {
            this.incidentRoutingService = incidentRoutingService;
            return this;
        }

        public Builder incidentRoutingService(@Nullable String incidentRoutingService) {
            this.incidentRoutingService = Input.ofNullable(incidentRoutingService);
            return this;
        }

        public Builder incidentRoutingTeam(@Nullable Input<String> incidentRoutingTeam) {
            this.incidentRoutingTeam = incidentRoutingTeam;
            return this;
        }

        public Builder incidentRoutingTeam(@Nullable String incidentRoutingTeam) {
            this.incidentRoutingTeam = Input.ofNullable(incidentRoutingTeam);
            return this;
        }

        public Builder manifestOwners(@Nullable Input<List<String>> manifestOwners) {
            this.manifestOwners = manifestOwners;
            return this;
        }

        public Builder manifestOwners(@Nullable List<String> manifestOwners) {
            this.manifestOwners = Input.ofNullable(manifestOwners);
            return this;
        }

        public Builder resourceAccessPolicy(@Nullable Input<String> resourceAccessPolicy) {
            this.resourceAccessPolicy = resourceAccessPolicy;
            return this;
        }

        public Builder resourceAccessPolicy(@Nullable String resourceAccessPolicy) {
            this.resourceAccessPolicy = Input.ofNullable(resourceAccessPolicy);
            return this;
        }

        public Builder resourceAccessRoles(@Nullable Input<List<Object>> resourceAccessRoles) {
            this.resourceAccessRoles = resourceAccessRoles;
            return this;
        }

        public Builder resourceAccessRoles(@Nullable List<Object> resourceAccessRoles) {
            this.resourceAccessRoles = Input.ofNullable(resourceAccessRoles);
            return this;
        }

        public Builder schemaOwners(@Nullable Input<List<String>> schemaOwners) {
            this.schemaOwners = schemaOwners;
            return this;
        }

        public Builder schemaOwners(@Nullable List<String> schemaOwners) {
            this.schemaOwners = Input.ofNullable(schemaOwners);
            return this;
        }

        public Builder serviceTreeInfos(@Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos) {
            this.serviceTreeInfos = serviceTreeInfos;
            return this;
        }

        public Builder serviceTreeInfos(@Nullable List<ServiceTreeInfoArgs> serviceTreeInfos) {
            this.serviceTreeInfos = Input.ofNullable(serviceTreeInfos);
            return this;
        }
        public ResourceProviderManifestPropertiesManagementArgs build() {
            return new ResourceProviderManifestPropertiesManagementArgs(incidentContactEmail, incidentRoutingService, incidentRoutingTeam, manifestOwners, resourceAccessPolicy, resourceAccessRoles, schemaOwners, serviceTreeInfos);
        }
    }
}
