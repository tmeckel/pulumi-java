// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse Empty = new ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse();

    /**
     * The private link service connection description.
     * 
     */
    @Import(name="actionsRequired", required=true)
    private String actionsRequired;

    /**
     * @return The private link service connection description.
     * 
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * The private link service connection description.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return The private link service connection description.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The private link service connection status.
     * 
     */
    public String status() {
        return this.status;
    }

    private ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse() {}

    private ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse(ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse $;

        public Builder() {
            $ = new ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse();
        }

        public Builder(ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse defaults) {
            $ = new ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionsRequired The private link service connection description.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(String actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        /**
         * @param description The private link service connection description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param status The private link service connection status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse build() {
            $.actionsRequired = Objects.requireNonNull($.actionsRequired, "expected parameter 'actionsRequired' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
