// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudchannel_v1.enums.ChannelPartnerLinkLinkState;
import java.lang.String;
import java.util.Objects;


public final class ChannelPartnerLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelPartnerLinkArgs Empty = new ChannelPartnerLinkArgs();

    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }

    /**
     * State of the channel partner link.
     * 
     */
    @Import(name="linkState", required=true)
      private final Output<ChannelPartnerLinkLinkState> linkState;

    public Output<ChannelPartnerLinkLinkState> getLinkState() {
        return this.linkState;
    }

    /**
     * Cloud Identity ID of the linked reseller.
     * 
     */
    @Import(name="resellerCloudIdentityId", required=true)
      private final Output<String> resellerCloudIdentityId;

    public Output<String> getResellerCloudIdentityId() {
        return this.resellerCloudIdentityId;
    }

    public ChannelPartnerLinkArgs(
        Output<String> accountId,
        Output<ChannelPartnerLinkLinkState> linkState,
        Output<String> resellerCloudIdentityId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.linkState = Objects.requireNonNull(linkState, "expected parameter 'linkState' to be non-null");
        this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId, "expected parameter 'resellerCloudIdentityId' to be non-null");
    }

    private ChannelPartnerLinkArgs() {
        this.accountId = Codegen.empty();
        this.linkState = Codegen.empty();
        this.resellerCloudIdentityId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelPartnerLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private Output<ChannelPartnerLinkLinkState> linkState;
        private Output<String> resellerCloudIdentityId;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelPartnerLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.linkState = defaults.linkState;
    	      this.resellerCloudIdentityId = defaults.resellerCloudIdentityId;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder linkState(Output<ChannelPartnerLinkLinkState> linkState) {
            this.linkState = Objects.requireNonNull(linkState);
            return this;
        }
        public Builder linkState(ChannelPartnerLinkLinkState linkState) {
            this.linkState = Output.of(Objects.requireNonNull(linkState));
            return this;
        }
        public Builder resellerCloudIdentityId(Output<String> resellerCloudIdentityId) {
            this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId);
            return this;
        }
        public Builder resellerCloudIdentityId(String resellerCloudIdentityId) {
            this.resellerCloudIdentityId = Output.of(Objects.requireNonNull(resellerCloudIdentityId));
            return this;
        }        public ChannelPartnerLinkArgs build() {
            return new ChannelPartnerLinkArgs(accountId, linkState, resellerCloudIdentityId);
        }
    }
}
