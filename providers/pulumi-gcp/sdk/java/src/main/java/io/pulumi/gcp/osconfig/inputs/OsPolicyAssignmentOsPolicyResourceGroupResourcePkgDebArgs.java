// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps")
      private final @Nullable Output<Boolean> pullDeps;

    public Output<Boolean> getPullDeps() {
        return this.pullDeps == null ? Codegen.empty() : this.pullDeps;
    }

    /**
     * Required. An rpm package.
     * 
     */
    @Import(name="source", required=true)
      private final Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> getSource() {
        return this.source;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs(
        @Nullable Output<Boolean> pullDeps,
        Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source) {
        this.pullDeps = pullDeps;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs() {
        this.pullDeps = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> pullDeps;
        private Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            this.pullDeps = pullDeps;
            return this;
        }
        public Builder pullDeps(@Nullable Boolean pullDeps) {
            this.pullDeps = Codegen.ofNullable(pullDeps);
            return this;
        }
        public Builder source(Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs(pullDeps, source);
        }
    }
}
