// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceExecResourceResponse;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileResourceResponse;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceResponse;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceResponse;
import java.util.Objects;


/**
 * An OS policy resource is used to define the desired state configuration and provides a specific functionality like installing/removing packages, executing a script etc. The system ensures that resources are always in their desired state by taking necessary actions if they have drifted from their desired state.
 * 
 */
public final class OSPolicyResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceResponse Empty = new OSPolicyResourceResponse();

    /**
     * Exec resource
     * 
     */
    @InputImport(name="exec", required=true)
    private final OSPolicyResourceExecResourceResponse exec;

    public OSPolicyResourceExecResourceResponse getExec() {
        return this.exec;
    }

    /**
     * File resource
     * 
     */
    @InputImport(name="file", required=true)
    private final OSPolicyResourceFileResourceResponse file;

    public OSPolicyResourceFileResourceResponse getFile() {
        return this.file;
    }

    /**
     * Package resource
     * 
     */
    @InputImport(name="pkg", required=true)
    private final OSPolicyResourcePackageResourceResponse pkg;

    public OSPolicyResourcePackageResourceResponse getPkg() {
        return this.pkg;
    }

    /**
     * Package repository resource
     * 
     */
    @InputImport(name="repository", required=true)
    private final OSPolicyResourceRepositoryResourceResponse repository;

    public OSPolicyResourceRepositoryResourceResponse getRepository() {
        return this.repository;
    }

    public OSPolicyResourceResponse(
        OSPolicyResourceExecResourceResponse exec,
        OSPolicyResourceFileResourceResponse file,
        OSPolicyResourcePackageResourceResponse pkg,
        OSPolicyResourceRepositoryResourceResponse repository) {
        this.exec = Objects.requireNonNull(exec, "expected parameter 'exec' to be non-null");
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.pkg = Objects.requireNonNull(pkg, "expected parameter 'pkg' to be non-null");
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
    }

    private OSPolicyResourceResponse() {
        this.exec = null;
        this.file = null;
        this.pkg = null;
        this.repository = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceExecResourceResponse exec;
        private OSPolicyResourceFileResourceResponse file;
        private OSPolicyResourcePackageResourceResponse pkg;
        private OSPolicyResourceRepositoryResourceResponse repository;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        public Builder setExec(OSPolicyResourceExecResourceResponse exec) {
            this.exec = Objects.requireNonNull(exec);
            return this;
        }

        public Builder setFile(OSPolicyResourceFileResourceResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setPkg(OSPolicyResourcePackageResourceResponse pkg) {
            this.pkg = Objects.requireNonNull(pkg);
            return this;
        }

        public Builder setRepository(OSPolicyResourceRepositoryResourceResponse repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public OSPolicyResourceResponse build() {
            return new OSPolicyResourceResponse(exec, file, pkg, repository);
        }
    }
}
