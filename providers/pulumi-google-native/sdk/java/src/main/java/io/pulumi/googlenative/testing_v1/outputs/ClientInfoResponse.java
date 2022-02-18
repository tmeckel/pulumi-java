// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.ClientInfoDetailResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ClientInfoResponse {
    /**
     * The list of detailed information about client.
     * 
     */
    private final List<ClientInfoDetailResponse> clientInfoDetails;
    /**
     * Client name, such as gcloud.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"clientInfoDetails","name"})
    private ClientInfoResponse(
        List<ClientInfoDetailResponse> clientInfoDetails,
        String name) {
        this.clientInfoDetails = Objects.requireNonNull(clientInfoDetails);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The list of detailed information about client.
     * 
     */
    public List<ClientInfoDetailResponse> getClientInfoDetails() {
        return this.clientInfoDetails;
    }
    /**
     * Client name, such as gcloud.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ClientInfoDetailResponse> clientInfoDetails;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientInfoDetails = defaults.clientInfoDetails;
    	      this.name = defaults.name;
        }

        public Builder setClientInfoDetails(List<ClientInfoDetailResponse> clientInfoDetails) {
            this.clientInfoDetails = Objects.requireNonNull(clientInfoDetails);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ClientInfoResponse build() {
            return new ClientInfoResponse(clientInfoDetails, name);
        }
    }
}
