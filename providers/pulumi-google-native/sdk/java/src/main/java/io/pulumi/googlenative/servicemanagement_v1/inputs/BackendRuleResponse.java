// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * A backend rule provides configuration for an individual API element.
 * 
 */
public final class BackendRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendRuleResponse Empty = new BackendRuleResponse();

    /**
     * The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
     * 
     */
    @InputImport(name="address", required=true)
      private final String address;

    public String getAddress() {
        return this.address;
    }

    /**
     * The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
     * 
     */
    @InputImport(name="deadline", required=true)
      private final Double deadline;

    public Double getDeadline() {
        return this.deadline;
    }

    /**
     * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization" HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
     * 
     */
    @InputImport(name="disableAuth", required=true)
      private final Boolean disableAuth;

    public Boolean getDisableAuth() {
        return this.disableAuth;
    }

    /**
     * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP "authorization" header, and sent to the backend.
     * 
     */
    @InputImport(name="jwtAudience", required=true)
      private final String jwtAudience;

    public String getJwtAudience() {
        return this.jwtAudience;
    }

    /**
     * The number of seconds to wait for the completion of a long running operation. The default is no deadline.
     * 
     */
    @InputImport(name="operationDeadline", required=true)
      private final Double operationDeadline;

    public Double getOperationDeadline() {
        return this.operationDeadline;
    }

    @InputImport(name="pathTranslation", required=true)
      private final String pathTranslation;

    public String getPathTranslation() {
        return this.pathTranslation;
    }

    /**
     * The protocol used for sending a request to the backend. The supported values are "http/1.1" and "h2". The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @InputImport(name="selector", required=true)
      private final String selector;

    public String getSelector() {
        return this.selector;
    }

    public BackendRuleResponse(
        String address,
        Double deadline,
        Boolean disableAuth,
        String jwtAudience,
        Double operationDeadline,
        String pathTranslation,
        String protocol,
        String selector) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.deadline = Objects.requireNonNull(deadline, "expected parameter 'deadline' to be non-null");
        this.disableAuth = Objects.requireNonNull(disableAuth, "expected parameter 'disableAuth' to be non-null");
        this.jwtAudience = Objects.requireNonNull(jwtAudience, "expected parameter 'jwtAudience' to be non-null");
        this.operationDeadline = Objects.requireNonNull(operationDeadline, "expected parameter 'operationDeadline' to be non-null");
        this.pathTranslation = Objects.requireNonNull(pathTranslation, "expected parameter 'pathTranslation' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
    }

    private BackendRuleResponse() {
        this.address = null;
        this.deadline = null;
        this.disableAuth = null;
        this.jwtAudience = null;
        this.operationDeadline = null;
        this.pathTranslation = null;
        this.protocol = null;
        this.selector = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private Double deadline;
        private Boolean disableAuth;
        private String jwtAudience;
        private Double operationDeadline;
        private String pathTranslation;
        private String protocol;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.deadline = defaults.deadline;
    	      this.disableAuth = defaults.disableAuth;
    	      this.jwtAudience = defaults.jwtAudience;
    	      this.operationDeadline = defaults.operationDeadline;
    	      this.pathTranslation = defaults.pathTranslation;
    	      this.protocol = defaults.protocol;
    	      this.selector = defaults.selector;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder deadline(Double deadline) {
            this.deadline = Objects.requireNonNull(deadline);
            return this;
        }

        public Builder disableAuth(Boolean disableAuth) {
            this.disableAuth = Objects.requireNonNull(disableAuth);
            return this;
        }

        public Builder jwtAudience(String jwtAudience) {
            this.jwtAudience = Objects.requireNonNull(jwtAudience);
            return this;
        }

        public Builder operationDeadline(Double operationDeadline) {
            this.operationDeadline = Objects.requireNonNull(operationDeadline);
            return this;
        }

        public Builder pathTranslation(String pathTranslation) {
            this.pathTranslation = Objects.requireNonNull(pathTranslation);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public BackendRuleResponse build() {
            return new BackendRuleResponse(address, deadline, disableAuth, jwtAudience, operationDeadline, pathTranslation, protocol, selector);
        }
    }
}
