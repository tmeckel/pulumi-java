// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single automation scope.
 * 
 */
public final class AutomationScopeResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutomationScopeResponse Empty = new AutomationScopeResponse();

    /**
     * The resources scope description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The resources scope description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     */
    @Import(name="scopePath")
    private @Nullable String scopePath;

    /**
     * @return The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     */
    public Optional<String> scopePath() {
        return Optional.ofNullable(this.scopePath);
    }

    private AutomationScopeResponse() {}

    private AutomationScopeResponse(AutomationScopeResponse $) {
        this.description = $.description;
        this.scopePath = $.scopePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationScopeResponse $;

        public Builder() {
            $ = new AutomationScopeResponse();
        }

        public Builder(AutomationScopeResponse defaults) {
            $ = new AutomationScopeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The resources scope description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param scopePath The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
         * 
         * @return builder
         * 
         */
        public Builder scopePath(@Nullable String scopePath) {
            $.scopePath = scopePath;
            return this;
        }

        public AutomationScopeResponse build() {
            return $;
        }
    }

}
