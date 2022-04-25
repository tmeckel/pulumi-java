// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Violation information.
 * 
 */
public final class ViolationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ViolationResponse Empty = new ViolationResponse();

    /**
     * Error message.
     * 
     */
    @Import(name="errorMessage", required=true)
    private String errorMessage;

    /**
     * @return Error message.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Id of the item that violates tenant configuration.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Id of the item that violates tenant configuration.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Id of the user who owns violated item.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return Id of the user who owns violated item.
     * 
     */
    public String userId() {
        return this.userId;
    }

    private ViolationResponse() {}

    private ViolationResponse(ViolationResponse $) {
        this.errorMessage = $.errorMessage;
        this.id = $.id;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViolationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViolationResponse $;

        public Builder() {
            $ = new ViolationResponse();
        }

        public Builder(ViolationResponse defaults) {
            $ = new ViolationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorMessage Error message.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(String errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param id Id of the item that violates tenant configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param userId Id of the user who owns violated item.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public ViolationResponse build() {
            $.errorMessage = Objects.requireNonNull($.errorMessage, "expected parameter 'errorMessage' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
