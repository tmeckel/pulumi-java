// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A portal resource.
 * 
 */
public final class AccessPolicyPortal extends com.pulumi.resources.InvokeArgs {

    public static final AccessPolicyPortal Empty = new AccessPolicyPortal();

    /**
     * The ID of the portal.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the portal.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private AccessPolicyPortal() {}

    private AccessPolicyPortal(AccessPolicyPortal $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyPortal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyPortal $;

        public Builder() {
            $ = new AccessPolicyPortal();
        }

        public Builder(AccessPolicyPortal defaults) {
            $ = new AccessPolicyPortal(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the portal.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public AccessPolicyPortal build() {
            return $;
        }
    }

}
