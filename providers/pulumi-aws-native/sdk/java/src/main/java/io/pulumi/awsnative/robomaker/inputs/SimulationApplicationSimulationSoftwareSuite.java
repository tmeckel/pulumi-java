// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteVersion;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a simulation software suite.
 * 
 */
public final class SimulationApplicationSimulationSoftwareSuite extends io.pulumi.resources.InvokeArgs {

    public static final SimulationApplicationSimulationSoftwareSuite Empty = new SimulationApplicationSimulationSoftwareSuite();

    /**
     * The name of the simulation software suite.
     * 
     */
    @InputImport(name="name", required=true)
      private final SimulationApplicationSimulationSoftwareSuiteName name;

    public SimulationApplicationSimulationSoftwareSuiteName getName() {
        return this.name;
    }

    /**
     * The version of the simulation software suite.
     * 
     */
    @InputImport(name="version")
      private final @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

    public Optional<SimulationApplicationSimulationSoftwareSuiteVersion> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public SimulationApplicationSimulationSoftwareSuite(
        SimulationApplicationSimulationSoftwareSuiteName name,
        @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private SimulationApplicationSimulationSoftwareSuite() {
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationSimulationSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationSimulationSoftwareSuiteName name;
        private @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationSimulationSoftwareSuite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(SimulationApplicationSimulationSoftwareSuiteName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder version(@Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
            this.version = version;
            return this;
        }
        public SimulationApplicationSimulationSoftwareSuite build() {
            return new SimulationApplicationSimulationSoftwareSuite(name, version);
        }
    }
}
