// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Network describes the GCP network used to create workers in.
 * 
 */
public final class NetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkResponse Empty = new NetworkResponse();

    /**
     * Network on which the workers are created. "default" network is used if empty.
     * 
     */
    @InputImport(name="network", required=true)
    private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * Project id containing the defined network and subnetwork. For a peered VPC, this will be the same as the project_id in which the workers are created. For a shared VPC, this will be the project sharing the network with the project_id project in which workers will be created. For custom workers with no VPC, this will be the same as project_id.
     * 
     */
    @InputImport(name="project", required=true)
    private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
     * 
     */
    @InputImport(name="subnetwork", required=true)
    private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    public NetworkResponse(
        String network,
        String project,
        String subnetwork) {
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private NetworkResponse() {
        this.network = null;
        this.project = null;
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String network;
        private String project;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public NetworkResponse build() {
            return new NetworkResponse(network, project, subnetwork);
        }
    }
}
