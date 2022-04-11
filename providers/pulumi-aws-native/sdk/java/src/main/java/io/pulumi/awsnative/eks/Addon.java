// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.eks.AddonArgs;
import io.pulumi.awsnative.eks.enums.AddonResolveConflicts;
import io.pulumi.awsnative.eks.outputs.AddonTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::EKS::Addon
 * 
 */
@ResourceType(type="aws-native:eks:Addon")
public class Addon extends io.pulumi.resources.CustomResource {
    /**
     * Name of Addon
     * 
     */
    @Export(name="addonName", type=String.class, parameters={})
    private Output<String> addonName;

    /**
     * @return Name of Addon
     * 
     */
    public Output<String> getAddonName() {
        return this.addonName;
    }
    /**
     * Version of Addon
     * 
     */
    @Export(name="addonVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> addonVersion;

    /**
     * @return Version of Addon
     * 
     */
    public Output</* @Nullable */ String> getAddonVersion() {
        return this.addonVersion;
    }
    /**
     * Amazon Resource Name (ARN) of the add-on
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the add-on
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of Cluster
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of Cluster
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * Resolve parameter value conflicts
     * 
     */
    @Export(name="resolveConflicts", type=AddonResolveConflicts.class, parameters={})
    private Output</* @Nullable */ AddonResolveConflicts> resolveConflicts;

    /**
     * @return Resolve parameter value conflicts
     * 
     */
    public Output</* @Nullable */ AddonResolveConflicts> getResolveConflicts() {
        return this.resolveConflicts;
    }
    /**
     * IAM role to bind to the add-on's service account
     * 
     */
    @Export(name="serviceAccountRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccountRoleArn;

    /**
     * @return IAM role to bind to the add-on's service account
     * 
     */
    public Output</* @Nullable */ String> getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AddonTag.class})
    private Output</* @Nullable */ List<AddonTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<AddonTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Addon(String name) {
        this(name, AddonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Addon(String name, AddonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Addon(String name, AddonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Addon(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:Addon", name, null, makeResourceOptions(options, id));
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
    public static Addon get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, options);
    }
}
