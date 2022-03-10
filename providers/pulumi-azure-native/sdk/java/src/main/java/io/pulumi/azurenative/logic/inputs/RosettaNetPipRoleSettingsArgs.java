// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.RosettaNetPipRoleType;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipBusinessDocumentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The integration account RosettaNet ProcessConfiguration role settings.
 * 
 */
public final class RosettaNetPipRoleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RosettaNetPipRoleSettingsArgs Empty = new RosettaNetPipRoleSettingsArgs();

    /**
     * The action name.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
     */
    @InputImport(name="businessDocument", required=true)
      private final Input<RosettaNetPipBusinessDocumentArgs> businessDocument;

    public Input<RosettaNetPipBusinessDocumentArgs> getBusinessDocument() {
        return this.businessDocument;
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
     */
    @InputImport(name="roleType", required=true)
      private final Input<RosettaNetPipRoleType> roleType;

    public Input<RosettaNetPipRoleType> getRoleType() {
        return this.roleType;
    }

    /**
     * The service name.
     * 
     */
    @InputImport(name="service", required=true)
      private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    /**
     * The service classification name.
     * 
     */
    @InputImport(name="serviceClassification", required=true)
      private final Input<String> serviceClassification;

    public Input<String> getServiceClassification() {
        return this.serviceClassification;
    }

    public RosettaNetPipRoleSettingsArgs(
        Input<String> action,
        Input<RosettaNetPipBusinessDocumentArgs> businessDocument,
        @Nullable Input<String> description,
        Input<String> role,
        Input<RosettaNetPipRoleType> roleType,
        Input<String> service,
        Input<String> serviceClassification) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.businessDocument = Objects.requireNonNull(businessDocument, "expected parameter 'businessDocument' to be non-null");
        this.description = description;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.roleType = Objects.requireNonNull(roleType, "expected parameter 'roleType' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.serviceClassification = Objects.requireNonNull(serviceClassification, "expected parameter 'serviceClassification' to be non-null");
    }

    private RosettaNetPipRoleSettingsArgs() {
        this.action = Input.empty();
        this.businessDocument = Input.empty();
        this.description = Input.empty();
        this.role = Input.empty();
        this.roleType = Input.empty();
        this.service = Input.empty();
        this.serviceClassification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipRoleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private Input<RosettaNetPipBusinessDocumentArgs> businessDocument;
        private @Nullable Input<String> description;
        private Input<String> role;
        private Input<RosettaNetPipRoleType> roleType;
        private Input<String> service;
        private Input<String> serviceClassification;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipRoleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.businessDocument = defaults.businessDocument;
    	      this.description = defaults.description;
    	      this.role = defaults.role;
    	      this.roleType = defaults.roleType;
    	      this.service = defaults.service;
    	      this.serviceClassification = defaults.serviceClassification;
        }

        public Builder action(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder action(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder businessDocument(Input<RosettaNetPipBusinessDocumentArgs> businessDocument) {
            this.businessDocument = Objects.requireNonNull(businessDocument);
            return this;
        }

        public Builder businessDocument(RosettaNetPipBusinessDocumentArgs businessDocument) {
            this.businessDocument = Input.of(Objects.requireNonNull(businessDocument));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder role(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder roleType(Input<RosettaNetPipRoleType> roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }

        public Builder roleType(RosettaNetPipRoleType roleType) {
            this.roleType = Input.of(Objects.requireNonNull(roleType));
            return this;
        }

        public Builder service(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder service(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public Builder serviceClassification(Input<String> serviceClassification) {
            this.serviceClassification = Objects.requireNonNull(serviceClassification);
            return this;
        }

        public Builder serviceClassification(String serviceClassification) {
            this.serviceClassification = Input.of(Objects.requireNonNull(serviceClassification));
            return this;
        }
        public RosettaNetPipRoleSettingsArgs build() {
            return new RosettaNetPipRoleSettingsArgs(action, businessDocument, description, role, roleType, service, serviceClassification);
        }
    }
}
