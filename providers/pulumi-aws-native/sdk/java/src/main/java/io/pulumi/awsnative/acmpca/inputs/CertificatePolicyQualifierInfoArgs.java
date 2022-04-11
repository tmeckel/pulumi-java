// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateQualifierArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Structure that contains X.509 Policy qualifier information.
 * 
 */
public final class CertificatePolicyQualifierInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificatePolicyQualifierInfoArgs Empty = new CertificatePolicyQualifierInfoArgs();

    @Import(name="policyQualifierId", required=true)
      private final Output<String> policyQualifierId;

    public Output<String> getPolicyQualifierId() {
        return this.policyQualifierId;
    }

    @Import(name="qualifier", required=true)
      private final Output<CertificateQualifierArgs> qualifier;

    public Output<CertificateQualifierArgs> getQualifier() {
        return this.qualifier;
    }

    public CertificatePolicyQualifierInfoArgs(
        Output<String> policyQualifierId,
        Output<CertificateQualifierArgs> qualifier) {
        this.policyQualifierId = Objects.requireNonNull(policyQualifierId, "expected parameter 'policyQualifierId' to be non-null");
        this.qualifier = Objects.requireNonNull(qualifier, "expected parameter 'qualifier' to be non-null");
    }

    private CertificatePolicyQualifierInfoArgs() {
        this.policyQualifierId = Codegen.empty();
        this.qualifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePolicyQualifierInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyQualifierId;
        private Output<CertificateQualifierArgs> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePolicyQualifierInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyQualifierId = defaults.policyQualifierId;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder policyQualifierId(Output<String> policyQualifierId) {
            this.policyQualifierId = Objects.requireNonNull(policyQualifierId);
            return this;
        }
        public Builder policyQualifierId(String policyQualifierId) {
            this.policyQualifierId = Output.of(Objects.requireNonNull(policyQualifierId));
            return this;
        }
        public Builder qualifier(Output<CertificateQualifierArgs> qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }
        public Builder qualifier(CertificateQualifierArgs qualifier) {
            this.qualifier = Output.of(Objects.requireNonNull(qualifier));
            return this;
        }        public CertificatePolicyQualifierInfoArgs build() {
            return new CertificatePolicyQualifierInfoArgs(policyQualifierId, qualifier);
        }
    }
}
