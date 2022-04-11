// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authorization.k8s.io_v1.SelfSubjectAccessReviewArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1.outputs.SelfSubjectAccessReviewSpec;
import io.pulumi.kubernetes.authorization.k8s.io_v1.outputs.SubjectAccessReviewStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means "in all namespaces".  Self is a special case, because users should always be able to check whether they can perform an action
 * 
 */
@ResourceType(type="kubernetes:authorization.k8s.io/v1:SelfSubjectAccessReview")
public class SelfSubjectAccessReview extends io.pulumi.resources.CustomResource {
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
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec holds information about the request being evaluated.  user and groups must be empty
     * 
     */
    @Export(name="spec", type=SelfSubjectAccessReviewSpec.class, parameters={})
    private Output<SelfSubjectAccessReviewSpec> spec;

    /**
     * @return Spec holds information about the request being evaluated.  user and groups must be empty
     * 
     */
    public Output<SelfSubjectAccessReviewSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    @Export(name="status", type=SubjectAccessReviewStatus.class, parameters={})
    private Output</* @Nullable */ SubjectAccessReviewStatus> status;

    /**
     * @return Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    public Output</* @Nullable */ SubjectAccessReviewStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SelfSubjectAccessReview(String name) {
        this(name, SelfSubjectAccessReviewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SelfSubjectAccessReview(String name, SelfSubjectAccessReviewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SelfSubjectAccessReview(String name, SelfSubjectAccessReviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SelfSubjectAccessReview", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private SelfSubjectAccessReview(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SelfSubjectAccessReview", name, null, makeResourceOptions(options, id));
    }

    private static SelfSubjectAccessReviewArgs makeArgs(SelfSubjectAccessReviewArgs args) {
        var builder = args == null ? SelfSubjectAccessReviewArgs.builder() : SelfSubjectAccessReviewArgs.builder(args);
        return builder
            .apiVersion("authorization.k8s.io/v1")
            .kind("SelfSubjectAccessReview")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:authorization.k8s.io/v1beta1:SelfSubjectAccessReview").build())
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
    public static SelfSubjectAccessReview get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SelfSubjectAccessReview(name, id, options);
    }
}
