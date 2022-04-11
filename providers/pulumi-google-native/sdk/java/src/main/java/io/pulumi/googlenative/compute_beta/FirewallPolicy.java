// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.FirewallPolicyArgs;
import io.pulumi.googlenative.compute_beta.outputs.FirewallPolicyAssociationResponse;
import io.pulumi.googlenative.compute_beta.outputs.FirewallPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new policy in the specified project using the data included in the request.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:compute/beta:FirewallPolicy")
public class FirewallPolicy extends io.pulumi.resources.CustomResource {
    /**
     * A list of associations that belong to this firewall policy.
     * 
     */
    @Export(name="associations", type=List.class, parameters={FirewallPolicyAssociationResponse.class})
    private Output<List<FirewallPolicyAssociationResponse>> associations;

    /**
     * @return A list of associations that belong to this firewall policy.
     * 
     */
    public Output<List<FirewallPolicyAssociationResponse>> getAssociations() {
        return this.associations;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of the firewall policy.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the firewall policy.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    @Export(name="ruleTupleCount", type=Integer.class, parameters={})
    private Output<Integer> ruleTupleCount;

    /**
     * @return Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    public Output<Integer> getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
     * 
     */
    @Export(name="rules", type=List.class, parameters={FirewallPolicyRuleResponse.class})
    private Output<List<FirewallPolicyRuleResponse>> rules;

    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
     * 
     */
    public Output<List<FirewallPolicyRuleResponse>> getRules() {
        return this.rules;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getShortName() {
        return this.shortName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicy(String name) {
        this(name, FirewallPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicy(String name, @Nullable FirewallPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicy(String name, @Nullable FirewallPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:FirewallPolicy", name, args == null ? FirewallPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:FirewallPolicy", name, null, makeResourceOptions(options, id));
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
    public static FirewallPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicy(name, id, options);
    }
}
