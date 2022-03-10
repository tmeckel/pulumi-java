// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ActiveDirectoryPropertiesResponse {
    /**
     * Specifies the security identifier (SID) for Azure Storage.
     * 
     */
    private final String azureStorageSid;
    /**
     * Specifies the domain GUID.
     * 
     */
    private final String domainGuid;
    /**
     * Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     */
    private final String domainName;
    /**
     * Specifies the security identifier (SID).
     * 
     */
    private final String domainSid;
    /**
     * Specifies the Active Directory forest to get.
     * 
     */
    private final String forestName;
    /**
     * Specifies the NetBIOS domain name.
     * 
     */
    private final String netBiosDomainName;

    @OutputCustomType.Constructor
    private ActiveDirectoryPropertiesResponse(
        @OutputCustomType.Parameter("azureStorageSid") String azureStorageSid,
        @OutputCustomType.Parameter("domainGuid") String domainGuid,
        @OutputCustomType.Parameter("domainName") String domainName,
        @OutputCustomType.Parameter("domainSid") String domainSid,
        @OutputCustomType.Parameter("forestName") String forestName,
        @OutputCustomType.Parameter("netBiosDomainName") String netBiosDomainName) {
        this.azureStorageSid = azureStorageSid;
        this.domainGuid = domainGuid;
        this.domainName = domainName;
        this.domainSid = domainSid;
        this.forestName = forestName;
        this.netBiosDomainName = netBiosDomainName;
    }

    /**
     * Specifies the security identifier (SID) for Azure Storage.
     * 
    */
    public String getAzureStorageSid() {
        return this.azureStorageSid;
    }
    /**
     * Specifies the domain GUID.
     * 
    */
    public String getDomainGuid() {
        return this.domainGuid;
    }
    /**
     * Specifies the primary domain that the AD DNS server is authoritative for.
     * 
    */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Specifies the security identifier (SID).
     * 
    */
    public String getDomainSid() {
        return this.domainSid;
    }
    /**
     * Specifies the Active Directory forest to get.
     * 
    */
    public String getForestName() {
        return this.forestName;
    }
    /**
     * Specifies the NetBIOS domain name.
     * 
    */
    public String getNetBiosDomainName() {
        return this.netBiosDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDirectoryPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureStorageSid;
        private String domainGuid;
        private String domainName;
        private String domainSid;
        private String forestName;
        private String netBiosDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDirectoryPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureStorageSid = defaults.azureStorageSid;
    	      this.domainGuid = defaults.domainGuid;
    	      this.domainName = defaults.domainName;
    	      this.domainSid = defaults.domainSid;
    	      this.forestName = defaults.forestName;
    	      this.netBiosDomainName = defaults.netBiosDomainName;
        }

        public Builder azureStorageSid(String azureStorageSid) {
            this.azureStorageSid = Objects.requireNonNull(azureStorageSid);
            return this;
        }

        public Builder domainGuid(String domainGuid) {
            this.domainGuid = Objects.requireNonNull(domainGuid);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainSid(String domainSid) {
            this.domainSid = Objects.requireNonNull(domainSid);
            return this;
        }

        public Builder forestName(String forestName) {
            this.forestName = Objects.requireNonNull(forestName);
            return this;
        }

        public Builder netBiosDomainName(String netBiosDomainName) {
            this.netBiosDomainName = Objects.requireNonNull(netBiosDomainName);
            return this;
        }
        public ActiveDirectoryPropertiesResponse build() {
            return new ActiveDirectoryPropertiesResponse(azureStorageSid, domainGuid, domainName, domainSid, forestName, netBiosDomainName);
        }
    }
}
