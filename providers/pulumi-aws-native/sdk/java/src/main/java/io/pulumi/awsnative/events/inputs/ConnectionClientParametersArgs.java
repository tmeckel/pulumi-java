// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ConnectionClientParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionClientParametersArgs Empty = new ConnectionClientParametersArgs();

    @Import(name="clientID", required=true)
      private final Output<String> clientID;

    public Output<String> getClientID() {
        return this.clientID;
    }

    @Import(name="clientSecret", required=true)
      private final Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret;
    }

    public ConnectionClientParametersArgs(
        Output<String> clientID,
        Output<String> clientSecret) {
        this.clientID = Objects.requireNonNull(clientID, "expected parameter 'clientID' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
    }

    private ConnectionClientParametersArgs() {
        this.clientID = Codegen.empty();
        this.clientSecret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionClientParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clientID;
        private Output<String> clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionClientParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientID = defaults.clientID;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder clientID(Output<String> clientID) {
            this.clientID = Objects.requireNonNull(clientID);
            return this;
        }
        public Builder clientID(String clientID) {
            this.clientID = Output.of(Objects.requireNonNull(clientID));
            return this;
        }
        public Builder clientSecret(Output<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Output.of(Objects.requireNonNull(clientSecret));
            return this;
        }        public ConnectionClientParametersArgs build() {
            return new ConnectionClientParametersArgs(clientID, clientSecret);
        }
    }
}
