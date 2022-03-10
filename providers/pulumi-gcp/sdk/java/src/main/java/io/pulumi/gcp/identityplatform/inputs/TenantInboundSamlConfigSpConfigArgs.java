// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigSpCertificateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigSpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigSpConfigArgs Empty = new TenantInboundSamlConfigSpConfigArgs();

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    @InputImport(name="callbackUri", required=true)
      private final Input<String> callbackUri;

    public Input<String> getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @InputImport(name="spCertificates")
      private final @Nullable Input<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;

    public Input<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> getSpCertificates() {
        return this.spCertificates == null ? Input.empty() : this.spCertificates;
    }

    /**
     * Unique identifier for all SAML entities.
     * 
     */
    @InputImport(name="spEntityId", required=true)
      private final Input<String> spEntityId;

    public Input<String> getSpEntityId() {
        return this.spEntityId;
    }

    public TenantInboundSamlConfigSpConfigArgs(
        Input<String> callbackUri,
        @Nullable Input<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates,
        Input<String> spEntityId) {
        this.callbackUri = Objects.requireNonNull(callbackUri, "expected parameter 'callbackUri' to be non-null");
        this.spCertificates = spCertificates;
        this.spEntityId = Objects.requireNonNull(spEntityId, "expected parameter 'spEntityId' to be non-null");
    }

    private TenantInboundSamlConfigSpConfigArgs() {
        this.callbackUri = Input.empty();
        this.spCertificates = Input.empty();
        this.spEntityId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigSpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> callbackUri;
        private @Nullable Input<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;
        private Input<String> spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigSpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder callbackUri(Input<String> callbackUri) {
            this.callbackUri = Objects.requireNonNull(callbackUri);
            return this;
        }

        public Builder callbackUri(String callbackUri) {
            this.callbackUri = Input.of(Objects.requireNonNull(callbackUri));
            return this;
        }

        public Builder spCertificates(@Nullable Input<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }

        public Builder spCertificates(@Nullable List<TenantInboundSamlConfigSpConfigSpCertificateArgs> spCertificates) {
            this.spCertificates = Input.ofNullable(spCertificates);
            return this;
        }

        public Builder spEntityId(Input<String> spEntityId) {
            this.spEntityId = Objects.requireNonNull(spEntityId);
            return this;
        }

        public Builder spEntityId(String spEntityId) {
            this.spEntityId = Input.of(Objects.requireNonNull(spEntityId));
            return this;
        }
        public TenantInboundSamlConfigSpConfigArgs build() {
            return new TenantInboundSamlConfigSpConfigArgs(callbackUri, spCertificates, spEntityId);
        }
    }
}
