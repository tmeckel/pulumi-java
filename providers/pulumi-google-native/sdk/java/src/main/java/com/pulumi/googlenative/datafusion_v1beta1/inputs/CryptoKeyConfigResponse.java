// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The crypto key configuration. This field is used by the Customer-managed encryption keys (CMEK) feature.
 * 
 */
public final class CryptoKeyConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final CryptoKeyConfigResponse Empty = new CryptoKeyConfigResponse();

    /**
     * The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Import(name="keyReference", required=true)
    private String keyReference;

    /**
     * @return The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    public String keyReference() {
        return this.keyReference;
    }

    private CryptoKeyConfigResponse() {}

    private CryptoKeyConfigResponse(CryptoKeyConfigResponse $) {
        this.keyReference = $.keyReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyConfigResponse $;

        public Builder() {
            $ = new CryptoKeyConfigResponse();
        }

        public Builder(CryptoKeyConfigResponse defaults) {
            $ = new CryptoKeyConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyReference The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
         * 
         * @return builder
         * 
         */
        public Builder keyReference(String keyReference) {
            $.keyReference = keyReference;
            return this;
        }

        public CryptoKeyConfigResponse build() {
            $.keyReference = Objects.requireNonNull($.keyReference, "expected parameter 'keyReference' to be non-null");
            return $;
        }
    }

}
