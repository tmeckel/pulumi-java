// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The named port. For example: &lt;&#34;http&#34;, 80&gt;.
 * 
 */
public final class NamedPortResponse extends com.pulumi.resources.InvokeArgs {

    public static final NamedPortResponse Empty = new NamedPortResponse();

    /**
     * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return The port number, which can be a value between 1 and 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }

    private NamedPortResponse() {}

    private NamedPortResponse(NamedPortResponse $) {
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedPortResponse $;

        public Builder() {
            $ = new NamedPortResponse();
        }

        public Builder(NamedPortResponse defaults) {
            $ = new NamedPortResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param port The port number, which can be a value between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        public NamedPortResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
