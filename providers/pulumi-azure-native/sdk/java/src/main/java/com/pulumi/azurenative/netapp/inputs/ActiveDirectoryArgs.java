// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Active Directory
 * 
 */
public final class ActiveDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActiveDirectoryArgs Empty = new ActiveDirectoryArgs();

    /**
     * Id of the Active Directory
     * 
     */
    @Import(name="activeDirectoryId")
    private @Nullable Output<String> activeDirectoryId;

    /**
     * @return Id of the Active Directory
     * 
     */
    public Optional<Output<String>> activeDirectoryId() {
        return Optional.ofNullable(this.activeDirectoryId);
    }

    /**
     * Name of the active directory machine. This optional parameter is used only while creating kerberos volume
     * 
     */
    @Import(name="adName")
    private @Nullable Output<String> adName;

    /**
     * @return Name of the active directory machine. This optional parameter is used only while creating kerberos volume
     * 
     */
    public Optional<Output<String>> adName() {
        return Optional.ofNullable(this.adName);
    }

    /**
     * If enabled, AES encryption will be enabled for SMB communication.
     * 
     */
    @Import(name="aesEncryption")
    private @Nullable Output<Boolean> aesEncryption;

    /**
     * @return If enabled, AES encryption will be enabled for SMB communication.
     * 
     */
    public Optional<Output<Boolean>> aesEncryption() {
        return Optional.ofNullable(this.aesEncryption);
    }

    /**
     *  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
     * 
     */
    @Import(name="allowLocalNfsUsersWithLdap")
    private @Nullable Output<Boolean> allowLocalNfsUsersWithLdap;

    /**
     * @return  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
     * 
     */
    public Optional<Output<Boolean>> allowLocalNfsUsersWithLdap() {
        return Optional.ofNullable(this.allowLocalNfsUsersWithLdap);
    }

    /**
     * Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
     * 
     */
    @Import(name="backupOperators")
    private @Nullable Output<List<String>> backupOperators;

    /**
     * @return Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
     * 
     */
    public Optional<Output<List<String>>> backupOperators() {
        return Optional.ofNullable(this.backupOperators);
    }

    /**
     * Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
     * 
     */
    @Import(name="dns")
    private @Nullable Output<String> dns;

    /**
     * @return Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
     * 
     */
    public Optional<Output<String>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * Name of the Active Directory domain
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Name of the Active Directory domain
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
     * 
     */
    @Import(name="kdcIP")
    private @Nullable Output<String> kdcIP;

    /**
     * @return kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
     * 
     */
    public Optional<Output<String>> kdcIP() {
        return Optional.ofNullable(this.kdcIP);
    }

    /**
     * Specifies whether or not the LDAP traffic needs to be secured via TLS.
     * 
     */
    @Import(name="ldapOverTLS")
    private @Nullable Output<Boolean> ldapOverTLS;

    /**
     * @return Specifies whether or not the LDAP traffic needs to be secured via TLS.
     * 
     */
    public Optional<Output<Boolean>> ldapOverTLS() {
        return Optional.ofNullable(this.ldapOverTLS);
    }

    /**
     * Specifies whether or not the LDAP traffic needs to be signed.
     * 
     */
    @Import(name="ldapSigning")
    private @Nullable Output<Boolean> ldapSigning;

    /**
     * @return Specifies whether or not the LDAP traffic needs to be signed.
     * 
     */
    public Optional<Output<Boolean>> ldapSigning() {
        return Optional.ofNullable(this.ldapSigning);
    }

    /**
     * The Organizational Unit (OU) within the Windows Active Directory
     * 
     */
    @Import(name="organizationalUnit")
    private @Nullable Output<String> organizationalUnit;

    /**
     * @return The Organizational Unit (OU) within the Windows Active Directory
     * 
     */
    public Optional<Output<String>> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }

    /**
     * Plain text password of Active Directory domain administrator, value is masked in the response
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Plain text password of Active Directory domain administrator, value is masked in the response
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
     * 
     */
    @Import(name="securityOperators")
    private @Nullable Output<List<String>> securityOperators;

    /**
     * @return Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
     * 
     */
    public Optional<Output<List<String>>> securityOperators() {
        return Optional.ofNullable(this.securityOperators);
    }

    /**
     * When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service&#39;s self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
     * 
     */
    @Import(name="serverRootCACertificate")
    private @Nullable Output<String> serverRootCACertificate;

    /**
     * @return When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service&#39;s self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
     * 
     */
    public Optional<Output<String>> serverRootCACertificate() {
        return Optional.ofNullable(this.serverRootCACertificate);
    }

    /**
     * The Active Directory site the service will limit Domain Controller discovery to
     * 
     */
    @Import(name="site")
    private @Nullable Output<String> site;

    /**
     * @return The Active Directory site the service will limit Domain Controller discovery to
     * 
     */
    public Optional<Output<String>> site() {
        return Optional.ofNullable(this.site);
    }

    /**
     * NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
     * 
     */
    @Import(name="smbServerName")
    private @Nullable Output<String> smbServerName;

    /**
     * @return NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
     * 
     */
    public Optional<Output<String>> smbServerName() {
        return Optional.ofNullable(this.smbServerName);
    }

    /**
     * Username of Active Directory domain administrator
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username of Active Directory domain administrator
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ActiveDirectoryArgs() {}

    private ActiveDirectoryArgs(ActiveDirectoryArgs $) {
        this.activeDirectoryId = $.activeDirectoryId;
        this.adName = $.adName;
        this.aesEncryption = $.aesEncryption;
        this.allowLocalNfsUsersWithLdap = $.allowLocalNfsUsersWithLdap;
        this.backupOperators = $.backupOperators;
        this.dns = $.dns;
        this.domain = $.domain;
        this.kdcIP = $.kdcIP;
        this.ldapOverTLS = $.ldapOverTLS;
        this.ldapSigning = $.ldapSigning;
        this.organizationalUnit = $.organizationalUnit;
        this.password = $.password;
        this.securityOperators = $.securityOperators;
        this.serverRootCACertificate = $.serverRootCACertificate;
        this.site = $.site;
        this.smbServerName = $.smbServerName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActiveDirectoryArgs $;

        public Builder() {
            $ = new ActiveDirectoryArgs();
        }

        public Builder(ActiveDirectoryArgs defaults) {
            $ = new ActiveDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectoryId Id of the Active Directory
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryId(@Nullable Output<String> activeDirectoryId) {
            $.activeDirectoryId = activeDirectoryId;
            return this;
        }

        /**
         * @param activeDirectoryId Id of the Active Directory
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryId(String activeDirectoryId) {
            return activeDirectoryId(Output.of(activeDirectoryId));
        }

        /**
         * @param adName Name of the active directory machine. This optional parameter is used only while creating kerberos volume
         * 
         * @return builder
         * 
         */
        public Builder adName(@Nullable Output<String> adName) {
            $.adName = adName;
            return this;
        }

        /**
         * @param adName Name of the active directory machine. This optional parameter is used only while creating kerberos volume
         * 
         * @return builder
         * 
         */
        public Builder adName(String adName) {
            return adName(Output.of(adName));
        }

        /**
         * @param aesEncryption If enabled, AES encryption will be enabled for SMB communication.
         * 
         * @return builder
         * 
         */
        public Builder aesEncryption(@Nullable Output<Boolean> aesEncryption) {
            $.aesEncryption = aesEncryption;
            return this;
        }

        /**
         * @param aesEncryption If enabled, AES encryption will be enabled for SMB communication.
         * 
         * @return builder
         * 
         */
        public Builder aesEncryption(Boolean aesEncryption) {
            return aesEncryption(Output.of(aesEncryption));
        }

        /**
         * @param allowLocalNfsUsersWithLdap  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
         * 
         * @return builder
         * 
         */
        public Builder allowLocalNfsUsersWithLdap(@Nullable Output<Boolean> allowLocalNfsUsersWithLdap) {
            $.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
            return this;
        }

        /**
         * @param allowLocalNfsUsersWithLdap  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
         * 
         * @return builder
         * 
         */
        public Builder allowLocalNfsUsersWithLdap(Boolean allowLocalNfsUsersWithLdap) {
            return allowLocalNfsUsersWithLdap(Output.of(allowLocalNfsUsersWithLdap));
        }

        /**
         * @param backupOperators Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
         * 
         * @return builder
         * 
         */
        public Builder backupOperators(@Nullable Output<List<String>> backupOperators) {
            $.backupOperators = backupOperators;
            return this;
        }

        /**
         * @param backupOperators Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
         * 
         * @return builder
         * 
         */
        public Builder backupOperators(List<String> backupOperators) {
            return backupOperators(Output.of(backupOperators));
        }

        /**
         * @param backupOperators Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
         * 
         * @return builder
         * 
         */
        public Builder backupOperators(String... backupOperators) {
            return backupOperators(List.of(backupOperators));
        }

        /**
         * @param dns Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable Output<String> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
         * 
         * @return builder
         * 
         */
        public Builder dns(String dns) {
            return dns(Output.of(dns));
        }

        /**
         * @param domain Name of the Active Directory domain
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Name of the Active Directory domain
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param kdcIP kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
         * 
         * @return builder
         * 
         */
        public Builder kdcIP(@Nullable Output<String> kdcIP) {
            $.kdcIP = kdcIP;
            return this;
        }

        /**
         * @param kdcIP kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
         * 
         * @return builder
         * 
         */
        public Builder kdcIP(String kdcIP) {
            return kdcIP(Output.of(kdcIP));
        }

        /**
         * @param ldapOverTLS Specifies whether or not the LDAP traffic needs to be secured via TLS.
         * 
         * @return builder
         * 
         */
        public Builder ldapOverTLS(@Nullable Output<Boolean> ldapOverTLS) {
            $.ldapOverTLS = ldapOverTLS;
            return this;
        }

        /**
         * @param ldapOverTLS Specifies whether or not the LDAP traffic needs to be secured via TLS.
         * 
         * @return builder
         * 
         */
        public Builder ldapOverTLS(Boolean ldapOverTLS) {
            return ldapOverTLS(Output.of(ldapOverTLS));
        }

        /**
         * @param ldapSigning Specifies whether or not the LDAP traffic needs to be signed.
         * 
         * @return builder
         * 
         */
        public Builder ldapSigning(@Nullable Output<Boolean> ldapSigning) {
            $.ldapSigning = ldapSigning;
            return this;
        }

        /**
         * @param ldapSigning Specifies whether or not the LDAP traffic needs to be signed.
         * 
         * @return builder
         * 
         */
        public Builder ldapSigning(Boolean ldapSigning) {
            return ldapSigning(Output.of(ldapSigning));
        }

        /**
         * @param organizationalUnit The Organizational Unit (OU) within the Windows Active Directory
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            $.organizationalUnit = organizationalUnit;
            return this;
        }

        /**
         * @param organizationalUnit The Organizational Unit (OU) within the Windows Active Directory
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnit(String organizationalUnit) {
            return organizationalUnit(Output.of(organizationalUnit));
        }

        /**
         * @param password Plain text password of Active Directory domain administrator, value is masked in the response
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Plain text password of Active Directory domain administrator, value is masked in the response
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param securityOperators Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
         * 
         * @return builder
         * 
         */
        public Builder securityOperators(@Nullable Output<List<String>> securityOperators) {
            $.securityOperators = securityOperators;
            return this;
        }

        /**
         * @param securityOperators Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
         * 
         * @return builder
         * 
         */
        public Builder securityOperators(List<String> securityOperators) {
            return securityOperators(Output.of(securityOperators));
        }

        /**
         * @param securityOperators Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
         * 
         * @return builder
         * 
         */
        public Builder securityOperators(String... securityOperators) {
            return securityOperators(List.of(securityOperators));
        }

        /**
         * @param serverRootCACertificate When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service&#39;s self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
         * 
         * @return builder
         * 
         */
        public Builder serverRootCACertificate(@Nullable Output<String> serverRootCACertificate) {
            $.serverRootCACertificate = serverRootCACertificate;
            return this;
        }

        /**
         * @param serverRootCACertificate When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service&#39;s self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
         * 
         * @return builder
         * 
         */
        public Builder serverRootCACertificate(String serverRootCACertificate) {
            return serverRootCACertificate(Output.of(serverRootCACertificate));
        }

        /**
         * @param site The Active Directory site the service will limit Domain Controller discovery to
         * 
         * @return builder
         * 
         */
        public Builder site(@Nullable Output<String> site) {
            $.site = site;
            return this;
        }

        /**
         * @param site The Active Directory site the service will limit Domain Controller discovery to
         * 
         * @return builder
         * 
         */
        public Builder site(String site) {
            return site(Output.of(site));
        }

        /**
         * @param smbServerName NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
         * 
         * @return builder
         * 
         */
        public Builder smbServerName(@Nullable Output<String> smbServerName) {
            $.smbServerName = smbServerName;
            return this;
        }

        /**
         * @param smbServerName NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
         * 
         * @return builder
         * 
         */
        public Builder smbServerName(String smbServerName) {
            return smbServerName(Output.of(smbServerName));
        }

        /**
         * @param username Username of Active Directory domain administrator
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username of Active Directory domain administrator
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ActiveDirectoryArgs build() {
            $.organizationalUnit = Codegen.stringProp("organizationalUnit").output().arg($.organizationalUnit).def("CN=Computers").getNullable();
            return $;
        }
    }

}
