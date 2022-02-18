// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networksecurity_v1.ClientTlsPolicyArgs;
import io.pulumi.googlenative.networksecurity_v1.outputs.GoogleCloudNetworksecurityV1CertificateProviderResponse;
import io.pulumi.googlenative.networksecurity_v1.outputs.ValidationCAResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ClientTlsPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networksecurity/v1:ClientTlsPolicy")
public class ClientTlsPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    @OutputExport(name="clientCertificate", type=GoogleCloudNetworksecurityV1CertificateProviderResponse.class, parameters={})
    private Output<GoogleCloudNetworksecurityV1CertificateProviderResponse> clientCertificate;

    /**
     * @return Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    public Output<GoogleCloudNetworksecurityV1CertificateProviderResponse> getClientCertificate() {
        return this.clientCertificate;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Free-text description of the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Set of label tags associated with the resource.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the resource.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    @OutputExport(name="serverValidationCa", type=List.class, parameters={ValidationCAResponse.class})
    private Output<List<ValidationCAResponse>> serverValidationCa;

    /**
     * @return Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    public Output<List<ValidationCAResponse>> getServerValidationCa() {
        return this.serverValidationCa;
    }
    /**
     * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
     * 
     */
    @OutputExport(name="sni", type=String.class, parameters={})
    private Output<String> sni;

    /**
     * @return Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
     * 
     */
    public Output<String> getSni() {
        return this.sni;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientTlsPolicy(String name, ClientTlsPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1:ClientTlsPolicy", name, args == null ? ClientTlsPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ClientTlsPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1:ClientTlsPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClientTlsPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClientTlsPolicy(name, id, options);
    }
}
