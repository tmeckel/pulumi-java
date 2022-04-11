// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an identity for which to determine resource access, based on roles assigned either directly to them or to the groups they belong to, directly or indirectly.
 * 
 */
public final class IdentitySelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentitySelectorArgs Empty = new IdentitySelectorArgs();

    /**
     * The identity appear in the form of principals in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
     * 
     */
    @Import(name="identity", required=true)
      private final Output<String> identity;

    public Output<String> getIdentity() {
        return this.identity;
    }

    public IdentitySelectorArgs(Output<String> identity) {
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
    }

    private IdentitySelectorArgs() {
        this.identity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentitySelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> identity;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentitySelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
        }

        public Builder identity(Output<String> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder identity(String identity) {
            this.identity = Output.of(Objects.requireNonNull(identity));
            return this;
        }        public IdentitySelectorArgs build() {
            return new IdentitySelectorArgs(identity);
        }
    }
}
