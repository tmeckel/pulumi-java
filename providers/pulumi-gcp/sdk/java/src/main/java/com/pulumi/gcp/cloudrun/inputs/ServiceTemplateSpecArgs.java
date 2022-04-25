// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecArgs Empty = new ServiceTemplateSpecArgs();

    /**
     * ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
     * requests per container of the Revision. Values are:
     * 
     */
    @Import(name="containerConcurrency")
    private @Nullable Output<Integer> containerConcurrency;

    /**
     * @return ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
     * requests per container of the Revision. Values are:
     * 
     */
    public Optional<Output<Integer>> containerConcurrency() {
        return Optional.ofNullable(this.containerConcurrency);
    }

    /**
     * Container defines the unit of execution for this Revision.
     * In the context of a Revision, we disallow a number of the fields of
     * this Container, including: name, ports, and volumeMounts.
     * The runtime contract is documented here:
     * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
     * Structure is documented below.
     * 
     */
    @Import(name="containers")
    private @Nullable Output<List<ServiceTemplateSpecContainerArgs>> containers;

    /**
     * @return Container defines the unit of execution for this Revision.
     * In the context of a Revision, we disallow a number of the fields of
     * this Container, including: name, ports, and volumeMounts.
     * The runtime contract is documented here:
     * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServiceTemplateSpecContainerArgs>>> containers() {
        return Optional.ofNullable(this.containers);
    }

    /**
     * Email address of the IAM service account associated with the revision of the
     * service. The service account represents the identity of the running revision,
     * and determines what permissions the revision has. If not provided, the revision
     * will use the project&#39;s default service account.
     * 
     */
    @Import(name="serviceAccountName")
    private @Nullable Output<String> serviceAccountName;

    /**
     * @return Email address of the IAM service account associated with the revision of the
     * service. The service account represents the identity of the running revision,
     * and determines what permissions the revision has. If not provided, the revision
     * will use the project&#39;s default service account.
     * 
     */
    public Optional<Output<String>> serviceAccountName() {
        return Optional.ofNullable(this.serviceAccountName);
    }

    /**
     * - 
     * ServingState holds a value describing the state the resources
     * are in for this Revision.
     * It is expected
     * that the system will manipulate this based on routability and load.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="servingState")
    private @Nullable Output<String> servingState;

    /**
     * @return -
     * ServingState holds a value describing the state the resources
     * are in for this Revision.
     * It is expected
     * that the system will manipulate this based on routability and load.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    public Optional<Output<String>> servingState() {
        return Optional.ofNullable(this.servingState);
    }

    /**
     * TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    /**
     * Volume represents a named volume in a container.
     * Structure is documented below.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<ServiceTemplateSpecVolumeArgs>> volumes;

    /**
     * @return Volume represents a named volume in a container.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServiceTemplateSpecVolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private ServiceTemplateSpecArgs() {}

    private ServiceTemplateSpecArgs(ServiceTemplateSpecArgs $) {
        this.containerConcurrency = $.containerConcurrency;
        this.containers = $.containers;
        this.serviceAccountName = $.serviceAccountName;
        this.servingState = $.servingState;
        this.timeoutSeconds = $.timeoutSeconds;
        this.volumes = $.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecArgs();
        }

        public Builder(ServiceTemplateSpecArgs defaults) {
            $ = new ServiceTemplateSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerConcurrency ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
         * requests per container of the Revision. Values are:
         * 
         * @return builder
         * 
         */
        public Builder containerConcurrency(@Nullable Output<Integer> containerConcurrency) {
            $.containerConcurrency = containerConcurrency;
            return this;
        }

        /**
         * @param containerConcurrency ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
         * requests per container of the Revision. Values are:
         * 
         * @return builder
         * 
         */
        public Builder containerConcurrency(Integer containerConcurrency) {
            return containerConcurrency(Output.of(containerConcurrency));
        }

        /**
         * @param containers Container defines the unit of execution for this Revision.
         * In the context of a Revision, we disallow a number of the fields of
         * this Container, including: name, ports, and volumeMounts.
         * The runtime contract is documented here:
         * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containers(@Nullable Output<List<ServiceTemplateSpecContainerArgs>> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers Container defines the unit of execution for this Revision.
         * In the context of a Revision, we disallow a number of the fields of
         * this Container, including: name, ports, and volumeMounts.
         * The runtime contract is documented here:
         * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containers(List<ServiceTemplateSpecContainerArgs> containers) {
            return containers(Output.of(containers));
        }

        /**
         * @param containers Container defines the unit of execution for this Revision.
         * In the context of a Revision, we disallow a number of the fields of
         * this Container, including: name, ports, and volumeMounts.
         * The runtime contract is documented here:
         * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder containers(ServiceTemplateSpecContainerArgs... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param serviceAccountName Email address of the IAM service account associated with the revision of the
         * service. The service account represents the identity of the running revision,
         * and determines what permissions the revision has. If not provided, the revision
         * will use the project&#39;s default service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(@Nullable Output<String> serviceAccountName) {
            $.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * @param serviceAccountName Email address of the IAM service account associated with the revision of the
         * service. The service account represents the identity of the running revision,
         * and determines what permissions the revision has. If not provided, the revision
         * will use the project&#39;s default service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(String serviceAccountName) {
            return serviceAccountName(Output.of(serviceAccountName));
        }

        /**
         * @param servingState -
         * ServingState holds a value describing the state the resources
         * are in for this Revision.
         * It is expected
         * that the system will manipulate this based on routability and load.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder servingState(@Nullable Output<String> servingState) {
            $.servingState = servingState;
            return this;
        }

        /**
         * @param servingState -
         * ServingState holds a value describing the state the resources
         * are in for this Revision.
         * It is expected
         * that the system will manipulate this based on routability and load.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder servingState(String servingState) {
            return servingState(Output.of(servingState));
        }

        /**
         * @param timeoutSeconds TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds TimeoutSeconds holds the max duration the instance is allowed for responding to a request.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        /**
         * @param volumes Volume represents a named volume in a container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<ServiceTemplateSpecVolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes Volume represents a named volume in a container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<ServiceTemplateSpecVolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes Volume represents a named volume in a container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(ServiceTemplateSpecVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        public ServiceTemplateSpecArgs build() {
            return $;
        }
    }

}
