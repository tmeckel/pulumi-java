// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateValidationArgs Empty = new CertificateValidationArgs();

    /**
     * The ARN of the certificate that is being validated.
     * 
     */
    @Import(name="certificateArn", required=true)
      private final Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
     * 
     */
    @Import(name="validationRecordFqdns")
      private final @Nullable Output<List<String>> validationRecordFqdns;

    public Output<List<String>> getValidationRecordFqdns() {
        return this.validationRecordFqdns == null ? Codegen.empty() : this.validationRecordFqdns;
    }

    public CertificateValidationArgs(
        Output<String> certificateArn,
        @Nullable Output<List<String>> validationRecordFqdns) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
        this.validationRecordFqdns = validationRecordFqdns;
    }

    private CertificateValidationArgs() {
        this.certificateArn = Codegen.empty();
        this.validationRecordFqdns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateArn;
        private @Nullable Output<List<String>> validationRecordFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.validationRecordFqdns = defaults.validationRecordFqdns;
        }

        public Builder certificateArn(Output<String> certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Output.of(Objects.requireNonNull(certificateArn));
            return this;
        }
        public Builder validationRecordFqdns(@Nullable Output<List<String>> validationRecordFqdns) {
            this.validationRecordFqdns = validationRecordFqdns;
            return this;
        }
        public Builder validationRecordFqdns(@Nullable List<String> validationRecordFqdns) {
            this.validationRecordFqdns = Codegen.ofNullable(validationRecordFqdns);
            return this;
        }
        public Builder validationRecordFqdns(String... validationRecordFqdns) {
            return validationRecordFqdns(List.of(validationRecordFqdns));
        }        public CertificateValidationArgs build() {
            return new CertificateValidationArgs(certificateArn, validationRecordFqdns);
        }
    }
}
