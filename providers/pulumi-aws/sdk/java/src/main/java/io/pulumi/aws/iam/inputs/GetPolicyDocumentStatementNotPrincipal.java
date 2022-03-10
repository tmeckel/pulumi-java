// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPolicyDocumentStatementNotPrincipal extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyDocumentStatementNotPrincipal Empty = new GetPolicyDocumentStatementNotPrincipal();

    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     * 
     */
    @InputImport(name="identifiers", required=true)
      private final List<String> identifiers;

    public List<String> getIdentifiers() {
        return this.identifiers;
    }

    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GetPolicyDocumentStatementNotPrincipal(
        List<String> identifiers,
        String type) {
        this.identifiers = Objects.requireNonNull(identifiers, "expected parameter 'identifiers' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetPolicyDocumentStatementNotPrincipal() {
        this.identifiers = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementNotPrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> identifiers;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDocumentStatementNotPrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifiers = defaults.identifiers;
    	      this.type = defaults.type;
        }

        public Builder identifiers(List<String> identifiers) {
            this.identifiers = Objects.requireNonNull(identifiers);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPolicyDocumentStatementNotPrincipal build() {
            return new GetPolicyDocumentStatementNotPrincipal(identifiers, type);
        }
    }
}
