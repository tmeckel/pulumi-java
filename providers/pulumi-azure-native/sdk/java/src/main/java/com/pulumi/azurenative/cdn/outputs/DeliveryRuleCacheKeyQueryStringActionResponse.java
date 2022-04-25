// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.CacheKeyQueryStringActionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleCacheKeyQueryStringActionResponse {
    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;CacheKeyQueryString&#39;.
     * 
     */
    private final String name;
    /**
     * @return Defines the parameters for the action.
     * 
     */
    private final CacheKeyQueryStringActionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleCacheKeyQueryStringActionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") CacheKeyQueryStringActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;CacheKeyQueryString&#39;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the parameters for the action.
     * 
     */
    public CacheKeyQueryStringActionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCacheKeyQueryStringActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private CacheKeyQueryStringActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCacheKeyQueryStringActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(CacheKeyQueryStringActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleCacheKeyQueryStringActionResponse build() {
            return new DeliveryRuleCacheKeyQueryStringActionResponse(name, parameters);
        }
    }
}
