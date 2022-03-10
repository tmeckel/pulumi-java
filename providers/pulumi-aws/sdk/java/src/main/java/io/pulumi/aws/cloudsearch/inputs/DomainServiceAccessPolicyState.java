// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainServiceAccessPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final DomainServiceAccessPolicyState Empty = new DomainServiceAccessPolicyState();

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @InputImport(name="accessPolicy")
      private final @Nullable Input<String> accessPolicy;

    public Input<String> getAccessPolicy() {
        return this.accessPolicy == null ? Input.empty() : this.accessPolicy;
    }

    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    public DomainServiceAccessPolicyState(
        @Nullable Input<String> accessPolicy,
        @Nullable Input<String> domainName) {
        this.accessPolicy = accessPolicy;
        this.domainName = domainName;
    }

    private DomainServiceAccessPolicyState() {
        this.accessPolicy = Input.empty();
        this.domainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPolicy;
        private @Nullable Input<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceAccessPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.domainName = defaults.domainName;
        }

        public Builder accessPolicy(@Nullable Input<String> accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }

        public Builder accessPolicy(@Nullable String accessPolicy) {
            this.accessPolicy = Input.ofNullable(accessPolicy);
            return this;
        }

        public Builder domainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }
        public DomainServiceAccessPolicyState build() {
            return new DomainServiceAccessPolicyState(accessPolicy, domainName);
        }
    }
}
