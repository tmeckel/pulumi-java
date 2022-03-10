// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The mapping between a particular client IP and the type of access client has on the NFS share.
 * 
 */
public final class ClientAccessRightResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientAccessRightResponse Empty = new ClientAccessRightResponse();

    /**
     * Type of access to be allowed for the client.
     * 
     */
    @InputImport(name="accessPermission", required=true)
      private final String accessPermission;

    public String getAccessPermission() {
        return this.accessPermission;
    }

    /**
     * IP of the client.
     * 
     */
    @InputImport(name="client", required=true)
      private final String client;

    public String getClient() {
        return this.client;
    }

    public ClientAccessRightResponse(
        String accessPermission,
        String client) {
        this.accessPermission = Objects.requireNonNull(accessPermission, "expected parameter 'accessPermission' to be non-null");
        this.client = Objects.requireNonNull(client, "expected parameter 'client' to be non-null");
    }

    private ClientAccessRightResponse() {
        this.accessPermission = null;
        this.client = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAccessRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPermission;
        private String client;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientAccessRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPermission = defaults.accessPermission;
    	      this.client = defaults.client;
        }

        public Builder accessPermission(String accessPermission) {
            this.accessPermission = Objects.requireNonNull(accessPermission);
            return this;
        }

        public Builder client(String client) {
            this.client = Objects.requireNonNull(client);
            return this;
        }
        public ClientAccessRightResponse build() {
            return new ClientAccessRightResponse(accessPermission, client);
        }
    }
}
