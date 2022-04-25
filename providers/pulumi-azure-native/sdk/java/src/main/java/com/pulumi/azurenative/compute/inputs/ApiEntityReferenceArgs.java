// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The API entity reference.
 * 
 */
public final class ApiEntityReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiEntityReferenceArgs Empty = new ApiEntityReferenceArgs();

    /**
     * The ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private ApiEntityReferenceArgs() {}

    private ApiEntityReferenceArgs(ApiEntityReferenceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiEntityReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiEntityReferenceArgs $;

        public Builder() {
            $ = new ApiEntityReferenceArgs();
        }

        public Builder(ApiEntityReferenceArgs defaults) {
            $ = new ApiEntityReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ApiEntityReferenceArgs build() {
            return $;
        }
    }

}
