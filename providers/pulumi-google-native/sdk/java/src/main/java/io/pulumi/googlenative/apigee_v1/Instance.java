// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.InstanceArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an Apigee runtime instance. The instance is accessible from the authorized network configured on the organization. **Note:** Not supported for Apigee hybrid.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * Time the instance was created in milliseconds since epoch.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time the instance was created in milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Optional. Description of the instance.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Description of the instance.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only. Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    @OutputExport(name="diskEncryptionKeyName", type=String.class, parameters={})
    private Output<String> diskEncryptionKeyName;

    /**
     * @return Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only. Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    public Output<String> getDiskEncryptionKeyName() {
        return this.diskEncryptionKeyName;
    }
    /**
     * Optional. Display name for the instance.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. Display name for the instance.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Internal hostname or IP address of the Apigee endpoint used by clients to connect to the service.
     * 
     */
    @OutputExport(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return Internal hostname or IP address of the Apigee endpoint used by clients to connect to the service.
     * 
     */
    public Output<String> getHost() {
        return this.host;
    }
    /**
     * Optional. IP range represents the customer-provided CIDR block of length 22 that will be used for the Apigee instance creation. This optional range, if provided, should be freely available as part of larger named range the customer has allocated to the Service Networking peering. If this is not provided, Apigee will automatically request for any available /22 CIDR block from Service Networking. The customer should use this CIDR block for configuring their firewall needs to allow traffic from Apigee. Input format: "a.b.c.d/22", Output format: a.b.c.d/22, e.f.g.h/28"
     * 
     */
    @OutputExport(name="ipRange", type=String.class, parameters={})
    private Output<String> ipRange;

    /**
     * @return Optional. IP range represents the customer-provided CIDR block of length 22 that will be used for the Apigee instance creation. This optional range, if provided, should be freely available as part of larger named range the customer has allocated to the Service Networking peering. If this is not provided, Apigee will automatically request for any available /22 CIDR block from Service Networking. The customer should use this CIDR block for configuring their firewall needs to allow traffic from Apigee. Input format: "a.b.c.d/22", Output format: a.b.c.d/22, e.f.g.h/28"
     * 
     */
    public Output<String> getIpRange() {
        return this.ipRange;
    }
    /**
     * Time the instance was last modified in milliseconds since epoch.
     * 
     */
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return Time the instance was last modified in milliseconds since epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Compute Engine location where the instance resides.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Compute Engine location where the instance resides.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource ID of the instance. Values must match the regular expression `^a-z{0,30}[a-z\d]$`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource ID of the instance. Values must match the regular expression `^a-z{0,30}[a-z\d]$`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
     */
    @OutputExport(name="peeringCidrRange", type=String.class, parameters={})
    private Output<String> peeringCidrRange;

    /**
     * @return Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
     */
    public Output<String> getPeeringCidrRange() {
        return this.peeringCidrRange;
    }
    /**
     * Port number of the exposed Apigee endpoint.
     * 
     */
    @OutputExport(name="port", type=String.class, parameters={})
    private Output<String> port;

    /**
     * @return Port number of the exposed Apigee endpoint.
     * 
     */
    public Output<String> getPort() {
        return this.port;
    }
    /**
     * Version of the runtime system running in the instance. The runtime system is the set of components that serve the API Proxy traffic in your Environments.
     * 
     */
    @OutputExport(name="runtimeVersion", type=String.class, parameters={})
    private Output<String> runtimeVersion;

    /**
     * @return Version of the runtime system running in the instance. The runtime system is the set of components that serve the API Proxy traffic in your Environments.
     * 
     */
    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * State of the instance. Values other than `ACTIVE` means the resource is not ready to use.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the instance. Values other than `ACTIVE` means the resource is not ready to use.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Instance", name, null, makeResourceOptions(options, id));
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
    public static Instance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
