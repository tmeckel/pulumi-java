// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigateway_v1.GatewayArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Gateway in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigateway/v1:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}
     * 
     */
    @OutputExport(name="apiConfig", type=String.class, parameters={})
    private Output<String> apiConfig;

    /**
     * @return Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}
     * 
     */
    public Output<String> getApiConfig() {
        return this.apiConfig;
    }
    /**
     * Created time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Created time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The default API Gateway host name of the form `{gateway_id}-{hash}.{region_code}.gateway.dev`.
     * 
     */
    @OutputExport(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    /**
     * @return The default API Gateway host name of the form `{gateway_id}-{hash}.{region_code}.gateway.dev`.
     * 
     */
    public Output<String> getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Optional. Display name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. Display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the Gateway. Format: projects/{project}/locations/{location}/gateways/{gateway}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Gateway. Format: projects/{project}/locations/{location}/gateways/{gateway}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current state of the Gateway.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the Gateway.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Updated time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Updated time.
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
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Gateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigateway/v1:Gateway", name, null, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, options);
    }
}
