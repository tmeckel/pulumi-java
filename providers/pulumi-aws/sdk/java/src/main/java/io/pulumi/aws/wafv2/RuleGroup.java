// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.RuleGroupArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupState;
import io.pulumi.aws.wafv2.outputs.RuleGroupCustomResponseBody;
import io.pulumi.aws.wafv2.outputs.RuleGroupRule;
import io.pulumi.aws.wafv2.outputs.RuleGroupVisibilityConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a WAFv2 Rule Group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAFv2 Rule Group can be imported using `ID/name/scope` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafv2/ruleGroup:RuleGroup example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/ruleGroup:RuleGroup")
public class RuleGroup extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
     * 
     */
    @Export(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    /**
     * @return The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
     * 
     */
    public Output<Integer> getCapacity() {
        return this.capacity;
    }
    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @Export(name="customResponseBodies", type=List.class, parameters={RuleGroupCustomResponseBody.class})
    private Output</* @Nullable */ List<RuleGroupCustomResponseBody>> customResponseBodies;

    /**
     * @return Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    public Output</* @Nullable */ List<RuleGroupCustomResponseBody>> getCustomResponseBodies() {
        return this.customResponseBodies;
    }
    /**
     * A friendly description of the rule group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the rule group.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="lockToken", type=String.class, parameters={})
    private Output<String> lockToken;

    public Output<String> getLockToken() {
        return this.lockToken;
    }
    /**
     * The label string.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The label string.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @Export(name="rules", type=List.class, parameters={RuleGroupRule.class})
    private Output</* @Nullable */ List<RuleGroupRule>> rules;

    /**
     * @return The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    public Output</* @Nullable */ List<RuleGroupRule>> getRules() {
        return this.rules;
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Export(name="visibilityConfig", type=RuleGroupVisibilityConfig.class, parameters={})
    private Output<RuleGroupVisibilityConfig> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    public Output<RuleGroupVisibilityConfig> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleGroup(String name) {
        this(name, RuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleGroup(String name, RuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroup(String name, RuleGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/ruleGroup:RuleGroup", name, args == null ? RuleGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RuleGroup(String name, Output<String> id, @Nullable RuleGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/ruleGroup:RuleGroup", name, state, makeResourceOptions(options, id));
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
    public static RuleGroup get(String name, Output<String> id, @Nullable RuleGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroup(name, id, state, options);
    }
}
