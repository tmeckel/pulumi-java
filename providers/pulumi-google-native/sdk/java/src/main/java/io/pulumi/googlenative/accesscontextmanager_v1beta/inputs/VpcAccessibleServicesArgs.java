// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how APIs are allowed to communicate within the Service Perimeter.
 * 
 */
public final class VpcAccessibleServicesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcAccessibleServicesArgs Empty = new VpcAccessibleServicesArgs();

    /**
     * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction' is True. You can specify a list of individual services, as well as include the 'RESTRICTED-SERVICES' value, which automatically includes all of the services protected by the perimeter.
     * 
     */
    @InputImport(name="allowedServices")
    private final @Nullable Input<List<String>> allowedServices;

    public Input<List<String>> getAllowedServices() {
        return this.allowedServices == null ? Input.empty() : this.allowedServices;
    }

    /**
     * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in 'allowed_services'.
     * 
     */
    @InputImport(name="enableRestriction")
    private final @Nullable Input<Boolean> enableRestriction;

    public Input<Boolean> getEnableRestriction() {
        return this.enableRestriction == null ? Input.empty() : this.enableRestriction;
    }

    public VpcAccessibleServicesArgs(
        @Nullable Input<List<String>> allowedServices,
        @Nullable Input<Boolean> enableRestriction) {
        this.allowedServices = allowedServices;
        this.enableRestriction = enableRestriction;
    }

    private VpcAccessibleServicesArgs() {
        this.allowedServices = Input.empty();
        this.enableRestriction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessibleServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedServices;
        private @Nullable Input<Boolean> enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessibleServicesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder setAllowedServices(@Nullable Input<List<String>> allowedServices) {
            this.allowedServices = allowedServices;
            return this;
        }

        public Builder setAllowedServices(@Nullable List<String> allowedServices) {
            this.allowedServices = Input.ofNullable(allowedServices);
            return this;
        }

        public Builder setEnableRestriction(@Nullable Input<Boolean> enableRestriction) {
            this.enableRestriction = enableRestriction;
            return this;
        }

        public Builder setEnableRestriction(@Nullable Boolean enableRestriction) {
            this.enableRestriction = Input.ofNullable(enableRestriction);
            return this;
        }

        public VpcAccessibleServicesArgs build() {
            return new VpcAccessibleServicesArgs(allowedServices, enableRestriction);
        }
    }
}
