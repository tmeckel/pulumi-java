// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.SdsConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] Defines the mechanism to obtain the Certificate Authority certificate to validate the client/server certificate. validate the client/server certificate.
 * 
 */
public final class TlsValidationContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final TlsValidationContextResponse Empty = new TlsValidationContextResponse();

    /**
     * The path to the file holding the CA certificate to validate the client or server certificate.
     * 
     */
    @Import(name="certificatePath", required=true)
    private String certificatePath;

    /**
     * @return The path to the file holding the CA certificate to validate the client or server certificate.
     * 
     */
    public String certificatePath() {
        return this.certificatePath;
    }

    /**
     * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
     */
    @Import(name="sdsConfig", required=true)
    private SdsConfigResponse sdsConfig;

    /**
     * @return Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
     */
    public SdsConfigResponse sdsConfig() {
        return this.sdsConfig;
    }

    /**
     * Defines how TLS certificates are obtained.
     * 
     */
    @Import(name="validationSource", required=true)
    private String validationSource;

    /**
     * @return Defines how TLS certificates are obtained.
     * 
     */
    public String validationSource() {
        return this.validationSource;
    }

    private TlsValidationContextResponse() {}

    private TlsValidationContextResponse(TlsValidationContextResponse $) {
        this.certificatePath = $.certificatePath;
        this.sdsConfig = $.sdsConfig;
        this.validationSource = $.validationSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsValidationContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsValidationContextResponse $;

        public Builder() {
            $ = new TlsValidationContextResponse();
        }

        public Builder(TlsValidationContextResponse defaults) {
            $ = new TlsValidationContextResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificatePath The path to the file holding the CA certificate to validate the client or server certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificatePath(String certificatePath) {
            $.certificatePath = certificatePath;
            return this;
        }

        /**
         * @param sdsConfig Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
         * 
         * @return builder
         * 
         */
        public Builder sdsConfig(SdsConfigResponse sdsConfig) {
            $.sdsConfig = sdsConfig;
            return this;
        }

        /**
         * @param validationSource Defines how TLS certificates are obtained.
         * 
         * @return builder
         * 
         */
        public Builder validationSource(String validationSource) {
            $.validationSource = validationSource;
            return this;
        }

        public TlsValidationContextResponse build() {
            $.certificatePath = Objects.requireNonNull($.certificatePath, "expected parameter 'certificatePath' to be non-null");
            $.sdsConfig = Objects.requireNonNull($.sdsConfig, "expected parameter 'sdsConfig' to be non-null");
            $.validationSource = Objects.requireNonNull($.validationSource, "expected parameter 'validationSource' to be non-null");
            return $;
        }
    }

}
