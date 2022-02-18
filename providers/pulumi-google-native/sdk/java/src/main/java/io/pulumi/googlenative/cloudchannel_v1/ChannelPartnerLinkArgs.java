// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudchannel_v1.enums.ChannelPartnerLinkLinkState;
import java.lang.String;
import java.util.Objects;


public final class ChannelPartnerLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelPartnerLinkArgs Empty = new ChannelPartnerLinkArgs();

    @InputImport(name="accountId", required=true)
    private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    /**
     * State of the channel partner link.
     * 
     */
    @InputImport(name="linkState", required=true)
    private final Input<ChannelPartnerLinkLinkState> linkState;

    public Input<ChannelPartnerLinkLinkState> getLinkState() {
        return this.linkState;
    }

    /**
     * Cloud Identity ID of the linked reseller.
     * 
     */
    @InputImport(name="resellerCloudIdentityId", required=true)
    private final Input<String> resellerCloudIdentityId;

    public Input<String> getResellerCloudIdentityId() {
        return this.resellerCloudIdentityId;
    }

    public ChannelPartnerLinkArgs(
        Input<String> accountId,
        Input<ChannelPartnerLinkLinkState> linkState,
        Input<String> resellerCloudIdentityId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.linkState = Objects.requireNonNull(linkState, "expected parameter 'linkState' to be non-null");
        this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId, "expected parameter 'resellerCloudIdentityId' to be non-null");
    }

    private ChannelPartnerLinkArgs() {
        this.accountId = Input.empty();
        this.linkState = Input.empty();
        this.resellerCloudIdentityId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelPartnerLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private Input<ChannelPartnerLinkLinkState> linkState;
        private Input<String> resellerCloudIdentityId;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelPartnerLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.linkState = defaults.linkState;
    	      this.resellerCloudIdentityId = defaults.resellerCloudIdentityId;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setLinkState(Input<ChannelPartnerLinkLinkState> linkState) {
            this.linkState = Objects.requireNonNull(linkState);
            return this;
        }

        public Builder setLinkState(ChannelPartnerLinkLinkState linkState) {
            this.linkState = Input.of(Objects.requireNonNull(linkState));
            return this;
        }

        public Builder setResellerCloudIdentityId(Input<String> resellerCloudIdentityId) {
            this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId);
            return this;
        }

        public Builder setResellerCloudIdentityId(String resellerCloudIdentityId) {
            this.resellerCloudIdentityId = Input.of(Objects.requireNonNull(resellerCloudIdentityId));
            return this;
        }

        public ChannelPartnerLinkArgs build() {
            return new ChannelPartnerLinkArgs(accountId, linkState, resellerCloudIdentityId);
        }
    }
}
