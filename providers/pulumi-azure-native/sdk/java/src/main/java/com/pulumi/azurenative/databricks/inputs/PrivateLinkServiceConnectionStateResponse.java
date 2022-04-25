// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @Import(name="actionRequired")
    private @Nullable String actionRequired;

    /**
     * @return Actions required for a private endpoint connection
     * 
     */
    public Optional<String> actionRequired() {
        return Optional.ofNullable(this.actionRequired);
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description for the current state of a private endpoint connection
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The status of a private endpoint connection
     * 
     */
    public String status() {
        return this.status;
    }

    private PrivateLinkServiceConnectionStateResponse() {}

    private PrivateLinkServiceConnectionStateResponse(PrivateLinkServiceConnectionStateResponse $) {
        this.actionRequired = $.actionRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateResponse $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateResponse();
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
            $ = new PrivateLinkServiceConnectionStateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionRequired Actions required for a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder actionRequired(@Nullable String actionRequired) {
            $.actionRequired = actionRequired;
            return this;
        }

        /**
         * @param description The description for the current state of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param status The status of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public PrivateLinkServiceConnectionStateResponse build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
