// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRuleHttpActionHeader;
import io.pulumi.awsnative.iot.outputs.TopicRuleHttpAuthorization;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleHttpAction {
    private final @Nullable TopicRuleHttpAuthorization auth;
    private final @Nullable String confirmationUrl;
    private final @Nullable List<TopicRuleHttpActionHeader> headers;
    private final String url;

    @OutputCustomType.Constructor
    private TopicRuleHttpAction(
        @OutputCustomType.Parameter("auth") @Nullable TopicRuleHttpAuthorization auth,
        @OutputCustomType.Parameter("confirmationUrl") @Nullable String confirmationUrl,
        @OutputCustomType.Parameter("headers") @Nullable List<TopicRuleHttpActionHeader> headers,
        @OutputCustomType.Parameter("url") String url) {
        this.auth = auth;
        this.confirmationUrl = confirmationUrl;
        this.headers = headers;
        this.url = url;
    }

    public Optional<TopicRuleHttpAuthorization> getAuth() {
        return Optional.ofNullable(this.auth);
    }
    public Optional<String> getConfirmationUrl() {
        return Optional.ofNullable(this.confirmationUrl);
    }
    public List<TopicRuleHttpActionHeader> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleHttpAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TopicRuleHttpAuthorization auth;
        private @Nullable String confirmationUrl;
        private @Nullable List<TopicRuleHttpActionHeader> headers;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleHttpAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.confirmationUrl = defaults.confirmationUrl;
    	      this.headers = defaults.headers;
    	      this.url = defaults.url;
        }

        public Builder auth(@Nullable TopicRuleHttpAuthorization auth) {
            this.auth = auth;
            return this;
        }

        public Builder confirmationUrl(@Nullable String confirmationUrl) {
            this.confirmationUrl = confirmationUrl;
            return this;
        }

        public Builder headers(@Nullable List<TopicRuleHttpActionHeader> headers) {
            this.headers = headers;
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public TopicRuleHttpAction build() {
            return new TopicRuleHttpAction(auth, confirmationUrl, headers, url);
        }
    }
}
