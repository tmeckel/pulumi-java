// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterKerberosAttributesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterKerberosAttributesGetArgs Empty = new ClusterKerberosAttributesGetArgs();

    /**
     * Active Directory password for `ad_domain_join_user`. This provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="adDomainJoinPassword")
      private final @Nullable Input<String> adDomainJoinPassword;

    public Input<String> getAdDomainJoinPassword() {
        return this.adDomainJoinPassword == null ? Input.empty() : this.adDomainJoinPassword;
    }

    /**
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="adDomainJoinUser")
      private final @Nullable Input<String> adDomainJoinUser;

    public Input<String> getAdDomainJoinUser() {
        return this.adDomainJoinUser == null ? Input.empty() : this.adDomainJoinUser;
    }

    /**
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="crossRealmTrustPrincipalPassword")
      private final @Nullable Input<String> crossRealmTrustPrincipalPassword;

    public Input<String> getCrossRealmTrustPrincipalPassword() {
        return this.crossRealmTrustPrincipalPassword == null ? Input.empty() : this.crossRealmTrustPrincipalPassword;
    }

    /**
     * Password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="kdcAdminPassword", required=true)
      private final Input<String> kdcAdminPassword;

    public Input<String> getKdcAdminPassword() {
        return this.kdcAdminPassword;
    }

    /**
     * Name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
     * 
     */
    @InputImport(name="realm", required=true)
      private final Input<String> realm;

    public Input<String> getRealm() {
        return this.realm;
    }

    public ClusterKerberosAttributesGetArgs(
        @Nullable Input<String> adDomainJoinPassword,
        @Nullable Input<String> adDomainJoinUser,
        @Nullable Input<String> crossRealmTrustPrincipalPassword,
        Input<String> kdcAdminPassword,
        Input<String> realm) {
        this.adDomainJoinPassword = adDomainJoinPassword;
        this.adDomainJoinUser = adDomainJoinUser;
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
        this.kdcAdminPassword = Objects.requireNonNull(kdcAdminPassword, "expected parameter 'kdcAdminPassword' to be non-null");
        this.realm = Objects.requireNonNull(realm, "expected parameter 'realm' to be non-null");
    }

    private ClusterKerberosAttributesGetArgs() {
        this.adDomainJoinPassword = Input.empty();
        this.adDomainJoinUser = Input.empty();
        this.crossRealmTrustPrincipalPassword = Input.empty();
        this.kdcAdminPassword = Input.empty();
        this.realm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKerberosAttributesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> adDomainJoinPassword;
        private @Nullable Input<String> adDomainJoinUser;
        private @Nullable Input<String> crossRealmTrustPrincipalPassword;
        private Input<String> kdcAdminPassword;
        private Input<String> realm;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKerberosAttributesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adDomainJoinPassword = defaults.adDomainJoinPassword;
    	      this.adDomainJoinUser = defaults.adDomainJoinUser;
    	      this.crossRealmTrustPrincipalPassword = defaults.crossRealmTrustPrincipalPassword;
    	      this.kdcAdminPassword = defaults.kdcAdminPassword;
    	      this.realm = defaults.realm;
        }

        public Builder adDomainJoinPassword(@Nullable Input<String> adDomainJoinPassword) {
            this.adDomainJoinPassword = adDomainJoinPassword;
            return this;
        }

        public Builder adDomainJoinPassword(@Nullable String adDomainJoinPassword) {
            this.adDomainJoinPassword = Input.ofNullable(adDomainJoinPassword);
            return this;
        }

        public Builder adDomainJoinUser(@Nullable Input<String> adDomainJoinUser) {
            this.adDomainJoinUser = adDomainJoinUser;
            return this;
        }

        public Builder adDomainJoinUser(@Nullable String adDomainJoinUser) {
            this.adDomainJoinUser = Input.ofNullable(adDomainJoinUser);
            return this;
        }

        public Builder crossRealmTrustPrincipalPassword(@Nullable Input<String> crossRealmTrustPrincipalPassword) {
            this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
            return this;
        }

        public Builder crossRealmTrustPrincipalPassword(@Nullable String crossRealmTrustPrincipalPassword) {
            this.crossRealmTrustPrincipalPassword = Input.ofNullable(crossRealmTrustPrincipalPassword);
            return this;
        }

        public Builder kdcAdminPassword(Input<String> kdcAdminPassword) {
            this.kdcAdminPassword = Objects.requireNonNull(kdcAdminPassword);
            return this;
        }

        public Builder kdcAdminPassword(String kdcAdminPassword) {
            this.kdcAdminPassword = Input.of(Objects.requireNonNull(kdcAdminPassword));
            return this;
        }

        public Builder realm(Input<String> realm) {
            this.realm = Objects.requireNonNull(realm);
            return this;
        }

        public Builder realm(String realm) {
            this.realm = Input.of(Objects.requireNonNull(realm));
            return this;
        }
        public ClusterKerberosAttributesGetArgs build() {
            return new ClusterKerberosAttributesGetArgs(adDomainJoinPassword, adDomainJoinUser, crossRealmTrustPrincipalPassword, kdcAdminPassword, realm);
        }
    }
}
