// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.AfdCertificateType;
import com.pulumi.azurenative.cdn.enums.AfdMinimumTlsVersion;
import com.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The JSON object that contains the properties to secure a domain.
 * 
 */
public final class AFDDomainHttpsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final AFDDomainHttpsParametersArgs Empty = new AFDDomainHttpsParametersArgs();

    /**
     * Defines the source of the SSL certificate.
     * 
     */
    @Import(name="certificateType", required=true)
    private Output<Either<String,AfdCertificateType>> certificateType;

    /**
     * @return Defines the source of the SSL certificate.
     * 
     */
    public Output<Either<String,AfdCertificateType>> certificateType() {
        return this.certificateType;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable Output<AfdMinimumTlsVersion> minimumTlsVersion;

    /**
     * @return TLS protocol version that will be used for Https
     * 
     */
    public Optional<Output<AfdMinimumTlsVersion>> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * Resource reference to the secret. ie. subs/rg/profile/secret
     * 
     */
    @Import(name="secret")
    private @Nullable Output<ResourceReferenceArgs> secret;

    /**
     * @return Resource reference to the secret. ie. subs/rg/profile/secret
     * 
     */
    public Optional<Output<ResourceReferenceArgs>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private AFDDomainHttpsParametersArgs() {}

    private AFDDomainHttpsParametersArgs(AFDDomainHttpsParametersArgs $) {
        this.certificateType = $.certificateType;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AFDDomainHttpsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AFDDomainHttpsParametersArgs $;

        public Builder() {
            $ = new AFDDomainHttpsParametersArgs();
        }

        public Builder(AFDDomainHttpsParametersArgs defaults) {
            $ = new AFDDomainHttpsParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateType Defines the source of the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateType(Output<Either<String,AfdCertificateType>> certificateType) {
            $.certificateType = certificateType;
            return this;
        }

        /**
         * @param certificateType Defines the source of the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateType(Either<String,AfdCertificateType> certificateType) {
            return certificateType(Output.of(certificateType));
        }

        /**
         * @param certificateType Defines the source of the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateType(String certificateType) {
            return certificateType(Either.ofLeft(certificateType));
        }

        /**
         * @param certificateType Defines the source of the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateType(AfdCertificateType certificateType) {
            return certificateType(Either.ofRight(certificateType));
        }

        /**
         * @param minimumTlsVersion TLS protocol version that will be used for Https
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(@Nullable Output<AfdMinimumTlsVersion> minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        /**
         * @param minimumTlsVersion TLS protocol version that will be used for Https
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(AfdMinimumTlsVersion minimumTlsVersion) {
            return minimumTlsVersion(Output.of(minimumTlsVersion));
        }

        /**
         * @param secret Resource reference to the secret. ie. subs/rg/profile/secret
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<ResourceReferenceArgs> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Resource reference to the secret. ie. subs/rg/profile/secret
         * 
         * @return builder
         * 
         */
        public Builder secret(ResourceReferenceArgs secret) {
            return secret(Output.of(secret));
        }

        public AFDDomainHttpsParametersArgs build() {
            $.certificateType = Objects.requireNonNull($.certificateType, "expected parameter 'certificateType' to be non-null");
            return $;
        }
    }

}
