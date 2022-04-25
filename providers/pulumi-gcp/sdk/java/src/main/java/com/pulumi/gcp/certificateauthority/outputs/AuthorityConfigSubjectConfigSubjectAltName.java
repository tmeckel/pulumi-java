// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityConfigSubjectConfigSubjectAltName {
    /**
     * @return Contains only valid, fully-qualified host names.
     * 
     */
    private final @Nullable List<String> dnsNames;
    /**
     * @return Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    private final @Nullable List<String> emailAddresses;
    /**
     * @return Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * @return Contains only valid RFC 3986 URIs.
     * 
     */
    private final @Nullable List<String> uris;

    @CustomType.Constructor
    private AuthorityConfigSubjectConfigSubjectAltName(
        @CustomType.Parameter("dnsNames") @Nullable List<String> dnsNames,
        @CustomType.Parameter("emailAddresses") @Nullable List<String> emailAddresses,
        @CustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses,
        @CustomType.Parameter("uris") @Nullable List<String> uris) {
        this.dnsNames = dnsNames;
        this.emailAddresses = emailAddresses;
        this.ipAddresses = ipAddresses;
        this.uris = uris;
    }

    /**
     * @return Contains only valid, fully-qualified host names.
     * 
     */
    public List<String> dnsNames() {
        return this.dnsNames == null ? List.of() : this.dnsNames;
    }
    /**
     * @return Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    public List<String> emailAddresses() {
        return this.emailAddresses == null ? List.of() : this.emailAddresses;
    }
    /**
     * @return Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * @return Contains only valid RFC 3986 URIs.
     * 
     */
    public List<String> uris() {
        return this.uris == null ? List.of() : this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigSubjectConfigSubjectAltName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsNames;
        private @Nullable List<String> emailAddresses;
        private @Nullable List<String> ipAddresses;
        private @Nullable List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigSubjectConfigSubjectAltName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder dnsNames(@Nullable List<String> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder uris(@Nullable List<String> uris) {
            this.uris = uris;
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public AuthorityConfigSubjectConfigSubjectAltName build() {
            return new AuthorityConfigSubjectConfigSubjectAltName(dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
