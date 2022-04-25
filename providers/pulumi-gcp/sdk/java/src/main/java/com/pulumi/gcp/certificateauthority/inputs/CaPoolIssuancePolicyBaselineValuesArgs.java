// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesCaOptionsArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyBaselineValuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesArgs Empty = new CaPoolIssuancePolicyBaselineValuesArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @Import(name="additionalExtensions")
    private @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions;

    /**
     * @return Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>>> additionalExtensions() {
        return Optional.ofNullable(this.additionalExtensions);
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
    private @Nullable Output<List<String>> aiaOcspServers;

    /**
     * @return Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public Optional<Output<List<String>>> aiaOcspServers() {
        return Optional.ofNullable(this.aiaOcspServers);
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="caOptions", required=true)
    private Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions;

    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions() {
        return this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="keyUsage", required=true)
    private Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage;

    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @Import(name="policyIds")
    private @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds;

    /**
     * @return Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>>> policyIds() {
        return Optional.ofNullable(this.policyIds);
    }

    private CaPoolIssuancePolicyBaselineValuesArgs() {}

    private CaPoolIssuancePolicyBaselineValuesArgs(CaPoolIssuancePolicyBaselineValuesArgs $) {
        this.additionalExtensions = $.additionalExtensions;
        this.aiaOcspServers = $.aiaOcspServers;
        this.caOptions = $.caOptions;
        this.keyUsage = $.keyUsage;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaPoolIssuancePolicyBaselineValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaPoolIssuancePolicyBaselineValuesArgs $;

        public Builder() {
            $ = new CaPoolIssuancePolicyBaselineValuesArgs();
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesArgs defaults) {
            $ = new CaPoolIssuancePolicyBaselineValuesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(@Nullable Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        /**
         * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs> additionalExtensions) {
            return additionalExtensions(Output.of(additionalExtensions));
        }

        /**
         * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        /**
         * @param aiaOcspServers Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            $.aiaOcspServers = aiaOcspServers;
            return this;
        }

        /**
         * @param aiaOcspServers Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            return aiaOcspServers(Output.of(aiaOcspServers));
        }

        /**
         * @param aiaOcspServers Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }

        /**
         * @param caOptions Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions) {
            $.caOptions = caOptions;
            return this;
        }

        /**
         * @param caOptions Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(CaPoolIssuancePolicyBaselineValuesCaOptionsArgs caOptions) {
            return caOptions(Output.of(caOptions));
        }

        /**
         * @param keyUsage Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param keyUsage Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(CaPoolIssuancePolicyBaselineValuesKeyUsageArgs keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        /**
         * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(@Nullable Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        /**
         * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs> policyIds) {
            return policyIds(Output.of(policyIds));
        }

        /**
         * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(CaPoolIssuancePolicyBaselineValuesPolicyIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public CaPoolIssuancePolicyBaselineValuesArgs build() {
            $.caOptions = Objects.requireNonNull($.caOptions, "expected parameter 'caOptions' to be non-null");
            $.keyUsage = Objects.requireNonNull($.keyUsage, "expected parameter 'keyUsage' to be non-null");
            return $;
        }
    }

}
