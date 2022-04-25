// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusBrokeredMessagePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceBusBrokeredMessagePropertiesResponse Empty = new ServiceBusBrokeredMessagePropertiesResponse();

    /**
     * Gets or sets the content type.
     * 
     */
    @Import(name="contentType")
    private @Nullable String contentType;

    /**
     * @return Gets or sets the content type.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * Gets or sets the correlation ID.
     * 
     */
    @Import(name="correlationId")
    private @Nullable String correlationId;

    /**
     * @return Gets or sets the correlation ID.
     * 
     */
    public Optional<String> correlationId() {
        return Optional.ofNullable(this.correlationId);
    }

    /**
     * Gets or sets the force persistence.
     * 
     */
    @Import(name="forcePersistence")
    private @Nullable Boolean forcePersistence;

    /**
     * @return Gets or sets the force persistence.
     * 
     */
    public Optional<Boolean> forcePersistence() {
        return Optional.ofNullable(this.forcePersistence);
    }

    /**
     * Gets or sets the label.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return Gets or sets the label.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Gets or sets the message ID.
     * 
     */
    @Import(name="messageId")
    private @Nullable String messageId;

    /**
     * @return Gets or sets the message ID.
     * 
     */
    public Optional<String> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * Gets or sets the partition key.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable String partitionKey;

    /**
     * @return Gets or sets the partition key.
     * 
     */
    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * Gets or sets the reply to.
     * 
     */
    @Import(name="replyTo")
    private @Nullable String replyTo;

    /**
     * @return Gets or sets the reply to.
     * 
     */
    public Optional<String> replyTo() {
        return Optional.ofNullable(this.replyTo);
    }

    /**
     * Gets or sets the reply to session ID.
     * 
     */
    @Import(name="replyToSessionId")
    private @Nullable String replyToSessionId;

    /**
     * @return Gets or sets the reply to session ID.
     * 
     */
    public Optional<String> replyToSessionId() {
        return Optional.ofNullable(this.replyToSessionId);
    }

    /**
     * Gets or sets the scheduled enqueue time UTC.
     * 
     */
    @Import(name="scheduledEnqueueTimeUtc")
    private @Nullable String scheduledEnqueueTimeUtc;

    /**
     * @return Gets or sets the scheduled enqueue time UTC.
     * 
     */
    public Optional<String> scheduledEnqueueTimeUtc() {
        return Optional.ofNullable(this.scheduledEnqueueTimeUtc);
    }

    /**
     * Gets or sets the session ID.
     * 
     */
    @Import(name="sessionId")
    private @Nullable String sessionId;

    /**
     * @return Gets or sets the session ID.
     * 
     */
    public Optional<String> sessionId() {
        return Optional.ofNullable(this.sessionId);
    }

    /**
     * Gets or sets the time to live.
     * 
     */
    @Import(name="timeToLive")
    private @Nullable String timeToLive;

    /**
     * @return Gets or sets the time to live.
     * 
     */
    public Optional<String> timeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    /**
     * Gets or sets the to.
     * 
     */
    @Import(name="to")
    private @Nullable String to;

    /**
     * @return Gets or sets the to.
     * 
     */
    public Optional<String> to() {
        return Optional.ofNullable(this.to);
    }

    /**
     * Gets or sets the via partition key.
     * 
     */
    @Import(name="viaPartitionKey")
    private @Nullable String viaPartitionKey;

    /**
     * @return Gets or sets the via partition key.
     * 
     */
    public Optional<String> viaPartitionKey() {
        return Optional.ofNullable(this.viaPartitionKey);
    }

    private ServiceBusBrokeredMessagePropertiesResponse() {}

    private ServiceBusBrokeredMessagePropertiesResponse(ServiceBusBrokeredMessagePropertiesResponse $) {
        this.contentType = $.contentType;
        this.correlationId = $.correlationId;
        this.forcePersistence = $.forcePersistence;
        this.label = $.label;
        this.messageId = $.messageId;
        this.partitionKey = $.partitionKey;
        this.replyTo = $.replyTo;
        this.replyToSessionId = $.replyToSessionId;
        this.scheduledEnqueueTimeUtc = $.scheduledEnqueueTimeUtc;
        this.sessionId = $.sessionId;
        this.timeToLive = $.timeToLive;
        this.to = $.to;
        this.viaPartitionKey = $.viaPartitionKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceBusBrokeredMessagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceBusBrokeredMessagePropertiesResponse $;

        public Builder() {
            $ = new ServiceBusBrokeredMessagePropertiesResponse();
        }

        public Builder(ServiceBusBrokeredMessagePropertiesResponse defaults) {
            $ = new ServiceBusBrokeredMessagePropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType Gets or sets the content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param correlationId Gets or sets the correlation ID.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(@Nullable String correlationId) {
            $.correlationId = correlationId;
            return this;
        }

        /**
         * @param forcePersistence Gets or sets the force persistence.
         * 
         * @return builder
         * 
         */
        public Builder forcePersistence(@Nullable Boolean forcePersistence) {
            $.forcePersistence = forcePersistence;
            return this;
        }

        /**
         * @param label Gets or sets the label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        /**
         * @param messageId Gets or sets the message ID.
         * 
         * @return builder
         * 
         */
        public Builder messageId(@Nullable String messageId) {
            $.messageId = messageId;
            return this;
        }

        /**
         * @param partitionKey Gets or sets the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable String partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param replyTo Gets or sets the reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyTo(@Nullable String replyTo) {
            $.replyTo = replyTo;
            return this;
        }

        /**
         * @param replyToSessionId Gets or sets the reply to session ID.
         * 
         * @return builder
         * 
         */
        public Builder replyToSessionId(@Nullable String replyToSessionId) {
            $.replyToSessionId = replyToSessionId;
            return this;
        }

        /**
         * @param scheduledEnqueueTimeUtc Gets or sets the scheduled enqueue time UTC.
         * 
         * @return builder
         * 
         */
        public Builder scheduledEnqueueTimeUtc(@Nullable String scheduledEnqueueTimeUtc) {
            $.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
            return this;
        }

        /**
         * @param sessionId Gets or sets the session ID.
         * 
         * @return builder
         * 
         */
        public Builder sessionId(@Nullable String sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        /**
         * @param timeToLive Gets or sets the time to live.
         * 
         * @return builder
         * 
         */
        public Builder timeToLive(@Nullable String timeToLive) {
            $.timeToLive = timeToLive;
            return this;
        }

        /**
         * @param to Gets or sets the to.
         * 
         * @return builder
         * 
         */
        public Builder to(@Nullable String to) {
            $.to = to;
            return this;
        }

        /**
         * @param viaPartitionKey Gets or sets the via partition key.
         * 
         * @return builder
         * 
         */
        public Builder viaPartitionKey(@Nullable String viaPartitionKey) {
            $.viaPartitionKey = viaPartitionKey;
            return this;
        }

        public ServiceBusBrokeredMessagePropertiesResponse build() {
            return $;
        }
    }

}
