// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.wafv2.inputs.RuleGroupCustomResponseBodyArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupVisibilityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    /**
     * The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
     * 
     */
    @Import(name="capacity", required=true)
    private Output<Integer> capacity;

    /**
     * @return The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }

    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @Import(name="customResponseBodies")
    private @Nullable Output<List<RuleGroupCustomResponseBodyArgs>> customResponseBodies;

    /**
     * @return Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    public Optional<Output<List<RuleGroupCustomResponseBodyArgs>>> customResponseBodies() {
        return Optional.ofNullable(this.customResponseBodies);
    }

    /**
     * A friendly description of the rule group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A friendly description of the rule group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The label string.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The label string.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RuleGroupRuleArgs>> rules;

    /**
     * @return The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    public Optional<Output<List<RuleGroupRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
    private Output<RuleGroupVisibilityConfigArgs> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    public Output<RuleGroupVisibilityConfigArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    private RuleGroupArgs() {}

    private RuleGroupArgs(RuleGroupArgs $) {
        this.capacity = $.capacity;
        this.customResponseBodies = $.customResponseBodies;
        this.description = $.description;
        this.name = $.name;
        this.rules = $.rules;
        this.scope = $.scope;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.visibilityConfig = $.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupArgs $;

        public Builder() {
            $ = new RuleGroupArgs();
        }

        public Builder(RuleGroupArgs defaults) {
            $ = new RuleGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The web ACL capacity units (WCUs) required for this rule group. See [here](https://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRuleGroup.html#API_CreateRuleGroup_RequestSyntax) for general information and [here](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statements-list.html) for capacity specific information.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param customResponseBodies Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
         * 
         * @return builder
         * 
         */
        public Builder customResponseBodies(@Nullable Output<List<RuleGroupCustomResponseBodyArgs>> customResponseBodies) {
            $.customResponseBodies = customResponseBodies;
            return this;
        }

        /**
         * @param customResponseBodies Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
         * 
         * @return builder
         * 
         */
        public Builder customResponseBodies(List<RuleGroupCustomResponseBodyArgs> customResponseBodies) {
            return customResponseBodies(Output.of(customResponseBodies));
        }

        /**
         * @param customResponseBodies Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
         * 
         * @return builder
         * 
         */
        public Builder customResponseBodies(RuleGroupCustomResponseBodyArgs... customResponseBodies) {
            return customResponseBodies(List.of(customResponseBodies));
        }

        /**
         * @param description A friendly description of the rule group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A friendly description of the rule group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The label string.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The label string.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rules The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RuleGroupRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RuleGroupRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
         * 
         * @return builder
         * 
         */
        public Builder rules(RuleGroupRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tags An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
         * 
         * @return builder
         * 
         */
        public Builder visibilityConfig(Output<RuleGroupVisibilityConfigArgs> visibilityConfig) {
            $.visibilityConfig = visibilityConfig;
            return this;
        }

        /**
         * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
         * 
         * @return builder
         * 
         */
        public Builder visibilityConfig(RuleGroupVisibilityConfigArgs visibilityConfig) {
            return visibilityConfig(Output.of(visibilityConfig));
        }

        public RuleGroupArgs build() {
            $.capacity = Objects.requireNonNull($.capacity, "expected parameter 'capacity' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.visibilityConfig = Objects.requireNonNull($.visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
            return $;
        }
    }

}
