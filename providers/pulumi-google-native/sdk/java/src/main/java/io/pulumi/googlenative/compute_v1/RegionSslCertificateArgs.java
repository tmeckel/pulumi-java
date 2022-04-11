// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.RegionSslCertificateType;
import io.pulumi.googlenative.compute_v1.inputs.SslCertificateManagedSslCertificateArgs;
import io.pulumi.googlenative.compute_v1.inputs.SslCertificateSelfManagedSslCertificateArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionSslCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionSslCertificateArgs Empty = new RegionSslCertificateArgs();

    /**
     * A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate == null ? Codegen.empty() : this.certificate;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Configuration and status of a managed SSL certificate.
     * 
     */
    @Import(name="managed")
      private final @Nullable Output<SslCertificateManagedSslCertificateArgs> managed;

    public Output<SslCertificateManagedSslCertificateArgs> getManaged() {
        return this.managed == null ? Codegen.empty() : this.managed;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Codegen.empty() : this.privateKey;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Configuration and status of a self-managed SSL certificate.
     * 
     */
    @Import(name="selfManaged")
      private final @Nullable Output<SslCertificateSelfManagedSslCertificateArgs> selfManaged;

    public Output<SslCertificateSelfManagedSslCertificateArgs> getSelfManaged() {
        return this.selfManaged == null ? Codegen.empty() : this.selfManaged;
    }

    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<RegionSslCertificateType> type;

    public Output<RegionSslCertificateType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public RegionSslCertificateArgs(
        @Nullable Output<String> certificate,
        @Nullable Output<String> description,
        @Nullable Output<SslCertificateManagedSslCertificateArgs> managed,
        @Nullable Output<String> name,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<SslCertificateSelfManagedSslCertificateArgs> selfManaged,
        @Nullable Output<RegionSslCertificateType> type) {
        this.certificate = certificate;
        this.description = description;
        this.managed = managed;
        this.name = name;
        this.privateKey = privateKey;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.selfManaged = selfManaged;
        this.type = type;
    }

    private RegionSslCertificateArgs() {
        this.certificate = Codegen.empty();
        this.description = Codegen.empty();
        this.managed = Codegen.empty();
        this.name = Codegen.empty();
        this.privateKey = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.selfManaged = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificate;
        private @Nullable Output<String> description;
        private @Nullable Output<SslCertificateManagedSslCertificateArgs> managed;
        private @Nullable Output<String> name;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SslCertificateSelfManagedSslCertificateArgs> selfManaged;
        private @Nullable Output<RegionSslCertificateType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.description = defaults.description;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.selfManaged = defaults.selfManaged;
    	      this.type = defaults.type;
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = Codegen.ofNullable(certificate);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder managed(@Nullable Output<SslCertificateManagedSslCertificateArgs> managed) {
            this.managed = managed;
            return this;
        }
        public Builder managed(@Nullable SslCertificateManagedSslCertificateArgs managed) {
            this.managed = Codegen.ofNullable(managed);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Codegen.ofNullable(privateKey);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder selfManaged(@Nullable Output<SslCertificateSelfManagedSslCertificateArgs> selfManaged) {
            this.selfManaged = selfManaged;
            return this;
        }
        public Builder selfManaged(@Nullable SslCertificateSelfManagedSslCertificateArgs selfManaged) {
            this.selfManaged = Codegen.ofNullable(selfManaged);
            return this;
        }
        public Builder type(@Nullable Output<RegionSslCertificateType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable RegionSslCertificateType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public RegionSslCertificateArgs build() {
            return new RegionSslCertificateArgs(certificate, description, managed, name, privateKey, project, region, requestId, selfManaged, type);
        }
    }
}
