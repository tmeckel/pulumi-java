// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalAddressArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalAddressArgs Empty = new GetGlobalAddressArgs();

    /**
     * A unique name for the resource, required by GCE.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return A unique name for the resource, required by GCE.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetGlobalAddressArgs() {}

    private GetGlobalAddressArgs(GetGlobalAddressArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalAddressArgs $;

        public Builder() {
            $ = new GetGlobalAddressArgs();
        }

        public Builder(GetGlobalAddressArgs defaults) {
            $ = new GetGlobalAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A unique name for the resource, required by GCE.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetGlobalAddressArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
