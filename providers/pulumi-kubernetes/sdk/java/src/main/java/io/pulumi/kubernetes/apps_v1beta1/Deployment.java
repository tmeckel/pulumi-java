// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps_v1beta1.DeploymentArgs;
import io.pulumi.kubernetes.apps_v1beta1.outputs.DeploymentSpec;
import io.pulumi.kubernetes.apps_v1beta1.outputs.DeploymentStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The Deployment has begun to be updated by the Deployment controller. If the current
 *    generation of the Deployment is > 1, then this means that the current generation must
 *    be different from the generation reported by the last outputs.
 * 2. There exists a ReplicaSet whose revision is equal to the current revision of the
 *    Deployment.
 * 3. The Deployment's '.status.conditions' has a status of type 'Available' whose 'status'
 *    member is set to 'True'.
 * 4. If the Deployment has generation > 1, then '.status.conditions' has a status of type
 *    'Progressing', whose 'status' member is set to 'True', and whose 'reason' is
 *    'NewReplicaSetAvailable'. For generation <= 1, this status field does not exist,
 *    because it doesn't do a rollout (i.e., it simply creates the Deployment and
 *    corresponding ReplicaSet), and therefore there is no rollout to mark as 'Progressing'.
 * 
 * If the Deployment has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the 'customTimeouts' option on the resource.
 * 
 * @Deprecated
 * apps/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters.
 * 
 */
@Deprecated /* apps/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta1:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object metadata.
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object metadata.
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired behavior of the Deployment.
     * 
     */
    @Export(name="spec", type=DeploymentSpec.class, parameters={})
    private Output</* @Nullable */ DeploymentSpec> spec;

    /**
     * @return Specification of the desired behavior of the Deployment.
     * 
     */
    public Output</* @Nullable */ DeploymentSpec> getSpec() {
        return this.spec;
    }
    /**
     * Most recently observed status of the Deployment.
     * 
     */
    @Export(name="status", type=DeploymentStatus.class, parameters={})
    private Output</* @Nullable */ DeploymentStatus> status;

    /**
     * @return Most recently observed status of the Deployment.
     * 
     */
    public Output</* @Nullable */ DeploymentStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, @Nullable DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, @Nullable DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta1:Deployment", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta1:Deployment", name, null, makeResourceOptions(options, id));
    }

    private static DeploymentArgs makeArgs(@Nullable DeploymentArgs args) {
        var builder = args == null ? DeploymentArgs.builder() : DeploymentArgs.builder(args);
        return builder
            .apiVersion("apps/v1beta1")
            .kind("Deployment")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:apps/v1:Deployment").build()),
                Output.of(Alias.builder().type("kubernetes:apps/v1beta2:Deployment").build()),
                Output.of(Alias.builder().type("kubernetes:extensions/v1beta1:Deployment").build())
            ))
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
    public static Deployment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
