// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.X509ExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SubjectAltNames corresponds to a more modern way of listing what the asserted identity is in a certificate (i.e., compared to the "common name" in the distinguished name).
 * 
 */
public final class SubjectAltNamesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectAltNamesArgs Empty = new SubjectAltNamesArgs();

    /**
     * Contains additional subject alternative name values.
     * 
     */
    @InputImport(name="customSans")
    private final @Nullable Input<List<X509ExtensionArgs>> customSans;

    public Input<List<X509ExtensionArgs>> getCustomSans() {
        return this.customSans == null ? Input.empty() : this.customSans;
    }

    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    @InputImport(name="dnsNames")
    private final @Nullable Input<List<String>> dnsNames;

    public Input<List<String>> getDnsNames() {
        return this.dnsNames == null ? Input.empty() : this.dnsNames;
    }

    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    @InputImport(name="emailAddresses")
    private final @Nullable Input<List<String>> emailAddresses;

    public Input<List<String>> getEmailAddresses() {
        return this.emailAddresses == null ? Input.empty() : this.emailAddresses;
    }

    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    @InputImport(name="ipAddresses")
    private final @Nullable Input<List<String>> ipAddresses;

    public Input<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    @InputImport(name="uris")
    private final @Nullable Input<List<String>> uris;

    public Input<List<String>> getUris() {
        return this.uris == null ? Input.empty() : this.uris;
    }

    public SubjectAltNamesArgs(
        @Nullable Input<List<X509ExtensionArgs>> customSans,
        @Nullable Input<List<String>> dnsNames,
        @Nullable Input<List<String>> emailAddresses,
        @Nullable Input<List<String>> ipAddresses,
        @Nullable Input<List<String>> uris) {
        this.customSans = customSans;
        this.dnsNames = dnsNames;
        this.emailAddresses = emailAddresses;
        this.ipAddresses = ipAddresses;
        this.uris = uris;
    }

    private SubjectAltNamesArgs() {
        this.customSans = Input.empty();
        this.dnsNames = Input.empty();
        this.emailAddresses = Input.empty();
        this.ipAddresses = Input.empty();
        this.uris = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAltNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<X509ExtensionArgs>> customSans;
        private @Nullable Input<List<String>> dnsNames;
        private @Nullable Input<List<String>> emailAddresses;
        private @Nullable Input<List<String>> ipAddresses;
        private @Nullable Input<List<String>> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAltNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSans = defaults.customSans;
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder setCustomSans(@Nullable Input<List<X509ExtensionArgs>> customSans) {
            this.customSans = customSans;
            return this;
        }

        public Builder setCustomSans(@Nullable List<X509ExtensionArgs> customSans) {
            this.customSans = Input.ofNullable(customSans);
            return this;
        }

        public Builder setDnsNames(@Nullable Input<List<String>> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }

        public Builder setDnsNames(@Nullable List<String> dnsNames) {
            this.dnsNames = Input.ofNullable(dnsNames);
            return this;
        }

        public Builder setEmailAddresses(@Nullable Input<List<String>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder setEmailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = Input.ofNullable(emailAddresses);
            return this;
        }

        public Builder setIpAddresses(@Nullable Input<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }

        public Builder setUris(@Nullable Input<List<String>> uris) {
            this.uris = uris;
            return this;
        }

        public Builder setUris(@Nullable List<String> uris) {
            this.uris = Input.ofNullable(uris);
            return this;
        }

        public SubjectAltNamesArgs build() {
            return new SubjectAltNamesArgs(customSans, dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
