// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateResponse Empty = new CertificateResponse();

    /**
     * PEM formatted public key.
     * 
     */
    @Import(name="pem")
    private @Nullable String pem;

    /**
     * @return PEM formatted public key.
     * 
     */
    public Optional<String> pem() {
        return Optional.ofNullable(this.pem);
    }

    private CertificateResponse() {}

    private CertificateResponse(CertificateResponse $) {
        this.pem = $.pem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateResponse $;

        public Builder() {
            $ = new CertificateResponse();
        }

        public Builder(CertificateResponse defaults) {
            $ = new CertificateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param pem PEM formatted public key.
         * 
         * @return builder
         * 
         */
        public Builder pem(@Nullable String pem) {
            $.pem = pem;
            return this;
        }

        public CertificateResponse build() {
            return $;
        }
    }

}
