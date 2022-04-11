// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1beta1.PeeringArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Peering for Managed AD instance.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:managedidentities/v1beta1:Peering")
public class Peering extends io.pulumi.resources.CustomResource {
    /**
     * The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    @Export(name="authorizedNetwork", type=String.class, parameters={})
    private Output<String> authorizedNetwork;

    /**
     * @return The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * The time the instance was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the instance was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    @Export(name="domainResource", type=String.class, parameters={})
    private Output<String> domainResource;

    /**
     * @return Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    public Output<String> getDomainResource() {
        return this.domainResource;
    }
    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user provided metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current state of this Peering.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of this Peering.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Additional information about the current status of this peering, if available.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return Additional information about the current status of this peering, if available.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Last update time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Last update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Peering(String name) {
        this(name, PeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Peering(String name, PeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Peering(String name, PeeringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1beta1:Peering", name, args == null ? PeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Peering(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1beta1:Peering", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Peering get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Peering(name, id, options);
    }
}
