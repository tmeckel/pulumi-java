// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Authorization header information.
 * 
 */
public final class BackendAuthorizationHeaderCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendAuthorizationHeaderCredentialsArgs Empty = new BackendAuthorizationHeaderCredentialsArgs();

    /**
     * Authentication Parameter value.
     * 
     */
    @Import(name="parameter", required=true)
      private final Output<String> parameter;

    public Output<String> getParameter() {
        return this.parameter;
    }

    /**
     * Authentication Scheme name.
     * 
     */
    @Import(name="scheme", required=true)
      private final Output<String> scheme;

    public Output<String> getScheme() {
        return this.scheme;
    }

    public BackendAuthorizationHeaderCredentialsArgs(
        Output<String> parameter,
        Output<String> scheme) {
        this.parameter = Objects.requireNonNull(parameter, "expected parameter 'parameter' to be non-null");
        this.scheme = Objects.requireNonNull(scheme, "expected parameter 'scheme' to be non-null");
    }

    private BackendAuthorizationHeaderCredentialsArgs() {
        this.parameter = Codegen.empty();
        this.scheme = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendAuthorizationHeaderCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parameter;
        private Output<String> scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendAuthorizationHeaderCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.scheme = defaults.scheme;
        }

        public Builder parameter(Output<String> parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }
        public Builder parameter(String parameter) {
            this.parameter = Output.of(Objects.requireNonNull(parameter));
            return this;
        }
        public Builder scheme(Output<String> scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }
        public Builder scheme(String scheme) {
            this.scheme = Output.of(Objects.requireNonNull(scheme));
            return this;
        }        public BackendAuthorizationHeaderCredentialsArgs build() {
            return new BackendAuthorizationHeaderCredentialsArgs(parameter, scheme);
        }
    }
}
