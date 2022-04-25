// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * KeyUsage.ExtendedKeyUsageOptions has fields that correspond to certain common OIDs that could be specified as an extended key usage value.
 * 
 */
public final class ExtendedKeyUsageOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExtendedKeyUsageOptionsResponse Empty = new ExtendedKeyUsageOptionsResponse();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="clientAuth", required=true)
    private Boolean clientAuth;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    public Boolean clientAuth() {
        return this.clientAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    @Import(name="codeSigning", required=true)
    private Boolean codeSigning;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    public Boolean codeSigning() {
        return this.codeSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    @Import(name="emailProtection", required=true)
    private Boolean emailProtection;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    public Boolean emailProtection() {
        return this.emailProtection;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    @Import(name="ocspSigning", required=true)
    private Boolean ocspSigning;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    public Boolean ocspSigning() {
        return this.ocspSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="serverAuth", required=true)
    private Boolean serverAuth;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    public Boolean serverAuth() {
        return this.serverAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    @Import(name="timeStamping", required=true)
    private Boolean timeStamping;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    public Boolean timeStamping() {
        return this.timeStamping;
    }

    private ExtendedKeyUsageOptionsResponse() {}

    private ExtendedKeyUsageOptionsResponse(ExtendedKeyUsageOptionsResponse $) {
        this.clientAuth = $.clientAuth;
        this.codeSigning = $.codeSigning;
        this.emailProtection = $.emailProtection;
        this.ocspSigning = $.ocspSigning;
        this.serverAuth = $.serverAuth;
        this.timeStamping = $.timeStamping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtendedKeyUsageOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtendedKeyUsageOptionsResponse $;

        public Builder() {
            $ = new ExtendedKeyUsageOptionsResponse();
        }

        public Builder(ExtendedKeyUsageOptionsResponse defaults) {
            $ = new ExtendedKeyUsageOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientAuth Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
         * 
         * @return builder
         * 
         */
        public Builder clientAuth(Boolean clientAuth) {
            $.clientAuth = clientAuth;
            return this;
        }

        /**
         * @param codeSigning Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
         * 
         * @return builder
         * 
         */
        public Builder codeSigning(Boolean codeSigning) {
            $.codeSigning = codeSigning;
            return this;
        }

        /**
         * @param emailProtection Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
         * 
         * @return builder
         * 
         */
        public Builder emailProtection(Boolean emailProtection) {
            $.emailProtection = emailProtection;
            return this;
        }

        /**
         * @param ocspSigning Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ocspSigning(Boolean ocspSigning) {
            $.ocspSigning = ocspSigning;
            return this;
        }

        /**
         * @param serverAuth Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
         * 
         * @return builder
         * 
         */
        public Builder serverAuth(Boolean serverAuth) {
            $.serverAuth = serverAuth;
            return this;
        }

        /**
         * @param timeStamping Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeStamping(Boolean timeStamping) {
            $.timeStamping = timeStamping;
            return this;
        }

        public ExtendedKeyUsageOptionsResponse build() {
            $.clientAuth = Objects.requireNonNull($.clientAuth, "expected parameter 'clientAuth' to be non-null");
            $.codeSigning = Objects.requireNonNull($.codeSigning, "expected parameter 'codeSigning' to be non-null");
            $.emailProtection = Objects.requireNonNull($.emailProtection, "expected parameter 'emailProtection' to be non-null");
            $.ocspSigning = Objects.requireNonNull($.ocspSigning, "expected parameter 'ocspSigning' to be non-null");
            $.serverAuth = Objects.requireNonNull($.serverAuth, "expected parameter 'serverAuth' to be non-null");
            $.timeStamping = Objects.requireNonNull($.timeStamping, "expected parameter 'timeStamping' to be non-null");
            return $;
        }
    }

}
