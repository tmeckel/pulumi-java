// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.ClientInfoDetailArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the client which invoked the test.
 * 
 */
public final class ClientInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientInfoArgs Empty = new ClientInfoArgs();

    /**
     * The list of detailed information about client.
     * 
     */
    @InputImport(name="clientInfoDetails")
    private final @Nullable Input<List<ClientInfoDetailArgs>> clientInfoDetails;

    public Input<List<ClientInfoDetailArgs>> getClientInfoDetails() {
        return this.clientInfoDetails == null ? Input.empty() : this.clientInfoDetails;
    }

    /**
     * Client name, such as gcloud.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ClientInfoArgs(
        @Nullable Input<List<ClientInfoDetailArgs>> clientInfoDetails,
        Input<String> name) {
        this.clientInfoDetails = clientInfoDetails;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ClientInfoArgs() {
        this.clientInfoDetails = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClientInfoDetailArgs>> clientInfoDetails;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientInfoDetails = defaults.clientInfoDetails;
    	      this.name = defaults.name;
        }

        public Builder setClientInfoDetails(@Nullable Input<List<ClientInfoDetailArgs>> clientInfoDetails) {
            this.clientInfoDetails = clientInfoDetails;
            return this;
        }

        public Builder setClientInfoDetails(@Nullable List<ClientInfoDetailArgs> clientInfoDetails) {
            this.clientInfoDetails = Input.ofNullable(clientInfoDetails);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public ClientInfoArgs build() {
            return new ClientInfoArgs(clientInfoDetails, name);
        }
    }
}
