// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainServiceAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainServiceAccessPolicyArgs Empty = new DomainServiceAccessPolicyArgs();

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @Import(name="accessPolicy", required=true)
    private Output<String> accessPolicy;

    /**
     * @return The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    public Output<String> accessPolicy() {
        return this.accessPolicy;
    }

    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The CloudSearch domain name the policy applies to.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    private DomainServiceAccessPolicyArgs() {}

    private DomainServiceAccessPolicyArgs(DomainServiceAccessPolicyArgs $) {
        this.accessPolicy = $.accessPolicy;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainServiceAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainServiceAccessPolicyArgs $;

        public Builder() {
            $ = new DomainServiceAccessPolicyArgs();
        }

        public Builder(DomainServiceAccessPolicyArgs defaults) {
            $ = new DomainServiceAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicy The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicy(Output<String> accessPolicy) {
            $.accessPolicy = accessPolicy;
            return this;
        }

        /**
         * @param accessPolicy The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicy(String accessPolicy) {
            return accessPolicy(Output.of(accessPolicy));
        }

        /**
         * @param domainName The CloudSearch domain name the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The CloudSearch domain name the policy applies to.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public DomainServiceAccessPolicyArgs build() {
            $.accessPolicy = Objects.requireNonNull($.accessPolicy, "expected parameter 'accessPolicy' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
