// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The name of delegated administrator account used to perform Active Directory operations.
     * If not specified, setupadmin will be used.
     * 
     */
    @Import(name="admin")
      private final @Nullable Output<String> admin;

    public Output<String> getAdmin() {
        return this.admin == null ? Codegen.empty() : this.admin;
    }

    /**
     * The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
     * If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @Import(name="authorizedNetworks")
      private final @Nullable Output<List<String>> authorizedNetworks;

    public Output<List<String>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Codegen.empty() : this.authorizedNetworks;
    }

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    /**
     * The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would
     * be chosen for an Active Directory set up on an internal network.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> getFqdn() {
        return this.fqdn == null ? Codegen.empty() : this.fqdn;
    }

    /**
     * Resource labels that can contain user-provided metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
     * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @Import(name="locations")
      private final @Nullable Output<List<String>> locations;

    public Output<List<String>> getLocations() {
        return this.locations == null ? Codegen.empty() : this.locations;
    }

    /**
     * The unique name of the domain using the format: 'projects/{project}/locations/global/domains/{domainName}'.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
     * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
     * 
     */
    @Import(name="reservedIpRange")
      private final @Nullable Output<String> reservedIpRange;

    public Output<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Codegen.empty() : this.reservedIpRange;
    }

    public DomainState(
        @Nullable Output<String> admin,
        @Nullable Output<List<String>> authorizedNetworks,
        @Nullable Output<String> domainName,
        @Nullable Output<String> fqdn,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> locations,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> reservedIpRange) {
        this.admin = admin;
        this.authorizedNetworks = authorizedNetworks;
        this.domainName = domainName;
        this.fqdn = fqdn;
        this.labels = labels;
        this.locations = locations;
        this.name = name;
        this.project = project;
        this.reservedIpRange = reservedIpRange;
    }

    private DomainState() {
        this.admin = Codegen.empty();
        this.authorizedNetworks = Codegen.empty();
        this.domainName = Codegen.empty();
        this.fqdn = Codegen.empty();
        this.labels = Codegen.empty();
        this.locations = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.reservedIpRange = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> admin;
        private @Nullable Output<List<String>> authorizedNetworks;
        private @Nullable Output<String> domainName;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> locations;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.domainName = defaults.domainName;
    	      this.fqdn = defaults.fqdn;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder admin(@Nullable Output<String> admin) {
            this.admin = admin;
            return this;
        }
        public Builder admin(@Nullable String admin) {
            this.admin = Codegen.ofNullable(admin);
            return this;
        }
        public Builder authorizedNetworks(@Nullable Output<List<String>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }
        public Builder authorizedNetworks(@Nullable List<String> authorizedNetworks) {
            this.authorizedNetworks = Codegen.ofNullable(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(String... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Codegen.ofNullable(fqdn);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder locations(@Nullable Output<List<String>> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = Codegen.ofNullable(locations);
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }
        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Codegen.ofNullable(reservedIpRange);
            return this;
        }        public DomainState build() {
            return new DomainState(admin, authorizedNetworks, domainName, fqdn, labels, locations, name, project, reservedIpRange);
        }
    }
}
