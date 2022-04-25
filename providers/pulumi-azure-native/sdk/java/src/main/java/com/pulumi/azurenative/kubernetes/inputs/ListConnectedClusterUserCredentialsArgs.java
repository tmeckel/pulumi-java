// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetes.inputs;

import com.pulumi.azurenative.kubernetes.enums.AuthenticationMethod;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ListConnectedClusterUserCredentialsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListConnectedClusterUserCredentialsArgs Empty = new ListConnectedClusterUserCredentialsArgs();

    /**
     * The mode of client authentication.
     * 
     */
    @Import(name="authenticationMethod", required=true)
    private Either<String,AuthenticationMethod> authenticationMethod;

    /**
     * @return The mode of client authentication.
     * 
     */
    public Either<String,AuthenticationMethod> authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Boolean value to indicate whether the request is for client side proxy or not
     * 
     */
    @Import(name="clientProxy", required=true)
    private Boolean clientProxy;

    /**
     * @return Boolean value to indicate whether the request is for client side proxy or not
     * 
     */
    public Boolean clientProxy() {
        return this.clientProxy;
    }

    /**
     * The name of the Kubernetes cluster on which get is called.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the Kubernetes cluster on which get is called.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListConnectedClusterUserCredentialsArgs() {}

    private ListConnectedClusterUserCredentialsArgs(ListConnectedClusterUserCredentialsArgs $) {
        this.authenticationMethod = $.authenticationMethod;
        this.clientProxy = $.clientProxy;
        this.clusterName = $.clusterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListConnectedClusterUserCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListConnectedClusterUserCredentialsArgs $;

        public Builder() {
            $ = new ListConnectedClusterUserCredentialsArgs();
        }

        public Builder(ListConnectedClusterUserCredentialsArgs defaults) {
            $ = new ListConnectedClusterUserCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMethod The mode of client authentication.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(Either<String,AuthenticationMethod> authenticationMethod) {
            $.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * @param authenticationMethod The mode of client authentication.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(String authenticationMethod) {
            return authenticationMethod(Either.ofLeft(authenticationMethod));
        }

        /**
         * @param authenticationMethod The mode of client authentication.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(AuthenticationMethod authenticationMethod) {
            return authenticationMethod(Either.ofRight(authenticationMethod));
        }

        /**
         * @param clientProxy Boolean value to indicate whether the request is for client side proxy or not
         * 
         * @return builder
         * 
         */
        public Builder clientProxy(Boolean clientProxy) {
            $.clientProxy = clientProxy;
            return this;
        }

        /**
         * @param clusterName The name of the Kubernetes cluster on which get is called.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListConnectedClusterUserCredentialsArgs build() {
            $.authenticationMethod = Objects.requireNonNull($.authenticationMethod, "expected parameter 'authenticationMethod' to be non-null");
            $.clientProxy = Objects.requireNonNull($.clientProxy, "expected parameter 'clientProxy' to be non-null");
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
