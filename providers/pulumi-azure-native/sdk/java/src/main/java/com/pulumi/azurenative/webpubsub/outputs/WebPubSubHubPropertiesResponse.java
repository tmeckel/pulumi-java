// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.outputs;

import com.pulumi.azurenative.webpubsub.outputs.EventHandlerResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebPubSubHubPropertiesResponse {
    /**
     * @return The settings for configuring if anonymous connections are allowed for this hub: &#34;allow&#34; or &#34;deny&#34;. Default to &#34;deny&#34;.
     * 
     */
    private final @Nullable String anonymousConnectPolicy;
    /**
     * @return Event handler of a hub.
     * 
     */
    private final @Nullable List<EventHandlerResponse> eventHandlers;

    @CustomType.Constructor
    private WebPubSubHubPropertiesResponse(
        @CustomType.Parameter("anonymousConnectPolicy") @Nullable String anonymousConnectPolicy,
        @CustomType.Parameter("eventHandlers") @Nullable List<EventHandlerResponse> eventHandlers) {
        this.anonymousConnectPolicy = anonymousConnectPolicy;
        this.eventHandlers = eventHandlers;
    }

    /**
     * @return The settings for configuring if anonymous connections are allowed for this hub: &#34;allow&#34; or &#34;deny&#34;. Default to &#34;deny&#34;.
     * 
     */
    public Optional<String> anonymousConnectPolicy() {
        return Optional.ofNullable(this.anonymousConnectPolicy);
    }
    /**
     * @return Event handler of a hub.
     * 
     */
    public List<EventHandlerResponse> eventHandlers() {
        return this.eventHandlers == null ? List.of() : this.eventHandlers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String anonymousConnectPolicy;
        private @Nullable List<EventHandlerResponse> eventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymousConnectPolicy = defaults.anonymousConnectPolicy;
    	      this.eventHandlers = defaults.eventHandlers;
        }

        public Builder anonymousConnectPolicy(@Nullable String anonymousConnectPolicy) {
            this.anonymousConnectPolicy = anonymousConnectPolicy;
            return this;
        }
        public Builder eventHandlers(@Nullable List<EventHandlerResponse> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }
        public Builder eventHandlers(EventHandlerResponse... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }        public WebPubSubHubPropertiesResponse build() {
            return new WebPubSubHubPropertiesResponse(anonymousConnectPolicy, eventHandlers);
        }
    }
}
