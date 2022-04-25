// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.inputs.EcKeyTypeResponse;
import com.pulumi.googlenative.privateca_v1.inputs.RsaKeyTypeResponse;
import java.util.Objects;


/**
 * Describes a &#34;type&#34; of key that may be used in a Certificate issued from a CaPool. Note that a single AllowedKeyType may refer to either a fully-qualified key algorithm, such as RSA 4096, or a family of key algorithms, such as any RSA key.
 * 
 */
public final class AllowedKeyTypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final AllowedKeyTypeResponse Empty = new AllowedKeyTypeResponse();

    /**
     * Represents an allowed Elliptic Curve key type.
     * 
     */
    @Import(name="ellipticCurve", required=true)
    private EcKeyTypeResponse ellipticCurve;

    /**
     * @return Represents an allowed Elliptic Curve key type.
     * 
     */
    public EcKeyTypeResponse ellipticCurve() {
        return this.ellipticCurve;
    }

    /**
     * Represents an allowed RSA key type.
     * 
     */
    @Import(name="rsa", required=true)
    private RsaKeyTypeResponse rsa;

    /**
     * @return Represents an allowed RSA key type.
     * 
     */
    public RsaKeyTypeResponse rsa() {
        return this.rsa;
    }

    private AllowedKeyTypeResponse() {}

    private AllowedKeyTypeResponse(AllowedKeyTypeResponse $) {
        this.ellipticCurve = $.ellipticCurve;
        this.rsa = $.rsa;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowedKeyTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowedKeyTypeResponse $;

        public Builder() {
            $ = new AllowedKeyTypeResponse();
        }

        public Builder(AllowedKeyTypeResponse defaults) {
            $ = new AllowedKeyTypeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ellipticCurve Represents an allowed Elliptic Curve key type.
         * 
         * @return builder
         * 
         */
        public Builder ellipticCurve(EcKeyTypeResponse ellipticCurve) {
            $.ellipticCurve = ellipticCurve;
            return this;
        }

        /**
         * @param rsa Represents an allowed RSA key type.
         * 
         * @return builder
         * 
         */
        public Builder rsa(RsaKeyTypeResponse rsa) {
            $.rsa = rsa;
            return this;
        }

        public AllowedKeyTypeResponse build() {
            $.ellipticCurve = Objects.requireNonNull($.ellipticCurve, "expected parameter 'ellipticCurve' to be non-null");
            $.rsa = Objects.requireNonNull($.rsa, "expected parameter 'rsa' to be non-null");
            return $;
        }
    }

}
