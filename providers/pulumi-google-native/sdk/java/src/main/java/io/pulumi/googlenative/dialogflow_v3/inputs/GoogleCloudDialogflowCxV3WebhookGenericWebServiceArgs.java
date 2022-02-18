// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for a generic web service.
 * 
 */
public final class GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs Empty = new GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs();

    /**
     * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with "subject alt name". For instance a certificate can be self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile <(printf "\nsubjectAltName='DNS:www.example.com'")
     * 
     */
    @InputImport(name="allowedCaCerts")
    private final @Nullable Input<List<String>> allowedCaCerts;

    public Input<List<String>> getAllowedCaCerts() {
        return this.allowedCaCerts == null ? Input.empty() : this.allowedCaCerts;
    }

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The HTTP request headers to send together with webhook requests.
     * 
     */
    @InputImport(name="requestHeaders")
    private final @Nullable Input<Map<String,String>> requestHeaders;

    public Input<Map<String,String>> getRequestHeaders() {
        return this.requestHeaders == null ? Input.empty() : this.requestHeaders;
    }

    /**
     * The webhook URI for receiving POST requests. It must use https protocol.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs(
        @Nullable Input<List<String>> allowedCaCerts,
        @Nullable Input<String> password,
        @Nullable Input<Map<String,String>> requestHeaders,
        Input<String> uri,
        @Nullable Input<String> username) {
        this.allowedCaCerts = allowedCaCerts;
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs() {
        this.allowedCaCerts = Input.empty();
        this.password = Input.empty();
        this.requestHeaders = Input.empty();
        this.uri = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedCaCerts;
        private @Nullable Input<String> password;
        private @Nullable Input<Map<String,String>> requestHeaders;
        private Input<String> uri;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setAllowedCaCerts(@Nullable Input<List<String>> allowedCaCerts) {
            this.allowedCaCerts = allowedCaCerts;
            return this;
        }

        public Builder setAllowedCaCerts(@Nullable List<String> allowedCaCerts) {
            this.allowedCaCerts = Input.ofNullable(allowedCaCerts);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setRequestHeaders(@Nullable Input<Map<String,String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }

        public Builder setRequestHeaders(@Nullable Map<String,String> requestHeaders) {
            this.requestHeaders = Input.ofNullable(requestHeaders);
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs build() {
            return new GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}
