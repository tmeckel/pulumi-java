// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSkusNestedResourceTypeThirdArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSkusNestedResourceTypeThirdArgs Empty = new GetSkusNestedResourceTypeThirdArgs();

    /**
     * The first child resource type.
     * 
     */
    @Import(name="nestedResourceTypeFirst", required=true)
    private String nestedResourceTypeFirst;

    /**
     * @return The first child resource type.
     * 
     */
    public String nestedResourceTypeFirst() {
        return this.nestedResourceTypeFirst;
    }

    /**
     * The second child resource type.
     * 
     */
    @Import(name="nestedResourceTypeSecond", required=true)
    private String nestedResourceTypeSecond;

    /**
     * @return The second child resource type.
     * 
     */
    public String nestedResourceTypeSecond() {
        return this.nestedResourceTypeSecond;
    }

    /**
     * The third child resource type.
     * 
     */
    @Import(name="nestedResourceTypeThird", required=true)
    private String nestedResourceTypeThird;

    /**
     * @return The third child resource type.
     * 
     */
    public String nestedResourceTypeThird() {
        return this.nestedResourceTypeThird;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
    private String providerNamespace;

    /**
     * @return The name of the resource provider hosted within ProviderHub.
     * 
     */
    public String providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return The resource type.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @Import(name="sku", required=true)
    private String sku;

    /**
     * @return The SKU.
     * 
     */
    public String sku() {
        return this.sku;
    }

    private GetSkusNestedResourceTypeThirdArgs() {}

    private GetSkusNestedResourceTypeThirdArgs(GetSkusNestedResourceTypeThirdArgs $) {
        this.nestedResourceTypeFirst = $.nestedResourceTypeFirst;
        this.nestedResourceTypeSecond = $.nestedResourceTypeSecond;
        this.nestedResourceTypeThird = $.nestedResourceTypeThird;
        this.providerNamespace = $.providerNamespace;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSkusNestedResourceTypeThirdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSkusNestedResourceTypeThirdArgs $;

        public Builder() {
            $ = new GetSkusNestedResourceTypeThirdArgs();
        }

        public Builder(GetSkusNestedResourceTypeThirdArgs defaults) {
            $ = new GetSkusNestedResourceTypeThirdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nestedResourceTypeFirst The first child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeFirst(String nestedResourceTypeFirst) {
            $.nestedResourceTypeFirst = nestedResourceTypeFirst;
            return this;
        }

        /**
         * @param nestedResourceTypeSecond The second child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeSecond(String nestedResourceTypeSecond) {
            $.nestedResourceTypeSecond = nestedResourceTypeSecond;
            return this;
        }

        /**
         * @param nestedResourceTypeThird The third child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeThird(String nestedResourceTypeThird) {
            $.nestedResourceTypeThird = nestedResourceTypeThird;
            return this;
        }

        /**
         * @param providerNamespace The name of the resource provider hosted within ProviderHub.
         * 
         * @return builder
         * 
         */
        public Builder providerNamespace(String providerNamespace) {
            $.providerNamespace = providerNamespace;
            return this;
        }

        /**
         * @param resourceType The resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param sku The SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            $.sku = sku;
            return this;
        }

        public GetSkusNestedResourceTypeThirdArgs build() {
            $.nestedResourceTypeFirst = Objects.requireNonNull($.nestedResourceTypeFirst, "expected parameter 'nestedResourceTypeFirst' to be non-null");
            $.nestedResourceTypeSecond = Objects.requireNonNull($.nestedResourceTypeSecond, "expected parameter 'nestedResourceTypeSecond' to be non-null");
            $.nestedResourceTypeThird = Objects.requireNonNull($.nestedResourceTypeThird, "expected parameter 'nestedResourceTypeThird' to be non-null");
            $.providerNamespace = Objects.requireNonNull($.providerNamespace, "expected parameter 'providerNamespace' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
