// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.AuthorizerArgs;
import io.pulumi.awsnative.iot.enums.AuthorizerStatus;
import io.pulumi.awsnative.iot.outputs.AuthorizerTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an authorizer.
 * 
 */
@ResourceType(type="aws-native:iot:Authorizer")
public class Authorizer extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="authorizerFunctionArn", type=String.class, parameters={})
    private Output<String> authorizerFunctionArn;

    public Output<String> getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }
    @Export(name="authorizerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerName;

    public Output</* @Nullable */ String> getAuthorizerName() {
        return this.authorizerName;
    }
    @Export(name="signingDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> signingDisabled;

    public Output</* @Nullable */ Boolean> getSigningDisabled() {
        return this.signingDisabled;
    }
    @Export(name="status", type=AuthorizerStatus.class, parameters={})
    private Output</* @Nullable */ AuthorizerStatus> status;

    public Output</* @Nullable */ AuthorizerStatus> getStatus() {
        return this.status;
    }
    @Export(name="tags", type=List.class, parameters={AuthorizerTag.class})
    private Output</* @Nullable */ List<AuthorizerTag>> tags;

    public Output</* @Nullable */ List<AuthorizerTag>> getTags() {
        return this.tags;
    }
    @Export(name="tokenKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKeyName;

    public Output</* @Nullable */ String> getTokenKeyName() {
        return this.tokenKeyName;
    }
    @Export(name="tokenSigningPublicKeys", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tokenSigningPublicKeys;

    public Output</* @Nullable */ Object> getTokenSigningPublicKeys() {
        return this.tokenSigningPublicKeys;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Authorizer(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:Authorizer", name, null, makeResourceOptions(options, id));
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
    public static Authorizer get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Authorizer(name, id, options);
    }
}
