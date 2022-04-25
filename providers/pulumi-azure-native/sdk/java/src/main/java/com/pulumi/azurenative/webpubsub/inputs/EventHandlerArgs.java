// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.azurenative.webpubsub.inputs.UpstreamAuthSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of event handler.
 * 
 */
public final class EventHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventHandlerArgs Empty = new EventHandlerArgs();

    /**
     * Upstream auth settings. If not set, no auth is used for upstream messages.
     * 
     */
    @Import(name="auth")
    private @Nullable Output<UpstreamAuthSettingsArgs> auth;

    /**
     * @return Upstream auth settings. If not set, no auth is used for upstream messages.
     * 
     */
    public Optional<Output<UpstreamAuthSettingsArgs>> auth() {
        return Optional.ofNullable(this.auth);
    }

    /**
     * Gets ot sets the list of system events.
     * 
     */
    @Import(name="systemEvents")
    private @Nullable Output<List<String>> systemEvents;

    /**
     * @return Gets ot sets the list of system events.
     * 
     */
    public Optional<Output<List<String>>> systemEvents() {
        return Optional.ofNullable(this.systemEvents);
    }

    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can&#39;t contains parameters.
     * 
     */
    @Import(name="urlTemplate", required=true)
    private Output<String> urlTemplate;

    /**
     * @return Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can&#39;t contains parameters.
     * 
     */
    public Output<String> urlTemplate() {
        return this.urlTemplate;
    }

    /**
     * Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. &#34;*&#34;, it to matches any event name
     *     2. Combine multiple events with &#34;,&#34;, for example &#34;event1,event2&#34;, it matches event &#34;event1&#34; and &#34;event2&#34;
     *     3. The single event name, for example, &#34;event1&#34;, it matches &#34;event1&#34;
     * 
     */
    @Import(name="userEventPattern")
    private @Nullable Output<String> userEventPattern;

    /**
     * @return Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. &#34;*&#34;, it to matches any event name
     *     2. Combine multiple events with &#34;,&#34;, for example &#34;event1,event2&#34;, it matches event &#34;event1&#34; and &#34;event2&#34;
     *     3. The single event name, for example, &#34;event1&#34;, it matches &#34;event1&#34;
     * 
     */
    public Optional<Output<String>> userEventPattern() {
        return Optional.ofNullable(this.userEventPattern);
    }

    private EventHandlerArgs() {}

    private EventHandlerArgs(EventHandlerArgs $) {
        this.auth = $.auth;
        this.systemEvents = $.systemEvents;
        this.urlTemplate = $.urlTemplate;
        this.userEventPattern = $.userEventPattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHandlerArgs $;

        public Builder() {
            $ = new EventHandlerArgs();
        }

        public Builder(EventHandlerArgs defaults) {
            $ = new EventHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth Upstream auth settings. If not set, no auth is used for upstream messages.
         * 
         * @return builder
         * 
         */
        public Builder auth(@Nullable Output<UpstreamAuthSettingsArgs> auth) {
            $.auth = auth;
            return this;
        }

        /**
         * @param auth Upstream auth settings. If not set, no auth is used for upstream messages.
         * 
         * @return builder
         * 
         */
        public Builder auth(UpstreamAuthSettingsArgs auth) {
            return auth(Output.of(auth));
        }

        /**
         * @param systemEvents Gets ot sets the list of system events.
         * 
         * @return builder
         * 
         */
        public Builder systemEvents(@Nullable Output<List<String>> systemEvents) {
            $.systemEvents = systemEvents;
            return this;
        }

        /**
         * @param systemEvents Gets ot sets the list of system events.
         * 
         * @return builder
         * 
         */
        public Builder systemEvents(List<String> systemEvents) {
            return systemEvents(Output.of(systemEvents));
        }

        /**
         * @param systemEvents Gets ot sets the list of system events.
         * 
         * @return builder
         * 
         */
        public Builder systemEvents(String... systemEvents) {
            return systemEvents(List.of(systemEvents));
        }

        /**
         * @param urlTemplate Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
         * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can&#39;t contains parameters.
         * 
         * @return builder
         * 
         */
        public Builder urlTemplate(Output<String> urlTemplate) {
            $.urlTemplate = urlTemplate;
            return this;
        }

        /**
         * @param urlTemplate Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
         * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can&#39;t contains parameters.
         * 
         * @return builder
         * 
         */
        public Builder urlTemplate(String urlTemplate) {
            return urlTemplate(Output.of(urlTemplate));
        }

        /**
         * @param userEventPattern Gets or sets the matching pattern for event names.
         * There are 3 kind of patterns supported:
         *     1. &#34;*&#34;, it to matches any event name
         *     2. Combine multiple events with &#34;,&#34;, for example &#34;event1,event2&#34;, it matches event &#34;event1&#34; and &#34;event2&#34;
         *     3. The single event name, for example, &#34;event1&#34;, it matches &#34;event1&#34;
         * 
         * @return builder
         * 
         */
        public Builder userEventPattern(@Nullable Output<String> userEventPattern) {
            $.userEventPattern = userEventPattern;
            return this;
        }

        /**
         * @param userEventPattern Gets or sets the matching pattern for event names.
         * There are 3 kind of patterns supported:
         *     1. &#34;*&#34;, it to matches any event name
         *     2. Combine multiple events with &#34;,&#34;, for example &#34;event1,event2&#34;, it matches event &#34;event1&#34; and &#34;event2&#34;
         *     3. The single event name, for example, &#34;event1&#34;, it matches &#34;event1&#34;
         * 
         * @return builder
         * 
         */
        public Builder userEventPattern(String userEventPattern) {
            return userEventPattern(Output.of(userEventPattern));
        }

        public EventHandlerArgs build() {
            $.urlTemplate = Objects.requireNonNull($.urlTemplate, "expected parameter 'urlTemplate' to be non-null");
            return $;
        }
    }

}
