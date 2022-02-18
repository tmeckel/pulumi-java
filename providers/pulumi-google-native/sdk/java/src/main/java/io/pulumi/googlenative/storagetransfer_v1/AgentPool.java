// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storagetransfer_v1.AgentPoolArgs;
import io.pulumi.googlenative.storagetransfer_v1.outputs.BandwidthLimitResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an agent pool resource.
 * 
 */
@ResourceType(type="google-native:storagetransfer/v1:AgentPool")
public class AgentPool extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the bandwidth limit details. If this field is unspecified, the default value is set as 'No Limit'.
     * 
     */
    @OutputExport(name="bandwidthLimit", type=BandwidthLimitResponse.class, parameters={})
    private Output<BandwidthLimitResponse> bandwidthLimit;

    /**
     * @return Specifies the bandwidth limit details. If this field is unspecified, the default value is set as 'No Limit'.
     * 
     */
    public Output<BandwidthLimitResponse> getBandwidthLimit() {
        return this.bandwidthLimit;
    }
    /**
     * Specifies the client-specified AgentPool description.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Specifies the client-specified AgentPool description.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the state of the AgentPool.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Specifies the state of the AgentPool.
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
    public AgentPool(String name, AgentPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storagetransfer/v1:AgentPool", name, args == null ? AgentPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AgentPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storagetransfer/v1:AgentPool", name, null, makeResourceOptions(options, id));
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
    public static AgentPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AgentPool(name, id, options);
    }
}
