// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.addons.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSupportPlanTypeResult {
    /**
     * @return The id of the ARM resource, e.g. &#34;/subscriptions/{id}/providers/Microsoft.Addons/supportProvider/{supportProviderName}/supportPlanTypes/{planTypeName}&#34;.
     * 
     */
    private final String id;
    /**
     * @return The name of the Canonical support plan, i.e. &#34;essential&#34;, &#34;standard&#34; or &#34;advanced&#34;.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return Microsoft.Addons/supportProvider
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSupportPlanTypeResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return The id of the ARM resource, e.g. &#34;/subscriptions/{id}/providers/Microsoft.Addons/supportProvider/{supportProviderName}/supportPlanTypes/{planTypeName}&#34;.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the Canonical support plan, i.e. &#34;essential&#34;, &#34;standard&#34; or &#34;advanced&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return Microsoft.Addons/supportProvider
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSupportPlanTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSupportPlanTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSupportPlanTypeResult build() {
            return new GetSupportPlanTypeResult(id, name, provisioningState, type);
        }
    }
}
