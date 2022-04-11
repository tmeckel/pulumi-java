// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsGetArgs;
import io.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesGetArgs;
import io.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryState extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryState Empty = new DirectoryState();

    /**
     * The directory alias.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Codegen.empty() : this.alias;
    }

    /**
     * The user name for the service account.
     * 
     */
    @Import(name="customerUserName")
      private final @Nullable Output<String> customerUserName;

    public Output<String> getCustomerUserName() {
        return this.customerUserName == null ? Codegen.empty() : this.customerUserName;
    }

    /**
     * The directory identifier for registration in WorkSpaces service.
     * 
     */
    @Import(name="directoryId")
      private final @Nullable Output<String> directoryId;

    public Output<String> getDirectoryId() {
        return this.directoryId == null ? Codegen.empty() : this.directoryId;
    }

    /**
     * The name of the directory.
     * 
     */
    @Import(name="directoryName")
      private final @Nullable Output<String> directoryName;

    public Output<String> getDirectoryName() {
        return this.directoryName == null ? Codegen.empty() : this.directoryName;
    }

    /**
     * The directory type.
     * 
     */
    @Import(name="directoryType")
      private final @Nullable Output<String> directoryType;

    public Output<String> getDirectoryType() {
        return this.directoryType == null ? Codegen.empty() : this.directoryType;
    }

    /**
     * The IP addresses of the DNS servers for the directory.
     * 
     */
    @Import(name="dnsIpAddresses")
      private final @Nullable Output<List<String>> dnsIpAddresses;

    public Output<List<String>> getDnsIpAddresses() {
        return this.dnsIpAddresses == null ? Codegen.empty() : this.dnsIpAddresses;
    }

    /**
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    @Import(name="iamRoleId")
      private final @Nullable Output<String> iamRoleId;

    public Output<String> getIamRoleId() {
        return this.iamRoleId == null ? Codegen.empty() : this.iamRoleId;
    }

    /**
     * The identifiers of the IP access control groups associated with the directory.
     * 
     */
    @Import(name="ipGroupIds")
      private final @Nullable Output<List<String>> ipGroupIds;

    public Output<List<String>> getIpGroupIds() {
        return this.ipGroupIds == null ? Codegen.empty() : this.ipGroupIds;
    }

    /**
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    @Import(name="registrationCode")
      private final @Nullable Output<String> registrationCode;

    public Output<String> getRegistrationCode() {
        return this.registrationCode == null ? Codegen.empty() : this.registrationCode;
    }

    /**
     * Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    @Import(name="selfServicePermissions")
      private final @Nullable Output<DirectorySelfServicePermissionsGetArgs> selfServicePermissions;

    public Output<DirectorySelfServicePermissionsGetArgs> getSelfServicePermissions() {
        return this.selfServicePermissions == null ? Codegen.empty() : this.selfServicePermissions;
    }

    /**
     * The identifiers of the subnets where the directory resides.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    /**
     * A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    @Import(name="workspaceAccessProperties")
      private final @Nullable Output<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties;

    public Output<DirectoryWorkspaceAccessPropertiesGetArgs> getWorkspaceAccessProperties() {
        return this.workspaceAccessProperties == null ? Codegen.empty() : this.workspaceAccessProperties;
    }

    /**
     * Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    @Import(name="workspaceCreationProperties")
      private final @Nullable Output<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties;

    public Output<DirectoryWorkspaceCreationPropertiesGetArgs> getWorkspaceCreationProperties() {
        return this.workspaceCreationProperties == null ? Codegen.empty() : this.workspaceCreationProperties;
    }

    /**
     * The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    @Import(name="workspaceSecurityGroupId")
      private final @Nullable Output<String> workspaceSecurityGroupId;

    public Output<String> getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId == null ? Codegen.empty() : this.workspaceSecurityGroupId;
    }

    public DirectoryState(
        @Nullable Output<String> alias,
        @Nullable Output<String> customerUserName,
        @Nullable Output<String> directoryId,
        @Nullable Output<String> directoryName,
        @Nullable Output<String> directoryType,
        @Nullable Output<List<String>> dnsIpAddresses,
        @Nullable Output<String> iamRoleId,
        @Nullable Output<List<String>> ipGroupIds,
        @Nullable Output<String> registrationCode,
        @Nullable Output<DirectorySelfServicePermissionsGetArgs> selfServicePermissions,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties,
        @Nullable Output<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties,
        @Nullable Output<String> workspaceSecurityGroupId) {
        this.alias = alias;
        this.customerUserName = customerUserName;
        this.directoryId = directoryId;
        this.directoryName = directoryName;
        this.directoryType = directoryType;
        this.dnsIpAddresses = dnsIpAddresses;
        this.iamRoleId = iamRoleId;
        this.ipGroupIds = ipGroupIds;
        this.registrationCode = registrationCode;
        this.selfServicePermissions = selfServicePermissions;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.workspaceAccessProperties = workspaceAccessProperties;
        this.workspaceCreationProperties = workspaceCreationProperties;
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    private DirectoryState() {
        this.alias = Codegen.empty();
        this.customerUserName = Codegen.empty();
        this.directoryId = Codegen.empty();
        this.directoryName = Codegen.empty();
        this.directoryType = Codegen.empty();
        this.dnsIpAddresses = Codegen.empty();
        this.iamRoleId = Codegen.empty();
        this.ipGroupIds = Codegen.empty();
        this.registrationCode = Codegen.empty();
        this.selfServicePermissions = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.workspaceAccessProperties = Codegen.empty();
        this.workspaceCreationProperties = Codegen.empty();
        this.workspaceSecurityGroupId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<String> customerUserName;
        private @Nullable Output<String> directoryId;
        private @Nullable Output<String> directoryName;
        private @Nullable Output<String> directoryType;
        private @Nullable Output<List<String>> dnsIpAddresses;
        private @Nullable Output<String> iamRoleId;
        private @Nullable Output<List<String>> ipGroupIds;
        private @Nullable Output<String> registrationCode;
        private @Nullable Output<DirectorySelfServicePermissionsGetArgs> selfServicePermissions;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties;
        private @Nullable Output<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties;
        private @Nullable Output<String> workspaceSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.customerUserName = defaults.customerUserName;
    	      this.directoryId = defaults.directoryId;
    	      this.directoryName = defaults.directoryName;
    	      this.directoryType = defaults.directoryType;
    	      this.dnsIpAddresses = defaults.dnsIpAddresses;
    	      this.iamRoleId = defaults.iamRoleId;
    	      this.ipGroupIds = defaults.ipGroupIds;
    	      this.registrationCode = defaults.registrationCode;
    	      this.selfServicePermissions = defaults.selfServicePermissions;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.workspaceAccessProperties = defaults.workspaceAccessProperties;
    	      this.workspaceCreationProperties = defaults.workspaceCreationProperties;
    	      this.workspaceSecurityGroupId = defaults.workspaceSecurityGroupId;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Codegen.ofNullable(alias);
            return this;
        }
        public Builder customerUserName(@Nullable Output<String> customerUserName) {
            this.customerUserName = customerUserName;
            return this;
        }
        public Builder customerUserName(@Nullable String customerUserName) {
            this.customerUserName = Codegen.ofNullable(customerUserName);
            return this;
        }
        public Builder directoryId(@Nullable Output<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Builder directoryId(@Nullable String directoryId) {
            this.directoryId = Codegen.ofNullable(directoryId);
            return this;
        }
        public Builder directoryName(@Nullable Output<String> directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public Builder directoryName(@Nullable String directoryName) {
            this.directoryName = Codegen.ofNullable(directoryName);
            return this;
        }
        public Builder directoryType(@Nullable Output<String> directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public Builder directoryType(@Nullable String directoryType) {
            this.directoryType = Codegen.ofNullable(directoryType);
            return this;
        }
        public Builder dnsIpAddresses(@Nullable Output<List<String>> dnsIpAddresses) {
            this.dnsIpAddresses = dnsIpAddresses;
            return this;
        }
        public Builder dnsIpAddresses(@Nullable List<String> dnsIpAddresses) {
            this.dnsIpAddresses = Codegen.ofNullable(dnsIpAddresses);
            return this;
        }
        public Builder dnsIpAddresses(String... dnsIpAddresses) {
            return dnsIpAddresses(List.of(dnsIpAddresses));
        }
        public Builder iamRoleId(@Nullable Output<String> iamRoleId) {
            this.iamRoleId = iamRoleId;
            return this;
        }
        public Builder iamRoleId(@Nullable String iamRoleId) {
            this.iamRoleId = Codegen.ofNullable(iamRoleId);
            return this;
        }
        public Builder ipGroupIds(@Nullable Output<List<String>> ipGroupIds) {
            this.ipGroupIds = ipGroupIds;
            return this;
        }
        public Builder ipGroupIds(@Nullable List<String> ipGroupIds) {
            this.ipGroupIds = Codegen.ofNullable(ipGroupIds);
            return this;
        }
        public Builder ipGroupIds(String... ipGroupIds) {
            return ipGroupIds(List.of(ipGroupIds));
        }
        public Builder registrationCode(@Nullable Output<String> registrationCode) {
            this.registrationCode = registrationCode;
            return this;
        }
        public Builder registrationCode(@Nullable String registrationCode) {
            this.registrationCode = Codegen.ofNullable(registrationCode);
            return this;
        }
        public Builder selfServicePermissions(@Nullable Output<DirectorySelfServicePermissionsGetArgs> selfServicePermissions) {
            this.selfServicePermissions = selfServicePermissions;
            return this;
        }
        public Builder selfServicePermissions(@Nullable DirectorySelfServicePermissionsGetArgs selfServicePermissions) {
            this.selfServicePermissions = Codegen.ofNullable(selfServicePermissions);
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder workspaceAccessProperties(@Nullable Output<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties) {
            this.workspaceAccessProperties = workspaceAccessProperties;
            return this;
        }
        public Builder workspaceAccessProperties(@Nullable DirectoryWorkspaceAccessPropertiesGetArgs workspaceAccessProperties) {
            this.workspaceAccessProperties = Codegen.ofNullable(workspaceAccessProperties);
            return this;
        }
        public Builder workspaceCreationProperties(@Nullable Output<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties) {
            this.workspaceCreationProperties = workspaceCreationProperties;
            return this;
        }
        public Builder workspaceCreationProperties(@Nullable DirectoryWorkspaceCreationPropertiesGetArgs workspaceCreationProperties) {
            this.workspaceCreationProperties = Codegen.ofNullable(workspaceCreationProperties);
            return this;
        }
        public Builder workspaceSecurityGroupId(@Nullable Output<String> workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = workspaceSecurityGroupId;
            return this;
        }
        public Builder workspaceSecurityGroupId(@Nullable String workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = Codegen.ofNullable(workspaceSecurityGroupId);
            return this;
        }        public DirectoryState build() {
            return new DirectoryState(alias, customerUserName, directoryId, directoryName, directoryType, dnsIpAddresses, iamRoleId, ipGroupIds, registrationCode, selfServicePermissions, subnetIds, tags, tagsAll, workspaceAccessProperties, workspaceCreationProperties, workspaceSecurityGroupId);
        }
    }
}
