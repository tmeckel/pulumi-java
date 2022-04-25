// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fms.inputs;

import com.pulumi.aws.fms.inputs.PolicyExcludeMapGetArgs;
import com.pulumi.aws.fms.inputs.PolicyIncludeMapGetArgs;
import com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     * 
     */
    @Import(name="deleteAllPolicyResources")
    private @Nullable Output<Boolean> deleteAllPolicyResources;

    /**
     * @return If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     * 
     */
    public Optional<Output<Boolean>> deleteAllPolicyResources() {
        return Optional.ofNullable(this.deleteAllPolicyResources);
    }

    /**
     * A map of lists of accounts and OU&#39;s to exclude from the policy.
     * 
     */
    @Import(name="excludeMap")
    private @Nullable Output<PolicyExcludeMapGetArgs> excludeMap;

    /**
     * @return A map of lists of accounts and OU&#39;s to exclude from the policy.
     * 
     */
    public Optional<Output<PolicyExcludeMapGetArgs>> excludeMap() {
        return Optional.ofNullable(this.excludeMap);
    }

    /**
     * A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
     * 
     */
    @Import(name="excludeResourceTags")
    private @Nullable Output<Boolean> excludeResourceTags;

    /**
     * @return A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
     * 
     */
    public Optional<Output<Boolean>> excludeResourceTags() {
        return Optional.ofNullable(this.excludeResourceTags);
    }

    /**
     * A map of lists of accounts and OU&#39;s to include in the policy.
     * 
     */
    @Import(name="includeMap")
    private @Nullable Output<PolicyIncludeMapGetArgs> includeMap;

    /**
     * @return A map of lists of accounts and OU&#39;s to include in the policy.
     * 
     */
    public Optional<Output<PolicyIncludeMapGetArgs>> includeMap() {
        return Optional.ofNullable(this.includeMap);
    }

    /**
     * The friendly name of the AWS Firewall Manager Policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The friendly name of the AWS Firewall Manager Policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A unique identifier for each update to the policy.
     * 
     */
    @Import(name="policyUpdateToken")
    private @Nullable Output<String> policyUpdateToken;

    /**
     * @return A unique identifier for each update to the policy.
     * 
     */
    public Optional<Output<String>> policyUpdateToken() {
        return Optional.ofNullable(this.policyUpdateToken);
    }

    /**
     * A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     * 
     */
    @Import(name="remediationEnabled")
    private @Nullable Output<Boolean> remediationEnabled;

    /**
     * @return A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     * 
     */
    public Optional<Output<Boolean>> remediationEnabled() {
        return Optional.ofNullable(this.remediationEnabled);
    }

    /**
     * A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     * 
     */
    @Import(name="resourceTags")
    private @Nullable Output<Map<String,String>> resourceTags;

    /**
     * @return A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     * 
     */
    public Optional<Output<Map<String,String>>> resourceTags() {
        return Optional.ofNullable(this.resourceTags);
    }

    /**
     * A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    @Import(name="resourceTypeLists")
    private @Nullable Output<List<String>> resourceTypeLists;

    /**
     * @return A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    public Optional<Output<List<String>>> resourceTypeLists() {
        return Optional.ofNullable(this.resourceTypeLists);
    }

    /**
     * The objects to include in Security Service Policy Data. Documented below.
     * 
     */
    @Import(name="securityServicePolicyData")
    private @Nullable Output<PolicySecurityServicePolicyDataGetArgs> securityServicePolicyData;

    /**
     * @return The objects to include in Security Service Policy Data. Documented below.
     * 
     */
    public Optional<Output<PolicySecurityServicePolicyDataGetArgs>> securityServicePolicyData() {
        return Optional.ofNullable(this.securityServicePolicyData);
    }

    private PolicyState() {}

    private PolicyState(PolicyState $) {
        this.arn = $.arn;
        this.deleteAllPolicyResources = $.deleteAllPolicyResources;
        this.excludeMap = $.excludeMap;
        this.excludeResourceTags = $.excludeResourceTags;
        this.includeMap = $.includeMap;
        this.name = $.name;
        this.policyUpdateToken = $.policyUpdateToken;
        this.remediationEnabled = $.remediationEnabled;
        this.resourceTags = $.resourceTags;
        this.resourceType = $.resourceType;
        this.resourceTypeLists = $.resourceTypeLists;
        this.securityServicePolicyData = $.securityServicePolicyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyState $;

        public Builder() {
            $ = new PolicyState();
        }

        public Builder(PolicyState defaults) {
            $ = new PolicyState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param deleteAllPolicyResources If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
         * 
         * @return builder
         * 
         */
        public Builder deleteAllPolicyResources(@Nullable Output<Boolean> deleteAllPolicyResources) {
            $.deleteAllPolicyResources = deleteAllPolicyResources;
            return this;
        }

        /**
         * @param deleteAllPolicyResources If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
         * 
         * @return builder
         * 
         */
        public Builder deleteAllPolicyResources(Boolean deleteAllPolicyResources) {
            return deleteAllPolicyResources(Output.of(deleteAllPolicyResources));
        }

        /**
         * @param excludeMap A map of lists of accounts and OU&#39;s to exclude from the policy.
         * 
         * @return builder
         * 
         */
        public Builder excludeMap(@Nullable Output<PolicyExcludeMapGetArgs> excludeMap) {
            $.excludeMap = excludeMap;
            return this;
        }

        /**
         * @param excludeMap A map of lists of accounts and OU&#39;s to exclude from the policy.
         * 
         * @return builder
         * 
         */
        public Builder excludeMap(PolicyExcludeMapGetArgs excludeMap) {
            return excludeMap(Output.of(excludeMap));
        }

        /**
         * @param excludeResourceTags A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
         * 
         * @return builder
         * 
         */
        public Builder excludeResourceTags(@Nullable Output<Boolean> excludeResourceTags) {
            $.excludeResourceTags = excludeResourceTags;
            return this;
        }

        /**
         * @param excludeResourceTags A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
         * 
         * @return builder
         * 
         */
        public Builder excludeResourceTags(Boolean excludeResourceTags) {
            return excludeResourceTags(Output.of(excludeResourceTags));
        }

        /**
         * @param includeMap A map of lists of accounts and OU&#39;s to include in the policy.
         * 
         * @return builder
         * 
         */
        public Builder includeMap(@Nullable Output<PolicyIncludeMapGetArgs> includeMap) {
            $.includeMap = includeMap;
            return this;
        }

        /**
         * @param includeMap A map of lists of accounts and OU&#39;s to include in the policy.
         * 
         * @return builder
         * 
         */
        public Builder includeMap(PolicyIncludeMapGetArgs includeMap) {
            return includeMap(Output.of(includeMap));
        }

        /**
         * @param name The friendly name of the AWS Firewall Manager Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The friendly name of the AWS Firewall Manager Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyUpdateToken A unique identifier for each update to the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyUpdateToken(@Nullable Output<String> policyUpdateToken) {
            $.policyUpdateToken = policyUpdateToken;
            return this;
        }

        /**
         * @param policyUpdateToken A unique identifier for each update to the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyUpdateToken(String policyUpdateToken) {
            return policyUpdateToken(Output.of(policyUpdateToken));
        }

        /**
         * @param remediationEnabled A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
         * 
         * @return builder
         * 
         */
        public Builder remediationEnabled(@Nullable Output<Boolean> remediationEnabled) {
            $.remediationEnabled = remediationEnabled;
            return this;
        }

        /**
         * @param remediationEnabled A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
         * 
         * @return builder
         * 
         */
        public Builder remediationEnabled(Boolean remediationEnabled) {
            return remediationEnabled(Output.of(remediationEnabled));
        }

        /**
         * @param resourceTags A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
         * 
         * @return builder
         * 
         */
        public Builder resourceTags(@Nullable Output<Map<String,String>> resourceTags) {
            $.resourceTags = resourceTags;
            return this;
        }

        /**
         * @param resourceTags A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
         * 
         * @return builder
         * 
         */
        public Builder resourceTags(Map<String,String> resourceTags) {
            return resourceTags(Output.of(resourceTags));
        }

        /**
         * @param resourceType A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param resourceTypeLists A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypeLists(@Nullable Output<List<String>> resourceTypeLists) {
            $.resourceTypeLists = resourceTypeLists;
            return this;
        }

        /**
         * @param resourceTypeLists A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypeLists(List<String> resourceTypeLists) {
            return resourceTypeLists(Output.of(resourceTypeLists));
        }

        /**
         * @param resourceTypeLists A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypeLists(String... resourceTypeLists) {
            return resourceTypeLists(List.of(resourceTypeLists));
        }

        /**
         * @param securityServicePolicyData The objects to include in Security Service Policy Data. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder securityServicePolicyData(@Nullable Output<PolicySecurityServicePolicyDataGetArgs> securityServicePolicyData) {
            $.securityServicePolicyData = securityServicePolicyData;
            return this;
        }

        /**
         * @param securityServicePolicyData The objects to include in Security Service Policy Data. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder securityServicePolicyData(PolicySecurityServicePolicyDataGetArgs securityServicePolicyData) {
            return securityServicePolicyData(Output.of(securityServicePolicyData));
        }

        public PolicyState build() {
            return $;
        }
    }

}
