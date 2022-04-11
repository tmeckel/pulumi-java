// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration and status of a managed SSL certificate.
 * 
 */
public final class SslCertificateManagedSslCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslCertificateManagedSslCertificateArgs Empty = new SslCertificateManagedSslCertificateArgs();

    /**
     * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
     * 
     */
    @Import(name="domains")
      private final @Nullable Output<List<String>> domains;

    public Output<List<String>> getDomains() {
        return this.domains == null ? Codegen.empty() : this.domains;
    }

    public SslCertificateManagedSslCertificateArgs(@Nullable Output<List<String>> domains) {
        this.domains = domains;
    }

    private SslCertificateManagedSslCertificateArgs() {
        this.domains = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertificateManagedSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> domains;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertificateManagedSslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
        }

        public Builder domains(@Nullable Output<List<String>> domains) {
            this.domains = domains;
            return this;
        }
        public Builder domains(@Nullable List<String> domains) {
            this.domains = Codegen.ofNullable(domains);
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }        public SslCertificateManagedSslCertificateArgs build() {
            return new SslCertificateManagedSslCertificateArgs(domains);
        }
    }
}
