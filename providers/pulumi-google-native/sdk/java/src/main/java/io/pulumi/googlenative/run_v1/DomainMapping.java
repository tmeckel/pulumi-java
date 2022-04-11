// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.run_v1.DomainMappingArgs;
import io.pulumi.googlenative.run_v1.outputs.DomainMappingSpecResponse;
import io.pulumi.googlenative.run_v1.outputs.DomainMappingStatusResponse;
import io.pulumi.googlenative.run_v1.outputs.ObjectMetaResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a new domain mapping.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:run/v1:DomainMapping")
public class DomainMapping extends io.pulumi.resources.CustomResource {
    /**
     * The API version for this call such as "domains.cloudrun.com/v1".
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output<String> apiVersion;

    /**
     * @return The API version for this call such as "domains.cloudrun.com/v1".
     * 
     */
    public Output<String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * The kind of resource, in this case "DomainMapping".
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of resource, in this case "DomainMapping".
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Metadata associated with this BuildTemplate.
     * 
     */
    @Export(name="metadata", type=ObjectMetaResponse.class, parameters={})
    private Output<ObjectMetaResponse> metadata;

    /**
     * @return Metadata associated with this BuildTemplate.
     * 
     */
    public Output<ObjectMetaResponse> getMetadata() {
        return this.metadata;
    }
    /**
     * The spec for this DomainMapping.
     * 
     */
    @Export(name="spec", type=DomainMappingSpecResponse.class, parameters={})
    private Output<DomainMappingSpecResponse> spec;

    /**
     * @return The spec for this DomainMapping.
     * 
     */
    public Output<DomainMappingSpecResponse> getSpec() {
        return this.spec;
    }
    /**
     * The current status of the DomainMapping.
     * 
     */
    @Export(name="status", type=DomainMappingStatusResponse.class, parameters={})
    private Output<DomainMappingStatusResponse> status;

    /**
     * @return The current status of the DomainMapping.
     * 
     */
    public Output<DomainMappingStatusResponse> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainMapping(String name) {
        this(name, DomainMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainMapping(String name, @Nullable DomainMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainMapping(String name, @Nullable DomainMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:run/v1:DomainMapping", name, args == null ? DomainMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainMapping(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:run/v1:DomainMapping", name, null, makeResourceOptions(options, id));
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
    public static DomainMapping get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainMapping(name, id, options);
    }
}
