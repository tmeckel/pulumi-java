// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateExtensionsArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateSubjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that specifies fields to be overridden in a certificate at the time of issuance. These requires an API Passthrough template be used or they will be ignored.
 * 
 */
public final class CertificateApiPassthroughArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateApiPassthroughArgs Empty = new CertificateApiPassthroughArgs();

    @InputImport(name="extensions")
      private final @Nullable Input<CertificateExtensionsArgs> extensions;

    public Input<CertificateExtensionsArgs> getExtensions() {
        return this.extensions == null ? Input.empty() : this.extensions;
    }

    @InputImport(name="subject")
      private final @Nullable Input<CertificateSubjectArgs> subject;

    public Input<CertificateSubjectArgs> getSubject() {
        return this.subject == null ? Input.empty() : this.subject;
    }

    public CertificateApiPassthroughArgs(
        @Nullable Input<CertificateExtensionsArgs> extensions,
        @Nullable Input<CertificateSubjectArgs> subject) {
        this.extensions = extensions;
        this.subject = subject;
    }

    private CertificateApiPassthroughArgs() {
        this.extensions = Input.empty();
        this.subject = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateApiPassthroughArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateExtensionsArgs> extensions;
        private @Nullable Input<CertificateSubjectArgs> subject;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateApiPassthroughArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.subject = defaults.subject;
        }

        public Builder extensions(@Nullable Input<CertificateExtensionsArgs> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder extensions(@Nullable CertificateExtensionsArgs extensions) {
            this.extensions = Input.ofNullable(extensions);
            return this;
        }

        public Builder subject(@Nullable Input<CertificateSubjectArgs> subject) {
            this.subject = subject;
            return this;
        }

        public Builder subject(@Nullable CertificateSubjectArgs subject) {
            this.subject = Input.ofNullable(subject);
            return this;
        }
        public CertificateApiPassthroughArgs build() {
            return new CertificateApiPassthroughArgs(extensions, subject);
        }
    }
}
