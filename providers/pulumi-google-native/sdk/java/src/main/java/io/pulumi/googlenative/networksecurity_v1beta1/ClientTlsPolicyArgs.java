// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.GoogleCloudNetworksecurityV1beta1CertificateProviderArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.ValidationCAArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClientTlsPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientTlsPolicyArgs Empty = new ClientTlsPolicyArgs();

    /**
     * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    @InputImport(name="clientCertificate")
      private final @Nullable Input<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> clientCertificate;

    public Input<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> getClientCertificate() {
        return this.clientCertificate == null ? Input.empty() : this.clientCertificate;
    }

    @InputImport(name="clientTlsPolicyId", required=true)
      private final Input<String> clientTlsPolicyId;

    public Input<String> getClientTlsPolicyId() {
        return this.clientTlsPolicyId;
    }

    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. Set of label tags associated with the resource.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    @InputImport(name="serverValidationCa")
      private final @Nullable Input<List<ValidationCAArgs>> serverValidationCa;

    public Input<List<ValidationCAArgs>> getServerValidationCa() {
        return this.serverValidationCa == null ? Input.empty() : this.serverValidationCa;
    }

    /**
     * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
     * 
     */
    @InputImport(name="sni")
      private final @Nullable Input<String> sni;

    public Input<String> getSni() {
        return this.sni == null ? Input.empty() : this.sni;
    }

    public ClientTlsPolicyArgs(
        @Nullable Input<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> clientCertificate,
        Input<String> clientTlsPolicyId,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<ValidationCAArgs>> serverValidationCa,
        @Nullable Input<String> sni) {
        this.clientCertificate = clientCertificate;
        this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId, "expected parameter 'clientTlsPolicyId' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serverValidationCa = serverValidationCa;
        this.sni = sni;
    }

    private ClientTlsPolicyArgs() {
        this.clientCertificate = Input.empty();
        this.clientTlsPolicyId = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serverValidationCa = Input.empty();
        this.sni = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientTlsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> clientCertificate;
        private Input<String> clientTlsPolicyId;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<ValidationCAArgs>> serverValidationCa;
        private @Nullable Input<String> sni;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientTlsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientTlsPolicyId = defaults.clientTlsPolicyId;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serverValidationCa = defaults.serverValidationCa;
    	      this.sni = defaults.sni;
        }

        public Builder clientCertificate(@Nullable Input<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        public Builder clientCertificate(@Nullable GoogleCloudNetworksecurityV1beta1CertificateProviderArgs clientCertificate) {
            this.clientCertificate = Input.ofNullable(clientCertificate);
            return this;
        }

        public Builder clientTlsPolicyId(Input<String> clientTlsPolicyId) {
            this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId);
            return this;
        }

        public Builder clientTlsPolicyId(String clientTlsPolicyId) {
            this.clientTlsPolicyId = Input.of(Objects.requireNonNull(clientTlsPolicyId));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder serverValidationCa(@Nullable Input<List<ValidationCAArgs>> serverValidationCa) {
            this.serverValidationCa = serverValidationCa;
            return this;
        }

        public Builder serverValidationCa(@Nullable List<ValidationCAArgs> serverValidationCa) {
            this.serverValidationCa = Input.ofNullable(serverValidationCa);
            return this;
        }

        public Builder sni(@Nullable Input<String> sni) {
            this.sni = sni;
            return this;
        }

        public Builder sni(@Nullable String sni) {
            this.sni = Input.ofNullable(sni);
            return this;
        }
        public ClientTlsPolicyArgs build() {
            return new ClientTlsPolicyArgs(clientCertificate, clientTlsPolicyId, description, labels, location, name, project, serverValidationCa, sni);
        }
    }
}
