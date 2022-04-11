// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.ServerPublicNetworkAccess;
import io.pulumi.azurenative.sql.inputs.ResourceIdentityArgs;
import io.pulumi.azurenative.sql.inputs.ServerExternalAdministratorArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * Administrator username for the server. Once created it cannot be changed.
     * 
     */
    @Import(name="administratorLogin")
      private final @Nullable Output<String> administratorLogin;

    public Output<String> getAdministratorLogin() {
        return this.administratorLogin == null ? Codegen.empty() : this.administratorLogin;
    }

    /**
     * The administrator login password (required for server creation).
     * 
     */
    @Import(name="administratorLoginPassword")
      private final @Nullable Output<String> administratorLoginPassword;

    public Output<String> getAdministratorLoginPassword() {
        return this.administratorLoginPassword == null ? Codegen.empty() : this.administratorLoginPassword;
    }

    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Import(name="administrators")
      private final @Nullable Output<ServerExternalAdministratorArgs> administrators;

    public Output<ServerExternalAdministratorArgs> getAdministrators() {
        return this.administrators == null ? Codegen.empty() : this.administrators;
    }

    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ResourceIdentityArgs> identity;

    public Output<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Minimal TLS version. Allowed values: '1.0', '1.1', '1.2'
     * 
     */
    @Import(name="minimalTlsVersion")
      private final @Nullable Output<String> minimalTlsVersion;

    public Output<String> getMinimalTlsVersion() {
        return this.minimalTlsVersion == null ? Codegen.empty() : this.minimalTlsVersion;
    }

    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @Import(name="primaryUserAssignedIdentityId")
      private final @Nullable Output<String> primaryUserAssignedIdentityId;

    public Output<String> getPrimaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId == null ? Codegen.empty() : this.primaryUserAssignedIdentityId;
    }

    /**
     * Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,ServerPublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,ServerPublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName")
      private final @Nullable Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName == null ? Codegen.empty() : this.serverName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The version of the server.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ServerArgs(
        @Nullable Output<String> administratorLogin,
        @Nullable Output<String> administratorLoginPassword,
        @Nullable Output<ServerExternalAdministratorArgs> administrators,
        @Nullable Output<ResourceIdentityArgs> identity,
        @Nullable Output<String> keyId,
        @Nullable Output<String> location,
        @Nullable Output<String> minimalTlsVersion,
        @Nullable Output<String> primaryUserAssignedIdentityId,
        @Nullable Output<Either<String,ServerPublicNetworkAccess>> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<String> serverName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> version) {
        this.administratorLogin = administratorLogin;
        this.administratorLoginPassword = administratorLoginPassword;
        this.administrators = administrators;
        this.identity = identity;
        this.keyId = keyId;
        this.location = location;
        this.minimalTlsVersion = minimalTlsVersion;
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = serverName;
        this.tags = tags;
        this.version = version;
    }

    private ServerArgs() {
        this.administratorLogin = Codegen.empty();
        this.administratorLoginPassword = Codegen.empty();
        this.administrators = Codegen.empty();
        this.identity = Codegen.empty();
        this.keyId = Codegen.empty();
        this.location = Codegen.empty();
        this.minimalTlsVersion = Codegen.empty();
        this.primaryUserAssignedIdentityId = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverName = Codegen.empty();
        this.tags = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> administratorLogin;
        private @Nullable Output<String> administratorLoginPassword;
        private @Nullable Output<ServerExternalAdministratorArgs> administrators;
        private @Nullable Output<ResourceIdentityArgs> identity;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> minimalTlsVersion;
        private @Nullable Output<String> primaryUserAssignedIdentityId;
        private @Nullable Output<Either<String,ServerPublicNetworkAccess>> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serverName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.administrators = defaults.administrators;
    	      this.identity = defaults.identity;
    	      this.keyId = defaults.keyId;
    	      this.location = defaults.location;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.primaryUserAssignedIdentityId = defaults.primaryUserAssignedIdentityId;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }
        public Builder administratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = Codegen.ofNullable(administratorLogin);
            return this;
        }
        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            this.administratorLoginPassword = administratorLoginPassword;
            return this;
        }
        public Builder administratorLoginPassword(@Nullable String administratorLoginPassword) {
            this.administratorLoginPassword = Codegen.ofNullable(administratorLoginPassword);
            return this;
        }
        public Builder administrators(@Nullable Output<ServerExternalAdministratorArgs> administrators) {
            this.administrators = administrators;
            return this;
        }
        public Builder administrators(@Nullable ServerExternalAdministratorArgs administrators) {
            this.administrators = Codegen.ofNullable(administrators);
            return this;
        }
        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Output<String> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }
        public Builder minimalTlsVersion(@Nullable String minimalTlsVersion) {
            this.minimalTlsVersion = Codegen.ofNullable(minimalTlsVersion);
            return this;
        }
        public Builder primaryUserAssignedIdentityId(@Nullable Output<String> primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }
        public Builder primaryUserAssignedIdentityId(@Nullable String primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = Codegen.ofNullable(primaryUserAssignedIdentityId);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,ServerPublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,ServerPublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
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
        public Builder serverName(@Nullable Output<String> serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = Codegen.ofNullable(serverName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ServerArgs build() {
            return new ServerArgs(administratorLogin, administratorLoginPassword, administrators, identity, keyId, location, minimalTlsVersion, primaryUserAssignedIdentityId, publicNetworkAccess, resourceGroupName, serverName, tags, version);
        }
    }
}
