// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1beta2.ResponsePolicyArgs;
import io.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyGKEClusterResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyNetworkResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Response Policy
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dns/v1beta2:ResponsePolicy")
public class ResponsePolicy extends io.pulumi.resources.CustomResource {
    /**
     * User-provided description for this Response Policy.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    @OutputExport(name="gkeClusters", type=List.class, parameters={ResponsePolicyGKEClusterResponse.class})
    private Output<List<ResponsePolicyGKEClusterResponse>> gkeClusters;

    /**
     * @return The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    public Output<List<ResponsePolicyGKEClusterResponse>> getGkeClusters() {
        return this.gkeClusters;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @OutputExport(name="networks", type=List.class, parameters={ResponsePolicyNetworkResponse.class})
    private Output<List<ResponsePolicyNetworkResponse>> networks;

    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public Output<List<ResponsePolicyNetworkResponse>> getNetworks() {
        return this.networks;
    }
    /**
     * User assigned name for this Response Policy.
     * 
     */
    @OutputExport(name="responsePolicyName", type=String.class, parameters={})
    private Output<String> responsePolicyName;

    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    public Output<String> getResponsePolicyName() {
        return this.responsePolicyName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponsePolicy(String name, @Nullable ResponsePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResponsePolicy", name, args == null ? ResponsePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResponsePolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResponsePolicy", name, null, makeResourceOptions(options, id));
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
    public static ResponsePolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResponsePolicy(name, id, options);
    }
}
