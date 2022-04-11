// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainPermissionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainPermissionsArgs Empty = new DomainPermissionsArgs();

    /**
     * The name of the domain on which to set the resource policy.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> getDomain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
      private final @Nullable Output<String> domainOwner;

    public Output<String> getDomainOwner() {
        return this.domainOwner == null ? Codegen.empty() : this.domainOwner;
    }

    /**
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @Import(name="policyDocument", required=true)
      private final Output<String> policyDocument;

    public Output<String> getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
     * 
     */
    @Import(name="policyRevision")
      private final @Nullable Output<String> policyRevision;

    public Output<String> getPolicyRevision() {
        return this.policyRevision == null ? Codegen.empty() : this.policyRevision;
    }

    public DomainPermissionsArgs(
        Output<String> domain,
        @Nullable Output<String> domainOwner,
        Output<String> policyDocument,
        @Nullable Output<String> policyRevision) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.domainOwner = domainOwner;
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyRevision = policyRevision;
    }

    private DomainPermissionsArgs() {
        this.domain = Codegen.empty();
        this.domainOwner = Codegen.empty();
        this.policyDocument = Codegen.empty();
        this.policyRevision = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainPermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domain;
        private @Nullable Output<String> domainOwner;
        private Output<String> policyDocument;
        private @Nullable Output<String> policyRevision;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainPermissionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyRevision = defaults.policyRevision;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }
        public Builder domainOwner(@Nullable String domainOwner) {
            this.domainOwner = Codegen.ofNullable(domainOwner);
            return this;
        }
        public Builder policyDocument(Output<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Output.of(Objects.requireNonNull(policyDocument));
            return this;
        }
        public Builder policyRevision(@Nullable Output<String> policyRevision) {
            this.policyRevision = policyRevision;
            return this;
        }
        public Builder policyRevision(@Nullable String policyRevision) {
            this.policyRevision = Codegen.ofNullable(policyRevision);
            return this;
        }        public DomainPermissionsArgs build() {
            return new DomainPermissionsArgs(domain, domainOwner, policyDocument, policyRevision);
        }
    }
}
