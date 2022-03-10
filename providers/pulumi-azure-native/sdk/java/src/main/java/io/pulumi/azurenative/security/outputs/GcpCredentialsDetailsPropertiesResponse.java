// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GcpCredentialsDetailsPropertiesResponse {
    /**
     * Auth provider x509 certificate URL field of the API key (write only)
     * 
     */
    private final String authProviderX509CertUrl;
    /**
     * Auth URI field of the API key (write only)
     * 
     */
    private final String authUri;
    /**
     * State of the multi-cloud connector
     * 
     */
    private final String authenticationProvisioningState;
    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'gcpCredentials'.
     * 
     */
    private final String authenticationType;
    /**
     * Client email field of the API key (write only)
     * 
     */
    private final String clientEmail;
    /**
     * Client ID field of the API key (write only)
     * 
     */
    private final String clientId;
    /**
     * Client x509 certificate URL field of the API key (write only)
     * 
     */
    private final String clientX509CertUrl;
    /**
     * The permissions detected in the cloud account.
     * 
     */
    private final List<String> grantedPermissions;
    /**
     * The organization ID of the GCP cloud account
     * 
     */
    private final String organizationId;
    /**
     * Private key field of the API key (write only)
     * 
     */
    private final String privateKey;
    /**
     * Private key ID field of the API key (write only)
     * 
     */
    private final String privateKeyId;
    /**
     * Project ID field of the API key (write only)
     * 
     */
    private final String projectId;
    /**
     * Token URI field of the API key (write only)
     * 
     */
    private final String tokenUri;
    /**
     * Type field of the API key (write only)
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GcpCredentialsDetailsPropertiesResponse(
        @OutputCustomType.Parameter("authProviderX509CertUrl") String authProviderX509CertUrl,
        @OutputCustomType.Parameter("authUri") String authUri,
        @OutputCustomType.Parameter("authenticationProvisioningState") String authenticationProvisioningState,
        @OutputCustomType.Parameter("authenticationType") String authenticationType,
        @OutputCustomType.Parameter("clientEmail") String clientEmail,
        @OutputCustomType.Parameter("clientId") String clientId,
        @OutputCustomType.Parameter("clientX509CertUrl") String clientX509CertUrl,
        @OutputCustomType.Parameter("grantedPermissions") List<String> grantedPermissions,
        @OutputCustomType.Parameter("organizationId") String organizationId,
        @OutputCustomType.Parameter("privateKey") String privateKey,
        @OutputCustomType.Parameter("privateKeyId") String privateKeyId,
        @OutputCustomType.Parameter("projectId") String projectId,
        @OutputCustomType.Parameter("tokenUri") String tokenUri,
        @OutputCustomType.Parameter("type") String type) {
        this.authProviderX509CertUrl = authProviderX509CertUrl;
        this.authUri = authUri;
        this.authenticationProvisioningState = authenticationProvisioningState;
        this.authenticationType = authenticationType;
        this.clientEmail = clientEmail;
        this.clientId = clientId;
        this.clientX509CertUrl = clientX509CertUrl;
        this.grantedPermissions = grantedPermissions;
        this.organizationId = organizationId;
        this.privateKey = privateKey;
        this.privateKeyId = privateKeyId;
        this.projectId = projectId;
        this.tokenUri = tokenUri;
        this.type = type;
    }

    /**
     * Auth provider x509 certificate URL field of the API key (write only)
     * 
    */
    public String getAuthProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }
    /**
     * Auth URI field of the API key (write only)
     * 
    */
    public String getAuthUri() {
        return this.authUri;
    }
    /**
     * State of the multi-cloud connector
     * 
    */
    public String getAuthenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }
    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'gcpCredentials'.
     * 
    */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Client email field of the API key (write only)
     * 
    */
    public String getClientEmail() {
        return this.clientEmail;
    }
    /**
     * Client ID field of the API key (write only)
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Client x509 certificate URL field of the API key (write only)
     * 
    */
    public String getClientX509CertUrl() {
        return this.clientX509CertUrl;
    }
    /**
     * The permissions detected in the cloud account.
     * 
    */
    public List<String> getGrantedPermissions() {
        return this.grantedPermissions;
    }
    /**
     * The organization ID of the GCP cloud account
     * 
    */
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Private key field of the API key (write only)
     * 
    */
    public String getPrivateKey() {
        return this.privateKey;
    }
    /**
     * Private key ID field of the API key (write only)
     * 
    */
    public String getPrivateKeyId() {
        return this.privateKeyId;
    }
    /**
     * Project ID field of the API key (write only)
     * 
    */
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Token URI field of the API key (write only)
     * 
    */
    public String getTokenUri() {
        return this.tokenUri;
    }
    /**
     * Type field of the API key (write only)
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpCredentialsDetailsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authProviderX509CertUrl;
        private String authUri;
        private String authenticationProvisioningState;
        private String authenticationType;
        private String clientEmail;
        private String clientId;
        private String clientX509CertUrl;
        private List<String> grantedPermissions;
        private String organizationId;
        private String privateKey;
        private String privateKeyId;
        private String projectId;
        private String tokenUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpCredentialsDetailsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authProviderX509CertUrl = defaults.authProviderX509CertUrl;
    	      this.authUri = defaults.authUri;
    	      this.authenticationProvisioningState = defaults.authenticationProvisioningState;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientEmail = defaults.clientEmail;
    	      this.clientId = defaults.clientId;
    	      this.clientX509CertUrl = defaults.clientX509CertUrl;
    	      this.grantedPermissions = defaults.grantedPermissions;
    	      this.organizationId = defaults.organizationId;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
    	      this.projectId = defaults.projectId;
    	      this.tokenUri = defaults.tokenUri;
    	      this.type = defaults.type;
        }

        public Builder authProviderX509CertUrl(String authProviderX509CertUrl) {
            this.authProviderX509CertUrl = Objects.requireNonNull(authProviderX509CertUrl);
            return this;
        }

        public Builder authUri(String authUri) {
            this.authUri = Objects.requireNonNull(authUri);
            return this;
        }

        public Builder authenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder clientEmail(String clientEmail) {
            this.clientEmail = Objects.requireNonNull(clientEmail);
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder clientX509CertUrl(String clientX509CertUrl) {
            this.clientX509CertUrl = Objects.requireNonNull(clientX509CertUrl);
            return this;
        }

        public Builder grantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder privateKeyId(String privateKeyId) {
            this.privateKeyId = Objects.requireNonNull(privateKeyId);
            return this;
        }

        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder tokenUri(String tokenUri) {
            this.tokenUri = Objects.requireNonNull(tokenUri);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GcpCredentialsDetailsPropertiesResponse build() {
            return new GcpCredentialsDetailsPropertiesResponse(authProviderX509CertUrl, authUri, authenticationProvisioningState, authenticationType, clientEmail, clientId, clientX509CertUrl, grantedPermissions, organizationId, privateKey, privateKeyId, projectId, tokenUri, type);
        }
    }
}
