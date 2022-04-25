// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterAuthorizationAdminUserGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterAuthorizationAdminUserGetArgs Empty = new AzureClusterAuthorizationAdminUserGetArgs();

    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private AzureClusterAuthorizationAdminUserGetArgs() {}

    private AzureClusterAuthorizationAdminUserGetArgs(AzureClusterAuthorizationAdminUserGetArgs $) {
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterAuthorizationAdminUserGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterAuthorizationAdminUserGetArgs $;

        public Builder() {
            $ = new AzureClusterAuthorizationAdminUserGetArgs();
        }

        public Builder(AzureClusterAuthorizationAdminUserGetArgs defaults) {
            $ = new AzureClusterAuthorizationAdminUserGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param username Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public AzureClusterAuthorizationAdminUserGetArgs build() {
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
