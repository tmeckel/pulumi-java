// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.X509ExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SubjectAltNames corresponds to a more modern way of listing what the asserted identity is in a certificate (i.e., compared to the &#34;common name&#34; in the distinguished name).
 * 
 */
public final class SubjectAltNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubjectAltNamesArgs Empty = new SubjectAltNamesArgs();

    /**
     * Contains additional subject alternative name values.
     * 
     */
    @Import(name="customSans")
    private @Nullable Output<List<X509ExtensionArgs>> customSans;

    /**
     * @return Contains additional subject alternative name values.
     * 
     */
    public Optional<Output<List<X509ExtensionArgs>>> customSans() {
        return Optional.ofNullable(this.customSans);
    }

    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    @Import(name="dnsNames")
    private @Nullable Output<List<String>> dnsNames;

    /**
     * @return Contains only valid, fully-qualified host names.
     * 
     */
    public Optional<Output<List<String>>> dnsNames() {
        return Optional.ofNullable(this.dnsNames);
    }

    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    @Import(name="emailAddresses")
    private @Nullable Output<List<String>> emailAddresses;

    /**
     * @return Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    public Optional<Output<List<String>>> emailAddresses() {
        return Optional.ofNullable(this.emailAddresses);
    }

    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @return Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<String>> uris;

    /**
     * @return Contains only valid RFC 3986 URIs.
     * 
     */
    public Optional<Output<List<String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    private SubjectAltNamesArgs() {}

    private SubjectAltNamesArgs(SubjectAltNamesArgs $) {
        this.customSans = $.customSans;
        this.dnsNames = $.dnsNames;
        this.emailAddresses = $.emailAddresses;
        this.ipAddresses = $.ipAddresses;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubjectAltNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectAltNamesArgs $;

        public Builder() {
            $ = new SubjectAltNamesArgs();
        }

        public Builder(SubjectAltNamesArgs defaults) {
            $ = new SubjectAltNamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customSans Contains additional subject alternative name values.
         * 
         * @return builder
         * 
         */
        public Builder customSans(@Nullable Output<List<X509ExtensionArgs>> customSans) {
            $.customSans = customSans;
            return this;
        }

        /**
         * @param customSans Contains additional subject alternative name values.
         * 
         * @return builder
         * 
         */
        public Builder customSans(List<X509ExtensionArgs> customSans) {
            return customSans(Output.of(customSans));
        }

        /**
         * @param customSans Contains additional subject alternative name values.
         * 
         * @return builder
         * 
         */
        public Builder customSans(X509ExtensionArgs... customSans) {
            return customSans(List.of(customSans));
        }

        /**
         * @param dnsNames Contains only valid, fully-qualified host names.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(@Nullable Output<List<String>> dnsNames) {
            $.dnsNames = dnsNames;
            return this;
        }

        /**
         * @param dnsNames Contains only valid, fully-qualified host names.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(List<String> dnsNames) {
            return dnsNames(Output.of(dnsNames));
        }

        /**
         * @param dnsNames Contains only valid, fully-qualified host names.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }

        /**
         * @param emailAddresses Contains only valid RFC 2822 E-mail addresses.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            $.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * @param emailAddresses Contains only valid RFC 2822 E-mail addresses.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(List<String> emailAddresses) {
            return emailAddresses(Output.of(emailAddresses));
        }

        /**
         * @param emailAddresses Contains only valid RFC 2822 E-mail addresses.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }

        /**
         * @param ipAddresses Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param uris Contains only valid RFC 3986 URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris Contains only valid RFC 3986 URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris Contains only valid RFC 3986 URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public SubjectAltNamesArgs build() {
            return $;
        }
    }

}
