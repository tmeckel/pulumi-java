// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.MetadataCredentialsFromPluginResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] gRPC call credentials to access the SDS server. gRPC call credentials to access the SDS server.
 * 
 */
public final class CallCredentialsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CallCredentialsResponse Empty = new CallCredentialsResponse();

    /**
     * The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    @Import(name="callCredentialType", required=true)
    private String callCredentialType;

    /**
     * @return The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    public String callCredentialType() {
        return this.callCredentialType;
    }

    /**
     * Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    @Import(name="fromPlugin", required=true)
    private MetadataCredentialsFromPluginResponse fromPlugin;

    /**
     * @return Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    public MetadataCredentialsFromPluginResponse fromPlugin() {
        return this.fromPlugin;
    }

    private CallCredentialsResponse() {}

    private CallCredentialsResponse(CallCredentialsResponse $) {
        this.callCredentialType = $.callCredentialType;
        this.fromPlugin = $.fromPlugin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CallCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CallCredentialsResponse $;

        public Builder() {
            $ = new CallCredentialsResponse();
        }

        public Builder(CallCredentialsResponse defaults) {
            $ = new CallCredentialsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param callCredentialType The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
         * 
         * @return builder
         * 
         */
        public Builder callCredentialType(String callCredentialType) {
            $.callCredentialType = callCredentialType;
            return this;
        }

        /**
         * @param fromPlugin Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
         * 
         * @return builder
         * 
         */
        public Builder fromPlugin(MetadataCredentialsFromPluginResponse fromPlugin) {
            $.fromPlugin = fromPlugin;
            return this;
        }

        public CallCredentialsResponse build() {
            $.callCredentialType = Objects.requireNonNull($.callCredentialType, "expected parameter 'callCredentialType' to be non-null");
            $.fromPlugin = Objects.requireNonNull($.fromPlugin, "expected parameter 'fromPlugin' to be non-null");
            return $;
        }
    }

}
