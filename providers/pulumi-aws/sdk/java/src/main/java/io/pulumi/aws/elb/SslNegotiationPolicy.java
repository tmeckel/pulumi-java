// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elb.SslNegotiationPolicyArgs;
import io.pulumi.aws.elb.inputs.SslNegotiationPolicyState;
import io.pulumi.aws.elb.outputs.SslNegotiationPolicyAttribute;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a load balancer SSL negotiation policy, which allows an ELB to control the ciphers and protocols that are supported during SSL negotiations between a client and a load balancer.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:elb/sslNegotiationPolicy:SslNegotiationPolicy")
public class SslNegotiationPolicy extends io.pulumi.resources.CustomResource {
    /**
     * An SSL Negotiation policy attribute. Each has two properties:
     * 
     */
    @Export(name="attributes", type=List.class, parameters={SslNegotiationPolicyAttribute.class})
    private Output</* @Nullable */ List<SslNegotiationPolicyAttribute>> attributes;

    /**
     * @return An SSL Negotiation policy attribute. Each has two properties:
     * 
     */
    public Output</* @Nullable */ List<SslNegotiationPolicyAttribute>> getAttributes() {
        return this.attributes;
    }
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Export(name="lbPort", type=Integer.class, parameters={})
    private Output<Integer> lbPort;

    /**
     * @return The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    public Output<Integer> getLbPort() {
        return this.lbPort;
    }
    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Export(name="loadBalancer", type=String.class, parameters={})
    private Output<String> loadBalancer;

    /**
     * @return The load balancer to which the policy
     * should be attached.
     * 
     */
    public Output<String> getLoadBalancer() {
        return this.loadBalancer;
    }
    /**
     * The name of the attribute
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the attribute
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SslNegotiationPolicy(String name) {
        this(name, SslNegotiationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SslNegotiationPolicy(String name, SslNegotiationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SslNegotiationPolicy(String name, SslNegotiationPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/sslNegotiationPolicy:SslNegotiationPolicy", name, args == null ? SslNegotiationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SslNegotiationPolicy(String name, Output<String> id, @Nullable SslNegotiationPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/sslNegotiationPolicy:SslNegotiationPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancing/sslNegotiationPolicy:SslNegotiationPolicy").build())
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SslNegotiationPolicy get(String name, Output<String> id, @Nullable SslNegotiationPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SslNegotiationPolicy(name, id, state, options);
    }
}
