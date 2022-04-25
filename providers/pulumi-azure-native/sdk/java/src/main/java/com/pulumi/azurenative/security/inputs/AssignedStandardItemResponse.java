// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * describe the properties of a of a security standard object reference
 * 
 */
public final class AssignedStandardItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignedStandardItemResponse Empty = new AssignedStandardItemResponse();

    /**
     * full resourceId of the Microsoft.Security/standard object
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return full resourceId of the Microsoft.Security/standard object
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private AssignedStandardItemResponse() {}

    private AssignedStandardItemResponse(AssignedStandardItemResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignedStandardItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignedStandardItemResponse $;

        public Builder() {
            $ = new AssignedStandardItemResponse();
        }

        public Builder(AssignedStandardItemResponse defaults) {
            $ = new AssignedStandardItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id full resourceId of the Microsoft.Security/standard object
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public AssignedStandardItemResponse build() {
            return $;
        }
    }

}
