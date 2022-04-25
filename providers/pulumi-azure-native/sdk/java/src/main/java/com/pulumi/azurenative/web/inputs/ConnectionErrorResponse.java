// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection error
 * 
 */
public final class ConnectionErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionErrorResponse Empty = new ConnectionErrorResponse();

    /**
     * Code of the status
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    /**
     * @return Code of the status
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Resource ETag
     * 
     */
    @Import(name="etag")
    private @Nullable String etag;

    /**
     * @return Resource ETag
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Resource id
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Resource id
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return Resource location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Description of the status
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    /**
     * @return Description of the status
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Resource name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Resource type
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    private ConnectionErrorResponse() {}

    private ConnectionErrorResponse(ConnectionErrorResponse $) {
        this.code = $.code;
        this.etag = $.etag;
        this.id = $.id;
        this.location = $.location;
        this.message = $.message;
        this.name = $.name;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionErrorResponse $;

        public Builder() {
            $ = new ConnectionErrorResponse();
        }

        public Builder(ConnectionErrorResponse defaults) {
            $ = new ConnectionErrorResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Code of the status
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        /**
         * @param etag Resource ETag
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Resource id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param message Description of the status
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        /**
         * @param name Resource name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param type Resource type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ConnectionErrorResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
