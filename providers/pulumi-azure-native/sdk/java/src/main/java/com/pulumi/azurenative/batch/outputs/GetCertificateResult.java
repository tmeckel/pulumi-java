// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.azurenative.batch.outputs.DeleteCertificateErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    /**
     * @return This is only returned when the certificate provisioningState is &#39;Failed&#39;.
     * 
     */
    private final DeleteCertificateErrorResponse deleteCertificateError;
    /**
     * @return The ETag of the resource, used for concurrency statements.
     * 
     */
    private final String etag;
    /**
     * @return The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    private final @Nullable String format;
    /**
     * @return The ID of the resource.
     * 
     */
    private final String id;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The previous provisioned state of the resource
     * 
     */
    private final String previousProvisioningState;
    private final String previousProvisioningStateTransitionTime;
    private final String provisioningState;
    private final String provisioningStateTransitionTime;
    /**
     * @return The public key of the certificate.
     * 
     */
    private final String publicData;
    /**
     * @return This must match the thumbprint from the name.
     * 
     */
    private final @Nullable String thumbprint;
    /**
     * @return This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
     * 
     */
    private final @Nullable String thumbprintAlgorithm;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("deleteCertificateError") DeleteCertificateErrorResponse deleteCertificateError,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("previousProvisioningState") String previousProvisioningState,
        @CustomType.Parameter("previousProvisioningStateTransitionTime") String previousProvisioningStateTransitionTime,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("provisioningStateTransitionTime") String provisioningStateTransitionTime,
        @CustomType.Parameter("publicData") String publicData,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint,
        @CustomType.Parameter("thumbprintAlgorithm") @Nullable String thumbprintAlgorithm,
        @CustomType.Parameter("type") String type) {
        this.deleteCertificateError = deleteCertificateError;
        this.etag = etag;
        this.format = format;
        this.id = id;
        this.name = name;
        this.previousProvisioningState = previousProvisioningState;
        this.previousProvisioningStateTransitionTime = previousProvisioningStateTransitionTime;
        this.provisioningState = provisioningState;
        this.provisioningStateTransitionTime = provisioningStateTransitionTime;
        this.publicData = publicData;
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        this.type = type;
    }

    /**
     * @return This is only returned when the certificate provisioningState is &#39;Failed&#39;.
     * 
     */
    public DeleteCertificateErrorResponse deleteCertificateError() {
        return this.deleteCertificateError;
    }
    /**
     * @return The ETag of the resource, used for concurrency statements.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return The ID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The previous provisioned state of the resource
     * 
     */
    public String previousProvisioningState() {
        return this.previousProvisioningState;
    }
    public String previousProvisioningStateTransitionTime() {
        return this.previousProvisioningStateTransitionTime;
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    public String provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * @return The public key of the certificate.
     * 
     */
    public String publicData() {
        return this.publicData;
    }
    /**
     * @return This must match the thumbprint from the name.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * @return This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
     * 
     */
    public Optional<String> thumbprintAlgorithm() {
        return Optional.ofNullable(this.thumbprintAlgorithm);
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeleteCertificateErrorResponse deleteCertificateError;
        private String etag;
        private @Nullable String format;
        private String id;
        private String name;
        private String previousProvisioningState;
        private String previousProvisioningStateTransitionTime;
        private String provisioningState;
        private String provisioningStateTransitionTime;
        private String publicData;
        private @Nullable String thumbprint;
        private @Nullable String thumbprintAlgorithm;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteCertificateError = defaults.deleteCertificateError;
    	      this.etag = defaults.etag;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.previousProvisioningState = defaults.previousProvisioningState;
    	      this.previousProvisioningStateTransitionTime = defaults.previousProvisioningStateTransitionTime;
    	      this.provisioningState = defaults.provisioningState;
    	      this.provisioningStateTransitionTime = defaults.provisioningStateTransitionTime;
    	      this.publicData = defaults.publicData;
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintAlgorithm = defaults.thumbprintAlgorithm;
    	      this.type = defaults.type;
        }

        public Builder deleteCertificateError(DeleteCertificateErrorResponse deleteCertificateError) {
            this.deleteCertificateError = Objects.requireNonNull(deleteCertificateError);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder previousProvisioningState(String previousProvisioningState) {
            this.previousProvisioningState = Objects.requireNonNull(previousProvisioningState);
            return this;
        }
        public Builder previousProvisioningStateTransitionTime(String previousProvisioningStateTransitionTime) {
            this.previousProvisioningStateTransitionTime = Objects.requireNonNull(previousProvisioningStateTransitionTime);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder provisioningStateTransitionTime(String provisioningStateTransitionTime) {
            this.provisioningStateTransitionTime = Objects.requireNonNull(provisioningStateTransitionTime);
            return this;
        }
        public Builder publicData(String publicData) {
            this.publicData = Objects.requireNonNull(publicData);
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprintAlgorithm(@Nullable String thumbprintAlgorithm) {
            this.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(deleteCertificateError, etag, format, id, name, previousProvisioningState, previousProvisioningStateTransitionTime, provisioningState, provisioningStateTransitionTime, publicData, thumbprint, thumbprintAlgorithm, type);
        }
    }
}
