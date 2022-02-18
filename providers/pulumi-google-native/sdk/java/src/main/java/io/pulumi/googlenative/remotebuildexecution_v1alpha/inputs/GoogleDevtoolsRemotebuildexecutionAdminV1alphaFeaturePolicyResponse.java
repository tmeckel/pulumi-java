// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse;
import java.lang.String;
import java.util.Objects;


/**
 * FeaturePolicy defines features allowed to be used on RBE instances, as well as instance-wide behavior changes that take effect without opt-in or opt-out at usage time.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse();

    /**
     * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is allowed. One can allow all repositories under a project or one specific repository only. E.g. container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io/project-bar/repo-baz", ] } will allow any repositories under "gcr.io/project-foo" plus the repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is allowed.
     * 
     */
    @InputImport(name="containerImageSources", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getContainerImageSources() {
        return this.containerImageSources;
    }

    /**
     * Whether dockerAddCapabilities can be used or what capabilities are allowed.
     * 
     */
    @InputImport(name="dockerAddCapabilities", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerAddCapabilities() {
        return this.dockerAddCapabilities;
    }

    /**
     * Whether dockerChrootPath can be used.
     * 
     */
    @InputImport(name="dockerChrootPath", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerChrootPath() {
        return this.dockerChrootPath;
    }

    /**
     * Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off` value only via `allowed_values`.
     * 
     */
    @InputImport(name="dockerNetwork", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerNetwork() {
        return this.dockerNetwork;
    }

    /**
     * Whether dockerPrivileged can be used.
     * 
     */
    @InputImport(name="dockerPrivileged", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerPrivileged() {
        return this.dockerPrivileged;
    }

    /**
     * Whether dockerRunAsRoot can be used.
     * 
     */
    @InputImport(name="dockerRunAsRoot", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerRunAsRoot() {
        return this.dockerRunAsRoot;
    }

    /**
     * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation takes precedence, and if set, docker_runtime values may be rejected if they are incompatible with the selected isolation.
     * 
     */
    @InputImport(name="dockerRuntime", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerRuntime() {
        return this.dockerRuntime;
    }

    /**
     * Whether dockerSiblingContainers can be used.
     * 
     */
    @InputImport(name="dockerSiblingContainers", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse getDockerSiblingContainers() {
        return this.dockerSiblingContainers;
    }

    /**
     * linux_isolation allows overriding the docker runtime used for containers started on Linux.
     * 
     */
    @InputImport(name="linuxIsolation", required=true)
    private final String linuxIsolation;

    public String getLinuxIsolation() {
        return this.linuxIsolation;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse(
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime,
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers,
        String linuxIsolation) {
        this.containerImageSources = Objects.requireNonNull(containerImageSources, "expected parameter 'containerImageSources' to be non-null");
        this.dockerAddCapabilities = Objects.requireNonNull(dockerAddCapabilities, "expected parameter 'dockerAddCapabilities' to be non-null");
        this.dockerChrootPath = Objects.requireNonNull(dockerChrootPath, "expected parameter 'dockerChrootPath' to be non-null");
        this.dockerNetwork = Objects.requireNonNull(dockerNetwork, "expected parameter 'dockerNetwork' to be non-null");
        this.dockerPrivileged = Objects.requireNonNull(dockerPrivileged, "expected parameter 'dockerPrivileged' to be non-null");
        this.dockerRunAsRoot = Objects.requireNonNull(dockerRunAsRoot, "expected parameter 'dockerRunAsRoot' to be non-null");
        this.dockerRuntime = Objects.requireNonNull(dockerRuntime, "expected parameter 'dockerRuntime' to be non-null");
        this.dockerSiblingContainers = Objects.requireNonNull(dockerSiblingContainers, "expected parameter 'dockerSiblingContainers' to be non-null");
        this.linuxIsolation = Objects.requireNonNull(linuxIsolation, "expected parameter 'linuxIsolation' to be non-null");
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse() {
        this.containerImageSources = null;
        this.dockerAddCapabilities = null;
        this.dockerChrootPath = null;
        this.dockerNetwork = null;
        this.dockerPrivileged = null;
        this.dockerRunAsRoot = null;
        this.dockerRuntime = null;
        this.dockerSiblingContainers = null;
        this.linuxIsolation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime;
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers;
        private String linuxIsolation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImageSources = defaults.containerImageSources;
    	      this.dockerAddCapabilities = defaults.dockerAddCapabilities;
    	      this.dockerChrootPath = defaults.dockerChrootPath;
    	      this.dockerNetwork = defaults.dockerNetwork;
    	      this.dockerPrivileged = defaults.dockerPrivileged;
    	      this.dockerRunAsRoot = defaults.dockerRunAsRoot;
    	      this.dockerRuntime = defaults.dockerRuntime;
    	      this.dockerSiblingContainers = defaults.dockerSiblingContainers;
    	      this.linuxIsolation = defaults.linuxIsolation;
        }

        public Builder setContainerImageSources(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources) {
            this.containerImageSources = Objects.requireNonNull(containerImageSources);
            return this;
        }

        public Builder setDockerAddCapabilities(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities) {
            this.dockerAddCapabilities = Objects.requireNonNull(dockerAddCapabilities);
            return this;
        }

        public Builder setDockerChrootPath(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath) {
            this.dockerChrootPath = Objects.requireNonNull(dockerChrootPath);
            return this;
        }

        public Builder setDockerNetwork(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork) {
            this.dockerNetwork = Objects.requireNonNull(dockerNetwork);
            return this;
        }

        public Builder setDockerPrivileged(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged) {
            this.dockerPrivileged = Objects.requireNonNull(dockerPrivileged);
            return this;
        }

        public Builder setDockerRunAsRoot(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot) {
            this.dockerRunAsRoot = Objects.requireNonNull(dockerRunAsRoot);
            return this;
        }

        public Builder setDockerRuntime(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime) {
            this.dockerRuntime = Objects.requireNonNull(dockerRuntime);
            return this;
        }

        public Builder setDockerSiblingContainers(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers) {
            this.dockerSiblingContainers = Objects.requireNonNull(dockerSiblingContainers);
            return this;
        }

        public Builder setLinuxIsolation(String linuxIsolation) {
            this.linuxIsolation = Objects.requireNonNull(linuxIsolation);
            return this;
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse(containerImageSources, dockerAddCapabilities, dockerChrootPath, dockerNetwork, dockerPrivileged, dockerRunAsRoot, dockerRuntime, dockerSiblingContainers, linuxIsolation);
        }
    }
}
