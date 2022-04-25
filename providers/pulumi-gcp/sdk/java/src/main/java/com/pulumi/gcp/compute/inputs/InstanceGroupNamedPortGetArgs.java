// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupNamedPortGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupNamedPortGetArgs Empty = new InstanceGroupNamedPortGetArgs();

    /**
     * The name which the port will be mapped to.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which the port will be mapped to.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The port number to map the name to.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port number to map the name to.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private InstanceGroupNamedPortGetArgs() {}

    private InstanceGroupNamedPortGetArgs(InstanceGroupNamedPortGetArgs $) {
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupNamedPortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupNamedPortGetArgs $;

        public Builder() {
            $ = new InstanceGroupNamedPortGetArgs();
        }

        public Builder(InstanceGroupNamedPortGetArgs defaults) {
            $ = new InstanceGroupNamedPortGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which the port will be mapped to.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which the port will be mapped to.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port number to map the name to.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number to map the name to.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public InstanceGroupNamedPortGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
