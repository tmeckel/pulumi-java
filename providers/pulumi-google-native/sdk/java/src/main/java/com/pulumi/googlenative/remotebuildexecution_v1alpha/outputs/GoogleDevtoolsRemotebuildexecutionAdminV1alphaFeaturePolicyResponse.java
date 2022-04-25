// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.remotebuildexecution_v1alpha.outputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse {
    /**
     * @return Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is allowed. One can allow all repositories under a project or one specific repository only. E.g. container_image_sources { policy: RESTRICTED allowed_values: [ &#34;gcr.io/project-foo&#34;, &#34;gcr.io/project-bar/repo-baz&#34;, ] } will allow any repositories under &#34;gcr.io/project-foo&#34; plus the repository &#34;gcr.io/project-bar/repo-baz&#34;. Default (UNSPECIFIED) is equivalent to any source is allowed.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources;
    /**
     * @return Whether dockerAddCapabilities can be used or what capabilities are allowed.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities;
    /**
     * @return Whether dockerChrootPath can be used.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath;
    /**
     * @return Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off` value only via `allowed_values`.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork;
    /**
     * @return Whether dockerPrivileged can be used.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged;
    /**
     * @return Whether dockerRunAsRoot can be used.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot;
    /**
     * @return Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation takes precedence, and if set, docker_runtime values may be rejected if they are incompatible with the selected isolation.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime;
    /**
     * @return Whether dockerSiblingContainers can be used.
     * 
     */
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers;
    /**
     * @return linux_isolation allows overriding the docker runtime used for containers started on Linux.
     * 
     */
    private final String linuxIsolation;

    @CustomType.Constructor
    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse(
        @CustomType.Parameter("containerImageSources") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources,
        @CustomType.Parameter("dockerAddCapabilities") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities,
        @CustomType.Parameter("dockerChrootPath") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath,
        @CustomType.Parameter("dockerNetwork") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork,
        @CustomType.Parameter("dockerPrivileged") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged,
        @CustomType.Parameter("dockerRunAsRoot") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot,
        @CustomType.Parameter("dockerRuntime") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime,
        @CustomType.Parameter("dockerSiblingContainers") GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers,
        @CustomType.Parameter("linuxIsolation") String linuxIsolation) {
        this.containerImageSources = containerImageSources;
        this.dockerAddCapabilities = dockerAddCapabilities;
        this.dockerChrootPath = dockerChrootPath;
        this.dockerNetwork = dockerNetwork;
        this.dockerPrivileged = dockerPrivileged;
        this.dockerRunAsRoot = dockerRunAsRoot;
        this.dockerRuntime = dockerRuntime;
        this.dockerSiblingContainers = dockerSiblingContainers;
        this.linuxIsolation = linuxIsolation;
    }

    /**
     * @return Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is allowed. One can allow all repositories under a project or one specific repository only. E.g. container_image_sources { policy: RESTRICTED allowed_values: [ &#34;gcr.io/project-foo&#34;, &#34;gcr.io/project-bar/repo-baz&#34;, ] } will allow any repositories under &#34;gcr.io/project-foo&#34; plus the repository &#34;gcr.io/project-bar/repo-baz&#34;. Default (UNSPECIFIED) is equivalent to any source is allowed.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources() {
        return this.containerImageSources;
    }
    /**
     * @return Whether dockerAddCapabilities can be used or what capabilities are allowed.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities() {
        return this.dockerAddCapabilities;
    }
    /**
     * @return Whether dockerChrootPath can be used.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath() {
        return this.dockerChrootPath;
    }
    /**
     * @return Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off` value only via `allowed_values`.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork() {
        return this.dockerNetwork;
    }
    /**
     * @return Whether dockerPrivileged can be used.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged() {
        return this.dockerPrivileged;
    }
    /**
     * @return Whether dockerRunAsRoot can be used.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot() {
        return this.dockerRunAsRoot;
    }
    /**
     * @return Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation takes precedence, and if set, docker_runtime values may be rejected if they are incompatible with the selected isolation.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime() {
        return this.dockerRuntime;
    }
    /**
     * @return Whether dockerSiblingContainers can be used.
     * 
     */
    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers() {
        return this.dockerSiblingContainers;
    }
    /**
     * @return linux_isolation allows overriding the docker runtime used for containers started on Linux.
     * 
     */
    public String linuxIsolation() {
        return this.linuxIsolation;
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

        public Builder containerImageSources(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse containerImageSources) {
            this.containerImageSources = Objects.requireNonNull(containerImageSources);
            return this;
        }
        public Builder dockerAddCapabilities(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerAddCapabilities) {
            this.dockerAddCapabilities = Objects.requireNonNull(dockerAddCapabilities);
            return this;
        }
        public Builder dockerChrootPath(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerChrootPath) {
            this.dockerChrootPath = Objects.requireNonNull(dockerChrootPath);
            return this;
        }
        public Builder dockerNetwork(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerNetwork) {
            this.dockerNetwork = Objects.requireNonNull(dockerNetwork);
            return this;
        }
        public Builder dockerPrivileged(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerPrivileged) {
            this.dockerPrivileged = Objects.requireNonNull(dockerPrivileged);
            return this;
        }
        public Builder dockerRunAsRoot(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRunAsRoot) {
            this.dockerRunAsRoot = Objects.requireNonNull(dockerRunAsRoot);
            return this;
        }
        public Builder dockerRuntime(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerRuntime) {
            this.dockerRuntime = Objects.requireNonNull(dockerRuntime);
            return this;
        }
        public Builder dockerSiblingContainers(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse dockerSiblingContainers) {
            this.dockerSiblingContainers = Objects.requireNonNull(dockerSiblingContainers);
            return this;
        }
        public Builder linuxIsolation(String linuxIsolation) {
            this.linuxIsolation = Objects.requireNonNull(linuxIsolation);
            return this;
        }        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse(containerImageSources, dockerAddCapabilities, dockerChrootPath, dockerNetwork, dockerPrivileged, dockerRunAsRoot, dockerRuntime, dockerSiblingContainers, linuxIsolation);
        }
    }
}
