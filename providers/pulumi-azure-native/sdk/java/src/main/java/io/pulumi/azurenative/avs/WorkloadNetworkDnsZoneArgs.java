// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadNetworkDnsZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadNetworkDnsZoneArgs Empty = new WorkloadNetworkDnsZoneArgs();

    /**
     * Display name of the DNS Zone.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * DNS Server IP array of the DNS Zone.
     * 
     */
    @Import(name="dnsServerIps")
      private final @Nullable Output<List<String>> dnsServerIps;

    public Output<List<String>> getDnsServerIps() {
        return this.dnsServerIps == null ? Codegen.empty() : this.dnsServerIps;
    }

    /**
     * Number of DNS Services using the DNS zone.
     * 
     */
    @Import(name="dnsServices")
      private final @Nullable Output<Double> dnsServices;

    public Output<Double> getDnsServices() {
        return this.dnsServices == null ? Codegen.empty() : this.dnsServices;
    }

    /**
     * NSX DNS Zone identifier. Generally the same as the DNS Zone's display name
     * 
     */
    @Import(name="dnsZoneId")
      private final @Nullable Output<String> dnsZoneId;

    public Output<String> getDnsZoneId() {
        return this.dnsZoneId == null ? Codegen.empty() : this.dnsZoneId;
    }

    /**
     * Domain names of the DNS Zone.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<List<String>> domain;

    public Output<List<String>> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final Output<String> privateCloudName;

    public Output<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX revision number.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<Double> revision;

    public Output<Double> getRevision() {
        return this.revision == null ? Codegen.empty() : this.revision;
    }

    /**
     * Source IP of the DNS Zone.
     * 
     */
    @Import(name="sourceIp")
      private final @Nullable Output<String> sourceIp;

    public Output<String> getSourceIp() {
        return this.sourceIp == null ? Codegen.empty() : this.sourceIp;
    }

    public WorkloadNetworkDnsZoneArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<List<String>> dnsServerIps,
        @Nullable Output<Double> dnsServices,
        @Nullable Output<String> dnsZoneId,
        @Nullable Output<List<String>> domain,
        Output<String> privateCloudName,
        Output<String> resourceGroupName,
        @Nullable Output<Double> revision,
        @Nullable Output<String> sourceIp) {
        this.displayName = displayName;
        this.dnsServerIps = dnsServerIps;
        this.dnsServices = dnsServices;
        this.dnsZoneId = dnsZoneId;
        this.domain = domain;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.revision = revision;
        this.sourceIp = sourceIp;
    }

    private WorkloadNetworkDnsZoneArgs() {
        this.displayName = Codegen.empty();
        this.dnsServerIps = Codegen.empty();
        this.dnsServices = Codegen.empty();
        this.dnsZoneId = Codegen.empty();
        this.domain = Codegen.empty();
        this.privateCloudName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.revision = Codegen.empty();
        this.sourceIp = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkDnsZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<String>> dnsServerIps;
        private @Nullable Output<Double> dnsServices;
        private @Nullable Output<String> dnsZoneId;
        private @Nullable Output<List<String>> domain;
        private Output<String> privateCloudName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Double> revision;
        private @Nullable Output<String> sourceIp;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkDnsZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.dnsServerIps = defaults.dnsServerIps;
    	      this.dnsServices = defaults.dnsServices;
    	      this.dnsZoneId = defaults.dnsZoneId;
    	      this.domain = defaults.domain;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.revision = defaults.revision;
    	      this.sourceIp = defaults.sourceIp;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder dnsServerIps(@Nullable Output<List<String>> dnsServerIps) {
            this.dnsServerIps = dnsServerIps;
            return this;
        }
        public Builder dnsServerIps(@Nullable List<String> dnsServerIps) {
            this.dnsServerIps = Codegen.ofNullable(dnsServerIps);
            return this;
        }
        public Builder dnsServerIps(String... dnsServerIps) {
            return dnsServerIps(List.of(dnsServerIps));
        }
        public Builder dnsServices(@Nullable Output<Double> dnsServices) {
            this.dnsServices = dnsServices;
            return this;
        }
        public Builder dnsServices(@Nullable Double dnsServices) {
            this.dnsServices = Codegen.ofNullable(dnsServices);
            return this;
        }
        public Builder dnsZoneId(@Nullable Output<String> dnsZoneId) {
            this.dnsZoneId = dnsZoneId;
            return this;
        }
        public Builder dnsZoneId(@Nullable String dnsZoneId) {
            this.dnsZoneId = Codegen.ofNullable(dnsZoneId);
            return this;
        }
        public Builder domain(@Nullable Output<List<String>> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable List<String> domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder domain(String... domain) {
            return domain(List.of(domain));
        }
        public Builder privateCloudName(Output<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Output.of(Objects.requireNonNull(privateCloudName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder revision(@Nullable Output<Double> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable Double revision) {
            this.revision = Codegen.ofNullable(revision);
            return this;
        }
        public Builder sourceIp(@Nullable Output<String> sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public Builder sourceIp(@Nullable String sourceIp) {
            this.sourceIp = Codegen.ofNullable(sourceIp);
            return this;
        }        public WorkloadNetworkDnsZoneArgs build() {
            return new WorkloadNetworkDnsZoneArgs(displayName, dnsServerIps, dnsServices, dnsZoneId, domain, privateCloudName, resourceGroupName, revision, sourceIp);
        }
    }
}
