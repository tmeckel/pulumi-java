// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.outputs;

import com.pulumi.aws.workspaces.outputs.GetDirectorySelfServicePermission;
import com.pulumi.aws.workspaces.outputs.GetDirectoryWorkspaceAccessProperty;
import com.pulumi.aws.workspaces.outputs.GetDirectoryWorkspaceCreationProperty;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDirectoryResult {
    /**
     * @return The directory alias.
     * 
     */
    private final String alias;
    /**
     * @return The user name for the service account.
     * 
     */
    private final String customerUserName;
    private final String directoryId;
    /**
     * @return The name of the directory.
     * 
     */
    private final String directoryName;
    /**
     * @return The directory type.
     * 
     */
    private final String directoryType;
    /**
     * @return The IP addresses of the DNS servers for the directory.
     * 
     */
    private final List<String> dnsIpAddresses;
    /**
     * @return The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    private final String iamRoleId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The identifiers of the IP access control groups associated with the directory.
     * 
     */
    private final List<String> ipGroupIds;
    /**
     * @return The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    private final String registrationCode;
    /**
     * @return The permissions to enable or disable self-service capabilities.
     * 
     */
    private final List<GetDirectorySelfServicePermission> selfServicePermissions;
    /**
     * @return The identifiers of the subnets where the directory resides.
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return A map of tags assigned to the WorkSpaces directory.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return (Optional) Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    private final List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties;
    /**
     * @return The default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    private final List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties;
    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces. Defined below.
     * 
     */
    private final String workspaceSecurityGroupId;

    @CustomType.Constructor
    private GetDirectoryResult(
        @CustomType.Parameter("alias") String alias,
        @CustomType.Parameter("customerUserName") String customerUserName,
        @CustomType.Parameter("directoryId") String directoryId,
        @CustomType.Parameter("directoryName") String directoryName,
        @CustomType.Parameter("directoryType") String directoryType,
        @CustomType.Parameter("dnsIpAddresses") List<String> dnsIpAddresses,
        @CustomType.Parameter("iamRoleId") String iamRoleId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipGroupIds") List<String> ipGroupIds,
        @CustomType.Parameter("registrationCode") String registrationCode,
        @CustomType.Parameter("selfServicePermissions") List<GetDirectorySelfServicePermission> selfServicePermissions,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("workspaceAccessProperties") List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties,
        @CustomType.Parameter("workspaceCreationProperties") List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties,
        @CustomType.Parameter("workspaceSecurityGroupId") String workspaceSecurityGroupId) {
        this.alias = alias;
        this.customerUserName = customerUserName;
        this.directoryId = directoryId;
        this.directoryName = directoryName;
        this.directoryType = directoryType;
        this.dnsIpAddresses = dnsIpAddresses;
        this.iamRoleId = iamRoleId;
        this.id = id;
        this.ipGroupIds = ipGroupIds;
        this.registrationCode = registrationCode;
        this.selfServicePermissions = selfServicePermissions;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.workspaceAccessProperties = workspaceAccessProperties;
        this.workspaceCreationProperties = workspaceCreationProperties;
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    /**
     * @return The directory alias.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return The user name for the service account.
     * 
     */
    public String customerUserName() {
        return this.customerUserName;
    }
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The name of the directory.
     * 
     */
    public String directoryName() {
        return this.directoryName;
    }
    /**
     * @return The directory type.
     * 
     */
    public String directoryType() {
        return this.directoryType;
    }
    /**
     * @return The IP addresses of the DNS servers for the directory.
     * 
     */
    public List<String> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * @return The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    public String iamRoleId() {
        return this.iamRoleId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identifiers of the IP access control groups associated with the directory.
     * 
     */
    public List<String> ipGroupIds() {
        return this.ipGroupIds;
    }
    /**
     * @return The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    public String registrationCode() {
        return this.registrationCode;
    }
    /**
     * @return The permissions to enable or disable self-service capabilities.
     * 
     */
    public List<GetDirectorySelfServicePermission> selfServicePermissions() {
        return this.selfServicePermissions;
    }
    /**
     * @return The identifiers of the subnets where the directory resides.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return A map of tags assigned to the WorkSpaces directory.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return (Optional) Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    public List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties() {
        return this.workspaceAccessProperties;
    }
    /**
     * @return The default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    public List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties() {
        return this.workspaceCreationProperties;
    }
    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces. Defined below.
     * 
     */
    public String workspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String customerUserName;
        private String directoryId;
        private String directoryName;
        private String directoryType;
        private List<String> dnsIpAddresses;
        private String iamRoleId;
        private String id;
        private List<String> ipGroupIds;
        private String registrationCode;
        private List<GetDirectorySelfServicePermission> selfServicePermissions;
        private List<String> subnetIds;
        private @Nullable Map<String,String> tags;
        private List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties;
        private List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties;
        private String workspaceSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.customerUserName = defaults.customerUserName;
    	      this.directoryId = defaults.directoryId;
    	      this.directoryName = defaults.directoryName;
    	      this.directoryType = defaults.directoryType;
    	      this.dnsIpAddresses = defaults.dnsIpAddresses;
    	      this.iamRoleId = defaults.iamRoleId;
    	      this.id = defaults.id;
    	      this.ipGroupIds = defaults.ipGroupIds;
    	      this.registrationCode = defaults.registrationCode;
    	      this.selfServicePermissions = defaults.selfServicePermissions;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.workspaceAccessProperties = defaults.workspaceAccessProperties;
    	      this.workspaceCreationProperties = defaults.workspaceCreationProperties;
    	      this.workspaceSecurityGroupId = defaults.workspaceSecurityGroupId;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder customerUserName(String customerUserName) {
            this.customerUserName = Objects.requireNonNull(customerUserName);
            return this;
        }
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        public Builder directoryName(String directoryName) {
            this.directoryName = Objects.requireNonNull(directoryName);
            return this;
        }
        public Builder directoryType(String directoryType) {
            this.directoryType = Objects.requireNonNull(directoryType);
            return this;
        }
        public Builder dnsIpAddresses(List<String> dnsIpAddresses) {
            this.dnsIpAddresses = Objects.requireNonNull(dnsIpAddresses);
            return this;
        }
        public Builder dnsIpAddresses(String... dnsIpAddresses) {
            return dnsIpAddresses(List.of(dnsIpAddresses));
        }
        public Builder iamRoleId(String iamRoleId) {
            this.iamRoleId = Objects.requireNonNull(iamRoleId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipGroupIds(List<String> ipGroupIds) {
            this.ipGroupIds = Objects.requireNonNull(ipGroupIds);
            return this;
        }
        public Builder ipGroupIds(String... ipGroupIds) {
            return ipGroupIds(List.of(ipGroupIds));
        }
        public Builder registrationCode(String registrationCode) {
            this.registrationCode = Objects.requireNonNull(registrationCode);
            return this;
        }
        public Builder selfServicePermissions(List<GetDirectorySelfServicePermission> selfServicePermissions) {
            this.selfServicePermissions = Objects.requireNonNull(selfServicePermissions);
            return this;
        }
        public Builder selfServicePermissions(GetDirectorySelfServicePermission... selfServicePermissions) {
            return selfServicePermissions(List.of(selfServicePermissions));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder workspaceAccessProperties(List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties) {
            this.workspaceAccessProperties = Objects.requireNonNull(workspaceAccessProperties);
            return this;
        }
        public Builder workspaceAccessProperties(GetDirectoryWorkspaceAccessProperty... workspaceAccessProperties) {
            return workspaceAccessProperties(List.of(workspaceAccessProperties));
        }
        public Builder workspaceCreationProperties(List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties) {
            this.workspaceCreationProperties = Objects.requireNonNull(workspaceCreationProperties);
            return this;
        }
        public Builder workspaceCreationProperties(GetDirectoryWorkspaceCreationProperty... workspaceCreationProperties) {
            return workspaceCreationProperties(List.of(workspaceCreationProperties));
        }
        public Builder workspaceSecurityGroupId(String workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = Objects.requireNonNull(workspaceSecurityGroupId);
            return this;
        }        public GetDirectoryResult build() {
            return new GetDirectoryResult(alias, customerUserName, directoryId, directoryName, directoryType, dnsIpAddresses, iamRoleId, id, ipGroupIds, registrationCode, selfServicePermissions, subnetIds, tags, workspaceAccessProperties, workspaceCreationProperties, workspaceSecurityGroupId);
        }
    }
}
