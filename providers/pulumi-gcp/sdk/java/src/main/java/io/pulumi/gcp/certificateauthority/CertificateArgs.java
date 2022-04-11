// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Certificate Authority name.
     * 
     */
    @Import(name="certificateAuthority")
      private final @Nullable Output<String> certificateAuthority;

    public Output<String> getCertificateAuthority() {
        return this.certificateAuthority == null ? Codegen.empty() : this.certificateAuthority;
    }

    /**
     * The resource name for a CertificateTemplate used to issue this certificate,
     * in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified,
     * the caller must have the necessary permission to use this template. If this is
     * omitted, no template will be used. This template must be in the same location
     * as the Certificate.
     * 
     */
    @Import(name="certificateTemplate")
      private final @Nullable Output<String> certificateTemplate;

    public Output<String> getCertificateTemplate() {
        return this.certificateTemplate == null ? Codegen.empty() : this.certificateTemplate;
    }

    /**
     * The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<CertificateConfigArgs> config;

    public Output<CertificateConfigArgs> getConfig() {
        return this.config == null ? Codegen.empty() : this.config;
    }

    /**
     * Labels with user-defined metadata to apply to this resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="lifetime")
      private final @Nullable Output<String> lifetime;

    public Output<String> getLifetime() {
        return this.lifetime == null ? Codegen.empty() : this.lifetime;
    }

    /**
     * Location of the Certificate. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * The name for this Certificate.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @Import(name="pemCsr")
      private final @Nullable Output<String> pemCsr;

    public Output<String> getPemCsr() {
        return this.pemCsr == null ? Codegen.empty() : this.pemCsr;
    }

    /**
     * The name of the CaPool this Certificate belongs to.
     * 
     */
    @Import(name="pool", required=true)
      private final Output<String> pool;

    public Output<String> getPool() {
        return this.pool;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public CertificateArgs(
        @Nullable Output<String> certificateAuthority,
        @Nullable Output<String> certificateTemplate,
        @Nullable Output<CertificateConfigArgs> config,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> lifetime,
        Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> pemCsr,
        Output<String> pool,
        @Nullable Output<String> project) {
        this.certificateAuthority = certificateAuthority;
        this.certificateTemplate = certificateTemplate;
        this.config = config;
        this.labels = labels;
        this.lifetime = lifetime;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.pemCsr = pemCsr;
        this.pool = Objects.requireNonNull(pool, "expected parameter 'pool' to be non-null");
        this.project = project;
    }

    private CertificateArgs() {
        this.certificateAuthority = Codegen.empty();
        this.certificateTemplate = Codegen.empty();
        this.config = Codegen.empty();
        this.labels = Codegen.empty();
        this.lifetime = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.pemCsr = Codegen.empty();
        this.pool = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateAuthority;
        private @Nullable Output<String> certificateTemplate;
        private @Nullable Output<CertificateConfigArgs> config;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> lifetime;
        private Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> pemCsr;
        private Output<String> pool;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.certificateTemplate = defaults.certificateTemplate;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pemCsr = defaults.pemCsr;
    	      this.pool = defaults.pool;
    	      this.project = defaults.project;
        }

        public Builder certificateAuthority(@Nullable Output<String> certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }
        public Builder certificateAuthority(@Nullable String certificateAuthority) {
            this.certificateAuthority = Codegen.ofNullable(certificateAuthority);
            return this;
        }
        public Builder certificateTemplate(@Nullable Output<String> certificateTemplate) {
            this.certificateTemplate = certificateTemplate;
            return this;
        }
        public Builder certificateTemplate(@Nullable String certificateTemplate) {
            this.certificateTemplate = Codegen.ofNullable(certificateTemplate);
            return this;
        }
        public Builder config(@Nullable Output<CertificateConfigArgs> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable CertificateConfigArgs config) {
            this.config = Codegen.ofNullable(config);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder lifetime(@Nullable Output<String> lifetime) {
            this.lifetime = lifetime;
            return this;
        }
        public Builder lifetime(@Nullable String lifetime) {
            this.lifetime = Codegen.ofNullable(lifetime);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
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
        public Builder pemCsr(@Nullable Output<String> pemCsr) {
            this.pemCsr = pemCsr;
            return this;
        }
        public Builder pemCsr(@Nullable String pemCsr) {
            this.pemCsr = Codegen.ofNullable(pemCsr);
            return this;
        }
        public Builder pool(Output<String> pool) {
            this.pool = Objects.requireNonNull(pool);
            return this;
        }
        public Builder pool(String pool) {
            this.pool = Output.of(Objects.requireNonNull(pool));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(certificateAuthority, certificateTemplate, config, labels, lifetime, location, name, pemCsr, pool, project);
        }
    }
}
