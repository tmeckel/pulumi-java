// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.route53resolver.enums.ResolverRuleRuleType;
import io.pulumi.awsnative.route53resolver.inputs.ResolverRuleTagArgs;
import io.pulumi.awsnative.route53resolver.inputs.ResolverRuleTargetAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleArgs Empty = new ResolverRuleArgs();

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The name for the Resolver rule
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @InputImport(name="resolverEndpointId")
      private final @Nullable Input<String> resolverEndpointId;

    public Input<String> getResolverEndpointId() {
        return this.resolverEndpointId == null ? Input.empty() : this.resolverEndpointId;
    }

    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM.
     * 
     */
    @InputImport(name="ruleType", required=true)
      private final Input<ResolverRuleRuleType> ruleType;

    public Input<ResolverRuleRuleType> getRuleType() {
        return this.ruleType;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ResolverRuleTagArgs>> tags;

    public Input<List<ResolverRuleTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    @InputImport(name="targetIps")
      private final @Nullable Input<List<ResolverRuleTargetAddressArgs>> targetIps;

    public Input<List<ResolverRuleTargetAddressArgs>> getTargetIps() {
        return this.targetIps == null ? Input.empty() : this.targetIps;
    }

    public ResolverRuleArgs(
        Input<String> domainName,
        @Nullable Input<String> name,
        @Nullable Input<String> resolverEndpointId,
        Input<ResolverRuleRuleType> ruleType,
        @Nullable Input<List<ResolverRuleTagArgs>> tags,
        @Nullable Input<List<ResolverRuleTargetAddressArgs>> targetIps) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.name = name;
        this.resolverEndpointId = resolverEndpointId;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.tags = tags;
        this.targetIps = targetIps;
    }

    private ResolverRuleArgs() {
        this.domainName = Input.empty();
        this.name = Input.empty();
        this.resolverEndpointId = Input.empty();
        this.ruleType = Input.empty();
        this.tags = Input.empty();
        this.targetIps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> resolverEndpointId;
        private Input<ResolverRuleRuleType> ruleType;
        private @Nullable Input<List<ResolverRuleTagArgs>> tags;
        private @Nullable Input<List<ResolverRuleTargetAddressArgs>> targetIps;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.ruleType = defaults.ruleType;
    	      this.tags = defaults.tags;
    	      this.targetIps = defaults.targetIps;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder resolverEndpointId(@Nullable Input<String> resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }

        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = Input.ofNullable(resolverEndpointId);
            return this;
        }

        public Builder ruleType(Input<ResolverRuleRuleType> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder ruleType(ResolverRuleRuleType ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder tags(@Nullable Input<List<ResolverRuleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ResolverRuleTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder targetIps(@Nullable Input<List<ResolverRuleTargetAddressArgs>> targetIps) {
            this.targetIps = targetIps;
            return this;
        }

        public Builder targetIps(@Nullable List<ResolverRuleTargetAddressArgs> targetIps) {
            this.targetIps = Input.ofNullable(targetIps);
            return this;
        }
        public ResolverRuleArgs build() {
            return new ResolverRuleArgs(domainName, name, resolverEndpointId, ruleType, tags, targetIps);
        }
    }
}
