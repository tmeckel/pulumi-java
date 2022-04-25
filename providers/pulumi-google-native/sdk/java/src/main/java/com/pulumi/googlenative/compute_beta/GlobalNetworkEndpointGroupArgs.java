// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.GlobalNetworkEndpointGroupNetworkEndpointType;
import com.pulumi.googlenative.compute_beta.inputs.NetworkEndpointGroupAppEngineArgs;
import com.pulumi.googlenative.compute_beta.inputs.NetworkEndpointGroupCloudFunctionArgs;
import com.pulumi.googlenative.compute_beta.inputs.NetworkEndpointGroupCloudRunArgs;
import com.pulumi.googlenative.compute_beta.inputs.NetworkEndpointGroupServerlessDeploymentArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalNetworkEndpointGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalNetworkEndpointGroupArgs Empty = new GlobalNetworkEndpointGroupArgs();

    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Metadata defined as annotations on the network endpoint group.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="appEngine")
    private @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Optional<Output<NetworkEndpointGroupAppEngineArgs>> appEngine() {
        return Optional.ofNullable(this.appEngine);
    }

    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="cloudFunction")
    private @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Optional<Output<NetworkEndpointGroupCloudFunctionArgs>> cloudFunction() {
        return Optional.ofNullable(this.cloudFunction);
    }

    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="cloudRun")
    private @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public Optional<Output<NetworkEndpointGroupCloudRunArgs>> cloudRun() {
        return Optional.ofNullable(this.cloudRun);
    }

    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    @Import(name="defaultPort")
    private @Nullable Output<Integer> defaultPort;

    /**
     * @return The default port used if the port number is not specified in the network endpoint.
     * 
     */
    public Optional<Output<Integer>> defaultPort() {
        return Optional.ofNullable(this.defaultPort);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @Import(name="networkEndpointType")
    private @Nullable Output<GlobalNetworkEndpointGroupNetworkEndpointType> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    public Optional<Output<GlobalNetworkEndpointGroupNetworkEndpointType>> networkEndpointType() {
        return Optional.ofNullable(this.networkEndpointType);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
     * 
     */
    @Import(name="pscTargetService")
    private @Nullable Output<String> pscTargetService;

    /**
     * @return The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
     * 
     */
    public Optional<Output<String>> pscTargetService() {
        return Optional.ofNullable(this.pscTargetService);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    @Import(name="serverlessDeployment")
    private @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    public Optional<Output<NetworkEndpointGroupServerlessDeploymentArgs>> serverlessDeployment() {
        return Optional.ofNullable(this.serverlessDeployment);
    }

    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private GlobalNetworkEndpointGroupArgs() {}

    private GlobalNetworkEndpointGroupArgs(GlobalNetworkEndpointGroupArgs $) {
        this.annotations = $.annotations;
        this.appEngine = $.appEngine;
        this.cloudFunction = $.cloudFunction;
        this.cloudRun = $.cloudRun;
        this.defaultPort = $.defaultPort;
        this.description = $.description;
        this.name = $.name;
        this.network = $.network;
        this.networkEndpointType = $.networkEndpointType;
        this.project = $.project;
        this.pscTargetService = $.pscTargetService;
        this.requestId = $.requestId;
        this.serverlessDeployment = $.serverlessDeployment;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalNetworkEndpointGroupArgs $;

        public Builder() {
            $ = new GlobalNetworkEndpointGroupArgs();
        }

        public Builder(GlobalNetworkEndpointGroupArgs defaults) {
            $ = new GlobalNetworkEndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Metadata defined as annotations on the network endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Metadata defined as annotations on the network endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param appEngine Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
         * 
         * @return builder
         * 
         */
        public Builder appEngine(@Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine) {
            $.appEngine = appEngine;
            return this;
        }

        /**
         * @param appEngine Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
         * 
         * @return builder
         * 
         */
        public Builder appEngine(NetworkEndpointGroupAppEngineArgs appEngine) {
            return appEngine(Output.of(appEngine));
        }

        /**
         * @param cloudFunction Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
         * 
         * @return builder
         * 
         */
        public Builder cloudFunction(@Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction) {
            $.cloudFunction = cloudFunction;
            return this;
        }

        /**
         * @param cloudFunction Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
         * 
         * @return builder
         * 
         */
        public Builder cloudFunction(NetworkEndpointGroupCloudFunctionArgs cloudFunction) {
            return cloudFunction(Output.of(cloudFunction));
        }

        /**
         * @param cloudRun Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
         * 
         * @return builder
         * 
         */
        public Builder cloudRun(@Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun) {
            $.cloudRun = cloudRun;
            return this;
        }

        /**
         * @param cloudRun Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine or cloudFunction may be set.
         * 
         * @return builder
         * 
         */
        public Builder cloudRun(NetworkEndpointGroupCloudRunArgs cloudRun) {
            return cloudRun(Output.of(cloudRun));
        }

        /**
         * @param defaultPort The default port used if the port number is not specified in the network endpoint.
         * 
         * @return builder
         * 
         */
        public Builder defaultPort(@Nullable Output<Integer> defaultPort) {
            $.defaultPort = defaultPort;
            return this;
        }

        /**
         * @param defaultPort The default port used if the port number is not specified in the network endpoint.
         * 
         * @return builder
         * 
         */
        public Builder defaultPort(Integer defaultPort) {
            return defaultPort(Output.of(defaultPort));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The URL of the network to which all network endpoints in the NEG belong. Uses &#34;default&#34; project network if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkEndpointType Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
         * 
         * @return builder
         * 
         */
        public Builder networkEndpointType(@Nullable Output<GlobalNetworkEndpointGroupNetworkEndpointType> networkEndpointType) {
            $.networkEndpointType = networkEndpointType;
            return this;
        }

        /**
         * @param networkEndpointType Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
         * 
         * @return builder
         * 
         */
        public Builder networkEndpointType(GlobalNetworkEndpointGroupNetworkEndpointType networkEndpointType) {
            return networkEndpointType(Output.of(networkEndpointType));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pscTargetService The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder pscTargetService(@Nullable Output<String> pscTargetService) {
            $.pscTargetService = pscTargetService;
            return this;
        }

        /**
         * @param pscTargetService The target service url used to set up private service connection to a Google API. An example value is: &#34;asia-northeast3-cloudkms.googleapis.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder pscTargetService(String pscTargetService) {
            return pscTargetService(Output.of(pscTargetService));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param serverlessDeployment Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
         * 
         * @return builder
         * 
         */
        public Builder serverlessDeployment(@Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment) {
            $.serverlessDeployment = serverlessDeployment;
            return this;
        }

        /**
         * @param serverlessDeployment Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
         * 
         * @return builder
         * 
         */
        public Builder serverlessDeployment(NetworkEndpointGroupServerlessDeploymentArgs serverlessDeployment) {
            return serverlessDeployment(Output.of(serverlessDeployment));
        }

        /**
         * @param subnetwork Optional URL of the subnetwork to which all network endpoints in the NEG belong.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Optional URL of the subnetwork to which all network endpoints in the NEG belong.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public GlobalNetworkEndpointGroupArgs build() {
            return $;
        }
    }

}
