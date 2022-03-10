// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChannelPartnerLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetChannelPartnerLinkArgs Empty = new GetChannelPartnerLinkArgs();

    @InputImport(name="accountId", required=true)
      private final String accountId;

    public String getAccountId() {
        return this.accountId;
    }

    @InputImport(name="channelPartnerLinkId", required=true)
      private final String channelPartnerLinkId;

    public String getChannelPartnerLinkId() {
        return this.channelPartnerLinkId;
    }

    @InputImport(name="view")
      private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetChannelPartnerLinkArgs(
        String accountId,
        String channelPartnerLinkId,
        @Nullable String view) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.channelPartnerLinkId = Objects.requireNonNull(channelPartnerLinkId, "expected parameter 'channelPartnerLinkId' to be non-null");
        this.view = view;
    }

    private GetChannelPartnerLinkArgs() {
        this.accountId = null;
        this.channelPartnerLinkId = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelPartnerLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String channelPartnerLinkId;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelPartnerLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.channelPartnerLinkId = defaults.channelPartnerLinkId;
    	      this.view = defaults.view;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder channelPartnerLinkId(String channelPartnerLinkId) {
            this.channelPartnerLinkId = Objects.requireNonNull(channelPartnerLinkId);
            return this;
        }

        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }
        public GetChannelPartnerLinkArgs build() {
            return new GetChannelPartnerLinkArgs(accountId, channelPartnerLinkId, view);
        }
    }
}
