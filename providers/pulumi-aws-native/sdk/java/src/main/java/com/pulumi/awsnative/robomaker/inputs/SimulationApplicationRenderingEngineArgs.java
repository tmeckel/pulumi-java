// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.awsnative.robomaker.enums.SimulationApplicationRenderingEngineName;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a rendering engine.
 * 
 */
public final class SimulationApplicationRenderingEngineArgs extends com.pulumi.resources.ResourceArgs {

    public static final SimulationApplicationRenderingEngineArgs Empty = new SimulationApplicationRenderingEngineArgs();

    /**
     * The name of the rendering engine.
     * 
     */
    @Import(name="name", required=true)
    private Output<SimulationApplicationRenderingEngineName> name;

    /**
     * @return The name of the rendering engine.
     * 
     */
    public Output<SimulationApplicationRenderingEngineName> name() {
        return this.name;
    }

    /**
     * The version of the rendering engine.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version of the rendering engine.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private SimulationApplicationRenderingEngineArgs() {}

    private SimulationApplicationRenderingEngineArgs(SimulationApplicationRenderingEngineArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SimulationApplicationRenderingEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationRenderingEngineArgs $;

        public Builder() {
            $ = new SimulationApplicationRenderingEngineArgs();
        }

        public Builder(SimulationApplicationRenderingEngineArgs defaults) {
            $ = new SimulationApplicationRenderingEngineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the rendering engine.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<SimulationApplicationRenderingEngineName> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rendering engine.
         * 
         * @return builder
         * 
         */
        public Builder name(SimulationApplicationRenderingEngineName name) {
            return name(Output.of(name));
        }

        /**
         * @param version The version of the rendering engine.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the rendering engine.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public SimulationApplicationRenderingEngineArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
