// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1beta.enums.ServicePerimeterPerimeterType;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.ServicePerimeterConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterArgs Empty = new ServicePerimeterArgs();

    @InputImport(name="accessPolicyId", required=true)
    private final Input<String> accessPolicyId;

    public Input<String> getAccessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, restricted/unrestricted service lists as well as access lists must be empty.
     * 
     */
    @InputImport(name="perimeterType")
    private final @Nullable Input<ServicePerimeterPerimeterType> perimeterType;

    public Input<ServicePerimeterPerimeterType> getPerimeterType() {
        return this.perimeterType == null ? Input.empty() : this.perimeterType;
    }

    /**
     * Current ServicePerimeter configuration. Specifies sets of resources, restricted/unrestricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<ServicePerimeterConfigArgs> status;

    public Input<ServicePerimeterConfigArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public ServicePerimeterArgs(
        Input<String> accessPolicyId,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<ServicePerimeterPerimeterType> perimeterType,
        @Nullable Input<ServicePerimeterConfigArgs> status,
        @Nullable Input<String> title) {
        this.accessPolicyId = Objects.requireNonNull(accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
        this.description = description;
        this.name = name;
        this.perimeterType = perimeterType;
        this.status = status;
        this.title = title;
    }

    private ServicePerimeterArgs() {
        this.accessPolicyId = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.perimeterType = Input.empty();
        this.status = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessPolicyId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<ServicePerimeterPerimeterType> perimeterType;
        private @Nullable Input<ServicePerimeterConfigArgs> status;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyId = defaults.accessPolicyId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.perimeterType = defaults.perimeterType;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
        }

        public Builder setAccessPolicyId(Input<String> accessPolicyId) {
            this.accessPolicyId = Objects.requireNonNull(accessPolicyId);
            return this;
        }

        public Builder setAccessPolicyId(String accessPolicyId) {
            this.accessPolicyId = Input.of(Objects.requireNonNull(accessPolicyId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPerimeterType(@Nullable Input<ServicePerimeterPerimeterType> perimeterType) {
            this.perimeterType = perimeterType;
            return this;
        }

        public Builder setPerimeterType(@Nullable ServicePerimeterPerimeterType perimeterType) {
            this.perimeterType = Input.ofNullable(perimeterType);
            return this;
        }

        public Builder setStatus(@Nullable Input<ServicePerimeterConfigArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable ServicePerimeterConfigArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public ServicePerimeterArgs build() {
            return new ServicePerimeterArgs(accessPolicyId, description, name, perimeterType, status, title);
        }
    }
}
