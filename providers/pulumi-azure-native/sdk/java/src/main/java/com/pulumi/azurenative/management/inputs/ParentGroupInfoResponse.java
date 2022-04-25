// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.management.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * (Optional) The ID of the parent management group.
 * 
 */
public final class ParentGroupInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ParentGroupInfoResponse Empty = new ParentGroupInfoResponse();

    /**
     * The friendly name of the parent management group.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The friendly name of the parent management group.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the parent management group
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the parent management group
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private ParentGroupInfoResponse() {}

    private ParentGroupInfoResponse(ParentGroupInfoResponse $) {
        this.displayName = $.displayName;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParentGroupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParentGroupInfoResponse $;

        public Builder() {
            $ = new ParentGroupInfoResponse();
        }

        public Builder(ParentGroupInfoResponse defaults) {
            $ = new ParentGroupInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The friendly name of the parent management group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param id The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the parent management group
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public ParentGroupInfoResponse build() {
            return $;
        }
    }

}
