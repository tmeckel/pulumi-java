// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.ContentKeyPolicyClearKeyConfigurationResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyFairPlayConfigurationResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyOpenRestrictionResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyConfigurationResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyTokenRestrictionResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyUnknownConfigurationResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyUnknownRestrictionResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyWidevineConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a policy option.
 * 
 */
public final class ContentKeyPolicyOptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyOptionResponse Empty = new ContentKeyPolicyOptionResponse();

    /**
     * The key delivery configuration.
     * 
     */
    @Import(name="configuration", required=true)
    private Object configuration;

    /**
     * @return The key delivery configuration.
     * 
     */
    public Object configuration() {
        return this.configuration;
    }

    /**
     * The Policy Option description.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The Policy Option description.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The legacy Policy Option ID.
     * 
     */
    @Import(name="policyOptionId", required=true)
    private String policyOptionId;

    /**
     * @return The legacy Policy Option ID.
     * 
     */
    public String policyOptionId() {
        return this.policyOptionId;
    }

    /**
     * The requirements that must be met to deliver keys with this configuration
     * 
     */
    @Import(name="restriction", required=true)
    private Object restriction;

    /**
     * @return The requirements that must be met to deliver keys with this configuration
     * 
     */
    public Object restriction() {
        return this.restriction;
    }

    private ContentKeyPolicyOptionResponse() {}

    private ContentKeyPolicyOptionResponse(ContentKeyPolicyOptionResponse $) {
        this.configuration = $.configuration;
        this.name = $.name;
        this.policyOptionId = $.policyOptionId;
        this.restriction = $.restriction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyOptionResponse $;

        public Builder() {
            $ = new ContentKeyPolicyOptionResponse();
        }

        public Builder(ContentKeyPolicyOptionResponse defaults) {
            $ = new ContentKeyPolicyOptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration The key delivery configuration.
         * 
         * @return builder
         * 
         */
        public Builder configuration(Object configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param name The Policy Option description.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param policyOptionId The legacy Policy Option ID.
         * 
         * @return builder
         * 
         */
        public Builder policyOptionId(String policyOptionId) {
            $.policyOptionId = policyOptionId;
            return this;
        }

        /**
         * @param restriction The requirements that must be met to deliver keys with this configuration
         * 
         * @return builder
         * 
         */
        public Builder restriction(Object restriction) {
            $.restriction = restriction;
            return this;
        }

        public ContentKeyPolicyOptionResponse build() {
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            $.policyOptionId = Objects.requireNonNull($.policyOptionId, "expected parameter 'policyOptionId' to be non-null");
            $.restriction = Objects.requireNonNull($.restriction, "expected parameter 'restriction' to be non-null");
            return $;
        }
    }

}
