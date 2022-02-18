// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.OrganizationArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AddonsConfigResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an Apigee organization. See [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Organization")
public class Organization extends io.pulumi.resources.CustomResource {
    /**
     * Addon configurations of the Apigee organization.
     * 
     */
    @OutputExport(name="addonsConfig", type=GoogleCloudApigeeV1AddonsConfigResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1AddonsConfigResponse> addonsConfig;

    /**
     * @return Addon configurations of the Apigee organization.
     * 
     */
    public Output<GoogleCloudApigeeV1AddonsConfigResponse> getAddonsConfig() {
        return this.addonsConfig;
    }
    /**
     * Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @OutputExport(name="analyticsRegion", type=String.class, parameters={})
    private Output<String> analyticsRegion;

    /**
     * @return Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    public Output<String> getAnalyticsRegion() {
        return this.analyticsRegion;
    }
    /**
     * Not used by Apigee.
     * 
     */
    @OutputExport(name="attributes", type=List.class, parameters={String.class})
    private Output<List<String>> attributes;

    /**
     * @return Not used by Apigee.
     * 
     */
    public Output<List<String>> getAttributes() {
        return this.attributes;
    }
    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    @OutputExport(name="authorizedNetwork", type=String.class, parameters={})
    private Output<String> authorizedNetwork;

    /**
     * @return Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    @OutputExport(name="billingType", type=String.class, parameters={})
    private Output<String> billingType;

    /**
     * @return Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    public Output<String> getBillingType() {
        return this.billingType;
    }
    /**
     * Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when [RuntimeType](#RuntimeType) is `CLOUD`.
     * 
     */
    @OutputExport(name="caCertificate", type=String.class, parameters={})
    private Output<String> caCertificate;

    /**
     * @return Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when [RuntimeType](#RuntimeType) is `CLOUD`.
     * 
     */
    public Output<String> getCaCertificate() {
        return this.caCertificate;
    }
    /**
     * Time that the Apigee organization was created in milliseconds since epoch.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time that the Apigee organization was created in milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Not used by Apigee.
     * 
     */
    @OutputExport(name="customerName", type=String.class, parameters={})
    private Output<String> customerName;

    /**
     * @return Not used by Apigee.
     * 
     */
    public Output<String> getCustomerName() {
        return this.customerName;
    }
    /**
     * Description of the Apigee organization.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the Apigee organization.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * List of environments in the Apigee organization.
     * 
     */
    @OutputExport(name="environments", type=List.class, parameters={String.class})
    private Output<List<String>> environments;

    /**
     * @return List of environments in the Apigee organization.
     * 
     */
    public Output<List<String>> getEnvironments() {
        return this.environments;
    }
    /**
     * Time that the Apigee organization is scheduled for deletion.
     * 
     */
    @OutputExport(name="expiresAt", type=String.class, parameters={})
    private Output<String> expiresAt;

    /**
     * @return Time that the Apigee organization is scheduled for deletion.
     * 
     */
    public Output<String> getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * Time that the Apigee organization was last modified in milliseconds since epoch.
     * 
     */
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return Time that the Apigee organization was last modified in milliseconds since epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the Apigee organization.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Apigee organization.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration for the Portals settings.
     * 
     */
    @OutputExport(name="portalDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> portalDisabled;

    /**
     * @return Configuration for the Portals settings.
     * 
     */
    public Output<Boolean> getPortalDisabled() {
        return this.portalDisabled;
    }
    /**
     * Project ID associated with the Apigee organization.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return Project ID associated with the Apigee organization.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Properties defined in the Apigee organization profile.
     * 
     */
    @OutputExport(name="properties", type=GoogleCloudApigeeV1PropertiesResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1PropertiesResponse> properties;

    /**
     * @return Properties defined in the Apigee organization profile.
     * 
     */
    public Output<GoogleCloudApigeeV1PropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: "projects/foo/locations/us/keyRings/bar/cryptoKeys/baz". **Note:** Not supported for Apigee hybrid.
     * 
     */
    @OutputExport(name="runtimeDatabaseEncryptionKeyName", type=String.class, parameters={})
    private Output<String> runtimeDatabaseEncryptionKeyName;

    /**
     * @return Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: "projects/foo/locations/us/keyRings/bar/cryptoKeys/baz". **Note:** Not supported for Apigee hybrid.
     * 
     */
    public Output<String> getRuntimeDatabaseEncryptionKeyName() {
        return this.runtimeDatabaseEncryptionKeyName;
    }
    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    @OutputExport(name="runtimeType", type=String.class, parameters={})
    private Output<String> runtimeType;

    /**
     * @return Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    public Output<String> getRuntimeType() {
        return this.runtimeType;
    }
    /**
     * State of the organization. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the organization. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Not used by Apigee.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Not used by Apigee.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Organization(String name, OrganizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Organization(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Organization", name, null, makeResourceOptions(options, id));
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
    public static Organization get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Organization(name, id, options);
    }
}
