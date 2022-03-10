// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionSettingsState extends io.pulumi.resources.ResourceArgs {

    public static final RegionSettingsState Empty = new RegionSettingsState();

    /**
     * A map of services along with the management preferences for the Region.
     * 
     */
    @InputImport(name="resourceTypeManagementPreference")
      private final @Nullable Input<Map<String,Boolean>> resourceTypeManagementPreference;

    public Input<Map<String,Boolean>> getResourceTypeManagementPreference() {
        return this.resourceTypeManagementPreference == null ? Input.empty() : this.resourceTypeManagementPreference;
    }

    /**
     * A map of services along with the opt-in preferences for the Region.
     * 
     */
    @InputImport(name="resourceTypeOptInPreference")
      private final @Nullable Input<Map<String,Boolean>> resourceTypeOptInPreference;

    public Input<Map<String,Boolean>> getResourceTypeOptInPreference() {
        return this.resourceTypeOptInPreference == null ? Input.empty() : this.resourceTypeOptInPreference;
    }

    public RegionSettingsState(
        @Nullable Input<Map<String,Boolean>> resourceTypeManagementPreference,
        @Nullable Input<Map<String,Boolean>> resourceTypeOptInPreference) {
        this.resourceTypeManagementPreference = resourceTypeManagementPreference;
        this.resourceTypeOptInPreference = resourceTypeOptInPreference;
    }

    private RegionSettingsState() {
        this.resourceTypeManagementPreference = Input.empty();
        this.resourceTypeOptInPreference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Boolean>> resourceTypeManagementPreference;
        private @Nullable Input<Map<String,Boolean>> resourceTypeOptInPreference;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSettingsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypeManagementPreference = defaults.resourceTypeManagementPreference;
    	      this.resourceTypeOptInPreference = defaults.resourceTypeOptInPreference;
        }

        public Builder resourceTypeManagementPreference(@Nullable Input<Map<String,Boolean>> resourceTypeManagementPreference) {
            this.resourceTypeManagementPreference = resourceTypeManagementPreference;
            return this;
        }

        public Builder resourceTypeManagementPreference(@Nullable Map<String,Boolean> resourceTypeManagementPreference) {
            this.resourceTypeManagementPreference = Input.ofNullable(resourceTypeManagementPreference);
            return this;
        }

        public Builder resourceTypeOptInPreference(@Nullable Input<Map<String,Boolean>> resourceTypeOptInPreference) {
            this.resourceTypeOptInPreference = resourceTypeOptInPreference;
            return this;
        }

        public Builder resourceTypeOptInPreference(@Nullable Map<String,Boolean> resourceTypeOptInPreference) {
            this.resourceTypeOptInPreference = Input.ofNullable(resourceTypeOptInPreference);
            return this;
        }
        public RegionSettingsState build() {
            return new RegionSettingsState(resourceTypeManagementPreference, resourceTypeOptInPreference);
        }
    }
}
