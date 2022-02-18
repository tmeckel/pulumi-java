// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SslCertificateType;
import io.pulumi.googlenative.compute_alpha.inputs.SslCertificateManagedSslCertificateArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SslCertificateSelfManagedSslCertificateArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslCertificateArgs Empty = new SslCertificateArgs();

    /**
     * A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @InputImport(name="certificate")
    private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Configuration and status of a managed SSL certificate.
     * 
     */
    @InputImport(name="managed")
    private final @Nullable Input<SslCertificateManagedSslCertificateArgs> managed;

    public Input<SslCertificateManagedSslCertificateArgs> getManaged() {
        return this.managed == null ? Input.empty() : this.managed;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    @InputImport(name="privateKey")
    private final @Nullable Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey == null ? Input.empty() : this.privateKey;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Configuration and status of a self-managed SSL certificate.
     * 
     */
    @InputImport(name="selfManaged")
    private final @Nullable Input<SslCertificateSelfManagedSslCertificateArgs> selfManaged;

    public Input<SslCertificateSelfManagedSslCertificateArgs> getSelfManaged() {
        return this.selfManaged == null ? Input.empty() : this.selfManaged;
    }

    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<SslCertificateType> type;

    public Input<SslCertificateType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public SslCertificateArgs(
        @Nullable Input<String> certificate,
        @Nullable Input<String> description,
        @Nullable Input<SslCertificateManagedSslCertificateArgs> managed,
        @Nullable Input<String> name,
        @Nullable Input<String> privateKey,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<SslCertificateSelfManagedSslCertificateArgs> selfManaged,
        @Nullable Input<SslCertificateType> type) {
        this.certificate = certificate;
        this.description = description;
        this.managed = managed;
        this.name = name;
        this.privateKey = privateKey;
        this.project = project;
        this.requestId = requestId;
        this.selfManaged = selfManaged;
        this.type = type;
    }

    private SslCertificateArgs() {
        this.certificate = Input.empty();
        this.description = Input.empty();
        this.managed = Input.empty();
        this.name = Input.empty();
        this.privateKey = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.selfManaged = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<String> description;
        private @Nullable Input<SslCertificateManagedSslCertificateArgs> managed;
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateKey;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<SslCertificateSelfManagedSslCertificateArgs> selfManaged;
        private @Nullable Input<SslCertificateType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.description = defaults.description;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.selfManaged = defaults.selfManaged;
    	      this.type = defaults.type;
        }

        public Builder setCertificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setManaged(@Nullable Input<SslCertificateManagedSslCertificateArgs> managed) {
            this.managed = managed;
            return this;
        }

        public Builder setManaged(@Nullable SslCertificateManagedSslCertificateArgs managed) {
            this.managed = Input.ofNullable(managed);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrivateKey(@Nullable Input<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setPrivateKey(@Nullable String privateKey) {
            this.privateKey = Input.ofNullable(privateKey);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSelfManaged(@Nullable Input<SslCertificateSelfManagedSslCertificateArgs> selfManaged) {
            this.selfManaged = selfManaged;
            return this;
        }

        public Builder setSelfManaged(@Nullable SslCertificateSelfManagedSslCertificateArgs selfManaged) {
            this.selfManaged = Input.ofNullable(selfManaged);
            return this;
        }

        public Builder setType(@Nullable Input<SslCertificateType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable SslCertificateType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public SslCertificateArgs build() {
            return new SslCertificateArgs(certificate, description, managed, name, privateKey, project, requestId, selfManaged, type);
        }
    }
}
