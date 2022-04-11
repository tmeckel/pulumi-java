// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.RosettaNetPipRoleType;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipBusinessDocumentArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
     */
    @Import(name="businessDocument", required=true)
      private final Output<RosettaNetPipBusinessDocumentArgs> businessDocument;

    public Output<RosettaNetPipBusinessDocumentArgs> getBusinessDocument() {
        return this.businessDocument;
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
     */
    @Import(name="roleType", required=true)
      private final Output<RosettaNetPipRoleType> roleType;

    public Output<RosettaNetPipRoleType> getRoleType() {
        return this.roleType;
    }

    /**
     * The service name.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    /**
     * The service classification name.
     * 
     */
    @Import(name="serviceClassification", required=true)
      private final Output<String> serviceClassification;

    public Output<String> getServiceClassification() {
        return this.serviceClassification;
    }

    public RosettaNetPipRoleSettingsArgs(
        Output<String> action,
        Output<RosettaNetPipBusinessDocumentArgs> businessDocument,
        @Nullable Output<String> description,
        Output<String> role,
        Output<RosettaNetPipRoleType> roleType,
        Output<String> service,
        Output<String> serviceClassification) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.businessDocument = Objects.requireNonNull(businessDocument, "expected parameter 'businessDocument' to be non-null");
        this.description = description;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.roleType = Objects.requireNonNull(roleType, "expected parameter 'roleType' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.serviceClassification = Objects.requireNonNull(serviceClassification, "expected parameter 'serviceClassification' to be non-null");
    }

    private RosettaNetPipRoleSettingsArgs() {
        this.action = Codegen.empty();
        this.businessDocument = Codegen.empty();
        this.description = Codegen.empty();
        this.role = Codegen.empty();
        this.roleType = Codegen.empty();
        this.service = Codegen.empty();
        this.serviceClassification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipRoleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private Output<RosettaNetPipBusinessDocumentArgs> businessDocument;
        private @Nullable Output<String> description;
        private Output<String> role;
        private Output<RosettaNetPipRoleType> roleType;
        private Output<String> service;
        private Output<String> serviceClassification;

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

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder businessDocument(Output<RosettaNetPipBusinessDocumentArgs> businessDocument) {
            this.businessDocument = Objects.requireNonNull(businessDocument);
            return this;
        }
        public Builder businessDocument(RosettaNetPipBusinessDocumentArgs businessDocument) {
            this.businessDocument = Output.of(Objects.requireNonNull(businessDocument));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder roleType(Output<RosettaNetPipRoleType> roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }
        public Builder roleType(RosettaNetPipRoleType roleType) {
            this.roleType = Output.of(Objects.requireNonNull(roleType));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }
        public Builder serviceClassification(Output<String> serviceClassification) {
            this.serviceClassification = Objects.requireNonNull(serviceClassification);
            return this;
        }
        public Builder serviceClassification(String serviceClassification) {
            this.serviceClassification = Output.of(Objects.requireNonNull(serviceClassification));
            return this;
        }        public RosettaNetPipRoleSettingsArgs build() {
            return new RosettaNetPipRoleSettingsArgs(action, businessDocument, description, role, roleType, service, serviceClassification);
        }
    }
}
