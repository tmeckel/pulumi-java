// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.managedidentities_v1beta1.outputs.TrustResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDomainResult {
    /**
     * Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    private final String admin;
    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    private final Boolean auditLogsEnabled;
    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    private final List<String> authorizedNetworks;
    /**
     * The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    private final String fqdn;
    /**
     * Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    private final List<String> locations;
    /**
     * The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    private final String name;
    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    private final String reservedIpRange;
    /**
     * The current state of this domain.
     * 
     */
    private final String state;
    /**
     * Additional information about the current status of this domain, if available.
     * 
     */
    private final String statusMessage;
    /**
     * The current trusts associated with the domain.
     * 
     */
    private final List<TrustResponse> trusts;
    /**
     * The last update time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"admin","auditLogsEnabled","authorizedNetworks","createTime","fqdn","labels","locations","name","reservedIpRange","state","statusMessage","trusts","updateTime"})
    private GetDomainResult(
        String admin,
        Boolean auditLogsEnabled,
        List<String> authorizedNetworks,
        String createTime,
        String fqdn,
        Map<String,String> labels,
        List<String> locations,
        String name,
        String reservedIpRange,
        String state,
        String statusMessage,
        List<TrustResponse> trusts,
        String updateTime) {
        this.admin = Objects.requireNonNull(admin);
        this.auditLogsEnabled = Objects.requireNonNull(auditLogsEnabled);
        this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
        this.createTime = Objects.requireNonNull(createTime);
        this.fqdn = Objects.requireNonNull(fqdn);
        this.labels = Objects.requireNonNull(labels);
        this.locations = Objects.requireNonNull(locations);
        this.name = Objects.requireNonNull(name);
        this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
        this.state = Objects.requireNonNull(state);
        this.statusMessage = Objects.requireNonNull(statusMessage);
        this.trusts = Objects.requireNonNull(trusts);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    public String getAdmin() {
        return this.admin;
    }
    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    public Boolean getAuditLogsEnabled() {
        return this.auditLogsEnabled;
    }
    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    public List<String> getAuthorizedNetworks() {
        return this.authorizedNetworks;
    }
    /**
     * The time the instance was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    public List<String> getLocations() {
        return this.locations;
    }
    /**
     * The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    public String getReservedIpRange() {
        return this.reservedIpRange;
    }
    /**
     * The current state of this domain.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Additional information about the current status of this domain, if available.
     * 
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * The current trusts associated with the domain.
     * 
     */
    public List<TrustResponse> getTrusts() {
        return this.trusts;
    }
    /**
     * The last update time.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String admin;
        private Boolean auditLogsEnabled;
        private List<String> authorizedNetworks;
        private String createTime;
        private String fqdn;
        private Map<String,String> labels;
        private List<String> locations;
        private String name;
        private String reservedIpRange;
        private String state;
        private String statusMessage;
        private List<TrustResponse> trusts;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.auditLogsEnabled = defaults.auditLogsEnabled;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.createTime = defaults.createTime;
    	      this.fqdn = defaults.fqdn;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.trusts = defaults.trusts;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAdmin(String admin) {
            this.admin = Objects.requireNonNull(admin);
            return this;
        }

        public Builder setAuditLogsEnabled(Boolean auditLogsEnabled) {
            this.auditLogsEnabled = Objects.requireNonNull(auditLogsEnabled);
            return this;
        }

        public Builder setAuthorizedNetworks(List<String> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setTrusts(List<TrustResponse> trusts) {
            this.trusts = Objects.requireNonNull(trusts);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetDomainResult build() {
            return new GetDomainResult(admin, auditLogsEnabled, authorizedNetworks, createTime, fqdn, labels, locations, name, reservedIpRange, state, statusMessage, trusts, updateTime);
        }
    }
}
