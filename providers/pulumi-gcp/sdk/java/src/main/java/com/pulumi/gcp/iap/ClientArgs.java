// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientArgs Empty = new ClientArgs();

    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    @Import(name="brand", required=true)
    private Output<String> brand;

    /**
     * @return Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    public Output<String> brand() {
        return this.brand;
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Human-friendly name given to the OAuth client.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    private ClientArgs() {}

    private ClientArgs(ClientArgs $) {
        this.brand = $.brand;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientArgs $;

        public Builder() {
            $ = new ClientArgs();
        }

        public Builder(ClientArgs defaults) {
            $ = new ClientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brand Identifier of the brand to which this client
         * is attached to. The format is
         * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
         * 
         * @return builder
         * 
         */
        public Builder brand(Output<String> brand) {
            $.brand = brand;
            return this;
        }

        /**
         * @param brand Identifier of the brand to which this client
         * is attached to. The format is
         * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
         * 
         * @return builder
         * 
         */
        public Builder brand(String brand) {
            return brand(Output.of(brand));
        }

        /**
         * @param displayName Human-friendly name given to the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human-friendly name given to the OAuth client.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public ClientArgs build() {
            $.brand = Objects.requireNonNull($.brand, "expected parameter 'brand' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
