// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDelegatedServicesDelegatedService {
    /**
     * The date that the account became a delegated administrator for this service.
     * 
     */
    private final String delegationEnabledDate;
    /**
     * The name of an AWS service that can request an operation for the specified service.
     * 
     */
    private final String servicePrincipal;

    @OutputCustomType.Constructor
    private GetDelegatedServicesDelegatedService(
        @OutputCustomType.Parameter("delegationEnabledDate") String delegationEnabledDate,
        @OutputCustomType.Parameter("servicePrincipal") String servicePrincipal) {
        this.delegationEnabledDate = delegationEnabledDate;
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * The date that the account became a delegated administrator for this service.
     * 
    */
    public String getDelegationEnabledDate() {
        return this.delegationEnabledDate;
    }
    /**
     * The name of an AWS service that can request an operation for the specified service.
     * 
    */
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDelegatedServicesDelegatedService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delegationEnabledDate;
        private String servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDelegatedServicesDelegatedService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegationEnabledDate = defaults.delegationEnabledDate;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder delegationEnabledDate(String delegationEnabledDate) {
            this.delegationEnabledDate = Objects.requireNonNull(delegationEnabledDate);
            return this;
        }

        public Builder servicePrincipal(String servicePrincipal) {
            this.servicePrincipal = Objects.requireNonNull(servicePrincipal);
            return this;
        }
        public GetDelegatedServicesDelegatedService build() {
            return new GetDelegatedServicesDelegatedService(delegationEnabledDate, servicePrincipal);
        }
    }
}
