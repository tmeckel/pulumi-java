// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BrokerLdapServerMetadata {
    /**
     * List of a fully qualified domain name of the LDAP server and an optional failover server.
     * 
     */
    private final @Nullable List<String> hosts;
    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
     */
    private final @Nullable String roleBase;
    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
     * 
     */
    private final @Nullable String roleName;
    /**
     * Search criteria for groups.
     * 
     */
    private final @Nullable String roleSearchMatching;
    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
     */
    private final @Nullable Boolean roleSearchSubtree;
    /**
     * Service account password.
     * 
     */
    private final @Nullable String serviceAccountPassword;
    /**
     * Service account username.
     * 
     */
    private final @Nullable String serviceAccountUsername;
    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
     */
    private final @Nullable String userBase;
    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
     */
    private final @Nullable String userRoleName;
    /**
     * Search criteria for users.
     * 
     */
    private final @Nullable String userSearchMatching;
    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
     */
    private final @Nullable Boolean userSearchSubtree;

    @OutputCustomType.Constructor
    private BrokerLdapServerMetadata(
        @OutputCustomType.Parameter("hosts") @Nullable List<String> hosts,
        @OutputCustomType.Parameter("roleBase") @Nullable String roleBase,
        @OutputCustomType.Parameter("roleName") @Nullable String roleName,
        @OutputCustomType.Parameter("roleSearchMatching") @Nullable String roleSearchMatching,
        @OutputCustomType.Parameter("roleSearchSubtree") @Nullable Boolean roleSearchSubtree,
        @OutputCustomType.Parameter("serviceAccountPassword") @Nullable String serviceAccountPassword,
        @OutputCustomType.Parameter("serviceAccountUsername") @Nullable String serviceAccountUsername,
        @OutputCustomType.Parameter("userBase") @Nullable String userBase,
        @OutputCustomType.Parameter("userRoleName") @Nullable String userRoleName,
        @OutputCustomType.Parameter("userSearchMatching") @Nullable String userSearchMatching,
        @OutputCustomType.Parameter("userSearchSubtree") @Nullable Boolean userSearchSubtree) {
        this.hosts = hosts;
        this.roleBase = roleBase;
        this.roleName = roleName;
        this.roleSearchMatching = roleSearchMatching;
        this.roleSearchSubtree = roleSearchSubtree;
        this.serviceAccountPassword = serviceAccountPassword;
        this.serviceAccountUsername = serviceAccountUsername;
        this.userBase = userBase;
        this.userRoleName = userRoleName;
        this.userSearchMatching = userSearchMatching;
        this.userSearchSubtree = userSearchSubtree;
    }

    /**
     * List of a fully qualified domain name of the LDAP server and an optional failover server.
     * 
    */
    public List<String> getHosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
    */
    public Optional<String> getRoleBase() {
        return Optional.ofNullable(this.roleBase);
    }
    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
     * 
    */
    public Optional<String> getRoleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * Search criteria for groups.
     * 
    */
    public Optional<String> getRoleSearchMatching() {
        return Optional.ofNullable(this.roleSearchMatching);
    }
    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
    */
    public Optional<Boolean> getRoleSearchSubtree() {
        return Optional.ofNullable(this.roleSearchSubtree);
    }
    /**
     * Service account password.
     * 
    */
    public Optional<String> getServiceAccountPassword() {
        return Optional.ofNullable(this.serviceAccountPassword);
    }
    /**
     * Service account username.
     * 
    */
    public Optional<String> getServiceAccountUsername() {
        return Optional.ofNullable(this.serviceAccountUsername);
    }
    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
    */
    public Optional<String> getUserBase() {
        return Optional.ofNullable(this.userBase);
    }
    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
    */
    public Optional<String> getUserRoleName() {
        return Optional.ofNullable(this.userRoleName);
    }
    /**
     * Search criteria for users.
     * 
    */
    public Optional<String> getUserSearchMatching() {
        return Optional.ofNullable(this.userSearchMatching);
    }
    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
    */
    public Optional<Boolean> getUserSearchSubtree() {
        return Optional.ofNullable(this.userSearchSubtree);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerLdapServerMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> hosts;
        private @Nullable String roleBase;
        private @Nullable String roleName;
        private @Nullable String roleSearchMatching;
        private @Nullable Boolean roleSearchSubtree;
        private @Nullable String serviceAccountPassword;
        private @Nullable String serviceAccountUsername;
        private @Nullable String userBase;
        private @Nullable String userRoleName;
        private @Nullable String userSearchMatching;
        private @Nullable Boolean userSearchSubtree;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerLdapServerMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.roleBase = defaults.roleBase;
    	      this.roleName = defaults.roleName;
    	      this.roleSearchMatching = defaults.roleSearchMatching;
    	      this.roleSearchSubtree = defaults.roleSearchSubtree;
    	      this.serviceAccountPassword = defaults.serviceAccountPassword;
    	      this.serviceAccountUsername = defaults.serviceAccountUsername;
    	      this.userBase = defaults.userBase;
    	      this.userRoleName = defaults.userRoleName;
    	      this.userSearchMatching = defaults.userSearchMatching;
    	      this.userSearchSubtree = defaults.userSearchSubtree;
        }

        public Builder hosts(@Nullable List<String> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder roleBase(@Nullable String roleBase) {
            this.roleBase = roleBase;
            return this;
        }

        public Builder roleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder roleSearchMatching(@Nullable String roleSearchMatching) {
            this.roleSearchMatching = roleSearchMatching;
            return this;
        }

        public Builder roleSearchSubtree(@Nullable Boolean roleSearchSubtree) {
            this.roleSearchSubtree = roleSearchSubtree;
            return this;
        }

        public Builder serviceAccountPassword(@Nullable String serviceAccountPassword) {
            this.serviceAccountPassword = serviceAccountPassword;
            return this;
        }

        public Builder serviceAccountUsername(@Nullable String serviceAccountUsername) {
            this.serviceAccountUsername = serviceAccountUsername;
            return this;
        }

        public Builder userBase(@Nullable String userBase) {
            this.userBase = userBase;
            return this;
        }

        public Builder userRoleName(@Nullable String userRoleName) {
            this.userRoleName = userRoleName;
            return this;
        }

        public Builder userSearchMatching(@Nullable String userSearchMatching) {
            this.userSearchMatching = userSearchMatching;
            return this;
        }

        public Builder userSearchSubtree(@Nullable Boolean userSearchSubtree) {
            this.userSearchSubtree = userSearchSubtree;
            return this;
        }
        public BrokerLdapServerMetadata build() {
            return new BrokerLdapServerMetadata(hosts, roleBase, roleName, roleSearchMatching, roleSearchSubtree, serviceAccountPassword, serviceAccountUsername, userBase, userRoleName, userSearchMatching, userSearchSubtree);
        }
    }
}
