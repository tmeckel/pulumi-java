// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers. More information could be found at: https://cloud.google.com/dialogflow/docs/fulfillment-configure.
 * 
 */
public final class GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs Empty = new GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs();

    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    @Import(name="isCloudFunction")
    private @Nullable Output<Boolean> isCloudFunction;

    /**
     * @return Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    public Optional<Output<Boolean>> isCloudFunction() {
        return Optional.ofNullable(this.isCloudFunction);
    }

    /**
     * Optional. The password for HTTP Basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Optional. The password for HTTP Basic authentication.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Optional. The HTTP request headers to send together with fulfillment requests.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable Output<Map<String,String>> requestHeaders;

    /**
     * @return Optional. The HTTP request headers to send together with fulfillment requests.
     * 
     */
    public Optional<Output<Map<String,String>>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    /**
     * Optional. The user name for HTTP Basic authentication.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Optional. The user name for HTTP Basic authentication.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs() {}

    private GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs(GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs $) {
        this.isCloudFunction = $.isCloudFunction;
        this.password = $.password;
        this.requestHeaders = $.requestHeaders;
        this.uri = $.uri;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs();
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs defaults) {
            $ = new GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isCloudFunction Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
         * 
         * @return builder
         * 
         */
        public Builder isCloudFunction(@Nullable Output<Boolean> isCloudFunction) {
            $.isCloudFunction = isCloudFunction;
            return this;
        }

        /**
         * @param isCloudFunction Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
         * 
         * @return builder
         * 
         */
        public Builder isCloudFunction(Boolean isCloudFunction) {
            return isCloudFunction(Output.of(isCloudFunction));
        }

        /**
         * @param password Optional. The password for HTTP Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Optional. The password for HTTP Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param requestHeaders Optional. The HTTP request headers to send together with fulfillment requests.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(@Nullable Output<Map<String,String>> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        /**
         * @param requestHeaders Optional. The HTTP request headers to send together with fulfillment requests.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(Map<String,String> requestHeaders) {
            return requestHeaders(Output.of(requestHeaders));
        }

        /**
         * @param uri The fulfillment URI for receiving POST requests. It must use https protocol.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The fulfillment URI for receiving POST requests. It must use https protocol.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        /**
         * @param username Optional. The user name for HTTP Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Optional. The user name for HTTP Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GoogleCloudDialogflowV2FulfillmentGenericWebServiceArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
