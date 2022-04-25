// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationTlsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationTlsConfigArgs Empty = new IntegrationTlsConfigArgs();

    /**
     * Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate&#39;s expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
     * 
     */
    @Import(name="insecureSkipVerification")
    private @Nullable Output<Boolean> insecureSkipVerification;

    /**
     * @return Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate&#39;s expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
     * 
     */
    public Optional<Output<Boolean>> insecureSkipVerification() {
        return Optional.ofNullable(this.insecureSkipVerification);
    }

    private IntegrationTlsConfigArgs() {}

    private IntegrationTlsConfigArgs(IntegrationTlsConfigArgs $) {
        this.insecureSkipVerification = $.insecureSkipVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationTlsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationTlsConfigArgs $;

        public Builder() {
            $ = new IntegrationTlsConfigArgs();
        }

        public Builder(IntegrationTlsConfigArgs defaults) {
            $ = new IntegrationTlsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param insecureSkipVerification Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate&#39;s expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
         * 
         * @return builder
         * 
         */
        public Builder insecureSkipVerification(@Nullable Output<Boolean> insecureSkipVerification) {
            $.insecureSkipVerification = insecureSkipVerification;
            return this;
        }

        /**
         * @param insecureSkipVerification Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate&#39;s expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
         * 
         * @return builder
         * 
         */
        public Builder insecureSkipVerification(Boolean insecureSkipVerification) {
            return insecureSkipVerification(Output.of(insecureSkipVerification));
        }

        public IntegrationTlsConfigArgs build() {
            return $;
        }
    }

}
