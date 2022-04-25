// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.enums.DirectoryType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The security profile which contains Ssh public key for the HDInsight cluster.
 * 
 */
public final class SecurityProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityProfileArgs Empty = new SecurityProfileArgs();

    /**
     * The resource ID of the user&#39;s Azure Active Directory Domain Service.
     * 
     */
    @Import(name="aaddsResourceId")
    private @Nullable Output<String> aaddsResourceId;

    /**
     * @return The resource ID of the user&#39;s Azure Active Directory Domain Service.
     * 
     */
    public Optional<Output<String>> aaddsResourceId() {
        return Optional.ofNullable(this.aaddsResourceId);
    }

    /**
     * Optional. The Distinguished Names for cluster user groups
     * 
     */
    @Import(name="clusterUsersGroupDNs")
    private @Nullable Output<List<String>> clusterUsersGroupDNs;

    /**
     * @return Optional. The Distinguished Names for cluster user groups
     * 
     */
    public Optional<Output<List<String>>> clusterUsersGroupDNs() {
        return Optional.ofNullable(this.clusterUsersGroupDNs);
    }

    /**
     * The directory type.
     * 
     */
    @Import(name="directoryType")
    private @Nullable Output<DirectoryType> directoryType;

    /**
     * @return The directory type.
     * 
     */
    public Optional<Output<DirectoryType>> directoryType() {
        return Optional.ofNullable(this.directoryType);
    }

    /**
     * The organization&#39;s active directory domain.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The organization&#39;s active directory domain.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The domain admin password.
     * 
     */
    @Import(name="domainUserPassword")
    private @Nullable Output<String> domainUserPassword;

    /**
     * @return The domain admin password.
     * 
     */
    public Optional<Output<String>> domainUserPassword() {
        return Optional.ofNullable(this.domainUserPassword);
    }

    /**
     * The domain user account that will have admin privileges on the cluster.
     * 
     */
    @Import(name="domainUsername")
    private @Nullable Output<String> domainUsername;

    /**
     * @return The domain user account that will have admin privileges on the cluster.
     * 
     */
    public Optional<Output<String>> domainUsername() {
        return Optional.ofNullable(this.domainUsername);
    }

    /**
     * The LDAPS protocol URLs to communicate with the Active Directory.
     * 
     */
    @Import(name="ldapsUrls")
    private @Nullable Output<List<String>> ldapsUrls;

    /**
     * @return The LDAPS protocol URLs to communicate with the Active Directory.
     * 
     */
    public Optional<Output<List<String>>> ldapsUrls() {
        return Optional.ofNullable(this.ldapsUrls);
    }

    /**
     * User assigned identity that has permissions to read and create cluster-related artifacts in the user&#39;s AADDS.
     * 
     */
    @Import(name="msiResourceId")
    private @Nullable Output<String> msiResourceId;

    /**
     * @return User assigned identity that has permissions to read and create cluster-related artifacts in the user&#39;s AADDS.
     * 
     */
    public Optional<Output<String>> msiResourceId() {
        return Optional.ofNullable(this.msiResourceId);
    }

    /**
     * The organizational unit within the Active Directory to place the cluster and service accounts.
     * 
     */
    @Import(name="organizationalUnitDN")
    private @Nullable Output<String> organizationalUnitDN;

    /**
     * @return The organizational unit within the Active Directory to place the cluster and service accounts.
     * 
     */
    public Optional<Output<String>> organizationalUnitDN() {
        return Optional.ofNullable(this.organizationalUnitDN);
    }

    private SecurityProfileArgs() {}

    private SecurityProfileArgs(SecurityProfileArgs $) {
        this.aaddsResourceId = $.aaddsResourceId;
        this.clusterUsersGroupDNs = $.clusterUsersGroupDNs;
        this.directoryType = $.directoryType;
        this.domain = $.domain;
        this.domainUserPassword = $.domainUserPassword;
        this.domainUsername = $.domainUsername;
        this.ldapsUrls = $.ldapsUrls;
        this.msiResourceId = $.msiResourceId;
        this.organizationalUnitDN = $.organizationalUnitDN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityProfileArgs $;

        public Builder() {
            $ = new SecurityProfileArgs();
        }

        public Builder(SecurityProfileArgs defaults) {
            $ = new SecurityProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aaddsResourceId The resource ID of the user&#39;s Azure Active Directory Domain Service.
         * 
         * @return builder
         * 
         */
        public Builder aaddsResourceId(@Nullable Output<String> aaddsResourceId) {
            $.aaddsResourceId = aaddsResourceId;
            return this;
        }

        /**
         * @param aaddsResourceId The resource ID of the user&#39;s Azure Active Directory Domain Service.
         * 
         * @return builder
         * 
         */
        public Builder aaddsResourceId(String aaddsResourceId) {
            return aaddsResourceId(Output.of(aaddsResourceId));
        }

        /**
         * @param clusterUsersGroupDNs Optional. The Distinguished Names for cluster user groups
         * 
         * @return builder
         * 
         */
        public Builder clusterUsersGroupDNs(@Nullable Output<List<String>> clusterUsersGroupDNs) {
            $.clusterUsersGroupDNs = clusterUsersGroupDNs;
            return this;
        }

        /**
         * @param clusterUsersGroupDNs Optional. The Distinguished Names for cluster user groups
         * 
         * @return builder
         * 
         */
        public Builder clusterUsersGroupDNs(List<String> clusterUsersGroupDNs) {
            return clusterUsersGroupDNs(Output.of(clusterUsersGroupDNs));
        }

        /**
         * @param clusterUsersGroupDNs Optional. The Distinguished Names for cluster user groups
         * 
         * @return builder
         * 
         */
        public Builder clusterUsersGroupDNs(String... clusterUsersGroupDNs) {
            return clusterUsersGroupDNs(List.of(clusterUsersGroupDNs));
        }

        /**
         * @param directoryType The directory type.
         * 
         * @return builder
         * 
         */
        public Builder directoryType(@Nullable Output<DirectoryType> directoryType) {
            $.directoryType = directoryType;
            return this;
        }

        /**
         * @param directoryType The directory type.
         * 
         * @return builder
         * 
         */
        public Builder directoryType(DirectoryType directoryType) {
            return directoryType(Output.of(directoryType));
        }

        /**
         * @param domain The organization&#39;s active directory domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The organization&#39;s active directory domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param domainUserPassword The domain admin password.
         * 
         * @return builder
         * 
         */
        public Builder domainUserPassword(@Nullable Output<String> domainUserPassword) {
            $.domainUserPassword = domainUserPassword;
            return this;
        }

        /**
         * @param domainUserPassword The domain admin password.
         * 
         * @return builder
         * 
         */
        public Builder domainUserPassword(String domainUserPassword) {
            return domainUserPassword(Output.of(domainUserPassword));
        }

        /**
         * @param domainUsername The domain user account that will have admin privileges on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder domainUsername(@Nullable Output<String> domainUsername) {
            $.domainUsername = domainUsername;
            return this;
        }

        /**
         * @param domainUsername The domain user account that will have admin privileges on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder domainUsername(String domainUsername) {
            return domainUsername(Output.of(domainUsername));
        }

        /**
         * @param ldapsUrls The LDAPS protocol URLs to communicate with the Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder ldapsUrls(@Nullable Output<List<String>> ldapsUrls) {
            $.ldapsUrls = ldapsUrls;
            return this;
        }

        /**
         * @param ldapsUrls The LDAPS protocol URLs to communicate with the Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder ldapsUrls(List<String> ldapsUrls) {
            return ldapsUrls(Output.of(ldapsUrls));
        }

        /**
         * @param ldapsUrls The LDAPS protocol URLs to communicate with the Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder ldapsUrls(String... ldapsUrls) {
            return ldapsUrls(List.of(ldapsUrls));
        }

        /**
         * @param msiResourceId User assigned identity that has permissions to read and create cluster-related artifacts in the user&#39;s AADDS.
         * 
         * @return builder
         * 
         */
        public Builder msiResourceId(@Nullable Output<String> msiResourceId) {
            $.msiResourceId = msiResourceId;
            return this;
        }

        /**
         * @param msiResourceId User assigned identity that has permissions to read and create cluster-related artifacts in the user&#39;s AADDS.
         * 
         * @return builder
         * 
         */
        public Builder msiResourceId(String msiResourceId) {
            return msiResourceId(Output.of(msiResourceId));
        }

        /**
         * @param organizationalUnitDN The organizational unit within the Active Directory to place the cluster and service accounts.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDN(@Nullable Output<String> organizationalUnitDN) {
            $.organizationalUnitDN = organizationalUnitDN;
            return this;
        }

        /**
         * @param organizationalUnitDN The organizational unit within the Active Directory to place the cluster and service accounts.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDN(String organizationalUnitDN) {
            return organizationalUnitDN(Output.of(organizationalUnitDN));
        }

        public SecurityProfileArgs build() {
            return $;
        }
    }

}
