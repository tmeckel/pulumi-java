// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication certificates of an application gateway.
 * 
 */
public final class ApplicationGatewayAuthenticationCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayAuthenticationCertificateArgs Empty = new ApplicationGatewayAuthenticationCertificateArgs();

    /**
     * Certificate public data.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Name of the authentication certificate that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ApplicationGatewayAuthenticationCertificateArgs(
        @Nullable Output<String> data,
        @Nullable Output<String> id,
        @Nullable Output<String> name) {
        this.data = data;
        this.id = id;
        this.name = name;
    }

    private ApplicationGatewayAuthenticationCertificateArgs() {
        this.data = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayAuthenticationCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayAuthenticationCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ApplicationGatewayAuthenticationCertificateArgs build() {
            return new ApplicationGatewayAuthenticationCertificateArgs(data, id, name);
        }
    }
}
