// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The named port. For example: &lt;&#34;http&#34;, 80&gt;.
 * 
 */
public final class NamedPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedPortArgs Empty = new NamedPortArgs();

    /**
     * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number, which can be a value between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private NamedPortArgs() {}

    private NamedPortArgs(NamedPortArgs $) {
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedPortArgs $;

        public Builder() {
            $ = new NamedPortArgs();
        }

        public Builder(NamedPortArgs defaults) {
            $ = new NamedPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port number, which can be a value between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number, which can be a value between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public NamedPortArgs build() {
            return $;
        }
    }

}
