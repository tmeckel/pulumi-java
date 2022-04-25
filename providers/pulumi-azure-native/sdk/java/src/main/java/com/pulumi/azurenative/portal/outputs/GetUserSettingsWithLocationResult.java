// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.azurenative.portal.outputs.UserPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetUserSettingsWithLocationResult {
    /**
     * @return The cloud shell user settings properties.
     * 
     */
    private final UserPropertiesResponse properties;

    @CustomType.Constructor
    private GetUserSettingsWithLocationResult(@CustomType.Parameter("properties") UserPropertiesResponse properties) {
        this.properties = properties;
    }

    /**
     * @return The cloud shell user settings properties.
     * 
     */
    public UserPropertiesResponse properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSettingsWithLocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSettingsWithLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(UserPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public GetUserSettingsWithLocationResult build() {
            return new GetUserSettingsWithLocationResult(properties);
        }
    }
}
