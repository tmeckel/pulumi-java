// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * If `true`, services that are enabled
     * and which depend on this service should also be disabled when this service is
     * destroyed. If `false` or unset, an error will be generated if any enabled
     * services depend on this service when destroying it.
     * 
     */
    @Import(name="disableDependentServices")
    private @Nullable Output<Boolean> disableDependentServices;

    /**
     * @return If `true`, services that are enabled
     * and which depend on this service should also be disabled when this service is
     * destroyed. If `false` or unset, an error will be generated if any enabled
     * services depend on this service when destroying it.
     * 
     */
    public Optional<Output<Boolean>> disableDependentServices() {
        return Optional.ofNullable(this.disableDependentServices);
    }

    /**
     * If true, disable the service when the resource is destroyed. Defaults to true. May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     * 
     */
    @Import(name="disableOnDestroy")
    private @Nullable Output<Boolean> disableOnDestroy;

    /**
     * @return If true, disable the service when the resource is destroyed. Defaults to true. May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     * 
     */
    public Optional<Output<Boolean>> disableOnDestroy() {
        return Optional.ofNullable(this.disableOnDestroy);
    }

    /**
     * The project ID. If not provided, the provider project
     * is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project ID. If not provided, the provider project
     * is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The service to enable.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The service to enable.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private ServiceState() {}

    private ServiceState(ServiceState $) {
        this.disableDependentServices = $.disableDependentServices;
        this.disableOnDestroy = $.disableOnDestroy;
        this.project = $.project;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceState $;

        public Builder() {
            $ = new ServiceState();
        }

        public Builder(ServiceState defaults) {
            $ = new ServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableDependentServices If `true`, services that are enabled
         * and which depend on this service should also be disabled when this service is
         * destroyed. If `false` or unset, an error will be generated if any enabled
         * services depend on this service when destroying it.
         * 
         * @return builder
         * 
         */
        public Builder disableDependentServices(@Nullable Output<Boolean> disableDependentServices) {
            $.disableDependentServices = disableDependentServices;
            return this;
        }

        /**
         * @param disableDependentServices If `true`, services that are enabled
         * and which depend on this service should also be disabled when this service is
         * destroyed. If `false` or unset, an error will be generated if any enabled
         * services depend on this service when destroying it.
         * 
         * @return builder
         * 
         */
        public Builder disableDependentServices(Boolean disableDependentServices) {
            return disableDependentServices(Output.of(disableDependentServices));
        }

        /**
         * @param disableOnDestroy If true, disable the service when the resource is destroyed. Defaults to true. May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
         * 
         * @return builder
         * 
         */
        public Builder disableOnDestroy(@Nullable Output<Boolean> disableOnDestroy) {
            $.disableOnDestroy = disableOnDestroy;
            return this;
        }

        /**
         * @param disableOnDestroy If true, disable the service when the resource is destroyed. Defaults to true. May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
         * 
         * @return builder
         * 
         */
        public Builder disableOnDestroy(Boolean disableOnDestroy) {
            return disableOnDestroy(Output.of(disableOnDestroy));
        }

        /**
         * @param project The project ID. If not provided, the provider project
         * is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project ID. If not provided, the provider project
         * is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param service The service to enable.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The service to enable.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ServiceState build() {
            return $;
        }
    }

}
