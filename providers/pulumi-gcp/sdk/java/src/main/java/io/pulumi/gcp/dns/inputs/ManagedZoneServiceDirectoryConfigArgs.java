// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigArgs Empty = new ManagedZoneServiceDirectoryConfigArgs();

    /**
     * The namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

    public Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> getNamespace() {
        return this.namespace;
    }

    public ManagedZoneServiceDirectoryConfigArgs(Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigArgs() {
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(ManagedZoneServiceDirectoryConfigNamespaceArgs namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }        public ManagedZoneServiceDirectoryConfigArgs build() {
            return new ManagedZoneServiceDirectoryConfigArgs(namespace);
        }
    }
}
