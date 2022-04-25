// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedservices;

import com.pulumi.azurenative.managedservices.inputs.PlanArgs;
import com.pulumi.azurenative.managedservices.inputs.RegistrationDefinitionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistrationDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistrationDefinitionArgs Empty = new RegistrationDefinitionArgs();

    /**
     * Plan details for the managed services.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<PlanArgs> plan;

    /**
     * @return Plan details for the managed services.
     * 
     */
    public Optional<Output<PlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Properties of a registration definition.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<RegistrationDefinitionPropertiesArgs> properties;

    /**
     * @return Properties of a registration definition.
     * 
     */
    public Optional<Output<RegistrationDefinitionPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Guid of the registration definition.
     * 
     */
    @Import(name="registrationDefinitionId")
    private @Nullable Output<String> registrationDefinitionId;

    /**
     * @return Guid of the registration definition.
     * 
     */
    public Optional<Output<String>> registrationDefinitionId() {
        return Optional.ofNullable(this.registrationDefinitionId);
    }

    /**
     * Scope of the resource.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Scope of the resource.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private RegistrationDefinitionArgs() {}

    private RegistrationDefinitionArgs(RegistrationDefinitionArgs $) {
        this.plan = $.plan;
        this.properties = $.properties;
        this.registrationDefinitionId = $.registrationDefinitionId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistrationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistrationDefinitionArgs $;

        public Builder() {
            $ = new RegistrationDefinitionArgs();
        }

        public Builder(RegistrationDefinitionArgs defaults) {
            $ = new RegistrationDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param plan Plan details for the managed services.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<PlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Plan details for the managed services.
         * 
         * @return builder
         * 
         */
        public Builder plan(PlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param properties Properties of a registration definition.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<RegistrationDefinitionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of a registration definition.
         * 
         * @return builder
         * 
         */
        public Builder properties(RegistrationDefinitionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param registrationDefinitionId Guid of the registration definition.
         * 
         * @return builder
         * 
         */
        public Builder registrationDefinitionId(@Nullable Output<String> registrationDefinitionId) {
            $.registrationDefinitionId = registrationDefinitionId;
            return this;
        }

        /**
         * @param registrationDefinitionId Guid of the registration definition.
         * 
         * @return builder
         * 
         */
        public Builder registrationDefinitionId(String registrationDefinitionId) {
            return registrationDefinitionId(Output.of(registrationDefinitionId));
        }

        /**
         * @param scope Scope of the resource.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope of the resource.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public RegistrationDefinitionArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
