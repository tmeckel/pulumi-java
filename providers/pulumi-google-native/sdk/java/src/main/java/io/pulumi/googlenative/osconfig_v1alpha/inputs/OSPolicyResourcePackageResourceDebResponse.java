// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A deb package file. dpkg packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceDebResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceDebResponse Empty = new OSPolicyResourcePackageResourceDebResponse();

    /**
     * Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update && apt-get -y install package.deb`
     * 
     */
    @InputImport(name="pullDeps", required=true)
    private final Boolean pullDeps;

    public Boolean getPullDeps() {
        return this.pullDeps;
    }

    /**
     * A deb package.
     * 
     */
    @InputImport(name="source", required=true)
    private final OSPolicyResourceFileResponse source;

    public OSPolicyResourceFileResponse getSource() {
        return this.source;
    }

    public OSPolicyResourcePackageResourceDebResponse(
        Boolean pullDeps,
        OSPolicyResourceFileResponse source) {
        this.pullDeps = Objects.requireNonNull(pullDeps, "expected parameter 'pullDeps' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OSPolicyResourcePackageResourceDebResponse() {
        this.pullDeps = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceDebResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean pullDeps;
        private OSPolicyResourceFileResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceDebResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder setPullDeps(Boolean pullDeps) {
            this.pullDeps = Objects.requireNonNull(pullDeps);
            return this;
        }

        public Builder setSource(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public OSPolicyResourcePackageResourceDebResponse build() {
            return new OSPolicyResourcePackageResourceDebResponse(pullDeps, source);
        }
    }
}
