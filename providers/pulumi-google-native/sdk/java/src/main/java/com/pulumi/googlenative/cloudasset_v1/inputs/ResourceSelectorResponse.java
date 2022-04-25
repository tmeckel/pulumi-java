// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the resource to analyze for access policies, which may be set directly on the resource, or on ancestors such as organizations, folders or projects.
 * 
 */
public final class ResourceSelectorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceSelectorResponse Empty = new ResourceSelectorResponse();

    /**
     * The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
     * 
     */
    @Import(name="fullResourceName", required=true)
    private String fullResourceName;

    /**
     * @return The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
     * 
     */
    public String fullResourceName() {
        return this.fullResourceName;
    }

    private ResourceSelectorResponse() {}

    private ResourceSelectorResponse(ResourceSelectorResponse $) {
        this.fullResourceName = $.fullResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSelectorResponse $;

        public Builder() {
            $ = new ResourceSelectorResponse();
        }

        public Builder(ResourceSelectorResponse defaults) {
            $ = new ResourceSelectorResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullResourceName The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
         * 
         * @return builder
         * 
         */
        public Builder fullResourceName(String fullResourceName) {
            $.fullResourceName = fullResourceName;
            return this;
        }

        public ResourceSelectorResponse build() {
            $.fullResourceName = Objects.requireNonNull($.fullResourceName, "expected parameter 'fullResourceName' to be non-null");
            return $;
        }
    }

}
