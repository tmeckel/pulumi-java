// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
import io.pulumi.gcp.pubsub.inputs.TopicIAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
 * 
 * * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
 * * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
 * * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
 * 
 * > **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_pubsub\_topic\_iam\_policy
 * 
 * ## google\_pubsub\_topic\_iam\_binding
 * 
 * ## google\_pubsub\_topic\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/topics/{{name}} * {{project}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud Pub/Sub topic IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/topicIAMPolicy:TopicIAMPolicy editor "projects/{{project}}/topics/{{topic}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/topicIAMPolicy:TopicIAMPolicy editor "projects/{{project}}/topics/{{topic}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/topicIAMPolicy:TopicIAMPolicy editor projects/{{project}}/topics/{{topic}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:pubsub/topicIAMPolicy:TopicIAMPolicy")
public class TopicIAMPolicy extends io.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getTopic() {
        return this.topic;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TopicIAMPolicy(String name) {
        this(name, TopicIAMPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TopicIAMPolicy(String name, TopicIAMPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TopicIAMPolicy(String name, TopicIAMPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/topicIAMPolicy:TopicIAMPolicy", name, args == null ? TopicIAMPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TopicIAMPolicy(String name, Output<String> id, @Nullable TopicIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/topicIAMPolicy:TopicIAMPolicy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TopicIAMPolicy get(String name, Output<String> id, @Nullable TopicIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TopicIAMPolicy(name, id, state, options);
    }
}
