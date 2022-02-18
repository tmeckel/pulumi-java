// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    @InputImport(name="admin")
    private final @Nullable Input<String> admin;

    public Input<String> getAdmin() {
        return this.admin == null ? Input.empty() : this.admin;
    }

    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    @InputImport(name="auditLogsEnabled")
    private final @Nullable Input<Boolean> auditLogsEnabled;

    public Input<Boolean> getAuditLogsEnabled() {
        return this.auditLogsEnabled == null ? Input.empty() : this.auditLogsEnabled;
    }

    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @InputImport(name="authorizedNetworks")
    private final @Nullable Input<List<String>> authorizedNetworks;

    public Input<List<String>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Input.empty() : this.authorizedNetworks;
    }

    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @InputImport(name="locations", required=true)
    private final Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations;
    }

    /**
     * The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    @InputImport(name="reservedIpRange", required=true)
    private final Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange;
    }

    public DomainArgs(
        @Nullable Input<String> admin,
        @Nullable Input<Boolean> auditLogsEnabled,
        @Nullable Input<List<String>> authorizedNetworks,
        Input<String> domainName,
        @Nullable Input<Map<String,String>> labels,
        Input<List<String>> locations,
        Input<String> name,
        @Nullable Input<String> project,
        Input<String> reservedIpRange) {
        this.admin = admin;
        this.auditLogsEnabled = auditLogsEnabled;
        this.authorizedNetworks = authorizedNetworks;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.labels = labels;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
        this.reservedIpRange = Objects.requireNonNull(reservedIpRange, "expected parameter 'reservedIpRange' to be non-null");
    }

    private DomainArgs() {
        this.admin = Input.empty();
        this.auditLogsEnabled = Input.empty();
        this.authorizedNetworks = Input.empty();
        this.domainName = Input.empty();
        this.labels = Input.empty();
        this.locations = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.reservedIpRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> admin;
        private @Nullable Input<Boolean> auditLogsEnabled;
        private @Nullable Input<List<String>> authorizedNetworks;
        private Input<String> domainName;
        private @Nullable Input<Map<String,String>> labels;
        private Input<List<String>> locations;
        private Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.auditLogsEnabled = defaults.auditLogsEnabled;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.domainName = defaults.domainName;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder setAdmin(@Nullable Input<String> admin) {
            this.admin = admin;
            return this;
        }

        public Builder setAdmin(@Nullable String admin) {
            this.admin = Input.ofNullable(admin);
            return this;
        }

        public Builder setAuditLogsEnabled(@Nullable Input<Boolean> auditLogsEnabled) {
            this.auditLogsEnabled = auditLogsEnabled;
            return this;
        }

        public Builder setAuditLogsEnabled(@Nullable Boolean auditLogsEnabled) {
            this.auditLogsEnabled = Input.ofNullable(auditLogsEnabled);
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable Input<List<String>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable List<String> authorizedNetworks) {
            this.authorizedNetworks = Input.ofNullable(authorizedNetworks);
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocations(Input<List<String>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Input.of(Objects.requireNonNull(locations));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReservedIpRange(Input<String> reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }

        public Builder setReservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Input.of(Objects.requireNonNull(reservedIpRange));
            return this;
        }

        public DomainArgs build() {
            return new DomainArgs(admin, auditLogsEnabled, authorizedNetworks, domainName, labels, locations, name, project, reservedIpRange);
        }
    }
}
