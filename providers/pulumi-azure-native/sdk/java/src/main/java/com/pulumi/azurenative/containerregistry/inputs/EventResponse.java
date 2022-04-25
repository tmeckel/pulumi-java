// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.EventRequestMessageResponse;
import com.pulumi.azurenative.containerregistry.inputs.EventResponseMessageResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The event for a webhook.
 * 
 */
public final class EventResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventResponse Empty = new EventResponse();

    /**
     * The event request message sent to the service URI.
     * 
     */
    @Import(name="eventRequestMessage")
    private @Nullable EventRequestMessageResponse eventRequestMessage;

    /**
     * @return The event request message sent to the service URI.
     * 
     */
    public Optional<EventRequestMessageResponse> eventRequestMessage() {
        return Optional.ofNullable(this.eventRequestMessage);
    }

    /**
     * The event response message received from the service URI.
     * 
     */
    @Import(name="eventResponseMessage")
    private @Nullable EventResponseMessageResponse eventResponseMessage;

    /**
     * @return The event response message received from the service URI.
     * 
     */
    public Optional<EventResponseMessageResponse> eventResponseMessage() {
        return Optional.ofNullable(this.eventResponseMessage);
    }

    /**
     * The event ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The event ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private EventResponse() {}

    private EventResponse(EventResponse $) {
        this.eventRequestMessage = $.eventRequestMessage;
        this.eventResponseMessage = $.eventResponseMessage;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventResponse $;

        public Builder() {
            $ = new EventResponse();
        }

        public Builder(EventResponse defaults) {
            $ = new EventResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventRequestMessage The event request message sent to the service URI.
         * 
         * @return builder
         * 
         */
        public Builder eventRequestMessage(@Nullable EventRequestMessageResponse eventRequestMessage) {
            $.eventRequestMessage = eventRequestMessage;
            return this;
        }

        /**
         * @param eventResponseMessage The event response message received from the service URI.
         * 
         * @return builder
         * 
         */
        public Builder eventResponseMessage(@Nullable EventResponseMessageResponse eventResponseMessage) {
            $.eventResponseMessage = eventResponseMessage;
            return this;
        }

        /**
         * @param id The event ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public EventResponse build() {
            return $;
        }
    }

}
