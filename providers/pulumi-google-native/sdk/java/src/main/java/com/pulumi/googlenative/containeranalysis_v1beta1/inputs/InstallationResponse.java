// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.LocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This represents how a particular software package may be installed on a system.
 * 
 */
public final class InstallationResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstallationResponse Empty = new InstallationResponse();

    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    @Import(name="location", required=true)
    private List<LocationResponse> location;

    /**
     * @return All of the places within the filesystem versions of this package have been found.
     * 
     */
    public List<LocationResponse> location() {
        return this.location;
    }

    /**
     * The name of the installed package.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the installed package.
     * 
     */
    public String name() {
        return this.name;
    }

    private InstallationResponse() {}

    private InstallationResponse(InstallationResponse $) {
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstallationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstallationResponse $;

        public Builder() {
            $ = new InstallationResponse();
        }

        public Builder(InstallationResponse defaults) {
            $ = new InstallationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(List<LocationResponse> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(LocationResponse... location) {
            return location(List.of(location));
        }

        /**
         * @param name The name of the installed package.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public InstallationResponse build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
